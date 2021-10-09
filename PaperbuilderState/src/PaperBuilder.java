
public abstract class PaperBuilder {
	
	String name ;
	
	PaperType type ;
	
	public abstract void addPages();
	
	public abstract void addingSomeElements();
	 
	public abstract void changeSomeElements();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PaperType getType() {
		return type;
	}

	public void setType(PaperType type) {
		this.type = type;
	}

}
