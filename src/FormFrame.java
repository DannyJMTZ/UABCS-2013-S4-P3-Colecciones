import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Map;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;


public class FormFrame extends JFrame implements ActionListener{
	
	private String id = "";
	private String name = "---";
	private String middleName = "---";
	private String lastName = "---";
	private int age = 0;
	private char sex = '-';
	private String career = "---";
	
	private Map< String , Student > students;
	private Box buttonsBox;
	private JPanel buttons;
	private JSplitPane splitPane;
	private MouseListener ML;
	
	private DTextField idTF;
	private DTextField nameTF;
	private DTextField middleNameTF;
	private DTextField lastNameTF;
	private DTextField ageTF;
	private DTextField sexTF;
	private DTextField careerTF;
	
	private DButton done;
	
	public FormFrame( Map< String , Student > students , Box buttonsBox , JPanel buttons , JSplitPane splitPane , MouseListener ML){
		
		this.getContentPane().setBackground( Color.DARK_GRAY );
		this.setLayout( null );
		this.setSize( 500 , 250 );
		this.setLocationRelativeTo( null );
		
		this.students = students;
		this.buttonsBox = buttonsBox;
		this.buttons = buttons;
		this.splitPane = splitPane;
		this.ML = ML;
		
		DLabel id = new DLabel("ID:");
		DLabel name = new DLabel("Nombre:");
		DLabel middleName = new DLabel("1er Apellido:");
		DLabel lastName = new DLabel("2do Apellido:");
		DLabel age = new DLabel("Edad:");
		DLabel sex = new DLabel("Sexo:");
		DLabel career = new DLabel("Carrera:");
		
		id.setBounds( 10 , 10 , 50 , 30 );
		name.setBounds( 10 , 50 , 100 , 30 );
		middleName.setBounds( 10 , 90 , 100 , 30 );
		lastName.setBounds( 10 , 130 , 100 , 30 );
		age.setBounds( 220 , 10 , 100 , 30 );
		sex.setBounds( 220 , 50 , 100 , 30 );
		career.setBounds( 220 , 90 , 100 , 30 );
		
		idTF = new DTextField();
		nameTF = new DTextField();
		middleNameTF = new DTextField();
		lastNameTF = new DTextField();
		ageTF = new DTextField();
		sexTF = new DTextField();
		careerTF = new DTextField();
		
		idTF.setBounds( 100 , 10 , 100 , 30 );
		nameTF.setBounds( 100 , 50 , 100 , 30 );
		middleNameTF.setBounds( 100 , 90 , 100 , 30 );
		lastNameTF.setBounds( 100 , 130 , 100 , 30 );
		ageTF.setBounds( 280 , 10 , 100 , 30 );
		sexTF.setBounds( 280 , 50 , 100 , 30 );
		careerTF.setBounds( 280 , 90 , 100 , 30 );
		
		// labels
		this.add( id );
		this.add( name );
		this.add( middleName );
		this.add( lastName );
		this.add( age );
		this.add( sex );
		this.add( career );
		
		// textfields
		this.add( idTF );
		this.add( nameTF );
		this.add( middleNameTF );
		this.add( lastNameTF );
		this.add( ageTF );
		this.add( sexTF );
		this.add( careerTF );
		
		this.done = new DButton("GUARDAR");
		this.done.setBounds( 200 , 130 , 100 , 30 );
		this.add( done );
		
		this.done.addActionListener( this );
		
		this.setVisible(true);
		
	}
	
	public String getId() { return id; }
	public String getName() { return name; }
	public String getMiddleName() { return middleName; }
	public String getLastName() { return lastName; }
	public int getAge() { return age; }
	public char getSex() { return sex; }
	public String getCareer() { return career; }

	@Override
	public void actionPerformed(ActionEvent e ) {
		
		if( e.getActionCommand().equalsIgnoreCase( "GUARDAR" )){
			
			if( this.idTF.getText().length() == 10 ){
				
				id = this.idTF.getText();
				
				if( this.nameTF.getText() .length() != 0 )
					name = this.nameTF.getText();
				if( this.middleNameTF.getText() .length() != 0 )
					middleName = this.middleNameTF.getText();
				if( this.lastNameTF.getText().length() != 0 )
					lastName = this.lastNameTF.getText();
				
				try{ age = Integer.parseInt( this.ageTF.getText() ); }
				catch( Exception ex ){}
				
				try{ sex = this.sexTF.getText().charAt( 0 ); }
				catch( Exception ex ){}
				
				if( this.careerTF.getText().length() != 0 )
					career = this.careerTF.getText();
				
				Student aux = new Student( id , name , middleName , lastName , age , sex , career);
				students.put( aux.getId() , aux );
				DButton auxBtn = new DButton( aux.getId() );
				auxBtn.addMouseListener( ML );
				buttonsBox.add( auxBtn );
				this.buttons.removeAll();
				this.buttons.add( buttonsBox );
				splitPane.add( splitPane.LEFT , buttons );
				this.dispose();
				
			}	
		}	
	}

}
