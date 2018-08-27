package cn.lzk.sgms.model;

public class Teacher {
    private Integer teacherId;

    private String teacherName;

    private Boolean teacherSex;

    private String teacherTitle;

    private String teacherPassword;

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Boolean getTeacherSex() {
        return teacherSex;
    }

    public void setTeacherSex(Boolean teacherSex) {
        this.teacherSex = teacherSex;
    }

    public String getTeacherTitle() {
        return teacherTitle;
    }

    public void setTeacherTitle(String teacherTitle) {
        this.teacherTitle = teacherTitle;
    }

    public String getTeacherPassword() {
        return teacherPassword;
    }

    public void setTeacherPassword(String teacherPassword) {
        this.teacherPassword = teacherPassword;
    }
}
