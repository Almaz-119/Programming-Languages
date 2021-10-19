package game;

import game.utils.Vehicle;
import game.Player;

public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(5,1,1,"#1");
        Vehicle v2 = new Vehicle(7,2,2,"#2");
        Vehicle v3 = new Vehicle(5,3,3,"#3");

        Player p1 = new Player("Almaz", "192:100:12", 100, v1);
        Player p2 = new Player("Beks", "192:100:12", 100, null);

        System.out.println(p1);
        System.out.println(p2);
    }
}