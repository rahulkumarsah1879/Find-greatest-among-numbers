import java.util.Scanner;
class GreatestFour {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the four number");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        if(a>b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("a is greater");
                } else {
                    System.out.println("d is greater");
                }
            }
            else if(c>d){
                System.out.println("c is greater");
            }
            else{
                System.out.println("d is greater");
            }
        }
        else if(b>c){
            if(b>d){
                System.out.println("b is greater");
            }
            else {
                System.out.println("d is greater");
            }
        }
        else if(c>d){
            System.out.println("c is greater");
        }
        else{
            System.out.println("d is greater");
        }
    }
}
