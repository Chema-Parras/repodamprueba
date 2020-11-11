package clases0;

public class Canción 
{	public String título; 			//Atributo 1
	public long numDiscosVendidos;  //Atributo 2
	public String grupo;			//Atributo 3
	
		//Constructor es la función que le da valor a los 
		//atributos. 
		//Se llama igual que la clase.
		//A diferencia de casi todos los métodos no 
		//lleva void.
	public Canción(String t, long nd, String g)//valores por argumento
	{	título = t;//Valor por argumento
		numDiscosVendidos = nd;//Valor por argumento
		grupo = g;//Valor por argumento
		
	}
	
	public void Mostrar ()
	{	System.out.print("Título: "+título+" Discos vendidos:");
		System.out.println(numDiscosVendidos + " Grupo: "+grupo);
	}
	
public static void main(String[] args) 
	{	//Clase nombreObjeto = new Constructor(le damos valores para los atributos)
		Canción canción1 = new Canción("Give a little bit ",150000,"Supertamp");
		canción1.Mostrar();
		Canción canción2 = new Canción("La del Pirata cojo",120000,"Joaquín Sabina");
		canción2.Mostrar();
	}

}