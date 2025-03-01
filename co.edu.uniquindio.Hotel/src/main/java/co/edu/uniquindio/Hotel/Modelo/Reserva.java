package co.edu.uniquindio.Hotel.Modelo;

import java.time.LocalDate;
import java.util.List;

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private List<Servicio> servicios;

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

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "habitacion=" + habitacion +
                ", cliente=" + cliente +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaSalida=" + fechaSalida +
                ", servicios=" + servicios +
                '}';
    }

    public void agregarServicio(Servicio servicio){
        servicios.add(servicio);
        habitacion.agregarServicio(servicio);

    }

    public double calcularCosto(){
        double costoTotal = habitacion.getPrecioHabitacion();
        for (Servicio servicio : servicios) {
            costoTotal += servicio.getCosto();
        }

        return costoTotal;
    }

}
