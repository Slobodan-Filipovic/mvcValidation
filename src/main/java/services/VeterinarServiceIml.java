package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Veterinar;
import repos.interfaces.IVeterinarRepository;
import services.interfaces.IVeterinarService;

@Service
public class VeterinarServiceIml implements IVeterinarService {	
	@Autowired
	IVeterinarRepository veterinarRepository;

	public List<Veterinar> getAll() {		 
		return veterinarRepository.getAll();
	}	 
	
	public void addVet(Veterinar v) {
		veterinarRepository.addVeterinar(v);
	}

	public void deleteVeterinar(int id) {
		veterinarRepository.deleteVeterinar(id);
		
	}

	@Override
	public Veterinar getVetById(int id) {
		return veterinarRepository.getVetById(id);
	}
	

}
