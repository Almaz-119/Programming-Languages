package game;

import game.utils.*;

public class Player {
    String name, ip_address;
    int health;
    Vehicle vehicle;

    public Player(String name, String ip, int health, Vehicle vehicle) {
        this.name = name;
        this.ip_address = ip;
        this.health = health;
        this.vehicle = vehicle;
    } 
    
    public String toString() {
        if (vehicle != null) {
            return "name: " + name + " IP: " + ip_address + " Health: " +  health + " Vehicle: " + vehicle.getRegNumber();
        }
        return "name: " + name + " IP: " + ip_address + " Health: " +  health + " Vehicle: NO VEHICLE"; 
    }
}