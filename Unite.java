package VirtualWar;

public class Unite {
	private int coordX;
	private int coordY;
	private int energie;
	private boolean inBase = true;
	private boolean team;
	
	
	
	public Unite(int coordX, int coordY, int energie, boolean team) {
		this.coordX = coordX;
		this.coordY = coordY;
		this.energie = energie;
		this.team = team;
	}
	public void minusEnergie(int dommages){
		energie -= dommages;
	}
	public void test(){
		
	}
	public int getCoordX() {
		return coordX;
	}
	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}
	public int getCoordY() {
		return coordY;
	}
	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}
	public int getEnergie() {
		return energie;
	}
	public void setEnergie(int energie) {
		this.energie = energie;
	}
	public boolean getInBase() {
		return inBase;
	}
	public void setInBase(boolean inBase) {
		this.inBase = inBase;
	}
	public boolean getTeam() {
		return team;
	}
	public void setTeam(boolean team) {
		this.team = team;
	}
}
