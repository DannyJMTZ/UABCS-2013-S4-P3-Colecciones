import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;


public class DButton extends JButton{
	
	public DButton( String text ){
		
		this.setBackground( Color.DARK_GRAY );
		this.setForeground( Color.LIGHT_GRAY );
		this.setBorderPainted( false );
		this.setText( text );
		this.setFocusable( false );
		
	}
	

}
