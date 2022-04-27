package com.bootcamp.solid;
public class Calculator {
	
	public void calculate(OperacionI operaciones) {
		
		operaciones.tipoOperacion();
		
	}


    public static void main(String[] args) throws Exception {

        //Calculator  obj = new Calculator();

        Addition add = new Addition(5,5);
        add.tipoOperacion();
        System.out.println("Resultado calculator: " +  add.result);

        Substraction sb = new Substraction(5,2);
        sb.tipoOperacion();
        System.out.println("Resultado susbration " +  sb.result);

        Multiplication ml = new Multiplication(5,5);
        ml.tipoOperacion();
        System.out.println("Resultado multiplication " +  ml.result);

        Dividir dv = new Dividir(10,5);
        dv.tipoOperacion();
        System.out.println("Resultado division " +  dv.result);
    }

}