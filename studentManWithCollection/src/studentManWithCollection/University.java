package studentManWithCollection;

import java.util.List;

public class University {
public static void main(String[] args) {
	College college =new College();
	List<Students> stdList=college.addStudent();
	for(Students s:stdList) {
		System.out.println(s);
	}
}
}
