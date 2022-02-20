package dominio;


public class Orden {
    
    private String nombre;
    private int numOrden;
    private String descripcion;

    public Orden() {
    }

    public Orden(String nombre, int numOrden, String descripcion) {
        this.nombre = nombre;
        this.numOrden = numOrden;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumOrden() {
        return numOrden;
    }

    public void setNumOrden(int numOrden) {
        this.numOrden = numOrden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Orden{" + "nombre=" + nombre + ", numOrden=" + numOrden + ", descripcion=" + descripcion + '}';
    }
    
}
