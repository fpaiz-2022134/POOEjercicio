public class Motocicleta extends Vehiculo{


    private String tipoManillar;

    public Motocicleta(String marca, String modelo, int año, int velocidadMaxima, String tipoManillar) {
        super(marca, modelo, año, velocidadMaxima);
        this.tipoManillar = tipoManillar;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando más rápido rum rum.");
    }
}
