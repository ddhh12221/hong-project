package homework5;
import java.util.*;
public class MaxandMin {
	public static void max_min(){
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		int num = 0;
		int max = 0;
		int min = 0;
		int flag = 0;
		
		while(true){
			System.out.print("0~100사이의 숫자를 입력해주세요(Q:종료) :");
			str = sc.next();
			
			if(str.equals("Q")|| str.equals("q")){
				break;
			}
			
			num = Integer.parseInt(str);
			
			if(num < 0 || num > 100){
				System.out.println("수가 너무 작거나 큽니다.");
				continue;
			}
			
			if(flag == 0){
				max = num;
				min = num;
				flag = 1;
			}
			
			if(num > max)
				max = num;
			
			if(num < min)
				min = num;
		}
		
		System.out.println("가장 큰 수는 "+max+"이고, 가장 작은 수는"+min+"입니다.");
		
	}
}
