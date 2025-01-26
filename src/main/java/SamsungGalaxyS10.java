package org.example;

class SamsungGalaxyS10 extends org.example.Phone {
    public SamsungGalaxyS10(String IMEI, String color, String material) {
        super(15, IMEI, color, material);
    }

    @Override
    public String getProducer() {
        return "Samsung";
    }

    @Override
    public String getModel() {
        return "Galaxy S10";
    }
}
