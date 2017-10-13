package kataSG;

public class CompteBancaire {
	private String nom;
	private String prenom;
	private double solde = 0;


	public void CompteBancaire(String nom, String prenom, double solde) {
		this.nom = nom;
		this.prenom = prenom;
		this.solde = solde;
	}

	/* CREDITER */
	public double crediterCompteBancaire(double sommecredite) {
		return this.solde = this.solde + sommecredite;
	}

	/* DEBITER */
	public double debiterCompteBancaire(double sommedebiter) {
		return this.solde = this.solde - sommedebiter;
	}

	/* AFFICHER COMPTE */
	public void afficher(String string) {
		System.out.println("Nom : " + this.nom);
		System.out.println("Prenom : " + this.prenom);
		System.out.println("Solde : " + this.solde + "€");
		System.out.println("Date de l'opération : " + string);

	}

}