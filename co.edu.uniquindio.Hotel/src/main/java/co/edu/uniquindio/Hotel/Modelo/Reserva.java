package co.edu.uniquindio.Hotel.Modelo;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;

    public Reserva() {
    }

    public Reserva(Habitacion habitacion, Cliente cliente, LocalDate fechaIngreso, LocalDate fechaSalida) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;

    }

    public Habitacion getHabitacion() {

        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {

        this.cliente = cliente;
    }

    public LocalDate getFechaIngreso() {

        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {

        this.fechaIngreso = fechaIngreso;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "habitacion=" + habitacion +
                ", cliente=" + cliente +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                '}';
    }

}
