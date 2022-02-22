package vehicle;

import driver.*;
import engine.*;



public class Car implements ICar,Cloneable {


    protected final Engine engine;
    protected final Driver driver;
    protected final String name;
    protected final double weight;

    protected double fuel_lv=0,path=0;

    /**------------------------
     -------------------------**/


    public Car(Engine engine, Driver driver,
               String name, double weight) {
        this.engine = engine;
        this.driver = driver;
        this.name = name;
        this.weight = weight;
    }

    /**------------------------
     -------------------------**/

    public Car(Engine engine,
               String name, double weight) {
        this.engine = engine;
        this.driver=new Driver("Alex",3);
        this.name = name;
        this.weight = weight;
    }

    /**------------------------
    -------------------------**/


    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getFuel_lv() {
        return fuel_lv;
    }

    public double getPath() {
        return path;
    }


    /**------------------------
     -------------------------**/


    public void start(){
        engine.startEngine();
    }

    public void stop(){
        engine.stopEngine();
    }

    /**------------------------
     -------------------------**/

    @Override
    public void restoreFuel(double amount) throws Exception{
        if (amount<0) {
            throw new Exception("Amount can't be negative");
        }

        fuel_lv+=amount;
    }

    /**------------------------
     -------------------------**/

    @Override
    public void go(double s) throws Exception{
        if (s<0) {
            throw new Exception("Path can't be negative");
        }

        double p=engine.getFuel_cons()*(s/100);

        if(p>fuel_lv){
            throw new Exception("We have not got a fuel");
        }

        path+=s;
        fuel_lv-=p;
    }

    /**------------------------
     -------------------------**/

    @Override
    public String toString(){

        return "Name: "+name+"\n"+
                "Weight: "+weight+"\n"+
                driver+
                engine;
    }


    @Override
    public Car clone() {return new Car(engine,driver,name,weight);}
}
