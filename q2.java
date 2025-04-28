import java.util.Scanner;
 class q2 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int year = scan.nextInt();
        if(year>=1582){
            if((year % 4 ==0) || (year %400==0 && year % 100!=0))
        {
            System.out.println("its a leap year");
        }else{
            System.out.println("its not a leap year");
        }

        }
    else{
        System.out.println("invalid input because Gregorian calender");
    }
    
            
        }
    } 
    

