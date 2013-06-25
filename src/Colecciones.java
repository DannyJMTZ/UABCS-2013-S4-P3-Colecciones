import java.util.ArrayList;
import java.util.List;

public class Colecciones {
	
	public static void main(String[] args) {
		
		List<Character> characterList = new ArrayList<Character>();
		
		characterList.add( new Character( "Mario") );
		characterList.get( 0 ).setItem( "Star" );
		characterList.get( 0 ).setItem( "Mushroom" );
		characterList.get( 0 ).setSkill( "Jump" );
		characterList.get( 0 ).setSkill( "BackFlip" );
		characterList.get( 0 ).setSkill( "Run" );
		
		characterList.add( new Character( "Goku") );
		characterList.get( 1 ).setItem( "Seeds" );
		characterList.get( 1 ).setSkill( "Kamehameha" );
		characterList.get( 1 ).setSkill( "Henkidama" );
		characterList.get( 1 ).setSkill( "Kaioken" );
		
		characterList.add( new Character( "Spiderman") );
		characterList.get( 2 ).setItem( "Web" );
		characterList.get( 2 ).setItem( "Mask" );
		characterList.get( 2 ).setSkill( "Web-Ball" );
		characterList.get( 2 ).setSkill( "Spider Swing" );
		characterList.get( 2 ).setSkill( "Maximun Spider" );
		
		for( Character character : characterList ){
			System.out.println( character );
			if( !(characterList.indexOf( character ) == characterList.size() - 1))
				System.out.println("***********************************\n");
		}
		
	}

}
