//Alexandra Hunter
//CS141
//Project2 - ParkingTicketSimulator
//4/27/17
public class ParkingTicket
{
	private ParkedCar car;
	private PoliceOfficer officer;
	private double fine;
	private int minutes;
	public final double BASE_FINE=25.0;
	public final double HOURLY_FINE=10.0;
	public ParkingTicket(ParkedCar aCar, PoliceOfficer anOfficer, int min)
	{
		car=aCar;
		officer=anOfficer;
		minutes=min;
	}
	public ParkingTicket(ParkingTicket ticket2)
	{
		car=ticket2.getParkedCar();
		officer=ticket2.getPoliceOfficer();
 		minutes=ticket2.getMinutes();
	}
	public void setParkedCar(ParkedCar acar)
	{
		car=acar;
	}
	public ParkedCar getParkedCar()
	{
		return car;
	}
	public void setPoliceOfficer(PoliceOfficer anOfficer)
	{
		officer=anOfficer;
	}
	public PoliceOfficer getPoliceOfficer()
	{
		return officer;
	}
	public void setMinutes(int min)
	{
		minutes=min;
	}
	public int getMinutes()
	{
		return minutes;
	}
	public void calculateFine()
	{
		fine=BASE_FINE;
		double hours=minutes/60.0;
		int hour1=(int)hours;
		if((hours-hour1)>=0)
		{
			hour1++;
		}
		fine+=(hour1*HOURLY_FINE);
	}
	public String toString()
	{
		calculateFine();
		return "Miniutes Illegally Parked: "
		+(car.getMinutesParked()-60)+"\nFine: $"+fine;
	}
}
