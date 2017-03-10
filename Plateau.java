package VirtualWar;

//INITIALISATION OBSTACLES A FAIRE

public class Plateau {
	private Case[][] plateau;

	public Plateau(int lignes, int colonnes) {
		plateau = new Case[lignes][colonnes];
		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau[0].length; j++) {
				plateau[i][j] = new Case();
			}
		}
	}

	public boolean isMine(int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			return plateau[coordX][coordY].isMine();
		}
		return false;
	}

	public Case getCase(int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			return plateau[coordX][coordY];
		}
		return null;
	}

	public boolean isVide(int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			return plateau[coordX][coordY].isVide();
		}
		return false;
	}

	public void vider(int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			plateau[coordX][coordY].vider();
		}
	}

	public boolean isUnite(int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			return plateau[coordX][coordY].isUnite();
		}
		return false;
	}

	public void setCase(int coordX, int coordY, Case case1) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			plateau[coordX][coordY] = case1;
		}
	}

	public int lengthX() {
		return plateau.length;
	}

	public int lengthY() {
		return plateau[0].length;
	}

	public void setUnite(Unite unite, int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			setCase(coordX, coordY, new Case(unite));
		}
	}

	public Unite getUnite(int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			return plateau[coordX][coordY].getUnite();
		}
		return null;
	}

	public void putMine(int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			setCase(coordX, coordY, new Case(1, true));
		}
	}

	public void putObstacle(int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			setCase(coordX, coordY, new Case(true));
		}
	}

	public void initialiserVide(int coordX, int coordY) {
		if (coordX > 0 && coordY > 0 && coordX < plateau.length && coordY < plateau.length) {
			setCase(coordX, coordY, new Case());
		}
	}

	public String toString() {
		String res = "";
		for (int i = 0; i < plateau.length; i++) {
			for (int j = 0; j < plateau[0].length; j++) {
				res += plateau[i][j];
			}
			res += "\n";
		}
		return res;
	}
}
