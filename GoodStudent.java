
public class GoodStudent extends Student {
					double cgpa ;
					String achive;
					public double getCgpa() {
						return cgpa;
					}
					public void setCgpa(double cgpa) {
						this.cgpa = cgpa;
					}
					public String getAchive() {
						return achive;
					}
					public void setAchive(String achive) {
						this.achive = achive;
					}
					public GoodStudent1(String id, String name) {
						super(id, name);
					}
					public GoodStudent(String id, String name) {
						super(id, name);
					}
					@Override
					public String toString() {
						return "GoodStudent [cgpa=" + cgpa + ", achive=" + achive + "]";
					}
					

}
