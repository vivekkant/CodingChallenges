package spoj;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;


public class SortingBankAccounts {

	public static void main(String[] args) throws Exception {
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tests = br.readLine();
		int numTests = Integer.parseInt(tests);
		
		for(int i = 0; i < numTests; i++) {
			String accounts = br.readLine();
			int numAccounts = Integer.parseInt(accounts);
			for(int j = 0; j < numAccounts; j++) {
				String account = br.readLine();
				if(map.containsKey(account)) {
					int count = map.get(account);
					map.put(account, ++count);
				} else {
					map.put(account, 1);
				}
			}
			br.readLine();
			for(String account : map.keySet()) {
				System.out.println(account + " " + map.get(account));
			}
			System.out.println();
			map.clear();
		}

	}

}
