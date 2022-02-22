package vehicle;

public interface ICar {

    void start();

    void stop();

    void go(double s) throws Exception;

    void restoreFuel(double amount) throws Exception;

    

}
