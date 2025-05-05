package Q_05;

        import java.util.*;

        public class Q_05 {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                String[][] menuItems = {
                    {"Tofu Burger", "Cajun Chicken", "Buffalo Wings", "Rainbow Fillet"},
                    {"Rice Cracker", "No-Salt Fries", "Zucchini", "Brown Rice"},
                    {"Cafe Mocha", "Cafe Latte", "Espresso", "Oolong Tea"}
                };
                double[][] menuPrices = {
                    {3.49, 4.59, 3.99, 2.99},
                    {0.79, 0.69, 1.09, 0.59},
                    {1.99, 1.90, 2.49, 0.99}
                };
                String[] categories = {"Entree", "Side Dish", "Drink"};

                ArrayList<String> orderedItems = new ArrayList<>();
                HashSet<String> selectedItems = new HashSet<>();
                double totalPrice = 0.0;

                int choice;
                do {
                    System.out.println("\nMain Menu:");
                    for (int i = 0; i < categories.length; i++) {
                        System.out.printf("%d. %s\n", i + 1, categories[i]);
                    }
                    System.out.println("4. Finish and Show Total");
                    System.out.print("Please 'click' the number of your choice: ");
                    choice = scan.nextInt();

                    if (choice >= 1 && choice <= 3) {
                        totalPrice += selectItems(categories[choice - 1], menuItems[choice - 1], menuPrices[choice - 1], orderedItems, selectedItems, scan);
                    } else if (choice == 4) {
                        System.out.println("\nTHANK YOU FOR ORDERING!!");
                        System.out.println("Your ordered items:");
                        orderedItems.forEach(item -> System.out.println("- " + item));
                        System.out.printf("Total: $%.2f\n", totalPrice);
                    } else {
                        System.out.println("Invalid choice. Please try again.");
                    }
                } while (choice != 4);
            }

            public static double selectItems(String category, String[] items, double[] prices,
                                             ArrayList<String> order, HashSet<String> selectedSet, Scanner scan) {
                double categoryTotal = 0.0;
                int selection;

                do {
                    System.out.println("\n" + category + " Menu:");
                    for (int i = 0; i < items.length; i++) {
                        System.out.printf("%d. %s \t $%.2f%s\n",
                                i + 1, items[i], prices[i],
                                selectedSet.contains(items[i]) ? " [Already Selected]" : "");
                    }
                    System.out.println("0. Done with " + category);
                    System.out.print("Click item number to select (0 to stop): ");
                    selection = scan.nextInt();

                    if (selection >= 1 && selection <= items.length) {
                        String selectedItem = items[selection - 1];
                        if (selectedSet.add(selectedItem)) {
                            order.add(selectedItem + " ($" + prices[selection - 1] + ")");
                            categoryTotal += prices[selection - 1];
                            System.out.println("Added: " + selectedItem);
                        } else {
                            System.out.println("You've already selected that item.");
                        }
                    } else if (selection != 0) {
                        System.out.println("Invalid selection.");
                    }
                } while (selection != 0);

                return categoryTotal;
            }
        }