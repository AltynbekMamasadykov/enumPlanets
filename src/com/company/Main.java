package com.company;

public class Main {

    public static void main(String[] args) {

        Planet[] planets = Planet.values();

        findAPlanetThatIsLessThanDays(planets);
        System.out.println();
        findAPlanetThatIsMoreThanDays(planets);


    }

    static  Planet findAPlanetThatIsLessThanDays(Planet[] planets){
        System.out.println("Planets with fewer days");
        for (Planet p:planets) {
            if(p.getDays()<1000){
                System.out.println(p.name()+" has " +p.getDays()+" days");
            }
        }
        return null;
    }

    static  Planet findAPlanetThatIsMoreThanDays(Planet[] planets){
        System.out.println("Planets with more days");
        for (Planet p:planets) {
            if(p.getDays()>1000){
                System.out.println(p.name()+" has " +p.getDays()+" days");
            }
        }
        return null;
    }

}
