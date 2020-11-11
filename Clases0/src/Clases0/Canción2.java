package clases0;

public class Canción2 //Canción2.java
{	public String título; 			//Atributo 1
	public long numDiscosVendidos;  //Atributo 2
	public String grupo;			//Atributo 3
	
		
	public Canción2(String t)//Da valor a cada atributo
	{	título = t;//Valor por argumento
		numDiscosVendidos = (long)(Math.random()*800000);//Aleatorio
		grupo = "Café Quijano"; //Valor por defecto
		
	}
	
	public void Mostrar ()//Muestra los valores de los atributos
	{	System.out.print("Título: "+título+" Discos vendidos:");
		System.out.println(numDiscosVendidos + " Grupo: "+grupo);
	}
	
public static void main(String[] args) 
	{	//Clase nombreObjeto = new Constructor(le damos valores para los atributos)
		Canción2 canción1 = new Canción2("Give a little bit ");
		canción1.Mostrar();
		Canción2 canción2 = new Canción2("La del Pirata cojo");
		canción2.Mostrar();
	}

}