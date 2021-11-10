package com.company;

public class IceRoadAdapter implements MicroUSB {
    private USBTypeC charger;

    public IceRoadAdapter() {
        charger = new USBTypeC();
    }

    public void charge() {
        charger.charge();
    }
}
