package ejercicio02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidadorContrasenaTest {

    private ValidadorContrasena validador;


    @BeforeEach

    public void setUp(){
         validador = new ValidadorContrasena();
    }

    @Test
    public void test_Validador_ContraseniaValida_ContraseniaValida(){
        assertTrue(validador.isValid("Vamooss1%6"));
    }

    @Test
    public void test_Validador_ContraseniaLongitudInsuficiente_DevuelveFalse(){
        assertFalse(validador.isValid("A1%e"));
    }

    @Test
    public void test_Validador_ContraseniaSinMayuscula_DevuelveFalse(){
        assertFalse(validador.isValid("elcuento1$"));
    }

    @Test
    public void test_Validador_ContraseniaSinMinuscula_DevuelveFalse(){
        assertFalse(validador.isValid("EJEMPLO1$"));
    }

    @Test
    public void test_Validador_ContraseniaSinNumero_DevuelveFalse(){
        assertFalse(validador.isValid("EJEMPLo$"));
    }

    @Test
    public void test_Validador_ContraseniaSinSimbolo_DevuelveFalse(){
        assertFalse(validador.isValid("EJEMPlo12"));
    }

    @Test
    public void test_Validador_ContraseniaCumpleExactamente_DevuelveTrue(){
        assertTrue(validador.isValid("Ejem1$rt"));
    }

    @Test
    public void test_Validador_ContraseniaConEspacios_DevuelveFalse(){
        assertFalse(validador.isValid("Ejem1 $rt"));
    }
}
