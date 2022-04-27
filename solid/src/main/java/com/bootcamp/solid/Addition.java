package com.bootcamp.solid;

public class Addition implements OperacionI {
    public double a;
    public double b;
    public double result = 0.0;

    public Addition(double a , double b) {
        this.a = a;
        this.b = b;
    }

	@Override
	public void tipoOperacion() {
		result=a+b;
		
	}
}