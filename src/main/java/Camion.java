public class Camion extends Vehiculo{


    private int capacidadCarga;

    public Camion(String marca, String modelo, int año, int velocidadMaxima, int capacidadCarga) {
        super(marca, modelo, año, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }
    @Override
    public void acelerar() {
        System.out.println("Acelerando lentamente rum rum.");
    }
}
