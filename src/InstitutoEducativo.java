
public class InstitutoEducativo {
	//Agregamos una instancia de tipo privado
	private static InstitutoEducativo instance = new InstitutoEducativo(); 
	//Agregamos un atributo con el nombre del instituto
	private String nombreInstituto;
	
	//Constructor de tipo privado
	private InstitutoEducativo(){
		
	}
	
	//Get and setters de la instancia
	public static InstitutoEducativo getInstance() {
		if(instance == null){
			instance = new InstitutoEducativo();
		}
		
		return instance;
	}

	public static void setInstance(InstitutoEducativo instance) {
		InstitutoEducativo.instance = instance;
	}

	//Get and setters del atributo NombreInstituto
	public String getNombreInstituto() {
		return nombreInstituto;
	}

	public void setNombreInstituto(String nombreInstituto) {
		this.nombreInstituto = nombreInstituto;
	}
	
}
