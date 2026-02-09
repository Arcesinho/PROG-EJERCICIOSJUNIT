package ejercicio01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NormalizadorNombreCompletoTest {

    private NormalizadorNombreCompleto normalizador;

    @BeforeEach

    public  void setUp(){
         normalizador = new NormalizadorNombreCompleto();

    }

    @Test
    public void test_normalize_StringNormalizado_StringNormalizado(){
        assertEquals("Adrian Balboa",normalizador.normalize("Adrian Balboa"));
    }

    @Test
    public void test_normalize_StringConEspacios_StringNormalizado(){
        assertEquals("Adrian Balboa",normalizador.normalize(" Adrian Balboa "));
    }

    @Test
    public void test_normalize_StringConMultiplesEspacios_StringNormalizado(){
        assertEquals("Adrian Balboa", normalizador.normalize("Adrian          Balboa"));
    }

    @Test
    public void test_normalize_StringSinCapitalize_StringNormalizado(){
        assertEquals("Adrian Balboa", normalizador.normalize("aDRIAN BALBOA"));
    }

    @Test
    public void test_nomalize_StringUnaLetraSinCapitalize_StringUnaLetraCapialize(){
        assertEquals("A B", normalizador.normalize("a b"));
    }

    @Test
    public void test_normalize_StringNulo_LanzarIllegalArgExcep(){

    assertThrows(IllegalArgumentException.class,
            ()-> new NormalizadorNombreCompleto().normalize(null));
    }

    @Test
    public void test_normalize_StringVacio_LanzarIllegalArgExcep(){

        assertThrows(IllegalArgumentException.class,
                ()-> new NormalizadorNombreCompleto().normalize("  "));
    }

}
