package tp3;
import java.util.Scanner;
public class MaDate {
	private int Jours;
	private int Mois;
	private int Année;
    public String toString() {
        return "MaDate ["+ this.Jours+ "/" + this.Mois+ "/" + this.Année + "]";
	}
	public void setMois(int mois) {
		Mois=mois;
	}
	public int getMois() {
		return this.Mois;
	}
	public void setJours(int jours) {
		Jours=jours;
	}
	public int getJours() {
		return this.Jours;
	}
	public void setAnnée(int année) {
		Année=année;
	}
	public int getAnnée() {
		return this.Année;
	}
	public MaDate(int jour, int mois, int annee) {
        this.Jours = jour;
        this.Mois = mois;
        this.Année = annee;
    }
	public MaDate(int annee) {
        this.Année = annee;
    }
	public void ajouterUnJour() {
		int Maxjours;
		switch(this.Mois){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			Maxjours=31;
		case 4: case 6: case 9: case 11:
			Maxjours=30;
		case 2:
			if (this.Année % 4 == 0 && this.Année % 100 != 0) {
				Maxjours=29;
			}
			else {
				Maxjours=28;
			}
			break;
		default:
			Maxjours=31;
		}
		if (this.Jours < Maxjours) {
			this.Jours++;
		}
		else {
			this.Jours=1;
			this.Mois++;
			if (this.Mois>12) {
				this.Mois=1;
				this.Année++;
			}
		}
	}
	public void ajouterPlusieursJours(int n) {
	    for (int i = 0; i < n; i++) {
	        ajouterUnJour();
	    }
	}
	public void ajouterUnMois() {
		Mois++;
		if(Mois==12) {
			Mois=1;
			Année++;
		}
	}
	public void ajouterUnAn() {
		Année++;
	}
	public static void main(String[] args) {
		MaDate d1 = new MaDate(31, 12,2005);
		MaDate d2 = new MaDate(2005);
		MaDate d3 = new MaDate(28, 5, 2004);
		d3.setAnnée(2005);
		d2.setAnnée(2004);
		d3.setJours(29);
		System.out.println("la 1ére date est: "+d1.Jours+"/"+d1.Mois+"/"+d1.Année);
		System.out.println("la 2éme date est: "+d2.Année);
		System.out.println("la 3éme date est: "+d3.Jours+"/"+d3.Mois+"/"+d3.Année);
		Scanner s = new Scanner (System.in);
		System.out.println("veuillez choisir un choix:"
				+ "1. Ajout d’un jour  \r\n"
				+ "2. Ou ajout de plusieurs jours \r\n"
				+ "3. Ajout d’un mois \r\n"
				+ "4. Ajout d’une année ");
		int choix=s.nextInt();
		while (choix!=1 && choix!=2 && choix!=3 && choix!=4) {
			System.out.println("INVALIDEEEEEE");
			System.out.println("veuillez choisir un choix:"
					+ "1. Ajout d’un jour  \r\n"
					+ "2. Ou ajout de plusieurs jours \r\n"
					+ "3. Ajout d’un mois \r\n"
					+ "4. Ajout d’une année ");
			choix=s.nextInt();
		}
		if (choix==1) {
			d1.ajouterUnJour();
			System.out.println(d1);
		}
		else if(choix==2) {
			System.out.println("donner un nombre de jours:");
			int n=s.nextInt();
			d1.ajouterPlusieursJours(n);
			System.out.println(d1);
		}
		else if(choix==3) {
			d1.ajouterUnMois();
			System.out.println(d1);
		}
		else {
			d1.ajouterUnAn();
			System.out.println(d1);
		}
	}
}