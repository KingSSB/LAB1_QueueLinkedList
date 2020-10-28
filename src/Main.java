import pa.Queue;
import pa.QueueLinkedList;

public class Main {

    public static void main(String[] args) {
        //Queue<Integer> queue = new QueueArrayList<>()List<>();
        Queue<Integer> queue = new QueueLinkedList<>();

        try {
            for (int i = 0; i < 119; i++) {
                queue.Enqueue(i);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Queue is size? " + queue.size());

        try {
            System.out.println("Queue is empty? " + queue.isEmpty());

            System.out.println("Bottom of queue is: " + queue.Front());

            System.out.println("Queue is size? " + queue.size());

            System.out.println("Dequeue all elements from queue:");
            while (!queue.isEmpty()) {
                System.out.println(queue.Dequeue());
            }

            System.out.println("Queue is size? " + queue.size());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Qeueue is empty? " + queue.isEmpty());

        queue.clear();

        System.out.println("Queue is clear? " + queue.size());

        System.out.println("Qeueue is empty? " + queue.isEmpty());
    }
}









