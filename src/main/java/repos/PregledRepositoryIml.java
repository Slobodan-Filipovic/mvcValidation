package repos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import models.Pregled;
import models.Usluga;
import repos.interfaces.IPregledRepository;
import repos.interfaces.IUslugaRepository;

@Repository
public class PregledRepositoryIml implements IPregledRepository {

	private List<Pregled> pregledi = new ArrayList<>();
	
	@Autowired
	IUslugaRepository uslugaRepository;

	public PregledRepositoryIml() {
		pregledi.add(new Pregled(1, 1));
		pregledi.add(new Pregled(1, 2));
		pregledi.add(new Pregled(1, 3));
		pregledi.add(new Pregled(1, 4));
		pregledi.add(new Pregled(2, 1));
		pregledi.add(new Pregled(3, 1));
		pregledi.add(new Pregled(4, 1));
		pregledi.add(new Pregled(2, 1));
		pregledi.add(new Pregled(2, 1));

	}
 
	@Override
	public List<Usluga> getUslugeForVeterinarId(int id) {
		// TODO Auto-generated method stub
		// return uslugaRepository.getUsluga().stream().filter(x -> x.getId() ==
		// id).collect(Collectors.toList());
		// List<Pregled> filteraniPregled = pregledi.stream().filter(x ->
		// x.getVeterinarId() == id).collect(Collectors.toList());
		
		List<Pregled> filteraniPregled = pregledi
				.stream()
				.filter(x -> x.getVeterinarId() == id)
				.collect(Collectors.toList());
		return uslugaRepository.getUsluga()
				.stream()
				.filter(x -> {
						return filteraniPregled.stream().anyMatch(y -> y.getUslugaId() == x.getId());
		}).collect(Collectors.toList());
	} 
/*@Override
	public List<Usluga> getUslugeForVeterinarId(int id) {
		List<Pregled> filterPregled = pregledi
				.stream()
				.filter(x -> x.getVeterinarId() == id)
				.collect(Collectors.toList());
		return uslugaRepository.getUsluga()
				.stream()
				.filter(x -> {
					return filterPregled.stream().anyMatch(y -> y.getUslugaId() == x.getId());
				}).collect(Collectors.toList());
	}*/
}
