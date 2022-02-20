
package middleware;

import dominio.Venta;

/**
 * Clase que realiza la interpretación mandando la informacion a la clase
 * Context
 */
public class Client implements InterpreterExpression{

    Context contexto;

    public Client(String entidad) {
        this.contexto = new Context(entidad);
    }
    
    @Override
    public Venta interpretar() {
        Venta venta = this.contexto.crearEntidad();
        return venta;
    }
    
}
