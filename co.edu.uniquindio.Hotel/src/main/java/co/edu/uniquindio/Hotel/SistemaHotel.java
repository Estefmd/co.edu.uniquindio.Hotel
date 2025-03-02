package co.edu.uniquindio.Hotel;

import co.edu.uniquindio.Hotel.Factory.ModelFactory;
import co.edu.uniquindio.Hotel.Modelo.*;

import java.time.LocalDate;
import java.util.HashSet;


public class SistemaHotel {
    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        // Agregar habitaciones al hotel
        Habitacion habitacion1 = new Habitacion(101, "Doble", 200000);
        Habitacion habitacion2 = new Habitacion(102, "Suite", 350000);
        hotel.agregarHabitacion(habitacion1);
        hotel.agregarHabitacion(habitacion2);

        // Crear y agregar clientes
        Cliente cliente1 = hotel.crearCliente("Juan Pérez", "12345678");
        Cliente cliente2 = hotel.crearCliente("María López", "87654321");

        // Realizar una reserva
        LocalDate fechaIngreso = LocalDate.of(2025, 3, 10);
        LocalDate fechaSalida = LocalDate.of(2025, 3, 15);
        Reserva reserva1 = hotel.agregarReserva(habitacion1, cliente1, fechaIngreso, fechaSalida);

        // Mostrar disponibilidad de una habitación
        hotel.verificarDisponibilidad(habitacion1);

        // Agregar un servicio y asignarlo a una reserva
        Servicio servicio1 = new Servicio("Desayuno", 25000, null);
        hotel.asignarServicioAReserva(reserva1, servicio1);

        // Contar reservas de un cliente
        hotel.contarReservasPorCliente(cliente1);

        // Mostrar servicios de una habitación
        hotel.mostrarServiciosDeHabitacion(habitacion1);

        // Eliminar un cliente
        hotel.eliminarCliente("12345678");
    }
}