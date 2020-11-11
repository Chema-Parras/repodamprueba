package clases0;

public class Ciudades
{
	//Clase ciudades
	//atributos: nombre, costa, población
	//Métodos: Ciudades, Mostrar, main
	
	//Cada objeto será una ciudad concreta
	
	public String nombre;
	public boolean costa;
	public float población; //escrito en millones
	
	public Ciudades(String n)
	//Constructor: se llama igual que la clase
	//constructor: un método que da valores a los atributos
	{	nombre= n;						//Valor se pasa por argumento
		costa=false; 					//Valor predeterminado
		población= (float)(Math.random()*10);	//Valor aleatorio
		
	}
	
	
	public Ciudades(String n, boolean b)
	{	nombre= n;						//Valor se pasa por argumento
		costa=true; 					//Valor predeterminado
		población= (float)(Math.random()*10);	//Valor aleatorio
	}
	
	public Ciudades(String n, byte b)
	{	nombre= n;	
		byte max=1;
		byte ale= (byte)(Math.random()*(max+1));//Aleatorio qu sea 1 o 0
		if (ale==0)
			costa=true; 	
		else
			costa=false;
		
		población= (float)(Math.random()*10);	
		
	}
	
	public Ciudades()
	{   //Nombre aleatorio: 
		//0="Kiev", 1="Montreal", 2="helsinki", 3="Tegucigalpa", 
		//4="Ulan Bator", 5="El Cairo"
		
		byte max =5;
		byte ale= (byte)(Math.random()*(max+1));
		
		switch(ale)
		{	case 0:nombre="Kiev		  "; break;
			case 1:nombre="Montreal   "; break;
			case 2:nombre="Helsinki	  "; break;
			case 3:nombre="Tegucigalpa"; break;
			case 4:nombre="Ulan Bator "; break;
			case 5:nombre="El Cairo   "; break;
		}					
		costa=true; 					
		población= 5F;	
	}
	
	
	public void Mostrar()
	{	System.out.print("Nombre: "+nombre);
	if (costa==true)
	{
		System.out.print("\tTiene costa\t");
	}
	else
	{	System.out.print("\tNo tiene costa\t");
	
	}
	System.out.println("Población: "+población);
	}
	
	public static void main(String[] args) 
	{	//Clase nombreObjeto = new contructor (argumento(s))
		Ciudades ciudad1	 = new Ciudades ("Madrid          ");
		ciudad1.Mostrar();
		Ciudades ciudad2	 = new Ciudades ("Moscú           ");
		ciudad2.Mostrar();
		Ciudades ciudad3	 = new Ciudades ("Ciudad de México");
		ciudad3.Mostrar();
		Ciudades ciudad4	 = new Ciudades ("Tokyo           ", true);
		ciudad4.Mostrar();
		Ciudades ciudad5	 = new Ciudades ("Melbourne       ", true);
		ciudad5.Mostrar();
		Ciudades ciudad6	 = new Ciudades ("Sao Paulo       ", (byte)5);
		ciudad6.Mostrar();
		Ciudades ciudad7	 = new Ciudades ("Nairobi         ", (byte)5);
		ciudad7.Mostrar();
		Ciudades ciudad8	 = new Ciudades ("Guayaquil       ", (byte)5);
		ciudad8.Mostrar();
		Ciudades ciudad9	 = new Ciudades ();
		ciudad9.Mostrar();
		Ciudades ciudad10	 = new Ciudades ();
		ciudad10.Mostrar();
		Ciudades ciudad11	 = new Ciudades ("Seúl            ");
		ciudad11.Mostrar();
		Ciudades ciudad12	 = new Ciudades ("Estocolmo       ", false);
		ciudad12.Mostrar();


	}

}
