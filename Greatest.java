import java.util.Scanner;
class Greatest {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the three number");
        int a= scan.nextInt();
        int b= scan.nextInt();
        int c= scan.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is greater");
            }
            else{
                System.out.println("C is greater");
            }
        }else{
            if(b>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println("c is greater");
            }
        }
    }
}
