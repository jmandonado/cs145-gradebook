// Joseph Mandonado Gradebook
import java.util.Random;
class Student {
	String name;
	double[] grade = new double[10];

	public Student(String n) {
		name = n;
		for (int i = 0; i < 10; i++){
			grade[i] = (Math.random() * 100) + 1;
			System.out.println(grade[i]);
		}
	}

	public double high() {
		double max = grade[0];

        for(int i = 0; i < 10; i++) {
            if (grade[i] > max) {
                max = grade[i];
            }
        }
        return max;
	}

	public double low() {
		double min = grade[0];

        for(int i = 0; i < 10; i++) {
            if (grade[i] < min) {
                min = grade[i];
            }
        }
		return min;
	}

	public double average() {
		double sum = 0;        
        for(int i = 0; i < 10; i++) {
            sum = sum + grade[i];
        }
        double average = (sum / 10);
		return average;
	}

	static char letter_grade(double average) {
		char let_grade = ' ';
		if (average >= 90 && average <= 100)
			let_grade = 'A';
		if (average >= 80 && average <= 89.99)
			let_grade = 'B';
		if (average >= 70 && average <= 79.99)
			let_grade = 'C';
		if (average >= 60 && average <= 69.99)
			let_grade = 'D';
		else
			let_grade = 'F';
		return let_grade;
	}
}