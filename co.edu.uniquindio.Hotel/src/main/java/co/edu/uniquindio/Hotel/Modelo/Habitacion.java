package co.edu.uniquindio.Hotel.Modelo;

public class Habitacion {
    private int numeroHabitacion;
    private String tipoHabitacion;
    private double precioHabitacion;

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion, String tipoHabitacion, double precioHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
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

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", tipoHabitacion='" + tipoHabitacion + '\'' +
                ", precioHabitacion=" + precioHabitacion +
                '}';
    }
}
