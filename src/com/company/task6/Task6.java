package com.company.task6;

import java.util.Scanner;

public class Task6 {
    public static void run() {
        Scanner scanner = new Scanner(System.in);
        Bag _bag = new Bag();
        _bag.setLift(20);
        BagObject a = new BagObject(5, 20);
        BagObject b = new BagObject();
        BagObject c = new BagObject(1, 2);
        b.addParameters(3, 15);
        int bestItem = 0;
        BagObject biggestItem = new BagObject();
        BagObject bestIt = new BagObject();
        if (a.costPerWeight() > bestItem) {
            bestItem = a.costPerWeight();
            bestIt = a;
        }
        if (b.costPerWeight() > bestItem) {
            bestItem = b.costPerWeight();
            bestIt = b;
        }
        if (c.costPerWeight() > bestItem) {
            bestItem = c.costPerWeight();
            bestIt = c;
        }
        if (a.getWeight() > biggestItem.getWeight()) {
            biggestItem = a;
        }
        if (b.getWeight() > biggestItem.getWeight())
            biggestItem = b;
        if (c.getWeight() > biggestItem.getWeight())
            biggestItem = c;
        while (_bag.getWeight() > biggestItem.getWeight()) {
            _bag.addObj(bestIt);
        }
        if (biggestItem.getCost() > b.getCost() + c.getCost() + c.getCost())
            _bag.addObj(biggestItem);
        else {
            _bag.addObj(b);
            _bag.addObj(b);
            _bag.addObj(c);
        }
        System.out.println(_bag.getCost());
    }
}