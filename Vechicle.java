
public class Vechicle {
				String licenseplate;

				public String getLicenseplate() {
					return licenseplate;
				}

				public void setLicenseplate(String licenseplate) {
					this.licenseplate = licenseplate;
				}

				public Vechicle(String licenseplate) {
					super();
					this.licenseplate = licenseplate;
				}

				public Vechicle() {
					super();
				}
				public void show ()
				{
					System.out.println();
				}

				@Override
				public String toString() {
					return "Vechicle [licenseplate=" + licenseplate + "]";
				}
}
