package branda;

import branda.Windows.MainWindow;

public final class Branda {
	
	public static void main(String[] args) {
		
		MainWindow mw = MainWindow.getRef();
		
		for(int i=0;i<10;i++){
			mw.addLine("MainWindow.getRef()", "public void addLine(String sName, String sDesc, String sBut)", "X");
		}
		
	}

}
