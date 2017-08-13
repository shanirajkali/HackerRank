import java.io.*;
import java.util.*;


class CountingValleys{

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int stepsLength=sc.nextInt(),upCount=0,downCount=0;
		
		String steps;
		steps=sc.nextLine();
		steps=sc.nextLine();
		if(steps.length()==stepsLength){
			System.out.println(steps.length());
			char[] stepsCharArray=stepsCharArray=steps.toCharArray();
		//	int[] stepsIntArry=new int[stepsLength];
			for(int i=0;i<stepsLength;i++){
			//	stepsIntArry[i]=(int)stepsCharArray[i];
				if(stepsCharArray[i]=='u'||stepsCharArray[i]=='U'){
					System.out.print("/");
					upCount++;
				}
				else if(stepsCharArray[i]=='d'||stepsCharArray[i]=='D'){
					System.out.print("\\");
					downCount++;
				}
				else{System.exit(0);}
			}
			}
		else{System.exit(0);}
		
		
		
		
		
		
	/*	if(candle<1||candle>100000){System.exit(0);}
		int[] candleHeight=new int[candle];
		int tallestCandle=0,tallestFrequency=0;
		
		for(int i=0;i<candle;i++){
			candleHeight[i]=sc.nextInt();
			if(candleHeight[i]<1||candleHeight[i]>10000000){System.exit(0);}
			if(candleHeight[i]>tallestCandle){
					tallestCandle=candleHeight[i];
					tallestFrequency=0;
			}
			if(candleHeight[i]==tallestCandle){tallestFrequency++;}
		
		} */
		System.out.println("tallestFrequency");		
}}