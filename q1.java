import java.util.Scanner;
class looop{
    public static void main(String args[])
       {
        Scanner scan  = new Scanner(System.in);     
        System.out.println("Enter a year:");
        int year = scan.nextInt();
        if(year>=1582){
            if(year%4==0){
                System.out.println("its a leap year");
            }
            else{
                if(year%100==0){
                    System.out.println("its not leap year");
                }
                else{
                    if(year%400==0){
                        System.out.println("its a leap year");
                    }
                    else{
                        System.out.println("its a not leap year");
                    }
                }
            }
        }
     else{
        System.out.println("invalid input");
        }
    }  
}  