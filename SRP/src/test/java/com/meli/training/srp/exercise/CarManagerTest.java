package com.meli.training.srp.exercise;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarManagerTest {
    private CarManager carManager;

    @Before
    public void setUp() throws Exception {
        carManager = new CarManager();
    }

    @Test
    public void testGetFromDb() throws Exception {
        Car car = carManager.getFromDb("1");
        assertEquals("Volkswagen", car.getBrand());
        assertEquals("Golf III", car.getModel());
    }

    @Test
    public void testGetCarsNames() throws Exception {
        String carsNames = carManager.getCarsNames();
        assertEquals("Volkswagen Golf III, Fiat Multipla, Renault Megane", carsNames);
    }

    @Test
    public void testGetBestCar() throws Exception {
        Car bestCar = carManager.getBestCar();
        assertEquals("Fiat", bestCar.getBrand());
        assertEquals("Multipla", bestCar.getModel());
    }
}
