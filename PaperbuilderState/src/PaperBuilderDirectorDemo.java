
public class PaperBuilderDirectorDemo {

	public static void main(String[] args) {
		 
		State bookbuilder = new PaperState();
		
		bookbuilder.Pulping();
		
		bookbuilder.addingUniqueElements();
		
		bookbuilder.settingThepaper();
		
		bookbuilder.CouchingThepaper();
		
		bookbuilder.ready();

	}

}
