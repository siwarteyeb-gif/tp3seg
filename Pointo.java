package tp2p;
public class Pointo{
	int abs;
	int ord;
	String nom;
	public Pointo(int abs,int ord,String nom) {
		this.abs=abs;
		this.ord=ord;
		this.nom=nom;
	}
	public Pointo() {
		this.abs=2;
		this.ord=3;
		this.nom="x";
	}
	public void affiche() {
		System.out.println(nom+"("+abs+","+ord+")");
	}
	public double distance(Pointo p) {
		double dx=(p.abs)-(this.abs);
		double dy=p.ord-this.ord;
		return Math.sqrt(dx*dx+ dy*dy);
	}
	@Override
	public String toString() {
		return nom+"("+abs+","+ord+")";
	}
	
}