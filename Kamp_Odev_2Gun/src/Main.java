public class Main {
	public static void main(String[] args) {
		
		CourseDetails kurs1 = new CourseDetails();
		kurs1.id = 1;
		kurs1.name = "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)";
		kurs1.teacher = "Engin Demiroð";
		kurs1.detail = "2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.";
	
		CourseDetails kurs2 = new CourseDetails();
		kurs2.id = 2;
		kurs2.name = "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)";
		kurs2.teacher = "Engin Demiroð";
		kurs2.detail = "2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, döküman ve duyurularýný buradan yapacaðýz.";
		
		
		CourseDetails[] kurslar = {kurs1, kurs2};
		
		for (CourseDetails kurs : kurslar) {
			System.out.println("Kurs ismi: " + kurs.name + " | Kurs Öðretmeni: " + kurs.teacher);
		}
		
		Course course1 = new Course();
		course1.id = 1;
		course1.name = "JAVA + REACT";
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "C# + ANGULAR";
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(kurs1);
		

		
		
		
		
	}

}
