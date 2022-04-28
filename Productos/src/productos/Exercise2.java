package productos;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
	   public static void main(String[] args) {
	      List<Producto> shopping = List.of(
	            new Producto("Clothes", new BigDecimal("15.90"), Impuesto.NORMAL),
	            new Producto("Bread", new BigDecimal("1.5"), Impuesto.SUPERREDUCED),
	            new Producto("Meat", new BigDecimal("13.99"), Impuesto.REDUCED),
	            new Producto("Cheese", new BigDecimal("3.59"), Impuesto.SUPERREDUCED),
	            new Producto("Coke", new BigDecimal("1.89"), Impuesto.REDUCED),
	            new Producto("Whiskey", new BigDecimal("19.90"), Impuesto.NORMAL));
	      
	      //// Implementacion
	      
	      Object productosC = shopping.stream().filter(p -> p.name.startsWith("C")).map(c -> c.name)
	    		  .sorted().collect(Collectors.toList());
	      
	      System.out.println("Productos que empiezan por C: "+productosC.toString());
	      
	      
	      Object precio = shopping.stream().map(i -> i.price.add(i.price.multiply(BigDecimal
	    		  .valueOf(i.impuesto.getPercent()*0.01)))).reduce(BigDecimal.ZERO, BigDecimal::add);
	      
	      System.out.println("El resultado es: "+ precio);
	      
	   }
	}