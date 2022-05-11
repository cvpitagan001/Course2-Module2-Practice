import java.util.Scanner;

public class AutoMobileDriver {

    static Scanner get = new Scanner(System.in);
    static AutoMobileDriver main = new AutoMobileDriver();
    public static void main(String[] args) {
        AutoMobile auto = new AutoMobile();
        System.out.print("How many cars do you want to consider: ");
        int qty = get.nextInt();
        
        main.selectMake(qty, auto);
    }


    void selectMake(int qty, AutoMobile auto) {
        int counter = 0;
        while(counter < qty) {
            System.out.print("Select Buick, Chevrolet, or Pontiac (b,c,p): ");
            String selected = get.next();

            if(selected.equalsIgnoreCase("b")) auto.setMake("Buick");
            else if(selected.equalsIgnoreCase("c")) auto.setMake("Chevrolet");
            else if(selected.equalsIgnoreCase("p")) auto.setMake("Pontiac");
            else {
                System.out.println("The only valid selections are 'b', 'c', or 'p'");
                counter = 0;
                main.selectMake(qty, auto);
            } 
    
            main.selectColor(auto);
    
            auto.printColor();
            auto.printMake();
            counter++;
        }
    }

    void selectColor(AutoMobile auto) {
        System.out.print("Select blue, green, or red (b,g,r): ");
        String color = get.next();

        if(color.equalsIgnoreCase("b")) auto.setColor("blue");
        if(color.equalsIgnoreCase("g")) auto.setColor("green");
        if(color.equalsIgnoreCase("r")) auto.setColor("red");
    }
}