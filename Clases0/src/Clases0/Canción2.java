package clases0;

public class Canci�n2 //Canci�n2.java
{	public String t�tulo; 			//Atributo 1
	public long numDiscosVendidos;  //Atributo 2
	public String grupo;			//Atributo 3
	
		
	public Canci�n2(String t)//Da valor a cada atributo
	{	t�tulo = t;//Valor por argumento
		numDiscosVendidos = (long)(Math.random()*800000);//Aleatorio
		grupo = "Caf� Quijano"; //Valor por defecto
		
	}
	
	public void Mostrar ()//Muestra los valores de los atributos
	{	System.out.print("T�tulo: "+t�tulo+" Discos vendidos:");
		System.out.println(numDiscosVendidos + " Grupo: "+grupo);
	}
	
public static void main(String[] args) 
	{	//Clase nombreObjeto = new Constructor(le damos valores para los atributos)
		Canci�n2 canci�n1 = new Canci�n2("Give a little bit ");
		canci�n1.Mostrar();
		Canci�n2 canci�n2 = new Canci�n2("La del Pirata cojo");
		canci�n2.Mostrar();
	}

}