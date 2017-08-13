import java.util.Scanner;
 class Kangaroo{
 	public static void main(String args[]){
 		Scanner sc=new Scanner(System.in);
 		int x1,v1,x2,v2;
 		x1=sc.nextInt();
 		if(x1<0||x1>10000)
 			System.exit(0);
 		v1=sc.nextInt();
 			if(v1<1||v1>10000)
 			System.exit(0);
 		x2=sc.nextInt();
 			if(x2<0||x2>10000)
 			System.exit(0);
 		v2=sc.nextInt();
 			if(v2<1||v2>10000)
 			System.exit(0);
 		if(v1>v2){
 			int a=v1,b=x1;
 			v1=v2;
 			x1=x2;
 			v2=a;
 			x2=b;
 		}
 		for(int i=0;;i++){
 			if(x1<x2){
 				System.out.println("NO");
 				break;
 			}
 			else if(x1==x2){
 				System.out.println("YES");
 				break;
 			}
 			x1=x1+v1;
 			x2=x2+v2;
 		}

 } 		}
