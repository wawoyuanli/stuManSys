package com.hyl.pojo;

public class Score {
    private Integer id;
    private Student student;
    private Course course;
    private int stuCouScore;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getStuCouScore() {
        return stuCouScore;
    }

    public void setStuCouScore(int stuCouScore) {
        this.stuCouScore = stuCouScore;
    }

	public Integer getId (){
		return id;
	}

	public void setId (Integer id){
		this.id = id;
	}

	@Override
    public String toString() {
        return "student : "+this.getStudent()+"\n"+"course : "+this.getCourse()+" score : studentId: "+this.getStudent().getStudentId()+" courseId: "+this.getCourse().getCourseId()+" score: "+this.getStuCouScore();
    }
}
