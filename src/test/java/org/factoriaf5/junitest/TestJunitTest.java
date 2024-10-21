package org.factoriaf5.junitest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestJunitTest {

    @Test
    public void testSumar() {
        int num1 = 35;
        int num2 = 79;
        int result = JunitTestMetodos.sumar(num1, num2);
        assertEquals(114, result);
    }

    @Test
    public void testSumarMayorDe100() {
        int num1 = 35;
        int num2 = 79;
        int result = JunitTestMetodos.sumar(num1, num2);
        assertTrue(result > 100);
    }

    @Test
    public void testSumarMenorDe120() {
        int num1 = 35;
        int num2 = 79;
        int result = JunitTestMetodos.sumar(num1, num2);
        assertFalse(result > 120);
    }

    @Test
    public void testSumarNotNull() {
        int num1 = 35;
        int num2 = 79;
        int result = JunitTestMetodos.sumar(num1, num2);
        assertNotNull(result);

    }

    @Test
    public void testSumarEsInteger() {
        int num1 = 35;
        int num2 = 79;
        int result = JunitTestMetodos.sumar(num1, num2);
        assertInstanceOf(Integer.class, result);
    }

    @Test
    public void testCheckNegative() {
        int num = -99;
        assertThrows(IllegalArgumentException.class, () -> {
            JunitTestMetodos.checkPositivo(num);
        });
    }

    @Test
    public void testCheckPositive() {
        int num = 99;
        boolean resultado = JunitTestMetodos.checkPositivo(num);
        assertTrue(resultado);
    }

    @Test
    public void testContarLetrasA() {

        JunitTestMetodos junitTest = new JunitTestMetodos();
        String cadena = "Palabra";
        int resultado = 3;
        int letrasA = junitTest.contarLetrasA(cadena);
        assertTrue(resultado == letrasA);
    }

    @Test
    public void testContieneElemento() {

        JunitTestMetodos junitTest = new JunitTestMetodos();
        List<String> lista = new ArrayList<>(Arrays.asList("nariz", "cuenco", "agua", "sol", "primavera"));
        String elemento = "sol";
        boolean resultado = junitTest.contieneElemento(lista, elemento);
        assertTrue(resultado);
    }

    @Test
    public void testNoContieneElemento() {

        JunitTestMetodos junitTest = new JunitTestMetodos();
        List<String> lista = new ArrayList<>(Arrays.asList("nariz", "cuenco", "agua", "sol", "primavera"));
        String elemento = "gato";
        boolean resultado = junitTest.contieneElemento(lista, elemento);
        assertFalse(resultado);
    }

    @Test
    public void testRevertirCadena() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        String cadena = "travis es mi perro";
        String reverseCadena = "orrep im se sivart";
        String resultado = junitTest.revertirCadena(cadena);

        assertTrue(resultado.equals(reverseCadena));
    }

    @Test
    public void testFactorial() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        int numero = 3;
        long resultadoFactorial = 6;
        long resultado = junitTest.factorial(numero);

        assertTrue(resultado == resultadoFactorial);
    }

    @Test
    public void testFactorialMenorCero() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        int numero = -8;
        long resultadoFactorial = 0;
        long resultado;
        try {
            resultado = junitTest.factorial(numero);
        } catch (IllegalArgumentException e) {
            resultado = 0;
        }
        assertTrue(resultado == resultadoFactorial);
    }

    @Test
    public void testEsPrimo() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        int numero = 2;
        boolean resultado = junitTest.esPrimo(numero);

        assertTrue(resultado);
    }

    @Test
    public void testEsPrimoMenorUno() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        int numero = 0;
        boolean resultado = junitTest.esPrimo(numero);

        assertFalse(resultado);
    }

    @Test
    public void testEsPrimoNoPrimo() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        int numero = 8;
        boolean resultado = junitTest.esPrimo(numero);

        assertFalse(resultado);
    }

    @Test
    public void testEsPrimoNegativo() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        int numero = -5;
        boolean resultado = junitTest.esPrimo(numero);

        assertFalse(resultado);
    }

    @Test
    public void testEsPrimoMayorPrimo() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        int numero = 11;
        boolean resultado = junitTest.esPrimo(numero);

        assertTrue(resultado);
    }

    @Test
    public void testEsPrimoMayorNoPrimo() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        int numero = 12;
        boolean resultado = junitTest.esPrimo(numero);

        assertFalse(resultado);
    }

    @Test
    public void testMensajeConRetraso() throws InterruptedException {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        String resultado = junitTest.mensajeConRetraso();
        assertEquals("Listo después de retraso", resultado);
    }

    @Test
    public void testConvertirAString() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        List<Integer> listaEnteros = new ArrayList<>(Arrays.asList(1, 21, 9, 99));
        List<String> listaString = new ArrayList<>(Arrays.asList("1", "21", "9", "99"));

        List<String> resultado = junitTest.convertirAString(listaEnteros);

        assertEquals(resultado, listaString);

    }

    @Test
    public void testCalcularMedia() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        List<Integer> lista = new ArrayList<>(Arrays.asList(20, 10, 90));
        int media = 40;

        double resultado = junitTest.calcularMedia(lista);

        assertEquals(resultado, media);
    }

    @Test
    public void testCalcularMediaVacia() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        List<Integer> lista = new ArrayList<>();
        int media = 0;
        double resultado;

        try {
            resultado = junitTest.calcularMedia(lista);
        } catch (IllegalArgumentException e) {
            resultado = 0;
        }

        assertEquals(resultado, media);
    }

    @Test
    public void testCalcularMediaNull() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        List<Integer> lista = null;

        assertThrows(IllegalArgumentException.class, () -> {
            junitTest.calcularMedia(lista);
        });
    }

    @Test
    public void testConvertirListaAString() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        List<String> lista = new ArrayList<>(Arrays.asList("abeja", "oveja", "oso", "carpincho"));
        String listaString = "ABEJA,OVEJA,OSO,CARPINCHO";

        String resultado = junitTest.convertirListaAString(lista);

        assertEquals(listaString, resultado);
    }

    @Test
    public void testConvertirListaAStringNull() {
        JunitTestMetodos junitTest = new JunitTestMetodos();
        List<String> lista = new ArrayList<>(Arrays.asList(null, "oveja", "oso", "carpincho"));
        String listaString = "NULL,OVEJA,OSO,CARPINCHO";

        String resultado = junitTest.convertirListaAString(lista);

        assertEquals(listaString, resultado);
    }

}
