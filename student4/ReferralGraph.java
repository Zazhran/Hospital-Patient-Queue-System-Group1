package student4;

import shared.Doctor;

class EdgeNode {
    Doctor doctor;
    EdgeNode next;

    public EdgeNode(Doctor doctor) {
        this.doctor = doctor;
        this.next = null;
    }
}

class GraphNode {
    Doctor doctor;
    EdgeNode head;

    public GraphNode(Doctor doctor) {
        this.doctor = doctor;
        this.head = null;
    }
}

class CustomQueue {
    private String[] items;
    private int front, rear, size, capacity;

    public CustomQueue(int capacity) {
        this.capacity = capacity;
        this.items = new String[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(String name) {
        if (size == capacity) return;
        rear = (rear + 1) % capacity;
        items[rear] = name;
        size++;
    }

    public String dequeue() {
        if (size == 0) return null;
        String item = items[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class ReferralGraph {
    private GraphNode[] nodes;
    private int nodeCount;
    private static final int MAX_NODES = 100;

    public ReferralGraph() {
        this.nodes = new GraphNode[MAX_NODES];
        this.nodeCount = 0;
    }

    public void addNode(Doctor doctor) {
        if (findNodeIndex(doctor.getName()) != -1) return;
        if (nodeCount < MAX_NODES) {
            nodes[nodeCount] = new GraphNode(doctor);
            nodeCount++;
        }
    }

    private int findNodeIndex(String doctorName) {
        for (int i = 0; i < nodeCount; i++) {
            if (nodes[i].doctor.getName().equals(doctorName)) {
                return i;
            }
        }
        return -1;
    }

    public void addEdge(String sourceName, String destName) {
        int sourceIdx = findNodeIndex(sourceName);
        int destIdx = findNodeIndex(destName);

        if (sourceIdx == -1 || destIdx == -1) return;

        EdgeNode newEdge = new EdgeNode(nodes[destIdx].doctor);

        if (nodes[sourceIdx].head == null) {
            nodes[sourceIdx].head = newEdge;
        } else {
            EdgeNode current = nodes[sourceIdx].head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newEdge;
        }
    }

    public void printGraph() {
        System.out.println("=== Graf Rujukan Dokter ===");
        for (int i = 0; i < nodeCount; i++) {
            System.out.print(String.format("%-20s -> [", nodes[i].doctor.getName()));
            EdgeNode current = nodes[i].head;
            while (current != null) {
                System.out.print(current.doctor.getName());
                if (current.next != null) {
                    System.out.print(", ");
                }
                current = current.next;
            }
            System.out.println("]");
        }
    }

    private boolean isVisited(String[] visitedList, int count, String name) {
        for (int i = 0; i < count; i++) {
            if (visitedList[i].equals(name)) return true;
        }
        return false;
    }
    public void BFS(String startNodeName) {
        System.out.println("=== BFS dari " + startNodeName + " ===");
        int startIdx = findNodeIndex(startNodeName);
        if (startIdx == -1) return;

        CustomQueue queue = new CustomQueue(MAX_NODES);
        String[] visited = new String[MAX_NODES];
        int visitedCount = 0;

        queue.enqueue(startNodeName);
        visited[visitedCount++] = startNodeName;

        while (!queue.isEmpty()) {
            String currentName = queue.dequeue();
            System.out.println("Kunjungi: " + currentName);

            int currentIdx = findNodeIndex(currentName);
            if (currentIdx != -1) {
                EdgeNode neighbor = nodes[currentIdx].head;
                while (neighbor != null) {
                    if (!isVisited(visited, visitedCount, neighbor.doctor.getName())){
                        visited[visitedCount++] = neighbor.doctor.getName();
                        queue.enqueue(neighbor.doctor.getName());
                    }
                    neighbor = neighbor.next;
                }
            }
        }
    }
    public boolean hasPath(String from, String to) {
    String[] visited = new String[MAX_NODES];
    return hasPathDFS(from, to, visited, 0);
}

    private boolean hasPathDFS(String current, String destination, String[] visited, int visitedCount) {
        if (current.equals(destination)) return true;

        visited[visitedCount++] = current;
        int currentIdx = findNodeIndex(current);

        if (currentIdx != -1) {
            EdgeNode neighbor = nodes[currentIdx].head;
            while (neighbor != null) {
                if (!isVisited(visited, visitedCount, neighbor.doctor.getName())) {
                    if (hasPathDFS(neighbor.doctor.getName(), destination, visited, visitedCount)) {
                        return true;
                    }
                }
                neighbor = neighbor.next;
            }
        }
        return false;
    }
}



