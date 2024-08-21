import java.util.ArrayList;
import java.util.List;


public class Garaje {


    private List <Vehiculo> vehiculos;

    public Garaje() {
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public void mostrarVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.mostrarDetalles();
            vehiculo.acelerar();  // Aquí se demuestra el polimorfismo
            System.out.println();  // Espacio para separar la salida de cada vehículo
        }
    }


}
