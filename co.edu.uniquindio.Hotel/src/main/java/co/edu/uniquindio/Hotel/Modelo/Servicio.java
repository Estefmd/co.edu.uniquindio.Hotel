package co.edu.uniquindio.Hotel.Modelo;

import co.edu.uniquindio.Hotel.Factory.Consumible;

public class Servicio implements Consumible {
    private String nombre;
    private double costo;
    private Habitacion habitacion;

    public Servicio(String nombre, double costo, Habitacion habitacion) {
        this.nombre = nombre;
        this.costo = costo;
        this.habitacion = habitacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public void consumir() {
        System.out.println("Servicio de habitación consumodo: " + nombre);
    }
}
