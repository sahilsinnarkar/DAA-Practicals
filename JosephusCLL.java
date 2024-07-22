import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLL {
    Node head = null, tail = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    public void removeNode(Node node) {
        if (head == null)
            return;

        Node temp = head, prev = null;
        if (head == node) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            return;
        }

        while (temp != node && temp.next != head) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == node) {
            prev.next = temp.next;
            if (tail == node) {
                tail = prev;
            }
        }
    }

    public int josephus(int k) {
        Node current = head;

        while (head != tail) {
            for (int i = 0; i < k - 1; i++) {
                current = current.next;
            }
            removeNode(current);
            current = current.next;
        }

        return head.data;
    }
}

public class JosephusCLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        System.out.print("Enter number of skip: ");
        int k = sc.nextInt();

        CircularLL cll = new CircularLL();
        for (int i = 1; i <= n; i++) {
            cll.addNode(i);
        }

        int survivor = cll.josephus(k);
        System.out.println("Survivor = " + survivor);

        sc.close();
    }
}
