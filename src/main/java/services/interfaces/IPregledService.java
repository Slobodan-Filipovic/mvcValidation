package services.interfaces;

import java.util.List;

import models.Usluga;

public interface IPregledService {

	List<Usluga> getUslugaForVeterinarId(int id);
}
