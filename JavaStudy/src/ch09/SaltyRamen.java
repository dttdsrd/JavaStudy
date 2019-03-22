package ch09;

public class SaltyRamen extends Ramen {
	public SaltyRamen(String name) {
		super.name = name;
	}
	// ¿À¹ö¶óÀÌµå ÄÚµå
	public String getTaste() {
		return name + " Â§¸À";
	}
}
