package VirtualWar;

public class Tireur extends Unite{

	
	public Tireur(int coordX, int coordY, boolean team) {
		super(coordX, coordY, 40, team);
	}
	
	public boolean avancer(Plateau plateau, int coordX, int coordY) {
		if (getEnergie() > 1) {
			for (int i = getCoordX() - 1; i < getCoordX() + 1; i++) {
				for (int j = getCoordY() - 1; i < getCoordY() + 1; i++) {
					if (i >= 0 && i < plateau.lengthX() && j >= 0 && j < plateau.lengthY()
							&& (i == coordX && j == coordY) && plateau.isVide(coordX, coordY)) {
						plateau.setUnite(this, coordX, coordY);
						plateau.vider(getCoordX(), getCoordY());
						minusEnergie(1);
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public boolean tir(Plateau plateau, int coordX, int coordY) {
		if (getEnergie() > 2 && plateau.isUnite(coordX, coordY) && ((coordX <= getCoordX() + 10  && coordY == getCoordY())|| (coordX >= getCoordX() - 10 && coordY == getCoordY())
				|| (coordY <= getCoordY() + 10 && coordX == getCoordX()) || (coordY >= getCoordY() - 10 && coordX == getCoordX()))) {
			plateau.getUnite(coordX, coordY).minusEnergie(3);
			minusEnergie(2);
			return true;
		}
		return false;
	}
	
	public String toString(){
		return "T";
	}
}
