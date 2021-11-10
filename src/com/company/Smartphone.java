package com.company;

public class Smartphone {
    private MicroUSB microUSB;

    public Smartphone(){}

    public Smartphone(MicroUSB microUSB){
        this.microUSB = microUSB;
    }

    public void chargeTheSmartphone() {
        System.out.println("Let's charge smartphone");
        microUSB.charge();
        System.out.println("Smartphone is full");
    }
}
