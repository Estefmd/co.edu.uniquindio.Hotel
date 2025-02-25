package co.edu.uniquindio.Hotel.Modelo;

public class Servicio {
    private String servicioOfrecido;
    private Habitacion habitacion;

    public Servicio() {
    }

    public Servicio(String servicioOfrecido, Habitacion habitacion) {
        this.servicioOfrecido = servicioOfrecido;
        this.habitacion = habitacion;
    }

    public String getServicioOfrecido() {
        return servicioOfrecido;
    }

    public void setServicioOfrecido(String servicioOfrecido) {
        this.servicioOfrecido = servicioOfrecido;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "servicioOfrecido='" + servicioOfrecido + '\'' +
                ", habitacion=" + habitacion +
                '}';
    }
}
