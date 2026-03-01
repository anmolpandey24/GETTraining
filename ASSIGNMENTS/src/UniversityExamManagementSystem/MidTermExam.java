package UniversityExamManagementSystem;

public class MidTermExam extends ExamProcess{

	public MidTermExam() {
		super("XXXX");
	}

	@Override
	void conductExam(Student std) {
		System.out.println("Conducting midterm exams for" +std.name);
		
		
		
	}

	@Override
	int evaluate(Student std) {
		System.out.println("Evaluating midterm papers");
		
		return 55;
	}
	
	

}
