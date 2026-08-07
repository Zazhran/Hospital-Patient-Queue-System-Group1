package student5;

import shared.Patient;

public class TreatmentHeap {
    private Patient[] heap;
    private int[] scores;
    private int size;
    private int capacity;

    public TreatmentHeap() {
        this.capacity = 10;
        this.heap = new Patient[capacity];
        this.scores = new int[capacity];
        this.size = 0;
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    private void swap(int i, int j) {
        Patient tempPatient = heap[i];
        heap[i] = heap[j];
        heap[j] = tempPatient;

        int tempScore = scores[i];
        scores[i] = scores[j];
        scores[j] = tempScore;
    }

    private void resize() {
        capacity *= 2;
        Patient[] newHeap = new Patient[capacity];
        int[] newScores = new int[capacity];
        for (int i = 0; i < size; i++) {
            newHeap[i] = heap[i];
            newScores[i] = scores[i];
        }
        heap = newHeap;
        scores = newScores;
    }

    public void insert(Patient patient, int severityScore) {
        if (size == capacity) {
            resize();
        }
        heap[size] = patient;
        scores[size] = severityScore;
        size++;
        heapifyUp(size - 1);
    }

    private void heapifyUp(int index) {
        while (index > 0 && scores[index] < scores[parent(index)]) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    public Patient extractMin() {
        if (size == 0) {
            System.out.println("Error: Antrian kritis kosong.");
            return null;
        }
        Patient minPatient = heap[0];
        int minScore = scores[0];

        heap[0] = heap[size - 1];
        scores[0] = scores[size - 1];
        size--;

        heapifyDown(0);

        System.out.println("Ditangani (score " + minScore + "): " + minPatient.getName());
        return minPatient;
    }

    private void heapifyDown(int index) {
        int smallest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && scores[left] < scores[smallest]) {
            smallest = left;
        }
        if (right < size && scores[right] < scores[smallest]) {
            smallest = right;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    public Patient peekMin() {
        if (size == 0) return null;
        return heap[0];
    }

    public void display() {
        if (size == 0) {
            System.out.println("=== Antrian Kritis Kosong ===");
            return;
        }
        System.out.println("=== Antrian Kritis (Min-Heap, score makin kecil makin darurat) ===");
        for (int i = 0; i < size; i++) {
            System.out.println("Score " + scores[i] + ": [" + heap[i].getId() + "] " 
                               + heap[i].getName() + " - " + heap[i].getAilment());
        }
    }
}