class Student extends Person {
    private String courses;

    public Student() {
        // Default constructor
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    public String getCourses() {
        return courses;
    }
}
