package basics;

public class Student extends School { //Multilevel Inheritance
	
	//Student - Child
	//School - Parent

   private String stuName;
   private int stutAge;
   private char stuGender;
   
public String getStuName() {
	return stuName;
}
public void setStuName(String stuName) {
	this.stuName = stuName;
}
public int getStutAge() {
	return stutAge;
}
public void setStutAge(int stutAge) {
	this.stutAge = stutAge;
}
public char getStuGender() {
	return stuGender;
}
public void setStuGender(char stuGender) {
	this.stuGender = stuGender;
}
       	
}
