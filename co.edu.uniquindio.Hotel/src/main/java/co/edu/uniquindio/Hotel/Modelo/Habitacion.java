package co.edu.uniquindio.Hotel.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int numeroHabitacion;
    private String tipoHabitacion;
    private double precioHabitacion;
    private List<Servicio> servicios;

    public Habitacion(int numeroHabitacion, String tipoHabitacion, double precioHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
        this.servicios = new ArrayList<>();
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", precioHabitacion=" + precioHabitacion +
                ", servicios=" + servicios +
                '}';
    }

}
