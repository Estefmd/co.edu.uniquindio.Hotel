package co.edu.uniquindio.Hotel.Modelo;

public class Cliente {
    private String nombre;
    private String apellido;
    private String numeroCedula;
    private Reserva reserva;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String numeroCedula, Reserva reserva) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCedula = numeroCedula;
        this.reserva = reserva;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", numeroCedula='" + numeroCedula + '\'' +
                ", reserva=" + reserva +
                '}';
    }
}
