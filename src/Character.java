import java.util.ArrayList;


public class Character {
	
	private String name;
	private ArrayList<String> skills;
	private ArrayList<String> items;
	
	public Character( String name ){
		this.name = name;
		skills = new ArrayList();
		items = new ArrayList();
		
	}
	
	public String getName() { return name; }
	public ArrayList<String> getAllSkills() { return skills; }
	public ArrayList<String> getAllItems() { return items; }
	
	public String getSkill( int index ){
		try{ return skills.get( index );}
		catch ( Exception e){ return null; }
	}
	
	public String getItem( int index ){
		try{ return items.get( index );}
		catch (Exception e){ return null; }
	}
	
	public void setName( String name ) { this.name = name; }
	public void setSkill( String skill ) { this.skills.add( skill ); }
	public void setItem( String item ) { this.items.add( item ); }

	@Override
	public String toString() {
		String name = "\t" + this.name;
		String skills = "\t";
		
		if( !this.skills.isEmpty() )
			for( String s : this.skills )
				skills += s + "\t";
		
		String items = "\t";
		
		if( !this.items.isEmpty() )
			for( String i : this.items )
				items += i + "\t";
		
		return "Name: " + name + "\n" + "Skills:" + skills + "\n" + "Items: "+ items + "\n";
	
	}
}
