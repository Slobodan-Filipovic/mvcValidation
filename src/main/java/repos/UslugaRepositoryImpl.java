package repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import models.Usluga;
import repos.interfaces.IUslugaRepository;

@Repository
public class UslugaRepositoryImpl implements IUslugaRepository{

	private List<Usluga> usluge = new ArrayList();
	
	
	public UslugaRepositoryImpl() {
		usluge.add(new Usluga(1, "pranje", 200.00));
		usluge.add(new Usluga(1, "kupanje", 100.00));
		usluge.add(new Usluga(1, "shishanje", 300.00));
		usluge.add(new Usluga(1, "lecenje", 400.00));
	}


	@Override
	public List<Usluga> getUsluga() {
		// TODO Auto-generated method stub		
		//return usluga.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return usluge;
		 
	}
	

}
