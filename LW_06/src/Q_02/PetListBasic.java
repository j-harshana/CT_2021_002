package Q_02;

import java.util.Scanner;

public class PetListBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] pets = new Pet[100]; // Can store up to 100 pets
        int count = 0;

        while (true) {
            System.out.print("Enter pet name and type (e.g., Dingo d), or STOP to end: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("STOP")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please use format: Name Type (e.g., Kitty c)");
                continue;
            }

            String name = parts[0];
            char type = parts[1].toLowerCase().charAt(0);

            if (type == 'c' || type == 'd') {
                pets[count] = new Pet(name, type);
                count++;
            } else {
                System.out.println("Invalid type. Use 'c' for cat or 'd' for dog.");
            }

            if (count >= pets.length) {
                System.out.println("Pet list is full.");
                break;
            }
        }

        System.out.println("\nPet List:");
        for (int i = 0; i < count; i++) {
            System.out.println(pets[i].name + " - " + pets[i].getTypeName());
        }

        scanner.close();
    }
}
