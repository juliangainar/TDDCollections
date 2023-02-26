package collections.TTD;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    // on veut une fonction qui retourne la suite de Fibonacci jusqu'une certaine borne
    // on testera ici la fonction 

    @Test
    void testFibo0(){
        assertEquals("0", Fibonnaci.calcul(0));
    }

    @Test
    void testFibo1(){
        assertEquals("0 1", Fibonnaci.calcul(1));
    }

    
    @Test
    void testFibo2(){
        assertEquals("0 1 1", Fibonnaci.calcul(2));
    }

    @Test
    void testFiboNegatif(){
        assertEquals("Le nombre doit être positif", Fibonnaci.calcul(-2));
    }
}
