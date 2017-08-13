import java.util.Scanner;
class Train_Partner{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t<1||t>100)
            System.exit(0);
        for(int i=1;i<=t;i++){
            int inp=sc.nextInt();
            if(t<1||t>100)
                System.exit(0);
            int sN=inp%8;
            if(sN==1)
                System.out.println((inp+3)+"LB");
            else if(sN==2)
                System.out.println((inp+3)+"MB");
            else if(sN==3)
                System.out.println((inp+3)+"UB");
            else if(sN==4)
                System.out.println((inp-3)+"LB");
            else if(sN==5)
                System.out.println((inp-3)+"MB");
            else if(sN==6)
                System.out.println((inp-3)+"UB");
            else if(sN==7)
                System.out.println((inp+1)+"SU");
            else if(sN==8)
                System.out.println((inp-1)+"SL");
        }
    }
}
