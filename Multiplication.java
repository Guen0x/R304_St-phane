/**
 * Classe représentant la multiplication de deux expressions.
 * Hérite de {@link Operation}.
 * @see Operation
 * @since 1.0
 */
public class Multiplication extends Operation {

    /**
     * Constructeur de la classe Multiplication.
     * @param operande1 Le premier opérande de la multiplication.
     * @param operande2 Le second opérande de la multiplication.
     */
    public Multiplication(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Calcule le produit des deux opérandes.
     * @return Le produit des valeurs des opérandes.
     */
    public int valeur() {
        return getOperande1().valeur() * getOperande2().valeur();
    }

    /**
     * Retourne une représentation textuelle de la multiplication.
     * @return La chaîne de caractères représentant la multiplication.
     */
    public String toString() {
        return "(" + getOperande1() + " * " + getOperande2() + ")";
    }
}
