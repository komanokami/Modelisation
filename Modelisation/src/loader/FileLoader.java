package loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import publics.Const;
import entity.Point;

public class FileLoader {
	private int nbPoint, nbSeg, nbFace;
	public FileLoader(){
		clearLists();
		String sta;
		String currnt;
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Mathias\\Documents\\GitHub\\Modelisation\\Modelisation\\src\\models\\cone.gts"))){
			sta = br.readLine();
			initNbs(sta);
			for(int i = 0; i<nbPoint; i++){
				double x, y , z;
				currnt = br.readLine();
				//Ici il faut recup les doubles de currnt !!!!!!!!
				Const.points.add(new Point(x, y, z));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	private void initNbs(String sta) {
		String words[] = sta.split(" ");
		nbPoint = Integer.parseInt(words[0]);
		nbSeg = Integer.parseInt(words[1]);
		nbFace = Integer.parseInt(words[2]);
	}

	private void clearLists() {
		Const.faces.clear();
		Const.points.clear();
		Const.segments.clear();
		
	}
	public static void main(String args[]){
		FileLoader f = new FileLoader();
	}
	
}
