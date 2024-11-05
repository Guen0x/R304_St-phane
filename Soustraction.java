/**
 * Classe représentant la soustraction de deux expressions.
 * Hérite de {@link Operation}.
 * @see Operation
 * @since 1.0
 */
public class Soustraction extends Operation {

    /**
     * Constructeur de la classe Soustraction.
     * @param operande1 Le premier opérande de la soustraction.
     * @param operande2 Le second opérande de la soustraction.
     */
    public Soustraction(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Calcule la différence entre les deux opérandes.
     * @return La différence des valeurs des opérandes.
     */
    public int valeur() {
        return getOperande1().valeur() - getOperande2().valeur();
    }

    /**
     * Retourne une représentation textuelle de la soustraction.
     * @return La chaîne de caractères représentant la soustraction.
     */
    public String toString() {
        return "(" + getOperande1() + " - " + getOperande2() + ")";
    }
}
