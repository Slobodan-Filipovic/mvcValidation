package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import models.Usluga;
import repos.interfaces.IPregledRepository;
import services.interfaces.IPregledService;

@Service
public class PregledServiceImpl implements IPregledService{
	
	@Autowired
	IPregledRepository pregledRepository;

	@Override
	public List<Usluga> getUslugaForVeterinarId(int id) {
		// TODO Auto-generated method stub
		return pregledRepository.getUslugeForVeterinarId(id);
	}

}
