import java.util.Scanner;
//  #day1 of 30 days Complete Java Development
public class hello {
    public static void main(String[] args) {
        // int age=26;
        // int _age=27;
        // System.out.println(_age);
        // float pi=3.14f;
        // double pi=3.14;

        // // Implicit Type Conversion
        // int count=23;
        // long longcount=count;
        // System.out.println(longcount);
        // // Explicit Type Conversion
        // long count1=22;
        // int longcount1=(int)count1;
        // System.out.println(longcount1);

        // --------------------------------taking input form user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The value of a");
        int a= sc.nextInt();
        System.out.println("Enter The value of b");
        int b= sc.nextInt();
        
        System.out.println("a+b is "+ (a+b));
        System.out.println("a-b is "+ (a-b));
        System.out.println("a*b is "+ (a*b));
        System.out.println("a/b is "+ (a/ (double)b));
        sc.close();

    }
}