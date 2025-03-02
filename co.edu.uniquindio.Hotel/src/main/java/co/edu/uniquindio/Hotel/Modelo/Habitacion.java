package co.edu.uniquindio.Hotel.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private int numeroHabitacion;
    private String tipoHabitacion;
    private double precioHabitacion;
    private List<Servicio> listaServicios;

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion, String tipoHabitacion, double precioHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
        this.listaServicios = new ArrayList<>();
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
        return listaServicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.listaServicios = servicios;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", precioHabitacion=" + precioHabitacion +
                ", listServicios=" + listaServicios +
                '}';
    }

    public void agregarServicio(Servicio servicio) {
        if (servicio != null) {
            listaServicios.add(servicio);
            System.out.println(" Servicio agregado: " + servicio.getNombre());
        } else {
            System.out.println(" Error: El servicio es nulo.");
        }
    }
}
