package hibernateproject.com.Learnhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student1 
{
@Id
int rollno;
String name;
@OneToOne
Bike bike;
public Student1() 
{
	
}
public Student1(int rollno, String name, Bike bike) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.bike = bike;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Bike getBike() {
	return bike;
}
public void setBike(Bike bike) {
	this.bike = bike;
}
}
