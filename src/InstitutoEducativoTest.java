
public class InstitutoEducativoTest {

	public static void main(String[] args) {
		//Creamos una instancia y asignamos un primer nombre
		InstitutoEducativo instituto1 = InstitutoEducativo.getInstance();
		instituto1.setNombreInstituto("Instituto José Cuervo");
		System.out.println("Instituto 1: "+instituto1.getNombreInstituto());
		
		//Intentamos crear una segunda instancia, si imprimimos el nombre imprimirá el
		//de la instancia creada previamente, eso quiere decir, que sólo permite crearlo
		//una sola vez.
		InstitutoEducativo instituto2 = InstitutoEducativo.getInstance();
		System.out.println("Instituto 2: "+instituto2.getNombreInstituto());

		InstitutoEducativo instituto3 = InstitutoEducativo.getInstance();
		instituto3.setNombreInstituto("Instituto Rafel Pombo");
		System.out.println("Instituto 3: "+instituto3.getNombreInstituto());
		System.out.println("Instituto 1: "+instituto1.getNombreInstituto());
	}

}
