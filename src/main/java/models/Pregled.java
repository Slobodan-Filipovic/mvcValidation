package models;

public class Pregled {
	private int veterinarId;
	private int uslugaId;
	
	
	public Pregled(int veterinarId, int uslugaId) {
		super();
		this.veterinarId = veterinarId;
		this.uslugaId = uslugaId;
	}
	public int getVeterinarId() {
		return veterinarId;
	}
	public void setVeterinarId(int veterinarId) {
		this.veterinarId = veterinarId;
	}
	public int getUslugaId() {
		return uslugaId;
	}
	public void setUslugaId(int uslugaId) {
		this.uslugaId = uslugaId;
	}
	
	
	 

}
