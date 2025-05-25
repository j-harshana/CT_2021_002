package Q_05;


import java.util.Scanner;

public class PetListNew {
    public static final int MAX_VALUE = 10;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PetQ5[] pets = new PetQ5[MAX_VALUE];
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

                CatQ5 cat = new CatQ5(name);
                cat.setCoatColor(coatColor);
                pets[petCount] = cat;
                petCount++;

            } else if (type == 'd') {
                System.out.print("Enter weight: ");
                double weight = scan.nextDouble();
                scan.nextLine();

                DogQ5 dog = new DogQ5(name);
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
            if(pets[i] instanceof CatQ5){
                CatQ5 cat = (CatQ5) pets[i];
                System.out.println("Cat "+catCount+":"+cat.getName()+" - Coat Color: "+cat.getCoatColor());
                catCount++;
            }
        }

        System.out.println("\tDog List");
        int dogCount = 1;
        for (int i = 0; i < petCount; i++) {
            if (pets[i] instanceof DogQ5) {
                DogQ5 dog = (DogQ5) pets[i];
                System.out.println("Dog " + dogCount + ": " + dog.getName()+" - Weight: "+dog.getWeight()+" kg");
                dogCount ++;
            }
        }

        // Create dog-only array
        DogQ5[] dogList = new DogQ5[petCount];
        int dogCounts = 0;
        for (int i = 0; i < petCount; i++) {
            if (pets[i] instanceof DogQ5) {
                dogList[dogCounts] = (DogQ5) pets[i];
                dogCounts++;
            }
        }

        // Calculate average, min, max
        if (dogCounts > 0) {
            double total = 0;
            double min = dogList[0].getWeight();
            double max = dogList[0].getWeight();

            for (int i = 0; i < dogCounts; i++) {
                double w = dogList[i].getWeight();
                total += w;
                if (w < min) min = w;
                if (w > max) max = w;
            }

            double avg = total / dogCounts;

            System.out.println("\nDog Weight Stats:");
            System.out.println("Average Weight: " + avg + " kg");
            System.out.println("Minimum Weight: " + min + " kg");
            System.out.println("Maximum Weight: " + max + " kg");
        } else {
            System.out.println("\nNo dogs found to calculate weights.");
        }
    }
}

