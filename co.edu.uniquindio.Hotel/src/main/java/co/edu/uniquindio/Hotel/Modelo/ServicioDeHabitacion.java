package co.edu.uniquindio.Hotel.Modelo;

public class ServicioDeHabitacion extends Servicio{
    public ServicioDeHabitacion(String nombre, double costo, Habitacion habitacion) {
        super(nombre, costo, habitacion);
    }
    @Override
    public void consumir() {
        System.out.println("Servicio de Habitacion consumido.");
    }



}
