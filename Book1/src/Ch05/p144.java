package Ch05;

public class p144 {
	
	public class Student {
		int studentID;
		String studentName;
		int grade;
		String address;
		
		public String getStudentName() {
			return studentName;
		}
		
		public static void main(String[] args) {
			Student studentAhn = new Student();
			studentAhn.studentName = "안연수";
					
					System.out.println(studentAhn.studentName);
					System.out.println(studentAhn.getStudentName());
					
		}		
		
	}



