package com.example.user.manillas;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Prueba1() throws Exception {
        assertEquals(100, Metodos.tipo_tipo(0),0);
    }
    @Test
    public void Prueba2() throws Exception {
        assertEquals(100, Metodos.tipo_tipo2(1),0);
    }
    @Test
    public void Prueba3() throws Exception {
        assertEquals(50, Metodos.tipo_tipo3(2),0);
    }
    @Test
    public void Prueba4() throws Exception {
        assertEquals(110,Metodos.tipo_tipo4(0),0);
    }
}