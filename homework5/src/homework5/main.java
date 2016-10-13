package homework5;
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		
		while(flag != 6){
			System.out.println("1. 1부터 입력한 수 더하기.");
			System.out.println("2. 최대값/최소값구하기");
			System.out.println("3. 입력받은숫자의 합계와 평균구하기");
			System.out.println("4. 원하는 구구단 출력하기 ");
			System.out.println("5. 짝수단/홀수단 출력하기");
			System.out.println("6. 종료하기.");
			
			System.out.print("원하는 메뉴 : ");
			flag = sc.nextInt();
			
			switch(flag){
				case 1:
					SumOfNumbers.sum();
					break;
				case 2:
					MaxandMin.max_min();
					break;
				case 3:
					SumandAvg.sum_avg();
					break;
				case 4:
					GuGuDan.gugudan();
					break;
				case 5:
					break;
				case 6:
					break;
				default:
					System.out.println("다시 입력 해 주세요.");
					break;
			}
			
		}
	}

}
