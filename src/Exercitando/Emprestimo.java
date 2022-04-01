package Exercitando;

        public class Emprestimo {
            public static Integer getDuasParcelas () {
                return 2;
            }
            public static Integer getTresParcelas () {
                return 3;
            }
            public static Double getTaxaDuasParcelas () {
                return 0.3;
            }
            public static Double getTaxaTresParcelas () {
                return 0.45;
            }
            public static void calcular (Double valor, Integer parcelas) {
                if (parcelas == 2) {
                    Double valorFinal =  valor + (valor * getTaxaDuasParcelas ());
                    System.out.println ("Valor final do empréstimo para 02 parcelas: R$ " + valorFinal);
                }
                else if (parcelas == 3) {
                    Double valorFinal =  valor + (valor * getTaxaTresParcelas ());
                    System.out.println ("Valor final do empréstimo para 03 parcelas: R$ " + valorFinal);
                }
                else {
                    System.out.println ("Quantidade de parcela(s) não aceita!");
                }
            }
        }