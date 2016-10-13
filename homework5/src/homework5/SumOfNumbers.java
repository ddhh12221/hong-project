package homework5;
import java.util.*;
public class SumOfNumbers {

	public static void sum(){
		Scanner sc = new Scanner(System.in);
		String str = null;
		int num = 0;
		int result = 0;
		while(true){
			
			System.out.print("마지막 수를 입력하세요(Q:종료) :");
			str = sc.next();
			
			if(str.equals("Q")||str.equals("q"))
				break;
			num = Integer.parseInt(str);
			
			for(int i = 1; i<=num; i++)
				result += i;
			
			System.out.println("총 합은"+result+"입니다.");
			result = 0;
		}
	}
}
