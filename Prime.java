import java.util.*;
class Prime{
		public static void main(String[] args) {
			int a,i,c=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			a=sc.nextInt();
			for(i=1;i<a/2;i++){
				if(a%i==0)
					c++;
			}	
			if(c!=2)
				System.out.println("Its Prime");
			else
				System.out.println("Not prime.");
		}
}