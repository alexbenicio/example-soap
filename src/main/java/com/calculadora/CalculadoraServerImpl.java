package com.calculadora;

import javax.jws.WebService;

@WebService(endpointInterface = "com.calculadora.CalculadoraServer")
public class CalculadoraServerImpl implements CalculadoraServer {

    @Override
    public double somar(double a, double b) {
        System.out.println("Recebido: " + a + " + " + b);
        return a + b;
    }
}