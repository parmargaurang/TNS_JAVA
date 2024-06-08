package inharitanceExample;

public class ParentClass {
	int marks=0;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "ParentClass [marks=" + marks + "]";
	}
	
}
