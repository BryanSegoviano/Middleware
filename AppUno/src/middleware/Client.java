
package middleware;

import dominio.Orden;

/**
 *
 * @author bryan
 */
public class Client implements InterpreterExpression{

    Context contexto;

    public Client(String entidad) {
        this.contexto = new Context(entidad);
    }
    
    @Override
    public Orden interpretar() {
        Orden orden = this.contexto.crearEntidad();
        return orden;
    }
    
}
