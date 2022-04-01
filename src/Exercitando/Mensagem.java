package Exercitando;

        public class Mensagem {
            public static void qualMensagem (Integer horas) {
                switch (horas) {
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        mensagemDeBOMDIA ();
                        break;
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        mensagemDeBOATARDE ();
                        break;
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        mensagemDeBOANOITE ();
                        break;
                    default:
                        System.out.println ("Hora inválida!");
                        break;
                }
            }
            public static void mensagemDeBOMDIA () {
                System.out.println ("Bom dia, bom dia, bom dia ... !.");
            }
            public static void mensagemDeBOATARDE () {
                System.out.println ("Boua Tarrrrrrrrrrrde gentaiada ... !.");
            }
            public static void mensagemDeBOANOITE () {
                System.out.println ("Good Night for you, too ... !.");
            }
        }