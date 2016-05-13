// Joseph Mandonado Gradebook

 class GradebookApp {
 	
 	public static void main(String[] args) {
		String name_1 = "Sam";
		Student student_1 =  new Student(name_1);
		System.out.println("High: " + student_1.high());
		System.out.println("Low: " + student_1.low());
		System.out.println("Average: " + student_1.average());
		System.out.println("Letter Grade: " + Student.letter_grade(student_1.average()));
 	}
 
 }