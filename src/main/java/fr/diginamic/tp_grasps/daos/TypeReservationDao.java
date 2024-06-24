package fr.diginamic.tp_grasps.daos;

import java.util.List;
import java.util.Optional;

import fr.diginamic.tp_grasps.beans.TypeReservation;

public class TypeReservationDao {
	
	public static TypeReservation[] types = {new TypeReservation("TH", 150.0, 15.0), new TypeReservation("CI", 10.9, 0.0)};
	
	private static TypeReservationDao instance;
	
	public TypeReservationDao() {};
    // Méthode publique statique pour obtenir l'instance
    public static TypeReservationDao getInstance() {
        if (instance == null) {
            instance = new TypeReservationDao();
        }
        return instance;
    }
	public TypeReservation extraireTypeReservation(String type) {
		
		Optional<TypeReservation> opt = List.of(types).stream().filter(t->t.getType().equals(type)).findAny();
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
}
