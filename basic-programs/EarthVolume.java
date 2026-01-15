public class EarthVolume{

      public static void main(String[] args){
      int r = 6378;
	 double miles = r * 0.621371;
	 double pi = 3.14159;

	  double volumekm = (4.0/3) * pi *r*r*r;
	   double volumemiles = (4.0/3) * pi *miles*miles*miles;
	  
		
         System.out.println(
		       "The volume of earth in cubic kilometers is " +volumekm+ " and cubic miles is " +volumemiles);
        }
    }
