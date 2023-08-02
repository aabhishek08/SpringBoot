package javabean;

 class Studentt {
	 static class Student{
		void generateResult(student st) {
			int d=st.getdata()+st.getdata1();
				if(d>30) {
					System.out.println("pass");;
				}else {
				System.out.println( "fail");
			}}
	public static void main(String args[]) {
		Student p=new Student();
		student t=new student();
			
		t.setdata(11);
	t.setdata(19);
	p.generateResult(t);
		
	}}}