package spring.impl.navigation;

import spring.interfaces.NavigationSystem;



public class Navitel implements NavigationSystem {
    public boolean createRoute() {
        System.out.println("*****************************");
        System.out.println("Route was created by Navitel");
        System.out.println("*****************************");
        return true;
    }
}
