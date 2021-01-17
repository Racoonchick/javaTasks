package com.company.task6;

public class Bag {
    public int lifting;
    public int costOfItems=0;
    public Bag(){}
    public Bag(int setlift){
        lifting=setlift;
    }
    public void setLift(int lift){
        lifting=lift;
    }
    public void addObj(BagObject a){
        lifting-=a.getWeight();
        costOfItems+=a.getCost();
    }
    public int getWeight(){
        return lifting;
    }
    public int getCost(){
        return costOfItems;
    }
}
