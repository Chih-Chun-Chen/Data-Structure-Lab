import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList206<String> linkedlist = new LinkedList206();

        while (true) {
            var command = scanner.next();
            if (command.equals("PUSH")) {
                var value = scanner.next();
                linkedlist.addNode(value);
            } else if (command.equals("POP")) {
                if (linkedlist.get(linkedlist.size - 1) == null) {
                    System.out.println("empty");
                } else {
                    System.out.println(linkedlist.get(linkedlist.size - 1));
                    linkedlist.removeAt(linkedlist.size - 1);
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
