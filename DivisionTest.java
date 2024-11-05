import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {

    @Test
    public void testDivisionValeur() {
        Expression six = new Nombre(6);
        Expression trois = new Nombre(3);
        Division division = new Division(six, trois);

        assertEquals(2, division.valeur(), "6 / 3 devrait être égal à 2");
    }

    @Test
    public void testDivisionByZero() {
        Expression six = new Nombre(6);
        Expression zero = new Nombre(0);
        Division division = new Division(six, zero);

        assertThrows(ArithmeticException.class, division::valeur, "La division par zéro devrait lancer une exception");
    }

    @Test
    public void testDivisionToString() {
        Expression six = new Nombre(6);
        Expression trois = new Nombre(3);
        Division division = new Division(six, trois);

        assertEquals("(6 / 3)", division.toString(), "Représentation de la division incorrecte");
    }
}
