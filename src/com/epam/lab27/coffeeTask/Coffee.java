package com.epam.lab27.coffeeTask;

public abstract class Coffee {
    private Double waterQuantity;

    public Coffee() {
    }

    public Coffee(Double waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    public Double getWaterQuantity() {
        return waterQuantity;
    }

    public void setWaterQuantity(Double waterQuantity) {
        this.waterQuantity = waterQuantity;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "waterQuantity=" + waterQuantity +
                '}';
    }
}




