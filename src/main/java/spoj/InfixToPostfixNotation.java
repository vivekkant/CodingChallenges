package spoj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class InfixToPostfixNotation {
    
    private static final Map<String, Integer> PRECEDENCE = new HashMap<>();
    private static final Set<String> RIGHT_ASSOCIATIVE = new HashSet<>();
    
    static {
        PRECEDENCE.put("+", 1);
        PRECEDENCE.put("-", 1);
        PRECEDENCE.put("*", 2);
        PRECEDENCE.put("/", 2);
        PRECEDENCE.put("^", 3);
        
        RIGHT_ASSOCIATIVE.add("^"); // Exponentiation is right associative
    }
    
    /**
     * Converts infix notation to postfix notation using Shunting Yard algorithm
     * @param infixTokens List of Objects (Double for numbers, String for operators and parentheses)
     * @return List of Objects in postfix notation
     */
    public static List<Object> infixToPostfix(List<Object> infixTokens) {
        if (infixTokens == null || infixTokens.isEmpty()) {
            return new ArrayList<>();
        }
        
        List<Object> output = new ArrayList<>();
        Stack<String> operatorStack = new Stack<>();
        
        for (Object token : infixTokens) {
            if (token instanceof Double) {
                // Operand - add directly to output
                output.add(token);
            } else if (token instanceof String) {
                String op = (String) token;
                
                if ("(".equals(op)) {
                    // Left parenthesis - push to stack
                    operatorStack.push(op);
                } else if (")".equals(op)) {
                    // Right parenthesis - pop operators until left parenthesis
                    while (!operatorStack.isEmpty() && !"(".equals(operatorStack.peek())) {
                        output.add(operatorStack.pop());
                    }
                    if (!operatorStack.isEmpty()) {
                        operatorStack.pop(); // Remove the '('
                    } else {
                        throw new IllegalArgumentException("Mismatched parentheses");
                    }
                } else if (isOperator(op)) {
                    // Operator - handle precedence and associativity
                    while (!operatorStack.isEmpty() && 
                           !"(".equals(operatorStack.peek()) &&
                           shouldPopOperator(operatorStack.peek(), op)) {
                        output.add(operatorStack.pop());
                    }
                    operatorStack.push(op);
                } else {
                    throw new IllegalArgumentException("Invalid token: " + op);
                }
            } else {
                throw new IllegalArgumentException("Invalid token type: " + token.getClass());
            }
        }
        
        // Pop remaining operators from stack
        while (!operatorStack.isEmpty()) {
            String op = operatorStack.pop();
            if ("(".equals(op) || ")".equals(op)) {
                throw new IllegalArgumentException("Mismatched parentheses");
            }
            output.add(op);
        }
        
        return output;
    }
    
    /**
     * Determines if operator1 should be popped from stack when operator2 is encountered
     */
    private static boolean shouldPopOperator(String op1, String op2) {
        int prec1 = PRECEDENCE.get(op1);
        int prec2 = PRECEDENCE.get(op2);
        
        if (RIGHT_ASSOCIATIVE.contains(op2)) {
            // For right associative operators, pop only if precedence is strictly higher
            return prec1 > prec2;
        } else {
            // For left associative operators, pop if precedence is higher or equal
            return prec1 >= prec2;
        }
    }
    
    private static boolean isOperator(String token) {
        return PRECEDENCE.containsKey(token);
    }
    
    /**
     * Evaluates a postfix expression
     * @param postfixTokens List of Objects in postfix notation
     * @return Result of the evaluation
     */
    public static double evaluatePostfix(List<Object> postfixTokens) {
        Stack<Double> stack = new Stack<>();
        
        for (Object token : postfixTokens) {
            if (token instanceof Double) {
                stack.push((Double) token);
            } else if (token instanceof String && isOperator((String) token)) {
                if (stack.size() < 2) {
                    throw new IllegalArgumentException("Invalid postfix expression");
                }
                
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                String operator = (String) token;
                
                double result = performOperation(operand1, operand2, operator);
                stack.push(result);
            }
        }
        
        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }
        
        return stack.pop();
    }
    
    private static double performOperation(double operand1, double operand2, String operator) {
        switch (operator) {
            case "+": return operand1 + operand2;
            case "-": return operand1 - operand2;
            case "*": return operand1 * operand2;
            case "/": 
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero");
                }
                return operand1 / operand2;
            case "^": return Math.pow(operand1, operand2);
            default: throw new IllegalArgumentException("Unknown operator: " + operator);
        }
    }
    
    /**
     * Validates if parentheses are balanced in the expression
     */
    public static boolean areParenthesesBalanced(List<Object> tokens) {
        int count = 0;
        for (Object token : tokens) {
            if ("(".equals(token)) {
                count++;
            } else if (")".equals(token)) {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }
        return count == 0;
    }
    
    // Utility method to print the expression
    public static void printExpression(List<Object> expression) {
        for (Object token : expression) {
            System.out.print(token + " ");
        }
        System.out.println();
    }
    
    // Test method
    public static void main(String[] args) {
        // Test case 1: 3 + 2 * 4 => 3 2 4 * +
        List<Object> infix1 = Arrays.asList(3.0, "+", 2.0, "*", 4.0);
        System.out.print("Infix: ");
        printExpression(infix1);
        
        List<Object> postfix1 = infixToPostfix(infix1);
        System.out.print("Postfix: ");
        printExpression(postfix1);
        System.out.println("Result: " + evaluatePostfix(postfix1));
        System.out.println();
        
        // Test case 2: (2 + 3) * (8 - 4) => 2 3 + 8 4 - *
        List<Object> infix2 = Arrays.asList("(", 2.0, "+", 3.0, ")", "*", "(", 8.0, "-", 4.0, ")");
        System.out.print("Infix: ");
        printExpression(infix2);
        
        List<Object> postfix2 = infixToPostfix(infix2);
        System.out.print("Postfix: ");
        printExpression(postfix2);
        System.out.println("Result: " + evaluatePostfix(postfix2));
        System.out.println();
        
        // Test case 3: 2 ^ 3 ^ 2 => 2 3 2 ^ ^ (right associative)
        List<Object> infix3 = Arrays.asList(2.0, "^", 3.0, "^", 2.0);
        System.out.print("Infix: ");
        printExpression(infix3);
        
        List<Object> postfix3 = infixToPostfix(infix3);
        System.out.print("Postfix: ");
        printExpression(postfix3);
        System.out.println("Result: " + evaluatePostfix(postfix3));
        System.out.println();
        
        // Test case 4: 10 + 2 * 6 / 3 - 1 => 10 2 6 * 3 / + 1 -
        List<Object> infix4 = Arrays.asList(10.0, "+", 2.0, "*", 6.0, "/", 3.0, "-", 1.0);
        System.out.print("Infix: ");
        printExpression(infix4);
        
        List<Object> postfix4 = infixToPostfix(infix4);
        System.out.print("Postfix: ");
        printExpression(postfix4);
        System.out.println("Result: " + evaluatePostfix(postfix4));
        System.out.println();
        
        // Test case 5: Complex expression with parentheses
        List<Object> infix5 = Arrays.asList("(", 2.0, "+", 3.0, ")", "^", "(", 6.0, "/", 2.0, ")");
        System.out.print("Infix: ");
        printExpression(infix5);
        
        List<Object> postfix5 = infixToPostfix(infix5);
        System.out.print("Postfix: ");
        printExpression(postfix5);
        System.out.println("Result: " + evaluatePostfix(postfix5));
    }
}