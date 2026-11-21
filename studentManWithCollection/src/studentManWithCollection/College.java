package studentManWithCollection;
import java.util.ArrayList;
import java.util.List;

public class College {
public List<Students> addStudent(){
	Students s=new Students(101, "Arti");
	Students s1=new Students(102, "Pooja");
	Students s2=new Students(103, "Kirti");
	Students s3=new Students(104, "Tushar");
	Students s4=new Students(105, "Saurabh");
	
	List<Students> sList=new ArrayList<Students>();
	sList.add(s);
	sList.add(s1);
	sList.add(s2);
	sList.add(s3);
	sList.add(s4);
	
	return sList;
	
}
}
