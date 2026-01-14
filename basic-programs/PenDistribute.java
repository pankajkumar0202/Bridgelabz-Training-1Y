public class PenDistribute{

      public static void main(String[] args){
         int pens = 14;
         int students = 3;
		 int rem = pens % students;
		  int div = pens / students;
         System.out.println(
		       "The Pen Per Student is " +div+ " and the remaining pen not distributed is " +rem);
        }
    }