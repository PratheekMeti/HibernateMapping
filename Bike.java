package hibernateproject.com.Learnhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bike 
{
@Id
int engno;
String brand;
@OneToOne
Student1 student;
public Bike() 
{
	
}
public Bike(int engno, String brand, Student1 student) {
	super();
	this.engno = engno;
	this.brand = brand;
	this.student = student;
}
public int getEngno() {
	return engno;
}
public void setEngno(int engno) {
	this.engno = engno;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public Student1 getStudent() {
	return student;
}
public void setStudent(Student1 student) {
	this.student = student;
}
}


