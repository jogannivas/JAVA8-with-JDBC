package SDMPackage;

public class Student {
	
	private int id;
	private String school ;
	private String name ;
	private String branch ;

	public Student(int id, String name, String branch, String school) {
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.school=school;

	}
	public int getId () {return id; }
	public String getName() {return name;}
	public String getBranch() {return branch; }
	public String getSchool() {return school;}
	
	
	public String toString() {
		return "student [id ,name , branch ,school ]";
	}

}
