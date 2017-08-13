import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t<1||t>10)
            System.exit(0);
        for(int i=0;i<t;i++){
            int j=1,k=1,n=sc.nextInt();
            if(n<0||n>60)
                System.exit(0);
            for(j=1;j<=n;j++){
                if(k/2!=0){
                    k=k+k+1;
                    
                }
                else
                    k=k+k;
                
            }
            System.out.println(k);
        }
    }
    
}