package com.company;

public class Main {

    public static void main(String[] args) {

        Planet[] planets = Planet.values();

//        findAPlanetThatIsLessThanDays(planets);
//        System.out.println();
//        findAPlanetThatIsMoreThanDays(planets);
//        System.out.println();

        findAPlanetThatIsLessThanDays2(planets);
        System.out.println();
        findAPlanetThatIsMoreThanDays2(planets);


    }

    static  Planet findAPlanetThatIsLessThanDays2(Planet[] planets){
        System.out.println("Planet with fewer days");
        int min = planets[0].getDays();
      for (int i = 0; i<planets.length;i++){
          if(planets[i].getDays()<min){
              min = planets[i].getDays();
          }
      }System.out.println(min+" days");

        for (int j = 0; j<planets.length;j++){
            if(planets[j].getDays()==min){
                System.out.println(planets[j].name());

            }
        }
      return null;

    }

    static  Planet findAPlanetThatIsMoreThanDays2(Planet[] planets){
        System.out.println("Planet with more days");
        int max = planets[0].getDays();
        for (int i = 0; i<planets.length;i++){
            if(planets[i].getDays()>max){
                max = planets[i].getDays();
            }
        }System.out.println(max+" days");

        for (int j = 0; j<planets.length;j++){
            if(planets[j].getDays()==max){
                System.out.println(planets[j].name());

            }
        }
        return null;

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
