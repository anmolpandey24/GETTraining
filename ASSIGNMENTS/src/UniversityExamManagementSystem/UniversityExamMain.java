package UniversityExamManagementSystem;

public class UniversityExamMain {
	public static void main(String[] args) {
		Student s1=new Student("590","Anmol",95);
		Student s2=new Student("456","Aman",70);
		
		ExamProcess lab=new LabExam("LAB605");
		ExamProcess midterm=new MidTermExam();
		ExamProcess finalExam=new FinalExam("FIN456");
		
		System.out.println("MIDTERM EXAMS");
		midterm.ExamProcessSteps(s1);
		
		System.out.println("LAB EXAMS");
		lab.ExamProcessSteps(s2);
		
		System.out.println("FINAL EXAMS");
		System.out.println(s1);
		
	}

}
