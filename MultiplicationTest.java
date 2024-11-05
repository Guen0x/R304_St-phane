import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MultiplicationTest {

    @Test
    public void testMultiplicationValeur() {
        Expression deux = new Nombre(2);
        Expression trois = new Nombre(3);
        Multiplication multiplication = new Multiplication(deux, trois);

        assertEquals(6, multiplication.valeur(), "2 * 3 devrait être égal à 6");
    }

    @Test
    public void testMultiplicationToString() {
        Expression deux = new Nombre(2);
        Expression trois = new Nombre(3);
        Multiplication multiplication = new Multiplication(deux, trois);

        assertEquals("(2 * 3)", multiplication.toString(), "Représentation de la multiplication incorrecte");
    }
}
