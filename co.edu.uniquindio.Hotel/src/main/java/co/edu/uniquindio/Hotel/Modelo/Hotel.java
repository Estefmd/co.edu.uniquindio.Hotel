package co.edu.uniquindio.Hotel.Modelo;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Hotel {
    private String nombre;
    private List<Habitacion> listaHabitaciones;
    private List<Reserva> listaReservas;
    private List<Cliente> listaClientes;
    private List<Servicio> listaServicios;

    public Hotel() {
    }

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.listaHabitaciones = new ArrayList<>();
        this.listaReservas = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaServicios = new ArrayList<>();
    }

    public Cliente crearCliente(String nombre, String apellido, String numeroCedula, Reserva reserva) {
        Cliente cliente = obtenerCliente(numeroCedula);
        if (cliente == null){
            cliente = new Cliente(nombre, apellido,numeroCedula,reserva);
            listaClientes.add(cliente);

            return cliente;
        }

        return null;
    }

    public Cliente obtenerCliente(String numeroCedula){
        for (Cliente cliente : listaClientes){
            if (cliente.getNumeroCedula().equals(numeroCedula)) {

                return cliente;
            }
        }

        return null;
    }

    public boolean actualizarCliente(String nombre, String apellido, String numeroCedula, Reserva reserva) {
        Cliente clienteActualizar = obtenerCliente(numeroCedula);
        if (clienteActualizar != null){
            clienteActualizar.setNombre(nombre);
            clienteActualizar.setApellido(apellido);
            clienteActualizar.setNumeroCedula(numeroCedula);
            clienteActualizar.setReserva(reserva);

            return true;
        }
        return false;
    }

    public boolean eliminarCliente(String numeroCedula){
        Cliente clienteEliminar = obtenerCliente(numeroCedula);
        if (clienteEliminar != null){
            listaClientes.remove(clienteEliminar);

            return true;
        }
        return false;
    }

    public void agregarHabitacion(Habitacion habitacion){
        listaHabitaciones.add(habitacion);
    }

    public Habitacion obtenerHabitacion(int numeroHabitacion){
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion){

                return habitacion;
            }
        }
        return null;
    }

    public void eliminarHabitacion(int numeroHabitacion){
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion){
                listaHabitaciones.remove(habitacion);
            }
        }
    }

    public Reserva crearReserva(Habitacion habitacion, Cliente cliente, LocalDate fechaIngreso, LocalDate fechaSalida ) {
        Reserva reserva = obtenerReserva(habitacion);
        if (reserva == null){
            reserva = new Reserva(habitacion, cliente,fechaIngreso, fechaSalida);
            listaReservas.add(reserva);

            return reserva;
        }
        return null;
    }

    public Reserva obtenerReserva(Habitacion habitacion){
        for (Reserva reserva : listaReservas) {
            if (reserva.getHabitacion().equals(habitacion)){

                return reserva;
            }
        }
        return null;
    }

    public void eliminarReserva (Habitacion habitacion){
        for (Reserva reserva : listaReservas) {
            if (reserva.getHabitacion().equals(habitacion)){
                listaReservas.remove(reserva);
            }
        }


    }

}
