import java.util.Scanner;

public class MaximumUsingGenerics {
    public static <new_data> void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter 3 Number :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        maxNum(a,b,c);
    }

   public static void maxNum(int a , int b,int c){
        if (a>b && a>c){                                 //a.compareTo(b) not working
            System.out.println(a+" is greater");
        }else if (b>c){
            System.out.println(b+" is greater");
        }else {
            System.out.println(c+" is graeter");
        }

    }
}
