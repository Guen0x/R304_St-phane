/**
 * Classe abstraite représentant une opération binaire (deux opérandes) dans une expression arithmétique.
 * Cette classe est une sous-classe de {@link Expression}.
 * @see Expression
 */
 public abstract class Operation extends Expression {
        private final Expression operande1;
        private final Expression operande2;
    
        /**
         * Constructeur de la classe Operation.
         * @param operande1 Le premier opérande de l'opération.
         * @param operande2 Le second opérande de l'opération.
         * @throws MismatchException si l'un des opérandes n'est pas du type attendu.
         * @throws ExpressionNullException si l'un des opérandes est null.
         */
        public Operation(Expression operande1, Expression operande2) {
            if (operande1 == null || operande2 == null) {
                throw new ExpressionNullException("Les opérandes ne doivent pas être null.");
            }
    
            // Vérification de type pour chaque opérande
            if (!(operande1 instanceof Expression) || !(operande2 instanceof Expression)) {
                throw new MismatchException("Les opérandes doivent être de type Expression.");
            }
    
            this.operande1 = operande1;
            this.operande2 = operande2;
        }
    
        /**
         * Accesseur pour le premier opérande.
         * @return le premier opérande de l'opération.
         */
        public Expression getOperande1() {
            return operande1;
        }
    
        /**
         * Accesseur pour le second opérande.
         * @return le second opérande de l'opération.
         */
        public Expression getOperande2() {
            return operande2;
        }
    
        /**
         * Méthode abstraite pour obtenir la valeur de l'opération.
         * @return la valeur entière de l'opération.
         */
        public abstract int valeur();
    }
    