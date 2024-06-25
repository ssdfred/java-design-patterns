package fr.diginamic.composite;

public class TestComposite {

	public TestComposite() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		 // Créer des employés
		Employe Directeur = new Employe("Cecile", "RASPEY", 10000.00);
		Employe Architcte = new Employe("Bollel", "Bechkar", 8000.00);
		Employe chefJAva = new Employe("Kevin", "GUINEAU", 7500.00);
		Employe lead = new Employe("Paul", "MARTIN", 3500.00);
		
		Employe chefJB = new Employe("JB", "RAMNEY", 7500.00);
		Employe concepteur = new Employe("Jane", "MDOE", 3500.00);
		
		// Créer des services
        Service service1 = new Service("DSNI");
        Service service2 = new Service("JAVADEV");
        Service service3 = new Service("BIGDATA");
        
        // Ajouter des employés aux services
        service1.ajoutElements(Architcte);
        service1.ajoutElements(Directeur);
        service2.ajoutElements(chefJAva);
        service2.ajoutElements(lead);
        service3.ajoutElements(concepteur);
        service3.ajoutElements(chefJB);
        
    
     // Créer un service global et ajouter des sous-services
  
        Service globalService = new Service("GolbalService");
        globalService.ajoutElements(service1);
        globalService.ajoutElements(service2);
        globalService.ajoutElements(service3);
        // Afficher le salaire total de chaque service et sous-service
        globalService.afficherSalaire("");
	}

}
