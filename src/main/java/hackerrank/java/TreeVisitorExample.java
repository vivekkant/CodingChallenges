package hackerrank.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;
    public int index;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }
    
    @Override
    public String toString() {
    	return index + "(" + depth + "," + color + "," + value + ")";
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

	class PrintVisitor extends TreeVis {
		
	    public int getResult() {
	        return 0;
	    }
	
	    public void visitNode(TreeNode node) {
	    	print(node);
	    }
	
	    public void visitLeaf(TreeLeaf leaf) {
	      	print(leaf);
	    }
	    
	    public void print(Tree node) {
	    	for(int i = 0; i < node.getDepth(); i++) {
	    		System.out.print('\t');
	    	}
	    	System.out.println(node);
	    }
	}
	
	class SumInLeavesVisitor extends TreeVis {
		private int sumLeaves = 0;

		public int getResult() {
			return this.sumLeaves;
		}

		public void visitNode(TreeNode node) {
		}

		public void visitLeaf(TreeLeaf leaf) {
			this.sumLeaves += leaf.getValue();
		}
	}

	class ProductOfRedNodesVisitor extends TreeVis {
		private int product = 1;
		private static long M = 1000000007;

		public int getResult() {
			return this.product;
		}

		public void visitNode(TreeNode node) {
			calculate(node);
		}

		public void visitLeaf(TreeLeaf node) {
			calculate(node);
		}
		
		public void calculate(Tree node) {
			long value = (node.getColor() == Color.RED) ? node.getValue() : 1;
			long result = 0;
			if (value == 0) {
				value = 1;
			}
			result = value * this.product % M;
			this.product = (int)result;			
		}
	}

	class FancyVisitor extends TreeVis {
		private int evenDepthNodeSum = 0;
		private int greenNodeSum = 0;

		public int getResult() {
			int result = Math.abs(this.evenDepthNodeSum - this.greenNodeSum);
			return result;
		}

		public void visitNode(TreeNode node) {
			if ((node.getDepth() % 2) == 0) {
				this.evenDepthNodeSum += node.getValue();
			}
		}

		public void visitLeaf(TreeLeaf leaf) {
			if (leaf.getColor() == Color.GREEN) {
				this.greenNodeSum += leaf.getValue();
			}
		}
	}

	public class TreeVisitorExample {

	    private static int[] colors;

	    private static Color color(int c) {
	        return colors[c] == 1 ? Color.GREEN : Color.RED;
	    }

	    private static Tree solve() {
	        Scanner in = new Scanner(System.in);
	       
	        int n = in.nextInt();
	        int[] values = new int[n];
	        for (int i = 0; i < n; i++) values[i] = in.nextInt();
	        int[] cs = new int[n];
	        for (int i = 0; i < n; i++) cs[i] = in.nextInt();
	        colors = cs;

	        //a node is a node and not a leaf if it shows up more than once in the data
	        Map<Integer, Set<Integer>> edges = new HashMap<>();
	        for (int i = 1; i < n; i++) {
	            int u = in.nextInt();
	            int v = in.nextInt();

	            if (edges.get(u) == null) edges.put(u, new HashSet<Integer>());
	            if (edges.get(v) == null) edges.put(v, new HashSet<Integer>());

	            edges.get(u).add(v);
	            edges.get(v).add(u);
	        }

	        Map<Integer, Tree> todo = new HashMap<>();
	        Tree root;
	        if (n > 1)
	            root = new TreeNode(values[0], color(0), 0);
	        else
	            root = new TreeLeaf(values[0], color(0), 0);

	        todo.put(1, root);

	        while (!todo.isEmpty()) {

	            int parentId = todo.keySet().iterator().next();
	            Tree parent = todo.remove(parentId);

	            Set<Integer> children = edges.get(parentId);
	            for (int childId : children) {
	                edges.get(childId).remove(parentId);
	                Tree child;
	                if (!edges.get(childId).isEmpty())
	                    child = new TreeNode(values[childId - 1], color(childId - 1), parent.getDepth() + 1);
	                else
	                    child = new TreeLeaf(values[childId - 1], color(childId - 1), parent.getDepth() + 1);
	                todo.put(childId, child);
	                ((TreeNode) parent).addChild(child);
	            }
	        }

	        return root;
	    }

    

    public static void main(String[] args) throws Exception {
    	
    	System.out.println("Build " + System.currentTimeMillis());
      	Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
      	FancyVisitor vis3 = new FancyVisitor();
      	PrintVisitor vis4 = new PrintVisitor();
      	
      	System.out.println("Visitor 1 " + System.currentTimeMillis());
      	root.accept(vis1);
      	System.out.println("Visitor 2 " + System.currentTimeMillis());
      	root.accept(vis2);
      	System.out.println("Visitor 3 " + System.currentTimeMillis());
      	root.accept(vis3);
//      	root.accept(vis4);

      	int res1 = vis1.getResult();
      	int res2 = vis2.getResult();
      	int res3 = vis3.getResult();

      	System.out.println();
      	System.out.println(res1);
     	System.out.println(res2);
    	System.out.println(res3);
	}
}