
public class PaperState implements State {

	@Override
	public void Pulping() {

System.out.println("Home made paper creation ");
System.out.println("Step1 : Pulping method");
		
	}

	@Override
	public void addingUniqueElements() {
		 
		System.out.println("Step2 : adding some Unique Elements");

	}

	@Override
	public void settingThepaper() {
		System.out.println("Step3 :setting up The paper");

		
	}

	@Override
	public void CouchingThepaper() {
		System.out.println("Step4 :CouchingThepaper process");
		
	}

	@Override
	public void ready() {
		System.out.println("Step5 :Ready to use ");
		
	} }
