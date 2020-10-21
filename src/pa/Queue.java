package pa;

/**
 *
 * Interface que define o comportamento de uma fila na linguagem Java.
 *
 * Uma fila é um contetor de elementos que garante usa politica de acesso FIFO
 *
 *
 * @param   <T> tipo de elemento a armazenar na fila.
 *
 *
 */



public interface Queue <T> {

    /**
     * Insere  o elemento <i>element</i> no bottom/fim da fila
     *
     *
     *
     * @param element elemento a inserir
     *
     * @throws FullQueueException se não houver capacidade/memoria para mais.
     *
     *
     *
     */

 public void Enqueue(T element) throws FullQueueException;

    /**
     * Remove o elemento no bottom/fim da fila.
     *
     *
     * @return o elemento do bottom/fim da pilha
     * @throws EmptyQueueException se a pilha estiver vazia.
     */

    public T Dequeue() throws EmptyQueueException;


    /**
     *Vê o elemento no fim/bottom da fila
     *
     * @return o elemento no bottom da fila
     * @throws EmptyQueueException
     */


    public T Front() throws EmptyQueueException;


    /**
     * Retorna o valor do size da queue
     *
     * @return o tamanho da queue
     */

    public int size();

    /**
     * True se a fila tiver vazia e false senão tiver
     *
     * @return True isEmpty or false isn´t Empty
     */

    public boolean isEmpty();

    /**
     * Limpa a fila
     *
     *
     */

    public void clear();



}
