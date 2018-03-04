package services.interfaces;

import java.util.List;

import models.Veterinar;

public interface IVeterinarService {
	public List<Veterinar> getAll();
	public void addVet(Veterinar vet);
	public void deleteVeterinar(int id);
	public Veterinar getVetById(int id);
	public Veterinar updateVeterinar(int id, Veterinar v);
	
	 
}
