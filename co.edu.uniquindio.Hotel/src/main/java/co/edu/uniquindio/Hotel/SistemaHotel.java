package co.edu.uniquindio.Hotel;

import co.edu.uniquindio.Hotel.Factory.ModelFactory;
import co.edu.uniquindio.Hotel.Modelo.*;

import java.util.HashSet;


public class SistemaHotel {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan");
        cliente1.setNumeroCedula("1094907106");

        Habitacion habitacion1 = new Habitacion();
        habitacion1.setNumeroHabitacion(101);
        habitacion1.setTipoHabitacion("Suite");
        habitacion1.setPrecioHabitacion(300.000);

        Reserva reserva1 = new Reserva(cliente1, habitacion1);
        reserva1.setCliente(cliente1);
        reserva1.setHabitacion(habitacion1);

        Reserva nuevaReserva = hotel.agregarReserva(cliente1, habitacion1);

        System.out.println(nuevaReserva);

    }

    private static void invokeV1() {
        ModelFactory modelFactory = ModelFactory.getInstance();
        Hotel hotel = modelFactory.getHotel();

        hotel.getListaClientes().remove(0);
        hotel.getListaHabitaciones().remove(0);
        hotel.getListaReservas().remove(0);

        System.out.println(" Hotel inicializado en la Base de Datos ");

    }


}