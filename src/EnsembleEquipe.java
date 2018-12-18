import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class EnsembleEquipe {
	public Set<Equipe> equipes = new HashSet<>();
    public Set<Equipe> getEquipes() {  return equipes;  }
    public void ajouterEquipe(Equipe e) { 
    	equipes.add(e); }
    public void supprimerEquipe(Equipe e) {  equipes.remove(e);  
    }
    //TODO Question 3
    public boolean rechercherEquipe(Equipe e) {
     return	getEquipes().stream().anyMatch(s -> s.equals(e));  	
    }
    //TODO Question 4
    public void afficherEquipe() {
    	equipes.forEach(s->System.out.println(s));
    }
    
    //TODO Question 5 
    public Set<Equipe> trierParEquipesParNomStream(){
    	return  equipes.stream().sorted(Comparator.comparing(Equipe::getNom)).collect(
    			Collectors.toSet());  	
    }
    public Set<Equipe> trierParEquipesParNomLambda(){
    	
    	return null;
    }
}
