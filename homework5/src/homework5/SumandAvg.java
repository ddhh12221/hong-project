package homework5;
import java.util.*;
public class SumandAvg {
	public static void sum_avg(){
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		int num = 0;
		double avg = 0.0;
		int sum = 0;
		int count=0;
		
		while(true){
			System.out.print("숫자를 입력(Q:종료) :");
			str = sc.next();
			
			if(str.equals("Q") || str.equals("q"))
				break;
			
			num = Integer.parseInt(str);
			sum += num;
			count += 1;
		}
		avg = sum/(double)count;
		
		System.out.println("합계는 "+sum+"이고, 평균은 "+avg+"입니다.");
	}
}
