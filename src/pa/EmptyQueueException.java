package pa;

/**
 * @Class EmptyQueueException class que é serve para exceções de quando a pilha está
 * empty e se quer lançar essa mesma exceção
 *
 *
 */

public class EmptyQueueException extends RuntimeException {

    /**
     * Aqui vai herdar da classe pai a message queremos dispor após o acontecimento da exceção Empty
     *
     *
     * @param message
     */
    public EmptyQueueException(String message) {
            super(message);
        }

        public EmptyQueueException() {
            super("The Queue is empty.");
        }
    }

