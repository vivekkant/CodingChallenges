package hackerrank.java;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class PriorityQueueExample {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int totalEvents = Integer.parseInt(in.nextLine());
      
      PriorityQueue<Student> pq = new PriorityQueue<Student>( totalEvents, new Comparator<Student>() {

		@Override
		public int compare(Student o1, Student o2) {
			
			if (o1.getCgpa() != o2.getCgpa()) {
				return o1.getCgpa() > o2.getCgpa() ? -1 : 1 ;
			} else {
				if (!o1.getFname().equals(o2.getFname())) {
					return o1.getFname().compareTo(o2.getFname());
				} else {
					return o1.getId() > o2.getId() ? 1 : -1;
				}
			}
		}
    	  
      });
      
      while(totalEvents>0){
         String event = in.next();
         if ("ENTER".equals(event)) {
        	 String fname = in.next();
        	 double cgpa = in.nextDouble();
        	 int token = in.nextInt();
        	 Student s = new Student(token, fname, cgpa);
        	 pq.add(s);
         } else {
        	 pq.poll();
         }
           
         totalEvents--;
      }
      
      if (pq.isEmpty()) {
    	  System.out.println("EMPTY");
      } else {
          while (!pq.isEmpty()) {
          	 System.out.println(pq.poll().getFname());
           }    	  
      }

    }
}
