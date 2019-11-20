package com.hyl.pojo;

public class Student {

    private int studentId;
    private String studentName;
    private String studentGender;
    private String studentClass;
    private String studentMajor;
    private String studentDepartment;
    private String studentRewOrPun;
    private Integer stuAge;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentGender() {
        return studentGender;
    }

    public void setStudentGender(String studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }

    public String getStudentRewOrPun() {
        return studentRewOrPun;
    }

    public void setStudentRewOrPun(String studentRewOrPun) {
        this.studentRewOrPun = studentRewOrPun;
    }

	public Integer getStuAge (){
		return stuAge;
	}

	public void setStuAge (Integer stuAge){
		this.stuAge = stuAge;
	}

	@Override
	public String toString (){
		return "Student{" + "studentId=" + studentId + ", studentName='" + studentName + '\'' + ", studentGender='" + studentGender + '\'' + ", studentClass='" + studentClass + '\'' + ", studentMajor='" + studentMajor + '\'' + ", studentDepartment='" + studentDepartment + '\'' + ", studentRewOrPun='" + studentRewOrPun + '\'' + ", stuAge=" + stuAge + '}';
	}
}
