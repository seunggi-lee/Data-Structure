import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class DequeTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<num; i++) {
			String[] str = br.readLine().split(" ");
			
			switch(str[0]) {
				case "push_front": {
					ad.addFirst(Integer.parseInt(str[1]));
					break;
				}
				case "push_back": {
					ad.addLast(Integer.parseInt(str[1]));
					break;
				}
				case"pop_front": {
					if (ad.size() != 0)
						System.out.println(ad.pollFirst());
					else System.out.println(-1);
					break;
				}
				case "pop_back": {
					if (ad.size() != 0)
						System.out.println(ad.pollLast());
					else System.out.println(-1);
					break;
				}
				case "size" : {
					System.out.println(ad.size());
					break;
				}
				case "empty" : {
					if(ad.isEmpty())
						System.out.println(1);
					else 
						System.out.println(0);
					break;
				}
				case "front" : {
					if (ad.isEmpty())
						System.out.println(-1);
					else System.out.println(ad.getFirst());
					break;
				}
				case "back" : {
					if (ad.isEmpty())
						System.out.println(-1);
					else System.out.println(ad.getLast());
					break;
				}
			}
		}
	}
}
