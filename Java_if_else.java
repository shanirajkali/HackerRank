import java.util.Scanner;
class Java_if_else{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1||n>100){
			System.exit(0);
		}
		int tn=n%2;
		if(tn!=0){
			System.out.println("Weird");
		}
		else if(n>=2&&n<=5){System.out.println("Not Weird");}
		else if(n>=6&&n<=20){System.out.println("Weird");}
		else if(n>20){System.out.println("Not Weird");}
		
	}
}