package pa;



public class QueueArrayList<T> implements Queue<T> {

    /**
     * array que contém os elementos armazenados
     */

    private static final int DEFAULT_CAPACITY = 40;

    private T[] elements;






    @Override
    public void Enqueue(T element) throws FullQueueException {

    }

    @Override
    public T Dequeue() throws EmptyQueueException {

        return null;
    }

    @Override
    public T Front() throws EmptyQueueException {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
