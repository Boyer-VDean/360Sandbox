package pkg360sandbox;
/*
 * @author reyob
 */
public class MathForJUnit {
        boolean truefalse;
        Animal cat = new Animal();
        Animal dog = new Animal();
        
   public void main(String[] args) {
               
   }
   
   public static long[] addArray(long[] first, long[] second){
        long[] sum = new long[3];
        for (int i=0; i<sum.length; i++)
        {
            sum[i] = first[i] + second[i];
        }
        return sum;
   } 
   
   public static long addLongs(long one, long two){
       long sum = one + two;
       return sum;
   }
   
   public static boolean wrongLong(long one){
       if (one < 0){
           return true;
       } else {
           return false;
       }
   }
   
   public static boolean wrightLong(long two){
       if (two > 0){
           return true;
       } else {
           return false;
       }
   }
   
   public static Animal ageAnimal(Animal subject){
       long newAge = subject.getAge() + 1;
       subject.setAge(newAge);
       return subject;
   }
   
   
   
   
}
