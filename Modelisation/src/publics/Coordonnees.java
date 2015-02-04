package publics;

public class Coordonnees {
	private int x, y, z;
	
	public Coordonnees(int x1,int y1,int z2){
		x = x1;
		y = y1;
		z = z2;
	}
	public void ajouter(Coordonnees c){
		x += c.x;
		y += c.y;
		z += c.z;
	}
	
}
