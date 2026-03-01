package UniversityExamManagementSystem;

public class LabExam extends ExamProcess {

	public LabExam(String examCode) {
		super(examCode);
	}

	@Override
	void conductExam(Student std) {
		System.out.println("Conducting lap exams for" +std.name);
		
		
	}

	@Override
	int evaluate(Student std) {
		System.out.println("Evaluating lab Performance");
		
		return 40;
	}
	
	

}
