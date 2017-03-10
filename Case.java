package VirtualWar;

public class Case {
	private Unite unite;
	private String type;
	private boolean obstacle;
	private boolean mine;
	public Case(Unite unite) {
		this.unite = unite;
		type = "unite";
		obstacle = false;
		setMine(false);
	}
	
	public Case(int any, boolean mine){
		type = "mine";
		this.setMine(mine);
		obstacle = false;
	}

	public Case(boolean obstacle) {
		type = "obstacle";
		this.obstacle = obstacle;
	}

	public Case() {
		type = "vide";
		obstacle = false;
	}

	public void vider() {
		unite = null;
		type = "vide";
		obstacle = false;
	}

	public boolean isUnite() {
		return type.equals("unite");
	}

	public boolean isVide() {
		return type.equals("vide");
	}

	public Unite getUnite() {
		return unite;
	}

	public void setUnite(Unite unite) {
		this.unite = unite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isObstacle() {
		return obstacle;
	}

	public void setObstacle(boolean obstacle) {
		this.obstacle = obstacle;
	}

	public String toString() {
		if (unite == null){
			return ".";
		}
		return unite.toString();
	}

	public boolean isMine() {
		return mine;
	}

	public void setMine(boolean mine) {
		this.mine = mine;
	}
}
