public class Main {
    public static void main(String[] args) {
        sumatoria(10, 20, 30);
        coche miCoche = new coche();
        miCoche.cantpuertas(1);
        miCoche.incpuertas(3);

    }
        public static void sumatoria ( int num1, int num2, int num3){
            int resultado;
            resultado = num1 + num2 + num3;
            System.out.println(resultado);
        }
}