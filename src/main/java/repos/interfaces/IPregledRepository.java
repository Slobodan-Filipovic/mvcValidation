package repos.interfaces;

import java.util.List;

import models.Usluga;

public interface IPregledRepository {
	List<Usluga> getUslugeForVeterinarId(int id);

}
