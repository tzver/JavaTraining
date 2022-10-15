package JavaTraining;

public class StudentProfile {
    String firstName;
    String lastName;
    int yearOfGraduation;
    double gpa;
    String major;

    public StudentProfile(String firstName,
            String lastName,
            int yearOfGraduation,
            double gpa,
            String major) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearOfGraduation = yearOfGraduation;
        this.gpa = gpa;
        this.major = major;
    }

    public void incrementGraduationYear() {
        this.yearOfGraduation += 1;

    }

}
