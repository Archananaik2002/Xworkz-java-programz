class TeacherRunner
{
	public static void main(String[] args){
		System.out.println("Running main in TeacherRunner");
		
		Teacher teacher=new Teacher();
		System.out.println("Teacher Name:"+teacher.name);
		System.out.println("Teacher qualification is:"+teacher.qualification);
		System.out.println("Subject:"+teacher.subject);
		System.out.println("Teacher Experience :"+teacher.experience);
		System.out.println("Teacher Salary:"+teacher.salary);
		
		System.out.println("****************************************");

		Teacher teacher1=new Teacher();
		
		teacher1.name="Saritha";
		teacher1.qualification="M.tech";
		teacher1.subject="DBMS";
		teacher1.experience=15;
		teacher1.salary=80000;
		
		System.out.println("Teacher Name:"+teacher1.name);
		System.out.println("Teacher qualification is:"+teacher1.qualification);
		System.out.println("Subject:"+teacher1.subject);
		System.out.println("Teacher Experience :"+teacher1.experience);
		System.out.println("Teacher Salary:"+teacher1.salary);
		
		
	}
}