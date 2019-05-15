package branda;

public final class Branda {
	
	private static final int EXIT_ON_CLOSE = 3;
	//fields
	Windows MainWindow, WarningWindow, OptionWindow;
	
	
	protected Branda() {
		this.MainWindow = new Windows("Main");
        this.MainWindow.setSize(600, 500);
        this.MainWindow.setLocation(100, 100);
        this.MainWindow.setDefaultCloseOperation( EXIT_ON_CLOSE );
		this.MainWindow.setVisible(true);
        
        this.WarningWindow = new Windows("Warning!");
        this.MainWindow.setSize(320, 320);
        this.MainWindow.setLocation(100, 100);
        
		this.OptionWindow = new Windows("Opions");
        this.MainWindow.setSize(320, 320);
        this.MainWindow.setLocation(100, 100);
	}
	
	public static void main(String[] args) {
		
		Branda Brenda = new Branda();
		
	}

}
