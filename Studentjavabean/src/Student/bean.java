package Student;
public class bean {
	void registerStudent(javabean java ) {
		String a=java.getName();int s=java.getRoll();
		System.out.println(a);
		System.out.println(s);
	}
	public static void main(String args[]) {
		javabean s=new javabean();
		s.setName("abhi",1);
		bean t=new bean();
		t.registerStudent(s);
	}

}
