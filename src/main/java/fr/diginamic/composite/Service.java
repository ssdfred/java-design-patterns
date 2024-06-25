package fr.diginamic.composite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Service implements IElement {

	private String nom;
	private List<IElement> elements =new ArrayList<>();
	
	public Service(String nom,IElement ...elements) {
		this.nom = nom;
		Collections.addAll(this.elements, elements);
		}

	public void ajoutElements(IElement element) {
		elements.add(element);
	}
	@Override
	public Double calculerSalaire() {
		return elements.stream()
				.mapToDouble(IElement::calculerSalaire).sum();
		
	}

    public void afficherSalaire(String indentation) {
        System.out.println(indentation + "Service " + nom + " - Salaire total : " + calculerSalaire());
        for (IElement element : elements) {
            if (element instanceof Service) {
                ((Service) element).afficherSalaire(indentation + "  ");
            } else if (element instanceof Employe) {
                Employe employe = (Employe) element;
                System.out.println(indentation + "  Employe " + employe.getNom() + " - Salaire : " + employe.calculerSalaire());
            }
        }
    }

	@Override
	public String toString() {
		return "Service [nom=" + nom + ", elements=" + elements + "]";
	}

}
