import java.util.Scanner;
class AVeryBigSum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<1||n>10){System.exit(0);}
		long[] arr=new long[n];
		long sum=0;
		long tem;
		tem=100000000000l;
		
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextLong();
			if(arr[i]<0||arr[i]>tem){System.exit(0);}
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}