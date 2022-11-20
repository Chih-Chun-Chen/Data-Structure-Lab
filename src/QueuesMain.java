import java.util.Scanner;

public class QueuesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList206<String> linkedlist = new LinkedList206();

        while (true) {
            var command = scanner.next();
            if (command.equals("ENQUEUE")) {
                var value = scanner.next();
                linkedlist.insertAt(linkedlist.size, value);
            } else if (command.equals("DEQUEUE")) {
                if (linkedlist.get(0) == null) {
                    System.out.println("empty");
                } else {
                    System.out.println(linkedlist.get(0));
                    linkedlist.removeAt(0);
                }
            } else if (command.equals("CLEAR")) {
                if (linkedlist.size != 0) {
                    for (int i = linkedlist.size - 1; i >= 0; i--) {
                        linkedlist.removeAt(i);
                    }
                }
            } else if (command.equals("PRINT")) {
                if (linkedlist.size != 0) {
                    for (int j = 0; j < linkedlist.size; j++) {
                        System.out.println(linkedlist.get(j));
                    }
                }
            } else {
                break;
            }
        }
    }
}
