
/**
 * Write a description of class beer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class beer{

public static void countdown (int n){
      
      if(n == 0){
        System.out.println("No bottles of beer on the wall,\n no bottles of beer, \n ya’ can’t take one down,\n ya’ can’t pass it around, \n ’cause there are no more bottles of beer on the wall!"); 
      }else{
        System.out.printf("%d, bottles of beer on the wall, \n %d, bottles of beer, \n ya’ take one down, \n ya’ pass it around, \n %d, bottles of beer on the wall. \n", n, n, n -1);
        countdown(n - 1);
      }  
   }
   
   public static void main(String[]args){
      countdown(99);
   }
}

