package com.example.fborja.myapplication;

import org.junit.Test;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import android.content.SharedPreferences;

import com.example.fborja.myapplication.Euler;

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
    }/*
    @Test
    public void cuartoTest() throws Exception {
        int resultado= Euler.cuarto();
        Assert.assertEquals(4613732,resultado);
    }@Test
    public void quintoTest() throws Exception {
        int resultado= Euler.quinto();
        Assert.assertEquals(4613732,resultado);
    }
    */

}