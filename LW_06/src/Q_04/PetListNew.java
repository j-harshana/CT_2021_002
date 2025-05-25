package Q_04;

import java.util.Scanner;

public class PetListNew {
    public static final int MAX_VALUE = 10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet[] pets = new Pet[MAX_VALUE];
        int petCount = 0;

        //input the data to array
        System.out.println("First Enter [Pet's Name],then [Pet Type]. Enter 'STOP' to finish.");

        while (true) {
            System.out.print("Enter Pet Name: ");
            String name = scan.nextLine();

            if (name.equalsIgnoreCase("stop")) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the pet type('c' for cat and 'd' for dog): ");
            char type = scan.nextLine().charAt(0);

            if (type == 'c') {
                System.out.print("Enter coat color: ");
                String coatColor = scan.nextLine();

                Cat cat = new Cat(name);
                cat.setCoatColor(coatColor);
                pets[petCount] = cat;
                petCount++;

            } else if (type == 'd') {
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                scan.nextLine();

                Dog dog = new Dog(name);
                dog.setWeight(weight);
                pets[petCount] = dog;
                petCount++;

            } else {
                System.out.print("Invalid Input.!");
            }
        }

        //print the array
        System.out.println("\tCat List");
        int catCount = 1;
        for (int i = 0; i < petCount; i++) {
            if(pets[i] instanceof Cat){
                Cat cat = (Cat) pets[i];
                System.out.println("Cat "+catCount+":"+cat.getName()+" - Coat Color: "+cat.getCoatColor());
                catCount++;
            }
        }

        System.out.println("\tDog List");
        int dogCount = 1;
        for (int i = 0; i < petCount; i++) {
            if (pets[i] instanceof Dog) {
                Dog dog = (Dog) pets[i];
                System.out.println("Dog " + dogCount + ": " + dog.getName()+" - Weight: "+dog.getWeight()+" kg");
                dogCount ++;
            }
        }
    }
}

