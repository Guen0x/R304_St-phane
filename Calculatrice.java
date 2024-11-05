/**
 * Classe de test pour effectuer des opérations arithmétiques en combinant différentes expressions.
 * @see Expression
 * @see Nombre
 * @see Addition
 * @see Soustraction
 * @see Division
 */
public class Calculatrice {

    public static void main(String[] args) {
        try {
            Expression deux = new Nombre(2);
            Expression trois = new Nombre(3);
            Expression dixSept = new Nombre(17);
            Expression s = new Soustraction(dixSept, deux);
            Expression a = new Addition(deux, trois);
            Expression d = new Division(s, a);

            System.out.println(d + " = " + d.valeur()); // affiche ((17 - 2) / (2 + 3)) = 3
        } catch (MismatchException e) {
            System.out.println("Erreur de type : " + e.getMessage());
        } catch (ExpressionNullException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erreur arithmétique : " + e.getMessage());
        }
    }
}

