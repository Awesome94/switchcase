package com.pluralsight.Switch;

/**
 * Created by AWESOME on 24/07/2017.
 */
public class Chef {

//    public void inHisHands(Spoon spoon){
//        System.out.println(spoon.utensilType());
//    }

    public void inHisHands(Utensils type){
        System.out.println(type.utensilType());
    }
    public static void main(String[] args){
        Spoon bigspoon = new Spoon();
        Pot smallpot = new Pot();
        Chef blackChef = new Chef();
        blackChef.inHisHands(bigspoon);
    }
}
