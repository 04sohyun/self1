package day19;

import java.util.Comparator;

public class StudentComparator2 implements Comparator<Student1>{
	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.sno.compareTo(o2.sno);
	}

}
class Student1{
	String sno;

	public Student1(String sno) {
		this.sno = sno;
	}
}