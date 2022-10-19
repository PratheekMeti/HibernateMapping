package hibernateproject.com.Learnhibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bike 
{
@Id
int engno;
String brand;
public Bike() 
{
	
}
public Bike(int engno, String brand) {
	super();
	this.engno = engno;
	this.brand = brand;
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

}


