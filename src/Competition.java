
public class Competition {
    private int id;
    private String nom;
    
    
    
	public Competition() {
		
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
    public String toString() {
        return "Competition{" + "id=" + id + ",  nom=" + nom + '}';
    }
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
		if (!(obj instanceof Competition))
			return false;
		Competition other = (Competition) obj;
		if (id != other.id)
			return false;
		return true;
	}
    
    
}
