package main;

import driver.*;
import engine.*;
import vehicle.*;

public class Main {
    public static void main(String[] args) {
        Driver s=new Driver("Slave",4);
        Engine engine=new Engine(190,2);
        ICar my_car =new Car(engine,s,"Ford",1000);
        System.out.println(my_car);

    }
}
