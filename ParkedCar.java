//Alexandra Hunter
//CS141
//Project 2 - ParkingTicketSimulator
//4/27/17
public class ParkedCar
{
	private String make;
	private String model;
	private String color;
	private String licenseNumber;
	private int minutesParked;
	public ParkedCar(String mk, String mod, String col, String lic, int min)
	{
		make=mk;
		model=mod;
		color=col;
		licenseNumber=lic;
		minutesParked=min;
	}
	public ParkedCar(ParkedCar car2)
	{
		make=car2.getMake();
		model=car2.getModel();
		color=car2.getColor();
		licenseNumber=car2.getLicenseNumber();
		minutesParked=car2.getMinutesParked();
	}
	public void setMake(String mak)
	{
		make=mak;
	}
	public String getMake()
	{
		return  make;
	}
	public void setModel(String mod)
	{
		model=mod;
	}
	public String getModel()
	{
		return model;
	}
	public void setColor(String col)
	{
		color=col;
	}
	public String getColor()
	{
		return color;
	}
	public void setLicenseNumber(String lic)
	{
		licenseNumber=lic;
	}
	public String getLicenseNumber()
	{
		return licenseNumber;
	}
	public void setMinutesParked(int mP)
	{
		minutesParked=mP;
	}
	public int getMinutesParked()
	{
		return minutesParked;
	}
	public String toString()
	{
		return "car data:\nMake: "+make+"\nModel: "+model+"\nColor"+color+"\nLicense Number: "+licenseNumber+"\nminutesParked: "+minutesParked;
	}
}
