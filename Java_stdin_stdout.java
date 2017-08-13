import java.util.Scanner;

class Java_stdin_stdout {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
        int i = scan.nextInt();
        double d=c.nextFloat();
        String s;
		s=sc.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
