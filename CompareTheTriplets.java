import java.util.Scanner;
class CompareTheTriplets{
	public static void main(String[] args){
		int[] a=new int[3];
		int[] b=new int[3];
		Scanner sc=new Scanner(System.in);
		int i=0,j=0,k=0;
		for(i=0;i<a.length;i++){
			a[i]=sc.nextInt();
			if(a[i]<0||a[i]>100){System.exit(0);}
		}
		for(j=0;j<b.length;j++){
			b[j]=sc.nextInt();
			if(b[j]<0||b[j]>100){System.exit(0);
			}
		}
		for(k=0,i=0,j=0;k<a.length;k++){
			if(a[k]>b[k]){i++;}
			if(a[k]<b[k]){j++;}
		}
		System.out.println(i+" "+j);
	}
}
