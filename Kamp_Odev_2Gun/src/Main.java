public class Main {
	public static void main(String[] args) {
		
		CourseDetails kurs1 = new CourseDetails();
		kurs1.id = 1;
		kurs1.name = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)";
		kurs1.teacher = "Engin Demiro�";
		kurs1.detail = "2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.";
	
		CourseDetails kurs2 = new CourseDetails();
		kurs2.id = 2;
		kurs2.name = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)";
		kurs2.teacher = "Engin Demiro�";
		kurs2.detail = "2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, d�k�man ve duyurular�n� buradan yapaca��z.";
		
		
		CourseDetails[] kurslar = {kurs1, kurs2};
		
		for (CourseDetails kurs : kurslar) {
			System.out.println("Kurs ismi: " + kurs.name + " | Kurs ��retmeni: " + kurs.teacher);
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
