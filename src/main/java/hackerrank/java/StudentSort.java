package hackerrank.java;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//Complete the code
public class StudentSort
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      
      Collections.sort( studentList, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			if ( o1.getCgpa() == o2.getCgpa() ) {
				
				if( o1.getFname().equals( o2.getFname() ) ) {
					return o1.getId() > o2.getId() ? -1 : 1 ;
				} else {
					return o1.getFname().compareTo( o2.getFname() ) ;
				}
				
			} else {
				return o1.getCgpa() > o2.getCgpa() ? -1 : 1 ;
			}
		
		}
    	   
       }
    		   
       );
      
         for(Student st: studentList){
         System.out.println(st.getCgpa() + " " + st.getFname() + " " + st.getId());
      }
      
         in.close() ;
   }
}
