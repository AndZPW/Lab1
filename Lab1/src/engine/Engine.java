package engine;

public class Engine implements IEngine {

    private final double power;
    private boolean state=false;
    private final double fuel_cons;

    /**------------------------
     -------------------------**/

    public Engine(double power,
                  double fuel_cons) {
        this.power = power;
        this.fuel_cons = fuel_cons;
    }

    /**------------------------
     -------------------------**/

    @Override
    public void startEngine(){
        state=true;
    }


    @Override
    public void stopEngine(){
        state=false;
    }


    public boolean isState() {
        return state;
    }


    public double getPower() {
        return power;
    }


    public double getFuel_cons() {
        return fuel_cons;
    }

    @Override
    public String toString(){
        return "Power: "+power+"\n"+
                "Fuel cons: "+fuel_cons+"\n";
    }
}
