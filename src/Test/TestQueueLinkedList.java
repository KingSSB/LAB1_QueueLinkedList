package Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pa.Queue;
import pa.QueueLinkedList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class no qual vamos fazer os testes sobre a ({@link QueueLinkedList})  e os seus metodos
 *
 *
 *
 *
 */


public class TestQueueLinkedList {

    //Node header,trailer;

    private Queue<Integer> queue;

    /**
     * BeforeEach antes de se começar inicialiase o queue para ser testada perante os outros metodos
     * e não ter que iniciar outra vez nos testes.
     *
     *
     */

    @BeforeEach
    void setUp() {

         queue = new QueueLinkedList<>();


    }

    /**
     *
     * Teste de encher a fila
     *
     */

    @Test
    void enqueue() {

        assertEquals(0,queue.size());

        queue.Enqueue(1);

        assertEquals(1,queue.size());

        assertEquals(1,queue.Front());


        queue.Dequeue();

        assertEquals(0,queue.size());


        assertTrue(queue.isEmpty());

        queue.Enqueue(1);

        assertFalse(queue.isEmpty());


    }

    /**
     *
     * Teste de retirar  da fila
     *
     */

    @Test
    void dequeue() {

        assertEquals(0,queue.size());

        queue.Enqueue(1);

        assertEquals(1,queue.size());

        assertEquals(1,queue.Front());

        queue.Dequeue();

        assertEquals(0,queue.size());

        assertTrue(queue.isEmpty());

        queue.Enqueue(1);

        assertFalse(queue.isEmpty());



    }

    /**
     *
     * Teste sobre o valor do prev do trailer
     *
     */

    @Test
    public void front() {

        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);


        assertEquals(1,queue.Front());



    }

    /**
     *
     * Teste sobre o size da fila
     *
     */

    @Test
    public void size() {

        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);

        assertEquals(3,queue.size());

        queue.Dequeue();
        queue.Dequeue();
        queue.Dequeue();

        assertEquals(0,queue.size());




    }


    /**
     *
     * Teste sobre se a fila esta vazia ou não
     *
     */

    @Test
    public void isEmpty() {

        queue.Enqueue(1);

        queue.clear();

        assertTrue(queue.isEmpty());

        queue.Enqueue(1);

        queue.Dequeue();

        assertTrue(queue.isEmpty());




    }

    /**
     *
     * Teste sobre o clear
     *
     */

    @Test
    public void clear() {

        queue.Enqueue(1);
        queue.Enqueue(2);
        queue.Enqueue(3);

        assertEquals(3,queue.size());

        assertFalse(queue.isEmpty());

        queue.clear();

        assertEquals(0,queue.size());

        assertTrue(queue.isEmpty());


    }
}