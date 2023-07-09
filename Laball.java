package prowork1;
import java.util.*;
public class Laball 
{
	
	public static void main(String[] args) 
	
	{
		//i/p scanner
		Scanner sc = new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int n=sc.nextInt();
		
		while(1==1) {
			n=n+1;
			if(n==x) {
				System.out.print("L1");
				break;
			}
			if(n==y) {
				System.out.print("L2");
				break;
			}
			if(n==z) {
				System.out.print("L3");
				break;
			}
		}
		
		sc.close();

	}
	
}



