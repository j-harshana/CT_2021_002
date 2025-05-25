package Q_02;

import java.util.Scanner;

public class PetList {
    public static final int MAX_VALUE = 10;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pet[] pets = new Pet[MAX_VALUE];
        int petCount = 0;

        //input the data to array
        System.out.println("First enter [Pet's Name], then [Pet Type] or 'STOP' to finish.");

        while(true){
            System.out.print("Enter Pet: ");
            String name = scan.nextLine();

            if(name.equalsIgnoreCase("stop")){
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the pet type('c' for cat and 'd' for dog): ");
            char type = scan.nextLine().charAt(0);

            if(type == 'c'){
                pets[petCount] = new Cat(name);
            } else if (type == 'd'){
                pets[petCount] = new Dog(name);
            }else{
                System.out.print("Invalid Input.!");
            }
            petCount = petCount + 1;
        }

        //print the array
        System.out.println("\tPet List");
        for(int i = 0; i < petCount; i++){
            System.out.println("Pet "+(i+1)+ ": "+pets[i].getName()+" ("+pets[i].getType()+")");
        }
    }
}
