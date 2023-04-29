public class coche {
    int puertas = 0;
    public void cantpuertas(int p){
        this.puertas = p;
        System.out.println("Puertas iniciales:" + puertas);
    }
    public void incpuertas(int p){
        this.puertas = puertas + p;
        System.out.println("Cantidad de puertas actuales:" + puertas);
    }
}