import java.util.Scanner;
public class Apple{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s,t,a,b,m,n;
		s=sc.nextInt();
		if(s<1||s>100000)
			System.exit(0);
		t=sc.nextInt();
		if(t<1||t>100000||t>s)
			System.exit(0);
		a=sc.nextInt();
		if(a<1||a>100000||a<s)
			System.exit(0);
		b=sc.nextInt();
		if(b<1||b>100000||b>t)
			System.exit(0);
		m=sc.nextInt();
		if(m<1||m>100000)
			System.exit(0);
		n=sc.nextInt();
		if(n<1||n>100000)
			System.exit(0);
		int[] arr1=new int[m];
		int[] arr2=new int[n];
		int ta=0,to=0;
		for(int i=0;i<arr1.length;i++){
			arr1[i]=sc.nextInt();
			if(arr1[i]<(-100000)||arr1[i]>100000){
				System.exit(0);
			}
		}
		for(int i=0;i<arr2.length;i++){
			arr2[i]=sc.nextInt();
			if(arr2[i]<(-100000)||arr2[i]>100000){
				System.exit(0);
			}
		}

		for(int i=0;i<arr1.length;i++){
			if((arr1[i]+a)>=s)
				ta++;
		}
		for(int i=0;i<arr2.length;i++){
			
			if((b-arr2[i])<=t)
				to++;
		}

		System.out.println(ta);
		System.out.println(to);

	}
}