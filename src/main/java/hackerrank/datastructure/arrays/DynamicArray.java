package hackerrank.datastructure.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		
		List<Integer> seqList[] = new List[n];
		int lastAnswer = 0;
		
		while (q-- > 0) {
			int t = in.nextInt();
			int x = in.nextInt();
			int y = in.nextInt();
			
			int index = ((x ^ lastAnswer) % n);
			List<Integer> seq = (seqList[index] == null) ? 
					new ArrayList<Integer>() : seqList[index];
			if (t == 1) {
				seq.add(y);
				seqList[index] = seq;
			}
			else {
				lastAnswer = seq.get(y % seq.size());
				System.out.println(lastAnswer);
				seqList[index] = seq;
			}
		}
	}

}
