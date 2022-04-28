package p1;

import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numeros = List.of(1, 15, 7, 70, 15, 9, 18, 3, 25, 40);
		
		int contador = 0;
		for(int a : numeros) {
			
			if(a > 10) {
				contador ++;
			}
		}
		
		System.out.println("El total de números mayores que 10 son "+contador);
		System.out.println("---------------------------------");

		mostrarI numerosLista = lista -> {
			lista.forEach(n -> System.out.println("Número de la lista "+n));
		};
	
		numerosLista.mostrar(numeros);
		System.out.println("---------------------------------");
				
		
		List<String> colores = List.of("rojo", "verde", "azul", "gris");
		
		
		Object color = colores.stream().filter(s -> !s.equals("rojo"))
		.map(j -> j.toString().toUpperCase())
		.collect(Collectors.toList());
		
		
		System.out.println("Resultado :" +color);
} 
	}
