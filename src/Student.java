public class Student extends Person {
    private int avgGrade;

    public Student(String firstName, String lastName, int avgGrade) {
        super(firstName, lastName);
        this.avgGrade = avgGrade;
    }

    public int getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(int avgGrade) {
        this.avgGrade = avgGrade;
    }


    public String toString() {
        return "Student{" +
                "avgGrade=" + avgGrade +
                '}';
    }

    public Student(Student other)
    {
        super(other);
        this.avgGrade = other.avgGrade;
    }
}
