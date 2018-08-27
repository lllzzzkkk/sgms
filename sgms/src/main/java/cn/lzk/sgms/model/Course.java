package cn.lzk.sgms.model;

public class Course {
    private Integer courseId;

    private Integer teacherId;

    private String courseName;

    private Integer courseProperty;

    private String attendFaculty;

    private  String attendMajor;

    private Float courseCredit;

    private String courseIntroduction;

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Integer getCourseProperty() {
        return courseProperty;
    }

    public void setCourseProperty(Integer courseProperty) {
        this.courseProperty = courseProperty;
    }

    public String getAttendFaculty() {
        return attendFaculty;
    }

    public void setAttendFaculty(String attendFaculty) {
        this.attendFaculty = attendFaculty;
    }

    public String getAttendMajor() {
        return attendMajor;
    }

    public void setAttendMajor(String attendMajor) {
        this.attendMajor = attendMajor;
    }

    public Float getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(Float courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCourseIntroduction() {
        return courseIntroduction;
    }

    public void setCourseIntroduction(String courseIntroduction) {
        this.courseIntroduction = courseIntroduction;
    }
}
