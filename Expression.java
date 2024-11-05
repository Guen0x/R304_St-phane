/**
 * Classe abstraite représentant une expression arithmétique.
 * Toutes les expressions doivent pouvoir retourner une valeur entière.
 * @author Stéphane
 */
public abstract class Expression {
    
    /**
     * Retourne la valeur entière de l'expression.
     * @return La valeur de l'expression en tant qu'entier.
     */
    public abstract int valeur();
}
