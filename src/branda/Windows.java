package branda;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Collection;

import javax.swing.*; 

public class Windows extends JFrame {

	public Windows(String str){
		super(str);
	}
	
	public void show(Windows w) {
		w.setVisible(true);
	}
	
	public void hide(Windows w) {
		w.setVisible(false);
	}
	
	protected static class MainWindow extends Windows {
		
		protected final MainWindow ref = new MainWindow("Main");
		
		private int gridRows;
		private GridLayout gridLay;
		private Collection lblName, lblDescription, btnDel;
		
		private MainWindow(String str) {
			super(str);
		    this.setSize(600, 500);
		    this.setLocation(100, 100);
		    
		    this.gridRows = 0;
		    this.gridLay = new GridLayout(this.gridRows, 3, 5, 5);
		    this.getContentPane().setLayout(this.gridLay);
		    
		    this.setDefaultCloseOperation( EXIT_ON_CLOSE );
			this.setVisible(true);
		}
		
		protected Windows getRef() {
			return ref;
		}
		
		private void thisShow() {
			super.show(this);
		}
		
		public void addLine(String sName, String sDesc, String sBut) {
			this.gridRows ++;
			this.gridLay = new GridLayout(this.gridRows, 3, 5, 5);
		    this.getContentPane().setLayout(this.gridLay);
			JLabel lName = new JLabel(sName) , 
				   lDesc = new JLabel(sDesc);
			JButton bDel = new JButton(sBut);
			
			bDel.addActionListener();
			
			this.getContentPane().add(lName);
			this.getContentPane().add(lDesc);
			this.getContentPane().add(bDel);
			System.out.println(this.gridRows);

		}
		
	}
	
	protected class OptionWindow extends Windows {
		
		protected final OptionWindow ref = new OptionWindow("Options");

		protected Windows getRef() {
			return ref;
		}
		
		private OptionWindow(String str) {
			super(str);
		    this.setSize(300, 200);
		    this.setLocation(100, 100);
		}
		

		
		
		
	}
	
}

