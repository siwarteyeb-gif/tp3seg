package tp2p;
public class Segment{
	Pointo extr1;
	Pointo extr2;
	public Segment() {
		this.extr1=new Pointo();
		this.extr2=new Pointo();
	}
	public Segment(Pointo p1,Pointo p2) {
		this.extr1=new Pointo(p1.abs,p1.ord,p1.nom);
		this.extr2=new Pointo(p2.abs,p2.ord,p2.nom);
	}
	@Override
	public String toString() {
		return "["+extr1+","+extr2+"]";
	}
	public double longuer(Pointo extr1,Pointo extr2) {
		double dx=extr2.abs-extr1.abs;
		double dy=extr2.ord-extr1.ord;
		return Math.sqrt((dx*dx)+(dy*dy));
	}
	public boolean appartient(Pointo p) {
		double dpb=longuer(this.extr1,p);
		double  dap=longuer(this.extr2,p);
		double d=longuer(this.extr1,this.extr2);
		return Math.abs((dpb+dap)-d)<1e-6;
	
	}
	public void traslaterSeg(int a ,int b) {
		this.extr1.abs+=a;
		this.extr1.ord+=b;
		this.extr2.abs+=a;
		this.extr2.ord+=b;
		
	}
	
}
class Test{
	public static void main(String [] args) {
		Pointo p1=new Pointo();
		Pointo p2=new Pointo(5,4,"y");
		Pointo p3=new Pointo(3,3,"m");
		p1.affiche();
		p2.affiche();
		System.out.println("la distance entre le deux point est --:"+p1.distance(p2));
		Segment seg1=new Segment(p1,p2);
		System.out.println("la longuer de segment 1 est --:"+seg1.longuer(p1, p2));
		if(seg1.appartient(p3)==true) {
		System.out.println("le point p3 appartient a le segment 1");
	}
		else {System.out.println("le point p3 n'appartient pas a le segment 1");}
	System.out.println("translation de segment1 ------------");
	System.out.println("premier version de segment est"+seg1);
	seg1.traslaterSeg(1,1);
	System.out.println("segment1 apres la translation"+seg1);
}}