package pa;

/**
 * Implementado em fila ({@link Queue}) baseado em QueueLinked List
 *
 *
 *
 * @param <T> elemento a armazenar
 */

public class QueueLinkedList<T> implements Queue<T> {

    /**
     * Header um dos sentinelas que vai ser considerado pelo top da fila
     * Trailer um dos sentinelas que vai ser considerado pelo bottom da fila
     *
     */

    private Node header; //Sentinel header
    private Node trailer; //Sentinel trailer

    private int size;

    /**
     *
     * QueueLinkedList () - Construtor onde se inicia-se o header e o trailer
     *
     */
    public QueueLinkedList() {
        /*
        The configuration of an empty singly linked list is the sentinel
        pointing to null.
         */
        this.header = new Node(null, null, null);
        this.trailer = new Node(null, null, null);

        header.next = trailer;

        trailer.prev = header;


    }

    /**
     * Enqueue Este metodo adiciona a seguir header um novo Node com o seu elemento
     *
     * @param element elemento a inserir
     *
     * @throws FullQueueException Se tiver full lança a exceção
     */

    @Override
    public void Enqueue(T element) throws FullQueueException {

        try {
            Node newNode = new Node (element, null ,null);

            Node currentBeginning = header.next;

            header.next = newNode;

            newNode.prev = header;

            newNode.next = currentBeginning;

            currentBeginning.prev = newNode;

            currentBeginning.next = newNode.next;



            //header.next = newNode.prev;


            //newNode.next.prev = header;

            size++;

        } catch (OutOfMemoryError e) {
            throw new FullQueueException("No memory more elements");
        }

    }

    /**
     *Dequeue Este metodo retira do  nó com o ultimo elemento antes do trailer
     *
     * @return o elemento do nó que foi removido
     *
     * @throws EmptyQueueException Se a fila tiver vazia lança a exceção que está vazia
     */

    @Override
    public T Dequeue() throws EmptyQueueException {

        if (isEmpty()) throw new EmptyQueueException();


        Node xpto = trailer.prev;

        T remove = xpto.element;

        xpto.prev.next=trailer; //trailer.prev.prev.next = trailer;

        trailer.prev = xpto.prev; // trailer.prev = trailer.prev.prev

        //T remove = trailer.prev.element;

        //trailer.prev.next = trailer;
        //trailer.prev = trailer.prev.prev;

        //header.next = trailer.prev;


        size--;

        return remove;

    }

    /**
     * Front vê o ultimo elemento no ultimo nó.
     *
     * @return o ultimo elemento na
     *
     * @throws EmptyQueueException esta exceção é lançada se a fila estiver vazia
     */
    @Override
    public T Front() throws EmptyQueueException {

        return trailer.prev.element;

    }

    /**
     *
     * vê o tamanho da fila a partir dos sentinelas percorrendo a partir do while
     *
     * @return count retorna o tamnho após o procedimento do loop do while até header chege até ao trailer
     * aumentado assim o count ao longo do processo.
     */

    //Complexiadade O(1)

    @Override
    public int size() {

        /*

        Node current = header.next;
        int count = 0;
        while (current != trailer) {

            count++;
            current = current.next;

        }

        return count;


         */

        return this.size;

    }

    /**
     *
     *
     * isEmpty verifica se a fila está ou não vazia
     *
     * @return false se fila estiver vazsia ou true se tiver cheia
     */


    @Override
    public boolean isEmpty() {

        if (header.next == trailer && trailer.prev == header) return true;
        else return false;


    }


    /**
     * Clear limpa a fila desde o header até ao trailer
     *
     *
     */

    @Override
    public void clear() {

        /*

        Node current = header.next;
        while (current != trailer) {
            current = current.next;
            current.prev = null;
        }

        header.next = trailer;
        trailer.prev = header;


         */

        header.next = trailer;
        trailer.prev = header;

        this.size = 0;

    }

    /**
     * Inner class representing a linked list node.
     * Only recognized in the context of this class (private).
     */
    private class Node {
        private T element;
        private Node next;
        private Node prev;

        public Node(T element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

    }
}
