package middleware;

import dominio.Orden;

public class Context {

    private String entidadTexto;

    public Context(String entidadTexto) {
        this.entidadTexto = entidadTexto;
    }

    public String obtenerNombre() {
        String nombre = "";
        String validarNombre = "";
        for (int i = 0; i < this.entidadTexto.length(); i++) {
            validarNombre += this.entidadTexto.charAt(i);
            if (validarNombre.equalsIgnoreCase("nombre=")) {
                for (int j = i + 1; j < this.entidadTexto.length(); j++) {
                    if (this.entidadTexto.charAt(j) == ','
                            || this.entidadTexto.charAt(j) == '}') {
                        System.out.println("Nombre interpretado: " + nombre);
                        return nombre;
                    }
                    nombre += this.entidadTexto.charAt(j);
                }

            }

            if (this.entidadTexto.charAt(i) == ','
                    || this.entidadTexto.charAt(i) == ' '
                    || this.entidadTexto.charAt(i) == '{') {
                validarNombre = "";
            }
        }
        return "-1";
    }

    public int obtenerNumOrden() {
        String numOrden = "";
        String validarNumOrden = "";
        for (int i = 0; i < this.entidadTexto.length(); i++) {
            validarNumOrden += this.entidadTexto.charAt(i);
            if (validarNumOrden.equalsIgnoreCase("numOrden=")) {
                for (int j = i + 1; j < this.entidadTexto.length(); j++) {
                    if (this.entidadTexto.charAt(j) == ','
                            || this.entidadTexto.charAt(j) == '}') {
                        System.out.println("Número de orden interpretado: " + numOrden);
                        return Integer.parseInt(numOrden);
                    }
                    numOrden += this.entidadTexto.charAt(j);
                }
            }

            if (this.entidadTexto.charAt(i) == ','
                    || this.entidadTexto.charAt(i) == ' '
                    || this.entidadTexto.charAt(i) == '{') {
                validarNumOrden = "";
            }
        }
        return -1;
    }

    public String obtenerDescripcion() {
        String descripcion = "";
        String validarDescripcion = "";
        for (int i = 0; i < this.entidadTexto.length(); i++) {
            validarDescripcion += this.entidadTexto.charAt(i);
            if (validarDescripcion.equalsIgnoreCase("descripcion=")) {
                for (int j = i + 1; j < this.entidadTexto.length(); j++) {
                    if (this.entidadTexto.charAt(j) == ','
                            || this.entidadTexto.charAt(j) == '}') {
                        System.out.println("Descripción interpretada: " + descripcion);
                        return descripcion;
                    }
                    descripcion += this.entidadTexto.charAt(j);
                }

            }

            if (this.entidadTexto.charAt(i) == ','
                    || this.entidadTexto.charAt(i) == ' '
                    || this.entidadTexto.charAt(i) == '{') {
                validarDescripcion = "";
            }
        }
        return "-1";
    }

    public Orden crearEntidad() {
        Orden orden = null;
        String nombre = this.obtenerNombre();
        int numOrden = this.obtenerNumOrden();
        String descripcion = this.obtenerDescripcion();
        orden = new Orden(nombre, numOrden, descripcion);
        System.out.println("Objeto final recibido e interpretado: " + orden);
        return orden;
    }

}
