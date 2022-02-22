package driver;

public class Driver implements IDriver {

    private final String name;
    private final double exp;

    public Driver(String name, double exp) {
        this.name = name;
        this.exp = exp;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getExp() {
        return exp;
    }

    @Override

    public String toString(){
        return "Driver name: "+name+"\n"+
                "Driver experience: "+exp+"\n";
    }
}
