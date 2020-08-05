package com.galvanize;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LightSaberTest {
    @Test
    public void itCreatesASerialNumber(){
        LightSaber lightSaber = new LightSaber(1);
        long expected = 1;
        long actual = lightSaber.getJediSerialNumber();
        assertEquals(expected, actual);
    }
    @Test
    public void itCanSetACharge(){
        LightSaber lightSaber = new LightSaber(1);
        lightSaber.setCharge(98.0f);
        float expected = 98.0f;
        float actual = lightSaber.getCharge();
        assertEquals(expected,actual);
    }
    @Test
    public void itCanChangeColor(){
        LightSaber lightSaber = new LightSaber(1);
        lightSaber.setColor("green");
        String expected = "green";
        String actual = lightSaber.getColor();
        assertEquals(expected, actual);
    }
    @Test
    public void itDecreasesTheCharge(){
        LightSaber lightSaber = new LightSaber(1);
        lightSaber.use(60);
        float expected = 90.0f;
        float actual = lightSaber.getCharge();
        assertEquals(expected, actual);
    }
    @Test
    public void itRecharges(){
        LightSaber lightSaber = new LightSaber(1);
        lightSaber.use(60);
        lightSaber.recharge();
        float expected = 100.0f;
        float actual = lightSaber.getCharge();
        assertEquals(expected,actual);
    }
    @Test
    public void itCalculatesTimeRemaining(){
        LightSaber lightSaber = new LightSaber(1);
        float expected = 300f;
        float actual = lightSaber.getRemainingMinutes();
        assertEquals(expected, actual);
    }
}
