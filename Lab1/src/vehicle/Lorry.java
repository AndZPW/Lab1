package vehicle;

import driver.Driver;
import engine.Engine;

public class Lorry extends Car {

    private final double max_weight;
    private double weight_w=weight;


    public Lorry(Engine engine, Driver driver, String name, double weight,double max_weight) {
        super(engine, driver, name, weight);
        this.max_weight=max_weight;
    }

    public Lorry(Engine engine, Driver driver, String name, double weight) {
        super(engine, driver, name, weight);
        this.max_weight=4000;
    }

    public Lorry(Engine engine, String name, double weight) {
        super(engine,name, weight);
        this.max_weight=4000;
    }

    public Lorry(Engine engine, String name, double weight,double max_weight) {
        super(engine,name, weight);
        this.max_weight=max_weight;
    }

    public double getMax_weight() {
        return max_weight;
    }

    public void zavantazutu(double weight1) throws Exception{
        if((weight1+weight)>max_weight){
            throw new Exception("Weight is very big");
        }

        weight_w+=weight1;
    }

}
