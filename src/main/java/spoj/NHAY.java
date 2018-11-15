package spoj;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author Vivek Kant
 *
 */
public class NHAY {

	/**
	 * Needle in a hay stack
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
//			String needle = "foobarfoo";
//			String haystack = "barfoobarfoobarfoobarfoobarfoo\n";
//			
//			InputStreamReader isr = new InputStreamReader(new ByteArrayInputStream(haystack.getBytes()));
//			searchNeedle(isr, needle.toCharArray());
			
			InputStreamReader isr = new InputStreamReader(System.in);
			
			while (true) {
				// Get the length of the needle
				int needlelength = readNeedleLength(isr);
				char[] needle = readNeedle(isr, needlelength);
				searchNeedle(isr, needle);
			}
			
		} catch (Exception e) {
			// Do nothing and quit without noise
		}
		
		
		

	}
	
	private static int readNeedleLength(InputStreamReader isr) throws Exception {
		StringBuilder buf = new StringBuilder();
		char c;
		while( (c = (char) isr.read()) != '\n') {
			buf.append(c);
		}
		return Integer.parseInt(buf.toString());
	}
	
	private static char[] readNeedle(InputStreamReader isr, int needleLength) throws Exception {
		char[] needle= new char[needleLength];
		
		for(int i = 0; i < needleLength ; i++) {
			needle[i] = (char) isr.read();
		}
		isr.read(); // Reading the new line
		
		return needle;
	}
	
	private static void searchNeedle(InputStreamReader isr, char[] needle) throws Exception {
		char c;
		int i = 0;
		Map<Integer, Integer> matches = new HashMap<Integer, Integer>();
		
		while((c = (char) isr.read()) != '\n') {
			
			//Iterate on the matches and see if they are still relevant
			
			for(Integer key : new ArrayList<Integer>(matches.keySet())) {
				int index = matches.get(key);
				if (needle[index + 1] == c) {
						index++;
					// Check if it is a full match
					if ( index == (needle.length - 1) ) {
						System.out.println(key);
						matches.remove(key);
					} else {
						matches.put(key, index);
					}
				} else {
					// Remove it from the matches
					matches.remove(key);
				}
			}

			//Check if this char matches the start of needle
			if (needle[0] == c) {
				matches.put(i, 0);
			}			
			i++;
		}
		System.out.println();
	}
	

}
