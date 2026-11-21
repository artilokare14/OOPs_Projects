package studentManWithCollection;

public class Students {
int rollNo;
String name;
public Students(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}
@Override
public String toString() {
	return "Students [rollNo=" + rollNo + ", name=" + name + "]";
}

}
