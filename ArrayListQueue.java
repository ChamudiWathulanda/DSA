package DSA;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayListQueue<T> {
    private ArrayList<T> queue;

    // Constructor to initialize the queue
    public ArrayListQueue() {
        queue = new ArrayList<>();
    }

    // Method to add an element to the queue
    public void enqueue(T item) {
        queue.add(item);
    }

    // Method to remove and return the front element of the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Dequeue from an empty queue");
        }
        return queue.remove(0);
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Method to return the front element without removing it
    public T peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Peek from an empty queue");
        }
        return queue.get(0);
    }

    // Method to return the size of the queue
    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        ArrayListQueue<Integer> queue = new ArrayListQueue<>();
        
        System.out.println("Queue is empty: " + queue.isEmpty()); // Output: true

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue size: " + queue.size()); 
        System.out.println("Front element: " + queue.peek()); 
        System.out.println("Dequeue: " + queue.dequeue()); 
        System.out.println("Queue size after dequeue: " + queue.size()); 
        System.out.println("Front element after dequeue: " + queue.peek());

        System.out.println("Dequeue: " + queue.dequeue()); 
        System.out.println("Dequeue: " + queue.dequeue()); 

        // Handling dequeue on an empty queue
        try {
            System.out.println("Dequeue: " + queue.dequeue()); 
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        System.out.println("Queue is empty: " + queue.isEmpty()); 
    }
}
