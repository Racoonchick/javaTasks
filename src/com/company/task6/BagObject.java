package com.company.task6;

public class BagObject {
    public int weight;
    public int cost;
    public BagObject(){}
    public BagObject(int we, int co){
        weight=we;
        cost=co;
    }
    public void addParameters(int we,int co){
        weight=we;
        cost=co;
    }
    public int costPerWeight(){
        return cost/weight;
    }
    public int getCost(){
        return cost;
    }
    public int getWeight(){
        return weight;
    }

}
