package com.company;

public class Main {

    public static void main(String[] args) {

        Planet[] planets = Planet.values();

        System.out.println(findAPlanetThatIsLessThanDays(planets));
        System.out.println();
        System.out.println(findAPlanetThatIsMoreThanDays(planets));


    }

    static  Planet findAPlanetThatIsLessThanDays(Planet[] planets){
        System.out.println("Planet with fewer days");
        int ordinal = -1;
        int min = planets[0].getDays();
      for (int i = 0; i<planets.length;i++){
          if(planets[i].getDays()<min){
              min = planets[i].getDays();
          }
      }//System.out.println(min+" days");

        for (int j = 0; j<planets.length;j++){
            if(planets[j].getDays()==min){
    //                System.out.println(planets[j].name());
                ordinal = planets[j].ordinal();
            }
        }
      return planets[ordinal];
    }

    static  Planet findAPlanetThatIsMoreThanDays(Planet[] planets){
        System.out.println("Planet with more days");
        int ordinal = -1;
        int max = planets[0].getDays();
        for (int i = 0; i<planets.length;i++){
            if(planets[i].getDays()>max){
                max = planets[i].getDays();
            }
        }//System.out.println(max+" days");

        for (int j = 0; j<planets.length;j++){
            if(planets[j].getDays()==max){
                ordinal = planets[j].ordinal();
                //System.out.println(planets[j].name());
            }
        }
        return planets[ordinal];
    }



}
