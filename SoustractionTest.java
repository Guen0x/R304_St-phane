import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SoustractionTest {

    @Test
    public void testSoustractionValeur() {
        Expression cinq = new Nombre(5);
        Expression trois = new Nombre(3);
        Soustraction soustraction = new Soustraction(cinq, trois);

        assertEquals(2, soustraction.valeur(), "5 - 3 devrait être égal à 2");
    }

    @Test
    public void testSoustractionToString() {
        Expression cinq = new Nombre(5);
        Expression trois = new Nombre(3);
        Soustraction soustraction = new Soustraction(cinq, trois);

        assertEquals("(5 - 3)", soustraction.toString(), "Représentation de la soustraction incorrecte");
    }
}

