public class Schedulesystem {
    private String studentName;
    private int studentId;
    private String email;
    private int phone;
    private String courses;

    public Schedulesystem() {

    }

    public Schedulesystem(String studentName, int studentId, String email, int phone, String courses) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.email = email;
        this.phone = phone;
        this.courses = courses;
    }

    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    // Getters
    public String getStudentName() {
        return this.studentName;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhone() {
        return this.phone;
    }

    public String getCourses() {
        return this.courses;
    }
}

