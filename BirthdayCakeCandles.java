import java.io.*;
import java.util.*;


class BirthdayCakeCandles{

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int candle=sc.nextInt();
		if(candle<1||candle>100000){System.exit(0);}
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
		
		}
		System.out.println(tallestFrequency);
		
		
	}
}