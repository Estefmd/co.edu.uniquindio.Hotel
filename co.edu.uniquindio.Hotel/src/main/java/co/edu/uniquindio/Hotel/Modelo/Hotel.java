package co.edu.uniquindio.Hotel.Modelo;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    public Hotel() {
    }
    private List<Habitacion> listaHabitaciones;
    private List<Reserva> listaReservas;
    private List<Cliente> listaClientes;
    private List<Servicio> listaServicios;

    public Hotel(List<Habitacion> listaHabitaciones, List<Reserva> listaReservas, List<Cliente> listaClientes, List<Servicio> servicios) {
        this.listaHabitaciones = listaHabitaciones != null ? listaHabitaciones : new ArrayList<>();
        ;
        this.listaReservas = listaReservas != null ? listaReservas : new ArrayList<>();
        this.listaClientes = listaClientes != null ? listaClientes : new ArrayList<>();
        this.listaServicios = listaServicios != null ? listaServicios : new ArrayList<>();
    }

    public List<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Servicio> getListaServicios() {
        return listaServicios;
    }

    public Cliente crearCliente(String nombre, String numeroCedula) {
        Cliente cliente = obtenerCliente(numeroCedula);
        if (cliente != null) {
            JOptionPane.showMessageDialog(null, "El cliente ya existe");
            return cliente;
        }
        cliente = new Cliente(nombre, numeroCedula);
        listaClientes.add(cliente);
        JOptionPane.showMessageDialog(null, "Cliente agregado correctamente");
        return cliente;
    }

    public Cliente obtenerCliente(String numeroCedula) {
        for (Cliente cliente : listaClientes) {
            if (cliente.getNumeroCedula().equals(numeroCedula)) {
                return cliente;
            }
        }
        return null;
    }

    public boolean actualizarCliente(String nombre, String apellido, String numeroCedula, Reserva reserva) {
        Cliente clienteActualizar = obtenerCliente(numeroCedula);
        if (clienteActualizar != null) {
            clienteActualizar.setNombre(nombre);
            clienteActualizar.setNumeroCedula(numeroCedula);
            return true;
        }
        return false;
    }

    public boolean eliminarCliente(String numeroCedula) {
        Cliente clienteEliminar = obtenerCliente(numeroCedula);
        if (clienteEliminar != null) {
            listaClientes.remove(clienteEliminar);
            return true;
        }
        return false;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        listaHabitaciones.add(habitacion);
    }

    public Habitacion obtenerHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : listaHabitaciones) {
            if (habitacion.getNumeroHabitacion() == numeroHabitacion) {
                return habitacion;
            }
        }
        return null;
    }

    public boolean eliminarHabitacion(int numeroHabitacion) {
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            if (listaHabitaciones.get(i).getNumeroHabitacion() == numeroHabitacion) {
                listaHabitaciones.remove(i);
                JOptionPane.showMessageDialog(null, "Habitación eliminada exitosamente.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró la habitación.");
        return false;
    }

    public Reserva agregarReserva(Habitacion habitacion, Cliente cliente, LocalDate fechaIngreso, LocalDate fechaSalida) {
        Reserva reserva = new Reserva(habitacion, cliente, fechaIngreso, fechaSalida);
        listaReservas.add(reserva);
        return reserva;
    }

    public boolean cancelarReserva(Habitacion habitacion, Cliente cliente, LocalDate fechaIngreso, LocalDate fechaSalida) {
        for (int i = 0; i < listaReservas.size(); i++) {
            Reserva reserva = listaReservas.get(i);
            if (reserva.getHabitacion().equals(habitacion) && reserva.getCliente().equals(cliente)
                    && reserva.getFechaIngreso().equals(fechaIngreso) && reserva.getFechaSalida().equals(fechaSalida)) {
                listaReservas.remove(i);
                JOptionPane.showMessageDialog(null, "Reserva cancelada con éxito.");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "No se encontró la reserva.");
        return false;
    }

    public void asignarServicioAReserva(Reserva reserva, Servicio servicio) {
        reserva.getHabitacion().agregarServicio(servicio);
        JOptionPane.showMessageDialog(null, "El servicio " + servicio.getNombre() +
                " ha sido asignado a la habitación " + reserva.getHabitacion().getNumeroHabitacion());
    }

    public void contarReservasPorCliente(Cliente cliente) {
        int contador = 0;
        for (Reserva reserva : listaReservas) {
            if (reserva.getCliente().equals(cliente)) {
                contador++;
            }
        }
        JOptionPane.showMessageDialog(null, cliente.getNombre() + " tiene " + contador + " reservas realizadas.");
    }

    public void verificarDisponibilidad(Habitacion habitacion) {
        boolean disponible = true;
        for (Reserva reserva : listaReservas) {
            if (reserva.getHabitacion().equals(habitacion)) {
                disponible = false;
                break;
            }
        }
        String mensaje = disponible ? "Disponible" : "No Disponible";
        JOptionPane.showMessageDialog(null, "La habitación " + habitacion.getNumeroHabitacion() + " está " + mensaje);
    }

    public void mostrarServiciosDeHabitacion(Habitacion habitacion) {
        String mensaje = "Servicios de la habitación " + habitacion.getNumeroHabitacion() + ":\n";
        for (Servicio servicio : habitacion.getServicios()) {
            mensaje += "- " + servicio.getNombre() + " - $ " + servicio.getCosto() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }
}


