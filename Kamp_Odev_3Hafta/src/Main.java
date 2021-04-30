
public class Main {
	public static void main(String[] args) {
		Student student1  = new Student();
		student1.id = 1;
		student1.Name = "Baran";
		student1.Surname = "Başaran";
		student1.studentNumber = "10";
		Instructor teacher1  = new Instructor();
		teacher1.id = 2;
		teacher1.Name = "Engin";
		teacher1.Surname = "Demiroğ";
		teacher1.instrucatorNumber = "110";
		
		
		UserManager userManager = new UserManager();
		userManager.info(student1);
		userManager.info(teacher1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.info(student1);
		studentManager.info(teacher1); //usermanager, student managerın annesi olduğu için student managerda bulunmayan insturctor ı usermanager olarak cevapladı
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.info(teacher1);
		instructorManager.info(student1); //InstructorManager da Student ile ilgili bir kod bulunmadığından üst sınıfı olan UserManager kodladı bu kodu
	
	}
}
