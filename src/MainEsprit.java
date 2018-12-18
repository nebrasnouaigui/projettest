import javax.swing.text.StringContent;

public class MainEsprit {
	

	public static void main(String[] args) {
		
	 Joueur player1 = new Joueur();
	 player1.setId(9);
	 player1.setNom("Karim");
	 player1.setNationalite("Tunisienne");

	 Joueur player5 = new Joueur();
	 player5.setId(2);
	 player5.setNom("Cafu");
	 player5.setNationalite("Brésilienne");

	 Joueur player2 = new Joueur();
	 player2.setId(11);
	 player2.setNom("Pogba");
	 player2.setNationalite("Française");
	
	 Joueur player3 = new Joueur();
	 player3.setId(7);
	 player3.setNom("Ronaldo");
	 player3.setNationalite("Portugaise");
	 
	 Joueur player4 = new Joueur();
	 player4.setId(6);
	 player4.setNom("Carlos");
	 player4.setNationalite("Brésilienne");
	 
//	System.out.println(player1.toString());
//	System.out.println( player2.toString());
//	System.out.println(player3.toString());
//	System.out.println( player4.toString());
	 
	Equipe equipe1 = new Equipe();
	equipe1.setId(1);
	equipe1.setNom("Juvents");
	equipe1.setPays("Italy");
	
	Equipe equipe2 = new Equipe();
	equipe2.setId(2);
	equipe2.setNom("As Roma");
	equipe2.setPays("Italy");
	
	Equipe equipe3 = new Equipe();
	equipe3.setId(3);
	equipe3.setNom("Club Africain");
    equipe3.setPays("Tunisie");
    
    
	Equipe equipe4 = new Equipe();
	equipe4.setId(4);
	equipe4.setNom("Ain");
	equipe4.setPays("Emirates");
	
	Equipe equipe5 = new Equipe();
	equipe5.setId(5);
	equipe5.setNom("Real Madrid");
	equipe5.setPays("Espagne");
	
	
	equipe1.addJoueur(player1);
	equipe2.addJoueur(player2);
	equipe3.addJoueur(player3);
	equipe4.addJoueur(player4);
	equipe5.addJoueur(player5);
	
	EnsembleEquipe ensembleEquipe = new EnsembleEquipe();
	ensembleEquipe.ajouterEquipe(equipe1);
	ensembleEquipe.ajouterEquipe(equipe2);
	ensembleEquipe.ajouterEquipe(equipe3);
	ensembleEquipe.ajouterEquipe(equipe4);
	ensembleEquipe.ajouterEquipe(equipe5);
	
System.out.println(equipe1.rechercherJoueurParNationalite("Brésilienne"));
System.out.println(equipe1.regroupParNationnalite());
System.out.println(ensembleEquipe.rechercherEquipe(equipe1));
ensembleEquipe.afficherEquipe();
System.out.println(ensembleEquipe.trierParEquipesParNomStream());





	 

	}

}
