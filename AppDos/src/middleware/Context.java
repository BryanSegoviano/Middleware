package middleware;

import dominio.Venta;

//Clase que recibe la información y trabaja con ella para interpretar los
//objetos recibidos.
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

    public int obtenerCantidad() {
        String cantidad = "";
        String validarCantidad = "";
        for (int i = 0; i < this.entidadTexto.length(); i++) {
            validarCantidad += this.entidadTexto.charAt(i);
            if (validarCantidad.equalsIgnoreCase("cantidad=")) {
                for (int j = i + 1; j < this.entidadTexto.length(); j++) {
                    if (this.entidadTexto.charAt(j) == ','
                            || this.entidadTexto.charAt(j) == '}') {
                        System.out.println("Cantidad interpretada: " + cantidad);
                        return Integer.parseInt(cantidad);
                    }
                    cantidad += this.entidadTexto.charAt(j);
                }

            }

            if (this.entidadTexto.charAt(i) == ','
                    || this.entidadTexto.charAt(i) == ' '
                    || this.entidadTexto.charAt(i) == '{') {
                validarCantidad = "";
            }
        }
        return -1;
    }

    public double obtenerTotal() {
        String total = "";
        String validarTotal = "";
        for (int i = 0; i < this.entidadTexto.length(); i++) {
            validarTotal += this.entidadTexto.charAt(i);
            if (validarTotal.equalsIgnoreCase("total=")) {
                for (int j = i + 1; j < this.entidadTexto.length(); j++) {
                    if (this.entidadTexto.charAt(j) == ','
                            || this.entidadTexto.charAt(j) == '}') {
                        System.out.println("Total interpretado: " + total);
                        return Double.parseDouble(total);
                    }
                    total += this.entidadTexto.charAt(j);
                }

            }

            if (this.entidadTexto.charAt(i) == ','
                    || this.entidadTexto.charAt(i) == ' '
                    || this.entidadTexto.charAt(i) == '{') {
                validarTotal = "";
            }
        }
        return -1;
    }

    public Venta crearEntidad() {
        Venta venta;
        String nombre = this.obtenerNombre();
        int cantidad = this.obtenerCantidad();
        double total = this.obtenerTotal();
        venta = new Venta(nombre, cantidad, total);
        System.out.println("Objeto final recibido e interpretado: " + venta);
        return venta;
    }

}
