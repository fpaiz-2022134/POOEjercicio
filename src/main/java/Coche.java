public class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, String modelo, int año, int velocidadMaxima, int numeroPuertas) {
        super(marca, modelo, año, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }



    @Override
    public void acelerar() {
        System.out.println("Acelerando de manera moderada rum rum.");
    }

}
