/*
 * Omar Sayyed
 * 06/03/2020
 * generates client code for the car class, makes three cars
 */

package cartester;

/**
 *
 * @author omsay9559
 */
public class CarTester {

    /**
     * @param args the command line arguments
     */


        public static void main(String[] args) {
           //declare car 1 and 2s specs
            car car1 = new car("Dodge", "Caliber", "Blue", 2007, 800, 150);
            car car2 = new car("Chevorlet", "Equinox", "Gold", 2015, 16000, 195);
            car car3 = new car();
            car car4= new car("karl"," is not a car","no rides given",2002,1000000000,200000000);

        
  

        //Print the details of each car
        System.out.println(car1.toString());
        System.out.println("--------------------------");

        System.out.println(car2.toString());
        System.out.println("--------------------------");

        System.out.println(car3);
        System.out.println("--------------------------");
        
         System.out.println(car4);
        System.out.println("--------------------------");


    }
    
}
