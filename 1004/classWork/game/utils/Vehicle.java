package game.utils;

public class Vehicle {
    
    private int id,color1,color2;
    private String reg_number;

    public Vehicle(int id,int color1,int color2,String reg_number) {
        this.id = id;
        this.color1 = color1;
        this.color2 = color2;
        this.reg_number = reg_number;
    }

    public String getRegNumber() {
        return reg_number;
    }
    public void setRegNumber(String number) {
        this.reg_number = number;
    }
}