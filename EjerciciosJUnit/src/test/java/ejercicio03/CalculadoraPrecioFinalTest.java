package ejercicio03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculadoraPrecioFinalTest {

    private CalculadoraPrecioFinal calculadora;

    @BeforeEach
    public void setUp(){
        calculadora = new CalculadoraPrecioFinal();
    }

    @Test
    public void test_Calculadora_DescuentoEIva_DoublePrecioFinal(){
        assertEquals(9,calculadora.calculate(10.0,10.0,10.0, RoundingMode.HALF_UP));
    }//SIN TERMINAR







}
