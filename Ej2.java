public class Ej2 {
    public static void main(String[] args) {
        int numeroIf = -2;
        int numeroWhile = 0;
        int numeroFor = 0;
        var estacion = "OTOÑO";

        condicionIf(numeroIf);
        condicionWhile(numeroWhile);
        condicionDoWhile(numeroWhile);
        condicionFor(numeroFor);
        condicionSwitch(estacion);
    }

    public static void condicionIf(int numero) {
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero == 0) {
            System.out.println("El número es cero");
        } else {
            System.out.println("El número es negativo");
        }
    }

    public static void condicionWhile(int numero) {
        while (numero < 3) {
            numero = numero + 1;
            System.out.println("Número del while:" + numero);
        }
    }

    public static void condicionDoWhile(int numero) {
        do {
            numero = numero + 1;
            System.out.println("Número del Do While:" + numero);
        } while (numero < 1);

    }

    public static void condicionFor(int numero) {
        for (numero = 0; numero < 3; numero = numero + 1 ){
            System.out.println("Número del For:" + numero);
        }
    }

    public static void condicionSwitch(String estacion) {
        switch (estacion) {
            case "VERANO": {
                System.out.println("Estación: Verano");
                break;
            }
            case "OTOÑO": {
                System.out.println("Estación: Otoño");
                break;
            }
            case "INVIERNO": {
                System.out.println("Estación: Invierno");
                break;
            }
            case "PRIMAVERA": {
                System.out.println("Estación: Primavera");
                break;
            }
            default: {
                System.out.println("La variable no es ninguna estación");
            }
        }
    }
}
