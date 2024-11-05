import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest {

    @Test
    public void testAdditionValeur() {
        Expression deux = new Nombre(2);
        Expression trois = new Nombre(3);
        Addition addition = new Addition(deux, trois);

        assertEquals(5, addition.valeur(), "2 + 3 devrait être égal à 5");
    }

    @Test
    public void testAdditionToString() {
        Expression deux = new Nombre(2);
        Expression trois = new Nombre(3);
        Addition addition = new Addition(deux, trois);

        assertEquals("(2 + 3)", addition.toString(), "Représentation de l'addition incorrecte");
    }
}
