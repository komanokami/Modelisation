package entity;

import publics.Coordonnees;

public class Point {
	private Coordonnees c;
	public Point(int x, int y, int z){
		c = new Coordonnees(x, y, z);
	}
}
