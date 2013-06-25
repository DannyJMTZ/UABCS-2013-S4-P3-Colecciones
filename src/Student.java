
public class Student{
	
	private String id;
	private String name;
	private String middleName;
	private String lastName;
	private int age;
	private char sex;
	private String career;
	
	public Student(){
		
		this.id = "";
		this.name = "";
		this.middleName = "";
		this.lastName = "";
		this.age = 0;
		this.sex = ' ';
		this.career = "";
		
	}

	public Student( String id , String name , String middleName , String lastName ,
					int age, char sex , String career ){
		
		this.id = id;
		this.name = name;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.sex = sex;
		this.career = career;
		
	}

	public String getId() { return id; }
	public String getName() { return name; }
	public String getMiddleName() { return middleName; }
	public String getLastName() { return lastName; }
	public int getAge() { return age; }
	public char getSex() { return sex; }
	public String getCareer() { return career; }
	public void setCareer(String career) { this.career = career; }
	
	public void setId(String id) { this.id = id; }
	public void setName(String name) { this.name = name; }
	public void setMiddleName(String middleName) { this.middleName = middleName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setAge(int age) { this.age = age; }
	public void setSex(char sex) { this.sex = sex; }
	
}
