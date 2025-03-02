package co.edu.uniquindio.Hotel.Factory;

import co.edu.uniquindio.Hotel.Modelo.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class ModelFactory {
    public static ModelFactory instance;
    private Hotel hotel;

    private ModelFactory(){
        hotel = new Hotel(new ArrayList<>(), new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        inicializarDatos();
    }
    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }
    private void inicializarDatos() {
        Habitacion habitacion1 = new Habitacion(101, "Doble", 200000);
        Habitacion habitacion2 = new Habitacion(102, "Suite", 350000);
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);

        Cliente cliente1 = hotel.crearCliente("Juan Pérez", "12345678");
        Cliente cliente2 = hotel.crearCliente("María López", "87654321");

        LocalDate fechaIngreso = LocalDate.of(2025, 3, 10);
        LocalDate fechaSalida = LocalDate.of(2025, 3, 15);
        Reserva reserva1 = hotel.agregarReserva(habitacion1, cliente1, fechaIngreso, fechaSalida);
    }
    public Hotel getHotel() {

        return hotel;
    }

}
