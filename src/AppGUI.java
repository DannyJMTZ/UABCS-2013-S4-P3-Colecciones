import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;


public class AppGUI extends JFrame implements MouseListener{
	
	private DButton add;
	private Map< String , Student > students = new HashMap< String , Student >();
	private JSplitPane splitPane;
	private JPanel panelInfo;
	private JPanel buttons;
	private Box buttonsBox;
	
	public AppGUI(){
		
		this.setTitle( "My HashMapped Student´s App" );
		this.setSize( 500 , 400 );
		this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		this.setLayout( new BorderLayout() );
		this.getContentPane().setBackground( Color.DARK_GRAY );
		this.setLocationRelativeTo( null );
		
		// boton agregar
		add = new DButton("Agregar");
		add.setBounds( 200 , 0 , 100 , 30 );
		add.addMouseListener( this );
		
		/*
		// alumnos
		Student s1 = new Student();
		s1.setName( "Juan Ramon" );
		s1.setMiddleName( "Zazueta" );
		s1.setLastName( "Moreno" );
		s1.setId( "2011083648" );
		
		Student s2 = new Student();
		s2.setName( "Tu mamá" );
		s2.setMiddleName( "BA" );
		s2.setLastName( "DA" );
		s2.setId( "2011083641" );
		
		Student s3 = new Student();
		s3.setName( "Ramon" );
		s3.setMiddleName( "Zaz" );
		s3.setLastName( "More" );
		s3.setId( "2011083621" );
		
		// hash map de alumnos
		students.put( s1.getId() , s1 );
		students.put( s2.getId() , s2 );
		students.put( s3.getId() , s3 );*/
		
		// creacion del SplitPane
		this.splitPane = new JSplitPane();
		this.splitPane.setDividerSize( 5 );
		this.splitPane.setDividerLocation( 115 );
		
		// combo box
		/*DButton b1 = new DButton( s1.getId());
		DButton b2 = new DButton( s2.getId());
		DButton b3 = new DButton( s3.getId());
		b1.addMouseListener( this );
		b2.addMouseListener( this );
		b3.addMouseListener( this );*/
		
		buttonsBox = Box.createVerticalBox();
		/*buttonsBox.add( b1 );
		buttonsBox.add( b2 );
		buttonsBox.add( b3 );*/
		
		// panel info
		this.panelInfo = new JPanel();
		this.panelInfo.setBackground( Color.DARK_GRAY );
		
		// panel info
		this.buttons = new JPanel();
		this.buttons.setBackground( Color.DARK_GRAY );
		// this.buttons.add( buttonsBox );
		
		// agregar los paneles al split pane
		splitPane.add( JSplitPane.LEFT , buttons );
		splitPane.add( JSplitPane.RIGHT , panelInfo );
		
		// agregar los componentes al frame
		this.add( BorderLayout.NORTH , add );
		this.add( BorderLayout.CENTER , splitPane );
		
		this.setVisible( true );
	}
	
	@Override
	public void mouseClicked(MouseEvent e) { 
		
		if( students.containsKey(((DButton)e.getSource()).getText())){
			
			Student aux = students.get( ((DButton)e.getSource()).getText() );
			
			Box box = Box.createVerticalBox();
			
			box.add( new DLabel("ID: " + aux.getId()));
			box.add( new DLabel("Nombre: " + aux.getName()));
			box.add( new DLabel("1er Apellido: " + aux.getMiddleName()));
			box.add( new DLabel("2do Apellido: " + aux.getLastName()));
			box.add( new DLabel("Edad: " + aux.getAge()));
			box.add( new DLabel("Sexo: " + aux.getSex()));
			box.add( new DLabel("Carrera: " + aux.getCareer()));
			
			panelInfo = new JPanel();
			panelInfo.setBackground( Color.DARK_GRAY );
			panelInfo.setForeground( Color.LIGHT_GRAY );
			panelInfo.add( box );
			this.splitPane.add( JSplitPane.RIGHT , panelInfo );
		
		} else if(((DButton)e.getSource()).getText().equalsIgnoreCase("Agregar")){
			FormFrame ff = new FormFrame( students , buttonsBox , buttons , splitPane , this );	
		}
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) { }
	@Override
	public void mouseExited(MouseEvent arg0) { }
	@Override
	public void mousePressed(MouseEvent arg0) { }
	@Override
	public void mouseReleased(MouseEvent arg0) { }
	
	public static void main( String[] args){ AppGUI app = new AppGUI(); }
	
}
