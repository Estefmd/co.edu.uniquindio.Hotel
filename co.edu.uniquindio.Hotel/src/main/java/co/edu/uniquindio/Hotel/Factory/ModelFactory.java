package co.edu.uniquindio.Hotel.Factory;

import co.edu.uniquindio.Hotel.Modelo.*;

public class ModelFactory {
    public static ModelFactory instance;
    private Hotel hotel;

    private ModelFactory(){
        hotel = inicializarDatos();
    }

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    private Hotel inicializarDatos() {
        Hotel hotel = new Hotel();
        Cliente cliente1 = new Cliente();
        cliente1.setNombre("Juan");
        cliente1.setNumeroCedula("1094907106");

        Habitacion habitacion1 = new Habitacion();
        habitacion1.setNumeroHabitacion(101);
        habitacion1.setTipoHabitacion("Suite");
        habitacion1.setPrecioHabitacion(300.000);

        Reserva reserva1 = new Reserva();
        reserva1.setCliente(cliente1);
        reserva1.setHabitacion(habitacion1);

        hotel.getListaClientes().add(cliente1);
        hotel.getListaHabitaciones().add(habitacion1);
        hotel.getListaReservas().add(reserva1);

        return hotel;
    }

    public Hotel getHotel() {

        return hotel;
    }

}
