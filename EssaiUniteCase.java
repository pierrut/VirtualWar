package VirtualWar;

public class EssaiUniteCase {
	public static void main(String[] args) {
		Char char1 = new Char(4, 1, true);
		Tireur tireur1 = new Tireur(1, 5, false);
		Piegeur piegeur1 = new Piegeur(4, 3, false);
		Plateau plateau = new Plateau(7, 8);
		plateau.setUnite(char1, char1.getCoordX(), char1.getCoordY());
		plateau.setUnite(piegeur1, piegeur1.getCoordX(), piegeur1.getCoordY());
		plateau.setUnite(tireur1, tireur1.getCoordX(), tireur1.getCoordY());
		System.out.println(plateau);
		char1.avancer(plateau, 4, 3);
		System.out.println(plateau);
		System.out.println(piegeur1.getEnergie());
		char1.tir(plateau, 4, 3);
		System.out.println(plateau);
		System.out.println(piegeur1.getEnergie());
		char1.avancer(plateau, 7, 4);
		System.out.println(plateau);
		char1.avancer(plateau, 6, 1);
		System.out.println(plateau);
		
	}
}
