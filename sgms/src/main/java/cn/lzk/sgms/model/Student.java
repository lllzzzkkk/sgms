package cn.lzk.sgms.model;

public class Student {
    private Integer studentId;

    private String studentName;

    private Boolean studentSex;

    private String studentAcademy;

    private String studentMajor;

    private String studentPassword;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Boolean getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Boolean studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentAcademy() {
        return studentAcademy;
    }

    public void setStudentAcademy(String studentAcademy) {
        this.studentAcademy = studentAcademy;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }
}
