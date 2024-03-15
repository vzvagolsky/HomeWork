public class Student1 {
    private String Name;
    private double avgGrade;

    private int YearOfAdmission;

    public Student1(String name, double avgGrade, int yearOfAdmission) {
        Name = name;
        this.avgGrade = avgGrade;
        YearOfAdmission = yearOfAdmission;
    }

    public String getName() {
        return Name;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public int getYearOfAdmission() {
        return YearOfAdmission;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "Name='" + Name + '\'' +
                ", avgGrade=" + avgGrade +
                ", YearOfAdmission=" + YearOfAdmission +
                '}';
    }
}
