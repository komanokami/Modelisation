package loader;

import publics.Const;

public class FileLoader {
	public FileLoader(){
		clearLists();
	}

	private void clearLists() {
		Const.faces.clear();
		Const.points.clear();
		Const.segments.clear();
		
	}
	
}
