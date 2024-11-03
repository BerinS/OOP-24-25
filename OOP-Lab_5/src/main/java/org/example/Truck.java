package org.example;

public class Truck extends Vehicle implements Repairable{

    public Truck(String modelName){
        super(modelName);
        lifespan = expectedLifespan()-mileage;
    }
    public Truck(String modelName, int mileage, int health){
        super(modelName, mileage, health);
        lifespan = expectedLifespan()-mileage;
    }

    @Override
    public String repair(){
        return "Engine overhauled and tyres changed for " + modelName;
    }
    @Override
    public String service(){
        return "Service preformed for " + modelName + ". " +
                "At the time of service, vehicle had " + mileage + " miles and was at " + health + " health.";
    }
    @Override
    public int expectedLifespan(){
        return 1000000;
    }

    public void haul(int loadWeight){
        mileage += 1000;
        if(loadWeight > 5000){
            health -= 5;
        }
        else{
            health--;
        }
        if(health < 30){
            lifespan -= 20000;
        }

    }
}