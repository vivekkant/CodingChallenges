package spoj;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author Vivek Kant
 *
 */
class LifeUniverseAndEverything {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		while((line = br.readLine()) != null) {
			if(!line.trim().equals("42")) {
				System.out.println(line);
			} else {
				break;
			}
		}
	}

}
