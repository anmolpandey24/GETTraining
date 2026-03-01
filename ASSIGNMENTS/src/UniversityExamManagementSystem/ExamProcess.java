package UniversityExamManagementSystem;

public abstract class ExamProcess {
	static final int passMarks=40;
	final String examCode;
	public ExamProcess(String examCode) {
		super();
		this.examCode = examCode;
	}
	
	boolean ValidateEligibilty(Student std) {
		return std.attendper >= UniversityRules.minAttendPer;
	}
	
	String allocateHallTicket(Student std) {
		return UniversityRules.generateHallTicket();
	}
	
	abstract void conductExam(Student std);
	abstract int evaluate(Student std);
	
	
	final void publishResult(Student std,int marks) {
		if(marks>= passMarks) {
			System.out.println(std.name+ "Passed with Marks: " +marks);
		}
		else {
			System.out.println(std.name + "failed with Marks: " +marks);
		}
	}
	
	final void ExamProcessSteps(Student std) {
		if(!ValidateEligibilty(std)) {
			System.out.println(std.name+ "not eligible due to low attendance");
			return;
			
		}
		String hallTicket = allocateHallTicket(std);
		System.out.println("Here is hall Ticket :" +hallTicket);
		conductExam(std);
		int marks=evaluate(std);
		publishResult(std,marks);
	}

}
