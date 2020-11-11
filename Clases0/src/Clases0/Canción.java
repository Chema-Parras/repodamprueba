package clases0;

public class Canci�n 
{	public String t�tulo; 			//Atributo 1
	public long numDiscosVendidos;  //Atributo 2
	public String grupo;			//Atributo 3
	
		//Constructor es la funci�n que le da valor a los 
		//atributos. 
		//Se llama igual que la clase.
		//A diferencia de casi todos los m�todos no 
		//lleva void.
	public Canci�n(String t, long nd, String g)//valores por argumento
	{	t�tulo = t;//Valor por argumento
		numDiscosVendidos = nd;//Valor por argumento
		grupo = g;//Valor por argumento
		
	}
	
	public void Mostrar ()
	{	System.out.print("T�tulo: "+t�tulo+" Discos vendidos:");
		System.out.println(numDiscosVendidos + " Grupo: "+grupo);
	}
	
public static void main(String[] args) 
	{	//Clase nombreObjeto = new Constructor(le damos valores para los atributos)
		Canci�n canci�n1 = new Canci�n("Give a little bit ",150000,"Supertamp");
		canci�n1.Mostrar();
		Canci�n canci�n2 = new Canci�n("La del Pirata cojo",120000,"Joaqu�n Sabina");
		canci�n2.Mostrar();
	}

}