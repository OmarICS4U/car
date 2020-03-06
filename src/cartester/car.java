/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cartester;

/**
 *
 * @author omsay9559
 */
public class car {
     //variables for characteristics

    private String carModel, carMake, carColour;
    private int carYear, carPrice,carHorsePower ;
    
    //constructors
    public car() {
        carMake = "ford";
        carModel = "Mustang";
        carColour = "red";
        carYear = 2020;
        carPrice = 40000;
        carHorsePower = 400;              
       
    }
    
   
    
    public car(String make, String model, String colour, int year, int price, int horsePower) {
        
        carMake = make; 
        carModel = model;
        carColour = colour;
        carYear = year;
        carPrice = price;
        carHorsePower = horsePower;
   
    }
      //gets the price of the car
    public int getPrice(){
        return carPrice;
    }
   //sets the price of the car
    public void setPrice(int moneys){
        carPrice = moneys;
    }
    
    //output the different cars
    public String toString() {
        String output = "Make: " + carMake + "\n";
        output += "Model: " + carModel + "\n";
        output += "Colour: " + carColour + "\n";
        output += "year: " + carYear + "\n";
        output += "Horsepower: " + carHorsePower + "\n";
        output += "Price: " + carPrice;
        //output string is complete, return it
        return output;
    }
}
