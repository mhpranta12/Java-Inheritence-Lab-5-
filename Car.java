
public class Car extends Vechicle{
					int noofseat;

					public Car(String licenseplate, int noofseat) {
						super(licenseplate);
						this.noofseat = noofseat;
					}

					public Car(String licenseplate) {
						super(licenseplate);
					}

					@Override
					public String toString() {
						return "Car [noofseat=" + noofseat + ", licenseplate=" + licenseplate + "]";
					}
					public void speedup()
					{
						System.out.print("I am from car class");
					}
}
