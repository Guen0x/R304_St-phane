/**
 * Classe représentant l'addition de deux expressions.
 * Hérite de {@link Operation}.
 * @see Operation
 * @since 1.0
 */
public class Addition extends Operation {

    /**
     * Constructeur de la classe Addition.
     * @param operande1 Le premier opérande de l'addition.
     * @param operande2 Le second opérande de l'addition.
     */
    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    /**
     * Calcule la somme des deux opérandes.
     * @return La somme des valeurs des opérandes.
     */
    public int valeur() {
        return getOperande1().valeur() + getOperande2().valeur();
    }

    /**
     * Retourne une représentation textuelle de l'addition.
     * @return La chaîne de caractères représentant l'addition.
     */
    public String toString() {
        return "(" + getOperande1() + " + " + getOperande2() + ")";
    }
}
