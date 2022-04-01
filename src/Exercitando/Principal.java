package Exercitando;

        public class Principal {
            public static void main(String[] args) {

                // Calculadora
                System.out.println ("Exercício Calculadora!");
                Calculadora.somar (3,6);
                Calculadora.subtrair (9,1.8);
                Calculadora.multiplicar (7,8);
                Calculadora.dividir (5,2.5);

                // Mensagem
                System.out.println ("Exercício Mensagem!");
                Mensagem.qualMensagem (Integer.valueOf("9"));
                Mensagem.qualMensagem (Integer.valueOf("14"));
                Mensagem.qualMensagem (Integer.valueOf("1"));

                // Empréstimo
                System.out.println ("Exercício Empréstimo!");
                Emprestimo.calcular (Double.valueOf ("1000"), Emprestimo.getDuasParcelas ());
                Emprestimo.calcular (Double.valueOf ("1000"), Emprestimo.getTresParcelas ());
                Emprestimo.calcular (Double.valueOf ("1000"), Integer.valueOf ("5"));
            }
        }