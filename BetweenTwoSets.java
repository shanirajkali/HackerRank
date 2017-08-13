import java.util.Scanner;
class BetweenTwoSets{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		if(m<1||m>10)
			System.exit(0);
		int n=sc.nextInt();
		if(n<1||n>10)
			System.exit(0);
		int[] setA=new int[m];
		int[] setB=new int[n];
		int greatest=1,smallest=1,freq=0;
		for(int i=0;i<m;i++){
			setA[i]=sc.nextInt();
			if(i==0)
				greatest=setA[i];
			if(setA[i]>greatest)
				greatest=setA[i];
			if(setA[i]<1||setA[i]>100)
				System.exit(0);
		}
		for(int i=0;i<n;i++){
			setB[i]=sc.nextInt();
			if(i==0)
				smallest=setB[i];
			if(setB[i]<smallest)
				smallest=setB[i];
			if(setB[i]<1||setB[i]>100)
				System.exit(0);
		}
			int select=greatest;
	ext:	for(int i=0;;){

		for(int j=0;j<m;j++){
			if(greatest%setA[j]==0){
				continue;
			}
			else if ((select+greatest<=smallest)) {
				select=select+greatest;
				j=0;
			}
			else if (select+greatest>=smallest) {
				break ext;
				
			}
		}
		for(int j=0;j<n;j++){
			if(setB[j]%greatest==0)
				continue;
			else if(greatest+select<=smallest){
				select=greatest+select;
				continue ext;}
			else if(greatest+select>=smallest)
				break ext;

		}
		select=greatest+select;
		freq++;
		if(select+greatest>smallest)
			break ext;
	}			
		
		
		System.out.println(freq);

	}
}