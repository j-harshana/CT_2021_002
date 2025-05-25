package Q_03;


import java.util.Scanner;

public class PetList {
    public static final int MAX_VALUE = 10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet[] pets = new Pet[MAX_VALUE];
        int petCount = 0;

        //input the data to array
        System.out.println("First Enter [Pet's Name],then [Pet Type]. Enter 'STOP' to finish.");

        while (true) {
            System.out.print("Enter Pet: ");
            String name = scan.nextLine();

            if (name.equalsIgnoreCase("stop")) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the pet type('c' for cat and 'd' for dog): ");
            char type = scan.nextLine().charAt(0);

            if (type == 'c') {
                pets[petCount] = new Cat(name);
            } else if (type == 'd') {
                pets[petCount] = new Dog(name);
            } else {
                System.out.print("Invalid Input.!");
            }
            petCount = petCount + 1;
        }

        //print the array
        System.out.println("\tCat List");
        int catCount = 1;
        for (int i = 0; i < petCount; i++) {
            if (pets[i].getClass().getSimpleName().equals("Cat")) {
                System.out.println("Cat " + catCount + ": " + pets[i].getName());
                catCount ++;
            }
        }

        System.out.println("\tDog List");
        int dogCount = 2;
        for (int i = 0; i < petCount; i++) {
            if (pets[i].getClass().getSimpleName().equals("Dog")) {
                System.out.println("Dog " + dogCount + ": " + pets[i].getName());
                dogCount ++;
            }
        }
    }
}

