import java.util.Scanner;
class MiniMaxSum{
	public static void main(String args[]){
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
			if(arr[i]>1000000000){
				System.exit(0);
			}
		}
		int min=arr[0],max=arr[0],total=0;
		for(int i=0;i<5;i++){
            int temp;
            if(min<arr[i]){
                min=arr[i];
            }
            if(max>arr[i]){max=arr[i];}
            total+=arr[i];
		}
		System.out.print((total-min)+" "+(total-max));
	}
}
