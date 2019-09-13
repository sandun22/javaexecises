import java.util.Scanner;
public class leapyear{
    public static void leapYear(int number){
        
        
        //find out odd or even
        if (number % 4 == 0 && number % 100 == 0 && number % 400 == 0 || number % 4 == 0 && number % 100 != 0  ||
        
         !(number % 4 == 0 && number % 100 == 0 && number % 400 != 0) ){
            System.out.println("Year " + number + " is  a leap year");
        }else {
            System.out.println("Year " + number + " is not a leap year");
        }
           
        
       
        

    }

     
    public static void main(String[]args){
         Scanner reader = new Scanner(System.in);
        System.out.println("input the year");
        int year = reader.nextInt();
      
        
        leapYear(year);
    }
    
    }
 