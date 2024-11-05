public class Nombre extends Expression {
    private final int valeurNombre;

    public Nombre(int valeur) {
        this.valeurNombre = valeur;
    }

    public int valeur() {
        return valeurNombre;
    }

    public String toString() {
        return Integer.toString(valeurNombre);
    }
}
