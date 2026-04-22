import java.io.StringWriter;

class Node {
     String data;
     Node next;
     
     public Node(String data) {
          this.data = data;
          this.next = null;
    }
}    

public class MedicalHistoryStack {
    private Node top;
    private int size;

    public MedicalHistoryStack() {
        top = null;
        size = 0;
    }


    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top =newNode;
        size++;
        System.out.println("Riwayat ditambahkan: " + data);

    }
    public String pop() {
        if (isEmpty()) {
            return "Stack kosong!";
        }
        String removed = top.data;
        top = top.next;
        size--;
        return removed;
    }
    
    
    public String peek() {
        if (isEmpty()) {
            return "Stack kosong!";
        }
        return top.data;
    }
    
    
    public boolean isEmpty() {
        return top == null;
    }
    


    public int size() {
        return size;
    }
    
    
    public void displayHistory() {
        if (isEmpty()) {
            System.out.println("Tidak ada riwayat medis.");
            return;
        }
        
        System.out.println("\n=== Riwayat Medis (Terbaru ke Lama) ===")
        Node temp =top;
        while (temp !=null) {
             System.out.println("-" + temp.data);
             temp = temp.next;
        }
    }
}

             



    