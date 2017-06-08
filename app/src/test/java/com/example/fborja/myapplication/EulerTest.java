package com.example.fborja.myapplication;

import org.junit.Test;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EulerTest {

    public EulerTest() {
        //super(Euler.class);
    }

    @Test
    public void primeroTest() throws Exception {
        int resultado= Euler.primero();
         Assert.assertEquals(233168,resultado);
    }
    @Test
    public void segundoTest() throws Exception {
        int resultado= Euler.segundo();
        Assert.assertEquals(4613732,resultado);
    }
    @Test
    public void terceroTest() throws Exception {
        float resultado= Euler.tercero();
        Assert.assertEquals(6857,resultado,1);
    }


    @Test
    public void cuartoTest() throws Exception {
        int resultado= Euler.cuarto(3);
        Assert.assertEquals(906609,resultado);
    }

    @Test
    public void quintoTest() throws Exception {
        int resultado= Euler.quinto(20,19);
        Assert.assertEquals(232792560,resultado);
    }


    /*


    @Test
    public void factoresTest() throws Exception {
        int[] F={0,0,0,0,0,0,0,0,0,0,1};
        Assert.assertArrayEquals(F,Euler.factoresprimos(29));
    }
    @Test
    public void mcmTest() throws Exception {
        int resultado= Euler.MCM(72,50);
        Assert.assertEquals(1800,resultado);
    }
    @Test
    public void pallyTest() throws Exception {
        Assert.assertEquals(true,Euler.pally(69596));
    }
     */
}