public class Main {

    public static void main(String[] args) {
        Garaje miGaraje = new Garaje();

        Coche miCoche = new Coche("Toyota", "Corolla", 2020, 4, 6);
        Camion miCamion = new Camion("Volvo", "FH16", 2018, 25, 10);
        Motocicleta miMoto = new Motocicleta("Harley-Davidson", "Sportster", 2021, 20, "Manilar PRO");

        miGaraje.agregarVehiculo(miCoche);
        miGaraje.agregarVehiculo(miCamion);
        miGaraje.agregarVehiculo(miMoto);

        miGaraje.mostrarVehiculos();
    }
}
