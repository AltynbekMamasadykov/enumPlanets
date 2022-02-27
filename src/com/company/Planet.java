package com.company;

public enum Planet {
    MERCURY(88),
    VENUS(225),
    EARTH(365),
    MARS(687),
    JUPITER(4333),
    SATURN(10759),
    URANUS(30687),
    NEPTUNE(60200);

    private final int days;

    Planet(int days) {
        this.days = days;
    }

    public int getDays() {
        return days;
    }

}
