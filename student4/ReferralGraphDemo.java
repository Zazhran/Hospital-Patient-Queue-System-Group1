package student4;

import shared.Doctor;

public class ReferralGraphDemo {
    public static void main(String[] args) {
        ReferralGraph graph = new ReferralGraph();

            graph.addNode(new Doctor("D001", "Dr. Andi (Umum)", "Umum"));
            graph.addNode(new Doctor("D002", "Dr. Budi (Jantung)", "Jantung"));
            graph.addNode(new Doctor("D003", "Dr. Cici (Paru)", "Paru"));
            graph.addNode(new Doctor("D004", "Dr. Dian (Saraf)", "Saraf"));

            graph.addEdge("Dr. Andi (Umum)",    "Dr. Budi (Jantung)");
            graph.addEdge("Dr. Andi (Umum)",    "Dr. Cici (Paru)");
            graph.addEdge("Dr. Budi (Jantung)", "Dr. Dian (Saraf)");

            graph.printGraph();

            graph.BFS("Dr. Andi (umum)");

            System.out.println("Jalur ke Dr. Dian? " + graph.hasPath("Dr. Andi (Umum)", "Dr. Dian (Saraf)"));
            System.out.println("Jalur ke Dr. Cici?" + graph.hasPath("Dr. Andi (Umum)", "Dr. Cici (Paru)"));

    }
    
}
