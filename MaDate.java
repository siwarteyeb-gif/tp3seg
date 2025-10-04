package tp2;
import java.util.Scanner;
public class MaDate{
	private int jour;
	private int mois;
	private int annee;
	@Override
	public String toString() {
		return jour+"/"+mois+"/"+annee;
	}
	public int getJour() {
		return jour;
	}
	public int getMois() {
		return mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setJour(int j) {
		this.jour=j;
	}
	public void setMois(int m) {
		this.mois=m;
	}
	public void setAnnee(int a) {
		this.annee=a;
	}
	public MaDate(int jour,int mois,int annee) {
		this.jour=jour;
		this.mois=mois;
		this.annee=annee;
	}
	public MaDate(int annee) {
		this.jour=31;
		this.mois=8;
		this.annee=annee;
	}
	public void AjoutJour() {
		int nbjour;
		switch(mois) {
		case 4: case 6:case 9: case 12:
			nbjour=30;
			break;
		
		case 2:
			if(annee%400==0 ||(annee%100!=0 && annee%4==0)) {
				nbjour=29;
			}else {
				nbjour=28;
			}
			break;
		default:
			nbjour=31;}
		if(jour<nbjour) {
			jour+=1;
		}
		else {
			jour=1;
			if(mois<12) {
				mois+=1;
			}
			else {
				annee+=1;
				mois=1;
			}
		}
			
			
	}
	public void AjoutPlusieur(int n) {
		for(int i=0; i<n ; i++) {
			AjoutJour();
		}
	}
	public void AjoutMois() {
		if(mois<12) {
			mois+=1;
		}
		else {
			mois=1;
		}
	}
	public void AjoutAnnee() {
		annee+=1;
		if(!(annee%400==0 || (annee%4==0 && annee%100!=0))) {
			mois=28;
		}
	}
	
	
}
class TestDate{
	public static void main(String [] args) {
		MaDate d1=new MaDate(20,5,2025);
		MaDate d2=new MaDate(2000);
		MaDate d3=new MaDate(8,10,2020);
		d1.setJour(5);
		d2.setJour(3);
		d3.setJour(4);
		d1.setAnnee(2001);
		d2.setAnnee(2015);
		d3.setAnnee(2024);
		d1.setMois(6);
		d2.setMois(7);
		d3.setMois(9);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		try (Scanner s=new Scanner(System.in)){; 
		System.out.println("le jour est : -------");
		int jour=s.nextInt();
		System.out.println("le mois est : -------");
		int mois=s.nextInt();
		System.out.println("l'annee est : -------");
		int annee=s.nextInt();}
		System.out.println("date 1 avant  on ajout un jour---------"+d1.toString());
		d1.AjoutJour();
		System.out.println("date 1 aprés  on ajout un jour---------"+d1.toString());
		System.out.println("date 2 avant on ajout plusieur jour--------"+d2.toString());
		d2.AjoutPlusieur(4);
		System.out.println("date 2 apres on ajout plusieur jour--------"+d2.toString());
		System.out.println("date 3 avant on ajout une mois-------"+d3.toString());
		d3.AjoutMois();
		System.out.println("date 3 apres on ajout une mois jour--------"+d3.toString());
		System.out.println("date 1 apres on ajout une annee------"+d1.toString());
		d1.AjoutAnnee();
		System.out.println("date 1 apres on ajout une annee--------"+d1.toString());
	}
}