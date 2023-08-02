package Student;

public class javabean implements java.io.Serializable {
	private String name;
	private int id;
	private String course;
	private int roll;
	public void setName(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	//gettter method use the value
	public String getName() {
		return name;
	}
	public int getRoll() {
		return roll;
		
	}
}
