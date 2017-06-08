package com.example.fborja.myapplication;

/**
 * Created by fborja on 8/6/17.
 */
import org.junit.Test;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Euler2Test {
    @Test
    public void sextoTest() throws Exception {
        int resultado= Euler2.sexto(100);
        Assert.assertEquals(25164150,resultado);
    }
    @Test
    public void séptimoTest() throws Exception {
        int resultado= Euler2.séptimo(10001);
        Assert.assertEquals(104743,resultado);
    }
}