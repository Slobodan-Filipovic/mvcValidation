package repos.interfaces;

import java.util.List;

import models.Veterinar;

public interface IVeterinarRepository {
	List<Veterinar> getAll();
	void addVeterinar(Veterinar v);
	void deleteVeterinar(int id);
	Veterinar getVetById(int id);
	Veterinar updateVeterinar(int id, Veterinar v);

}
