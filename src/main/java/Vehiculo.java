


public abstract class Vehiculo {


    private String marca;
    private String modelo;
    private int año;
    private int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int año, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.velocidadMaxima = velocidadMaxima;
    }

    //Metodo abstracto

    public abstract void acelerar();


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {

        if(año < 1886){
            System.out.println("No puede ingresar ese año. Fecha que se creo el primer coche.");
        }

        this.año = año;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {

        if(velocidadMaxima < 0){
            System.out.println("La velocidad no puede ser negativa.");
        }
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarDetalles() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
    }
}
