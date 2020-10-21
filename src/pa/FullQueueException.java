package pa;


/**
 * @Class FullQueueException class que é serve para exceções de quando a pilha está
 * Full e se quer lançar essa mesma exceção
 *
 *
 */

public class FullQueueException  extends RuntimeException  {

    /**
     * Aqui vai herdar da classe pai a message queremos dispor após o acontecimento da exceção Full
     *
     *
     * @param message
     */

        public  FullQueueException (String message) { super(message); }

        public FullQueueException() {
            super("The Queue is full.");
        }



    }


