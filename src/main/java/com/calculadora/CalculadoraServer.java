package com.calculadora;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface CalculadoraServer {

    @WebMethod
    double somar(double a, double b);
}