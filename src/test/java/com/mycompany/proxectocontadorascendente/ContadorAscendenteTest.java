/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proxectocontadorascendente;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alberto
 */
public class ContadorAscendenteTest {
    
    public ContadorAscendenteTest() {
    }

       @Test
    public void testIncrementar1() {
        System.out.println("Proba de caixa branca 1: valorActual =800");
        ContadorAscendente instance = new ContadorAscendente(800);
        int expResult = 801;
        int result = instance.incrementar();
        assertEquals(expResult, result);
      
    }

       @Test
    public void testIncrementar2() {
        System.out.println("Proba de caixa branca 2; valorActual = 1000");
        ContadorAscendente instance = new ContadorAscendente(1000);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
      
    }

       @Test
    public void testIncrementar3() {
        System.out.println("Proba de caixa negra 1; clase válida de equivalencia; valorActual = 500");
        ContadorAscendente instance = new ContadorAscendente(500);
        int expResult = 501;
        int result = instance.incrementar();
        assertEquals(expResult, result);
      
    }

         @Test
    public void testIncrementar4() {
        System.out.println("Proba de caixa negra 2; clase válida de equivalencia; valorActual = 1000");
        ContadorAscendente instance = new ContadorAscendente(1000);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
      
    }
    
    
         @Test
    public void testIncrementar5() {
        System.out.println("Proba de caixa negra 3; clase  non válida de equivalencia; valorActual = 1800");
        ContadorAscendente instance = new ContadorAscendente(1800);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
      
    }
    
         @Test
    public void testIncrementar6() {
        System.out.println("Proba de caixa negra 4; clase válida de equivalencia; valor límite = 999");
        ContadorAscendente instance = new ContadorAscendente(999);
        int expResult = 1000;
        int result = instance.incrementar();
        assertEquals(expResult, result);
      
    }

}
