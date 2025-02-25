package co.edu.uniquindio.Hotel.Modelo;

import java.util.List;

public class Hotel {
    private String nombre;
    private List<Habitacion> listaHabitaciones;
    private List<Reserva> listaReservas;
    private List<Cliente> listaClientes;
    private List<Servicio> listaServicios;

    public Hotel() {
    }

    public Hotel(String nombre, List<Habitacion> listaHabitaciones, List<Reserva> listaReservas,
                 List<Cliente> listaClientes, List<Servicio> listaServicios) {
        this.nombre = nombre;
        this.listaHabitaciones = listaHabitaciones;
        this.listaReservas = listaReservas;
        this.listaClientes = listaClientes;
        this.listaServicios = listaServicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(List<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(List<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "nombre='" + nombre + '\'' +
                ", listaHabitaciones=" + listaHabitaciones +
                ", listaReservas=" + listaReservas +
                ", listaClientes=" + listaClientes +
                ", listaServicios=" + listaServicios +
                '}';
    }
}
