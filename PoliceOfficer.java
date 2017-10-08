//Alexandra Hunter
//CS141
//Project 2 - ParkingTicketSimulator
//4/27/17
public class PoliceOfficer 
{
	private String name;
	private String badgeNumber;
	public PoliceOfficer(String n, String bn)
	{
		name=n;
		badgeNumber=bn;
	}
	public PoliceOfficer(PoliceOfficer officer2)
	{
		name=officer2.getName();
		badgeNumber=officer2.getBadgeNumber();
	}
	public void setName(String n)
	{
		name=n;
	}
	public String getName()
	{
		return name;
	}
	public void setBadgeNumber(String bn)
	{
		badgeNumber=bn;
	}
	public String getBadgeNumber()
	{
		return badgeNumber;
	}
	public ParkingTicket patrol(ParkedCar car, ParkingMeter meter)
	{
		//if(car.getMinutesParked()>meter.getMinutesPurchased())
		//{
			//ParkingTicket ticket= new ParkingTicket(new ParkedCar(car),officer,car.getMinutesParked);
			//car, name, car.getMinutesParked());
			//return ticket;
		//}
		//return null;
		ParkingTicket ticket=null;
		int overMin=car.getMinutesParked()-meter.getMinutesPurchased();
		if(overMin>0)
		{
			ticket=new ParkingTicket(car, this, overMin);
		}
		return ticket;
	}
	public String toString()
	{
		return "OfficerData:\nName: "+name+"\nBadgeNumber: "+badgeNumber;
	}
}
