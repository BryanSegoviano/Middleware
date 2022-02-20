package dominio;

public class Venta {
    
    private String nombre;
    private int cantidad;
    private double total;

    public Venta() {
    }

    public Venta(String nombre, int cantidad, double total) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.total = total;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return cantidad;
    }

    public void setId(int id) {
        this.cantidad = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double carrera) {
        this.total = carrera;
    }

    @Override
    public String toString() {
        return "Venta{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", total=" + total + '}';
    }
        
}
