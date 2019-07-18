/**
 * A class that describes a Car object in code (before Vehicle)
 * Like all classes, extends the class called Object
 * @author Chris
 * @version 1.0
 */
public class Car{

    //define instance variables (instance data, data, fields), i.e. data a Car contains
    //private means only visible within this class
    
    private double avgMpg; //average miles of gallon
    private String make;
    private String model;
    private int year;
    //define constructor(s)

 public Car() {
        make = "Generic";
        model = "Unknown";
        year = 1900;
        avgMpg = 0;
    }
    
    public Car(String make, String model, int year, double avgMpg) {
        super();
        this.make = make;
        this.model = model;
        this.year = year;
        this.avgMpg = avgMpg;
    }



    //define public methods that "client" classes can use
    //"getters" and "setters" (accessors and mutators)
/**
 * 
 * @return make of Car
 */
    public String getMake() {
        return make;
    }
/**
 * 
 * @param set make of Car
 */
    public void setMake(String make) {
        this.make = make;
    }
/**
 * 
 * @return model of Car
 */
    public String getModel() {
        return model;
    }
/**
 * 
 * @param set model of Car
 */
    public void setModel(String model) {
        this.model = model;
    }
/**
 * 
 * @return year of Car
 */
    public int getYear() {
        return year;
    }
/**
 * 
 * @param set year of Car
 */
    public void setYear(int year) {
        this.year = year;
    }
/**
 * 
 * @return AvgMpg of Car
 *
 */
    public double getAvgMpg() {
        return avgMpg;
    }
/**
 * 
 * @param set avgMpg of Car
 */
    public void setAvgMpg(double avgMpg) {
        this.avgMpg = avgMpg;
    }

    //methods beyond getter and setter
    public String abbreviateModel() {
        String shortModel = model.substring(0,3);
        return shortModel;
    }
    
    @Override
    //this method overrides the method in Object
    public String toString() {
        //Car has access to its own data
        String s = super.toString();
        s = s + ". This car is a " + make + " " + model + " from " + year + 
                " and gets " + avgMpg + " mpg";
        return s;
    }
    
    
}

