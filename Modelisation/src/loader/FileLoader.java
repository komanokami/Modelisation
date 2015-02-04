package loader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import publics.Const;

public class FileLoader {
	public FileLoader(){
		clearLists();
		String sta;
		try(BufferedReader br = new BufferedReader(new FileReader("/Modelisation/src/models/cone.gts"))){
			sta = br.readLine();
			System.out.println(sta);
		}catch(IOException e){
			e.printStackTrace();
		}
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
