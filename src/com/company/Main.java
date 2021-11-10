package com.company;

public class Main {
    public static void main(String[] args){
        Smartphone smartphone = new Smartphone(new IceRoadAdapter());
        smartphone.chargeTheSmartphone();
    }

}
