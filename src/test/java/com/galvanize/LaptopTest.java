package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LaptopTest {
    @Test
    public void itIsOffByDefault(){
        //Setup
        Laptop laptop = new Laptop();
        //Execution
        boolean expected = false;
        boolean actual = laptop.isOn();
        assertEquals(expected,actual);
    }
    @Test
    public void callingPowerTurnsItOn(){

        //Setup
        Laptop laptop = new Laptop();

        //Execution
        laptop.power();
        boolean expected = true;
        boolean actual = laptop.isOn();

        //Assertion
        assertEquals(expected,laptop.isOn());
    }
    @Test
    public void callingPowerWhenOnTurnsItOff(){

        //Setup
        Laptop laptop = new Laptop();

        //Execution
        laptop.power();
        laptop.power();
        boolean expected = false;
        boolean actual = laptop.isOn();

        //Assertion
        assertEquals(expected,actual);
    }
    @Test
    public void itCanBePutToSleep(){

        //Setup
        Laptop laptop = new Laptop();

        //Execution
        laptop.power();
        laptop.sleep();

        //Assertion
        assertEquals(true,laptop.isOn());
        assertEquals(true,laptop.isSleeping());
    }
    @Test
    public void callingPowerCanWakeUpTheLaptop(){

        //Setup
        Laptop laptop = new Laptop();

        //Execution
        laptop.power();
        laptop.sleep();
        laptop.power();

        //Assertion
        assertEquals(true,laptop.isOn());
        assertEquals(false,laptop.isSleeping());
    }
}
