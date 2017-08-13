import java.io.*;
import java.util.*;


class ArraySum{

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];
		
		int sum=0;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
}