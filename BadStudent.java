
public class BadStudent extends Student {
				String Badrecord;
				double cgpa;
				public String getBadrecord() {
					return Badrecord;
				}
				public void setBadrecord(String badrecord) {
					Badrecord = badrecord;
				}
				public double getCgpa() {
					return cgpa;
				}
				public void setCgpa(double cgpa) {
					this.cgpa = cgpa;
				}
				public BadStudent(String badrecord, double cgpa) {
					super();
					Badrecord = badrecord;
					this.cgpa = cgpa;
				}
				public BadStudent() {
					super();
				}
				@Override
				public String toString() {
					return "BadStudent [Badrecord=" + Badrecord + ", cgpa=" + cgpa + "]";
				}
				
				
}
