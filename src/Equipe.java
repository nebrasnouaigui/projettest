import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Equipe {
    private int id;
    private String nom;
    private String pays;
    private List<Joueur> joueurs;
	public Equipe() {
		joueurs = new ArrayList<>() ;   
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public List<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(List<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	
    //TODO Question 1
	public boolean rechercherJoueurParNationalite(String nationalite) {
	return joueurs.stream().anyMatch((s)->s.getNationalite().equals(nationalite));
	}
	
	//TODO Question 2
	public Map<String,List<Joueur>> regroupParNationnalite(){
	return	joueurs.stream().collect(Collectors.groupingBy(Joueur :: getNationalite));
	}
	
    public String toString() {
        return "Equipe{" + "id=" + id + ", nom=" + nom + ", pays=" + pays + ", joueurs=" + joueurs + '}'; }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Equipe))
			return false;
		Equipe other = (Equipe) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
    public void addJoueur(Joueur j) {     joueurs.add(j);  }
    public void supprimerJoueur(Joueur j) {  joueurs.remove(j);  }

}
