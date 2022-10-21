public enum Tipo{
	SERVER("Servidor"),
	WORKSTATION("Estación de trabajo"),
	DESKTOP("Escritorio"),
	LAPTOP("Portatil");

	private final String type;

	public Tipo(String type){
		this.type = type;
	}
	public String getType(){
		return type;
	}
}