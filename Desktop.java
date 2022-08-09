package org.comp;

public class Desktop implements Hardware,Software {
	private void desktopModel() {
		// TODO Auto-generated method stub
System.out.println("15");
	}
@Override
public void hardwareResources() {
	// TODO Auto-generated method stub
	System.out.println("2444");
}
@Override
public void softwareResources() {
	// TODO Auto-generated method stub
System.out.println("4222");	

}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel();
	d.hardwareResources();
	d.softwareResources();
}
}
