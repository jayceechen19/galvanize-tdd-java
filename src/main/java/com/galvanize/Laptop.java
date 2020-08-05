package com.galvanize;

public class Laptop {
    private boolean isOn = false;
    private boolean isSleeping = false;


    public boolean isOn() {
        return isOn;
    }
    public void power() {
        if(isSleeping){
            isSleeping = false;
        }else{
            isOn = !isOn;
        }
    }
    public void sleep() {
        isSleeping=true;
    }
    public boolean isSleeping() {
        return isSleeping;
    }



}
