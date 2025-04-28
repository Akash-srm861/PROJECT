import java.util.Scanner;
//Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights

class array {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String []arr ={"akash","rem","ash"}; 
//Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
       int []age=new int[3];
       int[]height=new int[3];
       System.out.println("Enter the height of "+arr[0]);
       height[0]=scan.nextInt();
       System.out.println("Enter the age of "+arr[0]);
       age[0]=scan.nextInt();
       System.out.println("Enter the height of "+arr[1]);
       height[1]=scan.nextInt();
       System.out.println("Enter the age of "+arr[1]);
       age[1]=scan.nextInt();
       System.out.println("Enter the height of "+arr[2]);
       height[2]=scan.nextInt();
       System.out.println("Enter the age of "+arr[2]);
       age[2]=scan.nextInt();
       int youngestIndex = (age[0] < age[1]) ? ((age[0] < age[2]) ? 0 : 2) : ((age[1] < age[2]) ? 1 : 2);

       // Finding the tallest using ternary operator
       int tallestIndex = (height[0] > height[1]) ? ((height[0] > height[2]) ? 0 : 2) : ((height[1] > height[2]) ? 1 : 2);
       System.out.println("the youngest "+arr[youngestIndex]);
       System.out.println("Tallest friend: " + arr[tallestIndex]);

        
    }
   }



