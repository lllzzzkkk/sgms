package cn.lzk.sgms.model;

public class CourseStudentRel {

    private Integer couStuRelId;

    private Integer cousrId;

    private Integer studentId;

    private Integer studentGrade;

    public Integer getCouStuRelId() {
        return couStuRelId;
    }

    public void setCouStuRelId(Integer couStuRelId) {
        this.couStuRelId = couStuRelId;
    }

    public Integer getCousrId() {
        return cousrId;
    }

    public void setCousrId(Integer cousrId) {
        this.cousrId = cousrId;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(Integer studentGrade) {
        this.studentGrade = studentGrade;
    }
}
