package repos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import models.Veterinar;
import repos.interfaces.IVeterinarRepository;

@Repository
public class VeterinarRepositoryImpl implements IVeterinarRepository {

	private List<Veterinar> vetList;

	public VeterinarRepositoryImpl() {
		vetList = new ArrayList<Veterinar>();
		vetList.add(new Veterinar(1, "mika", "antic", "123"));
		vetList.add(new Veterinar(2, "pera", "peric", "456"));
		vetList.add(new Veterinar(3, "zika", "zikic", "789"));
		vetList.add(new Veterinar(4, "joca", "jocic", "321"));
	}
	 
	@Override
	public Veterinar updateVeterinar(int id, Veterinar v) {
		Veterinar tempVet = new Veterinar();
		 for(int i = 0; i < vetList.size(); i++) {
			 if(id == vetList.get(i).getId()) {
				 tempVet = vetList.get(i);
				 tempVet.setName(v.getName());
				 tempVet.setLastName(v.getLastName());
				 tempVet.setTelephone(v.getTelephone());
			 }
		 }
		 return tempVet;
	}
	/*Sexy lambda
	 * @Override
	public void editVeterinar(Veterinar veterinar) {
		// TODO Auto-generated method stub
		
		Veterinar vet = mockVeterinars.stream().filter(x -> x.getId() == veterinar.getId()).findFirst().orElse(null);
//		vet.setId(veterinar.getId());
		if(vet != null) {
			vet.setName(veterinar.getName());
			vet.setLastname(veterinar.getLastname());
			vet.setTelephone(veterinar.getTelephone());
		}
	 * */
 
	public List<Veterinar> getAll() {
		return vetList;
		/*
		 * List<Veterinar> returnValue = new ArrayList<Veterinar>(); returnValue.add(new
		 * Veterinar(1, "mika" , "antic", "123")); returnValue.add(new Veterinar(2,
		 * "pera" , "peric", "456")); returnValue.add(new Veterinar(3, "zika" , "zikic",
		 * "789")); returnValue.add(new Veterinar(4, "joca" , "jocic", "321"));
		 * 
		 * 
		 * return returnValue;
		 */
	}

	public void addVeterinar(Veterinar v) {
		vetList.add(v);

	}

	public void deleteVeterinar(int id) {
		for(int i = 0; i < vetList.size(); i++) {
			if(vetList.get(i).getId() == id) vetList.remove(i);
		}
	}
	/*
	 * public Veterinar getVetById(int id) { for(Veterinar vet : vetList) {
	 * if(vet.getClass() == id) { return vet; } } return null;
	 * 
	 * }
	 */

	@Override
	public Veterinar getVetById(int id) {
		for (Veterinar vet : vetList) {
			if (vet.getId() == id) {
				return vet;
			}
		}
		return null;
	}
	/*
	 * with lambda public Veterinar getVeterinarById(int id) { return
	 * mockVeterinars.stream().filter(x -> x.getId() ==
	 * id).findFirst().orElse(null); }
	 */

	
}
