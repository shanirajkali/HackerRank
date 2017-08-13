import java.util.Scanner;
class DiagonalDifference{
	public static void main(String srgs[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[][] matrix=new int[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				matrix[i][j]=sc.nextInt();
			}
		}
	/*	for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
		System.out.print(" "+matrix[i][j]+" ");	}
		System.out.println();
		} */
	
	int diagonal1=0,diagonal2=0;
	for(int i=0;i<size;i++){
		diagonal1=matrix[i][i]+diagonal1;
	}
	int i=0,j=0;
	for(i=size-1,j=0;i>=0||j<size;i--,j++){
		diagonal2=diagonal2+matrix[i][j];
	}
	int diff=diagonal2-diagonal1;
	System.out.println(diff);	
}}