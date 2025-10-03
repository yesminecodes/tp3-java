package tp3;

public class TestSegment {
	 public static void main(String[] args) {
		 point A = new point(1,2,"A");
	     point B = new point(3,4,"B");
	     point C = new point(2,3,"C");
	     
	     segment s = new segment (A,B);
	     System.out.println("Segment : " + s);
	     System.out.println("Longueur : " + s.longueur());
	     System.out.println("C appartient au segment ? " + s.appartient(C));
	     s.translaterSeg(2, 1);
	     System.out.println("Après translation : " + s);System.out.println("Avant translation : " + s);
	     s.translaterSeg(2, 3);
	     System.out.println("Après translation : " + s);
	 }
}
