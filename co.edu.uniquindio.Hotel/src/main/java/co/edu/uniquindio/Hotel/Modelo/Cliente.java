package co.edu.uniquindio.Hotel.Modelo;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String numeroCedula;
    private List<Reserva> reservas;

    public Cliente() {
    }

    public Cliente(String nombre, String numeroCedula) {
        this.nombre = nombre;
        this.numeroCedula = numeroCedula;
        this.reservas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", numeroCedula='" + numeroCedula + '\'' +
                ", reservas=" + reservas +
                '}';
    }

}
