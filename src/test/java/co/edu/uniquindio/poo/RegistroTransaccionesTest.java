package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class registroTransaccionesTest {
        private static final Logger LOG = Logger.getLogger(AppTest.class.getName());
/*
 * test para agregar transaccion
 */
@Test
public void agregarTransaccion(){
    Transaccion transaccion =new TCompra("erf12");
    RegistroTransacciones registroTransacciones=new RegistroTransacciones("18/11/2024");
    LinkedList<Transaccion>tansactions=registroTransacciones.getTransacciones();
    registroTransacciones.registrarTransaccion(transaccion);
    imprimir("la Transacion fue agregada correctamente");
}
/**
 * test para eliminar Transaccion
 */
@Test
public void eliminarTransaccion(){
    Transaccion transaccion =new TCompra("erf12");
    RegistroTransacciones registroTransacciones=new RegistroTransacciones("18/11/2024");
    LinkedList<Transaccion>tansactions=registroTransacciones.getTransacciones();
    registroTransacciones.eliminarTransaccion(transaccion.getCodigo());
    imprimir("la Transacion fue eliminada correctamente");
}

/*
 * imprimir
 */
public void imprimir(String mensaje){
     System.out.println(mensaje);
}


}
