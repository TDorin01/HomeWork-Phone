package org.example;

class SamsungGalaxyS24 extends org.example.Phone {
    public SamsungGalaxyS24(String IMEI, String color, String material) {
        super(10, IMEI, color, material);
    }

    @Override
    public String getProducer() {
        return "Samsung";
    }

    @Override
    public String getModel() {
        return "Galaxy S24";
    }
}