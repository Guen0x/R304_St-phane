import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NombreTest {

    @Test
    public void testNombreValeur() {
        Nombre cinq = new Nombre(5);

        assertEquals(5, cinq.valeur(), "La valeur du nombre devrait être égale à celle fournie");
    }

    @Test
    public void testNombreToString() {
        Nombre cinq = new Nombre(5);

        assertEquals("5", cinq.toString(), "La représentation textuelle du nombre est incorrecte");
    }
}
