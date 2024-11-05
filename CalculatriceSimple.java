public class CalculatriceSimple {
    public static void main(String[] args) {
        try {
            Nombre six = new Nombre(6);
            Nombre dix = new Nombre(10);
            Operation addition = new Addition(dix, six);
            Operation soustraction = new Soustraction(dix, six);
            Operation multiplication = new Multiplication(dix, six);
            Operation division = new Division(dix, six);

            System.out.println(addition + " = " + addition.valeur());
            System.out.println(soustraction + " = " + soustraction.valeur());
            System.out.println(multiplication + " = " + multiplication.valeur());
            System.out.println(division + " = " + division.valeur());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
