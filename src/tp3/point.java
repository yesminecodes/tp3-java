package tp3;

public class point {
	public int abs;
	public int ord;
	public String nom;
	public point (int abs,int ord,String nom) {
		this.abs=abs;
		this.ord=ord;
		this.nom=nom;
	}
	public point () {
		abs=7;
		ord=5;
		nom="A";
	}
	public void afficher() {
		System.out.println(this.nom+"("+this.abs+","+this.ord+")");
	}
	public double distance(point p) {
		return Math.sqrt(Math.pow(this.abs - p.abs, 2) + Math.pow(this.ord - p.ord, 2));
	}
	public String toString() {
	    return nom + " (" + abs + ", " + ord + ")";
	}
}
