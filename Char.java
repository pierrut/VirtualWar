package VirtualWar;

public class Char extends Unite {
	public Char(int coordX, int coordY, boolean team) {
		super(coordX, coordY, 60, team);
	}
//ATTENTION : CAS OU DEPLACEMENT D'UNE CASE FORCE A FAIRE ET VERIFICATION !obstacle ENTRE CASE ACTUELLE ET CASE DESTINATAIRE
	public boolean avancer(Plateau plateau, int coordX, int coordY) {
		if (plateau.isVide(coordX, coordY) && getEnergie() > 5
				&& ((((coordX == getCoordX() + 2 && coordY == getCoordY())
						|| (coordX == getCoordX() && coordY == getCoordY() + 2))
						|| (coordX == getCoordX() - 2 && coordY == getCoordY())
						|| (coordX == getCoordX() && coordY == getCoordY() - 2))
				|| ((coordX == getCoordX() + 1 && coordY == getCoordY())
						|| (coordX == getCoordX() && coordY == getCoordY() + 1))
						|| (coordX == getCoordX() - 1 && coordY == getCoordY())
						|| (coordX == getCoordX() && coordY == getCoordY() - 1))) {
			plateau.vider(getCoordX(), getCoordY());
			setCoordX(coordX);
			setCoordY(coordY);
			plateau.setUnite(this, coordX, coordY);
			minusEnergie(5);
			return true;
		}
		return false;
	}

	public boolean tir(Plateau plateau, int coordX, int coordY) {
		if (getEnergie() > 1 && plateau.isUnite(coordX, coordY)
				&& ((coordX <= getCoordX() + 10 && coordY == getCoordY())
						|| (coordX >= getCoordX() - 10 && coordY == getCoordY())
						|| (coordY <= getCoordY() + 10 && coordX == getCoordX())
						|| (coordY >= getCoordY() - 10 && coordX == getCoordX()))) {
			plateau.getUnite(coordX, coordY).minusEnergie(6);
			minusEnergie(1);
			return true;
		}
		return false;
	}

	public String toString() {
		return "C";
	}
}
