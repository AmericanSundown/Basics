import java.util.*;
class TOH{
	int n;
	public void input(){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of disks");
		n=sc.nextInt();
		tow(n,'A','B','C');
	}	//end of input

	public void tow(int n,char a,char b,char c){
		if(n==1){
			System.out.println("Move disk from "+a+" to "+c);
			return;
		}
		else{
			tow(n-1,a,c,b);
			System.out.println("Move disk from "+a+" to "+c);
		}
		tow(n-1,b,a,c);
		return;

	}	//end of tow
	public static void main(String []args){
		TOH ab=new TOH();
		ab.input();
	}	//end of main
}