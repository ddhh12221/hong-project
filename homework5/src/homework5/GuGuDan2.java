package homework5;
import java.util.*;

public class GuGuDan2 {
	
	public static void gugudan2()
	{
		Scanner sc = new Scanner(System.in);
		String str = null;
		
		while(true){
			System.out.print("E:Â¦¼ö´Ü, O:È¦¼ö´Ü Q:Á¾·á : ");
			str = sc.next();
			
			if(str.equals("Q"))
				break;
			else if(str.equals("E"))
			{
				for(int i = 2; i<10; i+=2)
				{
					for(int j = 0 ; j<10; j++)
					{
						System.out.printf("%d * %d = %d \n",i,j,i*j);
					}
				}
			}
			else
			{
				for(int i = 1; i<10; i+=2)
				{
					for(int j = 0 ; j<10; j++)
					{
						System.out.printf("%d * %d = %d \n",i,j,i*j);
					}
				}
			}
		}
	}
}
