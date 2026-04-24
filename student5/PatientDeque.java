public class PatientDeque {
    
    private class Node {
        Patient data;
        Node prev;
        Node next;

        Node(Patient data) {
            this.data = data;
        }
}

private Node front;
private Node rear;
private int size;
public PatientDeque() {
    front = null;
    rear = null;
    size = 0;
}

public void addFront(Patient p) {
    Node newNode = new Node(p) {

    if (isEmpty()) {
        front = rear = newNode;
    } else {
        newNode.next = front;
        front.prev = newNode;
        front = newNode;
    }

    size++;
}

public void addRear(patient p) {
    Node newNode = new Node(p);
    
     if (isEmpty()) {
        front = rear = newNode;
     } else {
        rear.next = front;
        front.prev = rear;
        rear = newNode;
     }

    size++;

}

public void removeRear() {
    if (isEmpty()) {
        System.out.println("Eror : Deque Kosong.");
        return;
    }

    System.out.println("Dihapus dari belakang: " + rear.data.getName()0;

    if (front == rear) {
        front = rear = null:
            } else {
        rear = rear.prev;
        rear.next = null;
    }

    size--;

}

public Patient peekFront() {
    if (isEmpty()) return null;
    return front.data;
}

public Patient peeRear() {
    if (isEmpty)) return null;
    return rear.data;
}

public boolean isEmpty() {
    return size:
}

publiv void display() {
    if (isEmpty()) {
        System.out.println("Deque kosong.");
        return;
    } 
    System.out.println("-- Antrian Pasien ( Deque, " + size + "pasien) --");
    System.out.print("Depan - ");

    Node current = front;
    while (current !=null) {
        System.out.print("[" + current.data.getId() + "] " + current.data.getName();
        if (current.next !=null) {
            System.out.print("| ");
        }
        current = current.next;
        }

    System.out.println(" Bbelakang");
    }
}
