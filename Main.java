import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try {
            Pets[] pets = new Pets[3];
            Hero Kai = new Hero("Kai"); 
            pets[0] = new Pets("Chó");
            pets[1] = new Pets("Mèo");
            pets[2] = new Pets("Chuột");
        
            Kai.addPets(pets);
            Kai.setLevel(10);
            Kai.riding_pet(2); // Chọn thú cưỡi;
    
            System.out.println("Power: "+Kai.caculatePower());
        } catch (Exception error) {
            System.out.println(error);
        }
    }    
}
