package collections.TTD;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    // on veut une fonction qui retourne la suite de Fibonacci jusqu'une certaine borne
    // on testera ici la fonction 

    @Test
    void testFibo1(){
        assertEquals("0", Fibonnaci.calcul(0));
    }
}
