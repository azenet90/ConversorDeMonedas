import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {

        while (true){
            System.out.println("Conversor de monedas, mi desafio");
            System.out.println("1 - Peso argentino a dolares\n" +
                    "2 - Real brasileño a dolares\n" +
                    "3 - Peso colombiano a dolares\n" +
                    "4 - Salida");
            System.out.println("Ingrese un número");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            switch (opcion){
                case 1:
                    convertir("Peso argentino",  0.0011);
                case 2:
                    convertir ("Real brasileño", 0.18);
                case 3:
                    convertir( "Peso colombiano", 0.00025);
                case 4:
                    System.out.println("Cerando el programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }



        public  static void convertir (String pais, double valorDolar){

            Scanner leer = new Scanner(System.in);
            System.out.println("Escriba la cantidad que desee" + pais);
            double cantidadMoneda = leer.nextDouble();

            double dolares = cantidadMoneda / valorDolar;
            dolares = (double) Math.round(dolares * 100d/100 );


            System.out.println("*******************************");
            System.out.println("Tienes $" + dolares + "Dolares");
            System.out.println("*******************************");
        }
    }

