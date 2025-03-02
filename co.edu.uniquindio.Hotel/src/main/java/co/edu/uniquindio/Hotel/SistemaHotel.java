package co.edu.uniquindio.Hotel;

import co.edu.uniquindio.Hotel.Factory.ModelFactory;
import co.edu.uniquindio.Hotel.Modelo.*;

import java.time.LocalDate;
import java.util.HashSet;


public class SistemaHotel {
    public static void main(String[] args) {

        ModelFactory modelFactory = ModelFactory.getInstance();
        Hotel hotel = modelFactory.getHotel();

        if (!hotel.getListaHabitaciones().isEmpty()) {
            hotel.verificarDisponibilidad(hotel.getListaHabitaciones().get(0));
        } else {
            System.out.println("No hay habitaciones disponibles.");
        }
        if (!hotel.getListaClientes().isEmpty()) {
            hotel.contarReservasPorCliente(hotel.getListaClientes().get(0));
        } else {
            System.out.println("No hay clientes registrados.");
        }
        if (!hotel.getListaReservas().isEmpty() && !hotel.getListaServicios().isEmpty()) {
            Reserva reserva = hotel.getListaReservas().get(0);
            Servicio servicio = hotel.getListaServicios().get(0);
            hotel.asignarServicioAReserva(reserva, servicio);
        } else {
            System.out.println("No hay reservas o servicios disponibles.");
        }
        if (!hotel.getListaHabitaciones().isEmpty()) {
            hotel.mostrarServiciosDeHabitacion(hotel.getListaHabitaciones().get(0));
        }
    }
}
