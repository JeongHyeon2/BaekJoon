
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		Stack<Integer> stack = new Stack<Integer>();
		int size = Integer.parseInt(br.readLine());

		String arr[] = new String[size];

		for (int i = 0; i < size; i++) {
			arr[i] = br.readLine();
		}

		for (int i = 0; i < size; i++) {
			switch (arr[i]) {
			case "pop":
				if (stack.isEmpty() == true)
					System.out.println("-1");
				else
					System.out.println(stack.pop());
				break;

			case "size":
				System.out.println(stack.size());
				break;

			case "empty":
				if (stack.isEmpty() == false)
					System.out.println("0");
				else
					System.out.println("1");
				break;

			case "top":
				if (stack.isEmpty() == true)
					System.out.println("-1");
				else
					System.out.println(stack.peek());
				break;
			default:
				if (arr[i].charAt(1) == 'u') {
					String[] sarr = arr[i].split(" ");
					stack.push(Integer.parseInt(sarr[1]));
				}
			}

		}
	}

}
