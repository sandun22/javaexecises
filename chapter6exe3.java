
 /** exercise3
 * Chapter6
 * sandun
 * day22 2019/01/16
 */

public class chapter6exe3{
   public static boolean isTriangle(int x, int y, int z){
       
       
       if((x > (y + z)) && (y > (x + z)) && (z > (x + y))){
           return false;
       }else{
          return true;
       }
    }
   
    public static void main(String[]args){
        
       
       boolean result = isTriangle(12, 13, 13);
       System.out.println(result);
    }

}