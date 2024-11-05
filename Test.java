public class Test {
        public static Expression fabriqueExpression(String e) {
            // Supprime les espaces blancs de la chaîne
            e = e.replaceAll("\\s", "");
            // Analyse et retourne l'expression
            return parseExpression(e);
        }
        private static Expression parseExpression(String e) {
            // Vérifie si la chaîne est un nombre
            if (e.matches("\\d+")) {
                // Retourne une nouvelle instance de Nombre
                return new Nombre(Integer.parseInt(e));
            }

            // Trouve l'opérateur principal
            int parenCount = 0;
            for (int i = 0; i < e.length(); i++) {
                char c = e.charAt(i);
                // Compte les parenthèses pour gérer les expressions imbriquées
                if (c == '(') parenCount++;
                else if (c == ')') parenCount--;
                    // Vérifie si c'est un opérateur en dehors des parenthèses
                else if (parenCount == 0) {
                    if (c == '+' || c == '-' || c == '*' || c == '/') {
                        // Analyse les sous-expressions gauche et droite
                        Expression left = parseExpression(e.substring(0, i));
                        Expression right = parseExpression(e.substring(i + 1));
                        // Retourne la nouvelle expression basée sur l'opérateur trouvé
                        switch (c) {
                            case '+': return new Addition(left, right);
                            case '-': return new Soustraction(left, right);
                            case '*': return new Multiplication(left, right);
                            case '/': return new Division(left, right);
                        }
                    }
                }
            }
            // Retourne null si l'expression est invalide
            return null;
        }

        // Méthode principale pour tester le programme
        public static void main(String[] args) {
            // Crée une expression à partir de la chaîne "3"
            Expression expr1 = fabriqueExpression("3");
            // Affiche l'expression et sa valeur
            System.out.println(expr1 + " = " + expr1.valeur()); // affiche 3 = 3

            // Crée une expression à partir de la chaîne "17-2"
            Expression expr2 = fabriqueExpression("17-2");
            // Affiche l'expression et sa valeur
            System.out.println(expr2 + " = " + expr2.valeur()); // affiche (17 - 2) = 15

            // Crée une expression à partir de la chaîne "(17-2)/3"
            Expression expr3 = fabriqueExpression("(17-2)/3");
            // Affiche l'expression et sa valeur
            System.out.println(expr3 + " = " + expr3.valeur()); // affiche ((17 - 2) / 3) = 5
        }
    }
