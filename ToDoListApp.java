import java.util.*;

public class ToDoListApp {

    public static void displayToDoList(ArrayList<String> toDoList)
    {
        if(toDoList.size()>0) {
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
        else
        {
            System.out.println("To-Do List is empty!");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add item ");
            System.out.println("2. Remove item ");
            System.out.println("3. View to-do list ");
            System.out.println("4. Exit ");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to add in list: ");
                    String newItem = scanner.nextLine();
                    toDoList.add(newItem);
                    System.out.println("Item added to the to-do list.");
                    break;
                case 2:
                    System.out.println("Current to-do list:");
                    displayToDoList(toDoList);
                    System.out.print("Enter the index of the item to remove: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < toDoList.size()) {
                        toDoList.remove(indexToRemove);
                        System.out.println("Item removed from the to-do list.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:
                    System.out.println("Current to-do list:");
                    displayToDoList(toDoList);
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
