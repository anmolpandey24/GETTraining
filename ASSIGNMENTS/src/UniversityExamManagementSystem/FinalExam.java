package UniversityExamManagementSystem;

public class FinalExam extends ExamProcess{

	public FinalExam(String examCode) {
		super(examCode);
	}

	@Override
	void conductExam(Student std) {
		System.out.println("Conducting final exams for" +std.name);
		
		
	}

	@Override
	int evaluate(Student std) {
		System.out.println("evaluating final papers");
		
		return 80;
	}
	
	

}
