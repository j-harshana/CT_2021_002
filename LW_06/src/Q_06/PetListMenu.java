package Q_06;

import java.util.ArrayList;
import java.util.Scanner;

public class PetListMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Pet> allPets = new ArrayList<>();
        ArrayList<Cat> catList = new ArrayList<>();
        ArrayList<Dog> dogList = new ArrayList<>();

        System.out.println("Enter pets (name + type). Type 'STOP' to end initial input.");
        while (true) {
            System.out.print("Enter Pet Name: ");
            String name = scan.nextLine();
            if (name.equalsIgnoreCase("stop")) break;

            System.out.print("Enter pet type ('c' for cat, 'd' for dog): ");
            char type = scan.nextLine().toLowerCase().charAt(0);

            if (type == 'c') {
                System.out.print("Enter coat color: ");
                String color = scan.nextLine();

                Cat cat = new Cat(name);
                cat.setCoatColor(color);

                allPets.add(cat);
                catList.add(cat);
            } else if (type == 'd') {
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                scan.nextLine();

                Dog dog = new Dog(name);
                dog.setWeight(weight);

                allPets.add(dog);
                dogList.add(dog);
            } else {
                System.out.println("Invalid type.");
            }
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Choose option: ");
            int choice = scan.nextInt();
            scan.nextLine(); // consume newline

            if (choice == 0) {
                System.out.println("Exiting...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter cat name: ");
                    String catName = scan.nextLine();
                    System.out.print("Enter coat color: ");
                    String color = scan.nextLine();
                    Cat newCat = new Cat(catName);
                    newCat.setCoatColor(color);
                    allPets.add(newCat);
                    catList.add(newCat);
                    break;

                case 2:
                    System.out.print("Enter dog name: ");
                    String dogName = scan.nextLine();
                    System.out.print("Enter weight: ");
                    double weight = scan.nextDouble();
                    scan.nextLine(); // consume newline
                    Dog newDog = new Dog(dogName);
                    newDog.setWeight(weight);
                    allPets.add(newDog);
                    dogList.add(newDog);
                    break;

                case 3:
                    System.out.print("Enter cat name to remove: ");
                    String removeCatName = scan.nextLine();
                    catList.removeIf(cat -> cat.getName().equalsIgnoreCase(removeCatName));
                    allPets.removeIf(pet -> pet instanceof Cat && pet.getName().equalsIgnoreCase(removeCatName));
                    break;

                case 4:
                    System.out.print("Enter dog name to remove: ");
                    String removeDogName = scan.nextLine();
                    dogList.removeIf(dog -> dog.getName().equalsIgnoreCase(removeDogName));
                    allPets.removeIf(pet -> pet instanceof Dog && pet.getName().equalsIgnoreCase(removeDogName));
                    break;

                default:
                    System.out.println("Invalid option!");
            }

            System.out.println("\n--- Current Cats ---");
            for (Cat c : catList) {
                System.out.println(c.getName() + " - Coat Color: " + c.getCoatColor());
            }

            System.out.println("\n--- Current Dogs ---");
            for (Dog d : dogList) {
                System.out.println(d.getName() + " - Weight: " + d.getWeight() + " kg");
            }
        }

        scan.close();
    }
}
