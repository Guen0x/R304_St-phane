public class Division extends Operation {
    public Division(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    public int valeur() {
        if (getOperande2().valeur() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return getOperande1().valeur() / getOperande2().valeur();
    }

    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")";
    }
}
