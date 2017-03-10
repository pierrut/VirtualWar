package VirtualWar;

public class Piegeur extends Unite {
	public Piegeur(int coordX, int coordY, boolean team) {
		super(coordX, coordY, 50, team);
	}

	public boolean avancer(Plateau plateau, int coordX, int coordY) {
		if (getEnergie() > 2) {
			for (int i = getCoordX() - 1; i < getCoordX() + 1; i++) {
				for (int j = getCoordY() - 1; i < getCoordY() + 1; i++) {
					if (i >= 0 && i < plateau.lengthX() && j >= 0 && j < plateau.lengthY()
							&& (i == coordX && j == coordY) && plateau.isVide(coordX, coordY)) {
						plateau.setUnite(this, coordX, coordY);
						plateau.vider(getCoordX(), getCoordY());
						minusEnergie(2);
						return true;
					}
				}
			}
		}
		return false;
	}

	public boolean mine(Plateau plateau, int coordX, int coordY) {
		if (getEnergie() > 2) {
			for (int i = getCoordX() - 1; i < getCoordX() + 1; i++) {
				for (int j = getCoordY() - 1; i < getCoordY() + 1; i++) {
					if (i >= 0 && i < plateau.lengthX() && j >= 0 && j < plateau.lengthY()
							&& (i == coordX && j == coordY) && plateau.isVide(coordX, coordY)) {
						plateau.putMine(coordX, coordY);
						minusEnergie(2);
						return true;
					}
				}
			}
		}
		return false;
	}

	public String toString() {
		return "P";
	}
}
