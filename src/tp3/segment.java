package tp3;

public class segment {
	private point extr1;
	private point extr2;
	public segment (point extr1, point extr2) {
		this.extr1=extr1;
		this.extr2=extr2;
	}
	public segment() {
		point extr1=new point (1,2,"A");
		point extr2=new point (3,4,"B");
	}
	public String toString() {
	    return "[" + extr1 + ", " + extr2 + "]";
	}
	 public double longueur() {
		 return extr1.distance(extr2);
	 }
	 public boolean appartient(point p) {
		 double d1=extr1.distance(p);
		 double d2=p.distance(extr2);
		 double d3=d1+d2;
		 double d=this.longueur();
		 return d3==d;
	 }
	 public void translaterSeg(int a, int b) {
	        extr1.abs += a;
	        extr1.ord += b;
	        extr2.abs += a;
	        extr2.ord += b;
	    }
}

