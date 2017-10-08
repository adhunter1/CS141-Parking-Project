//Alexandra Hunter
//CS141
//Project 2 - ParkingTicketSimulator
//4/27/17
/**
   Driver Program
   Parking Ticket Simulator.
*/

public class ParkingTicketSimulator
{
	public static void main(String[] args)
	{
		ParkedCar car= new ParkedCar("Volkswagen","1972","Red","147RHZM",125);
		//ParkedCar car= new ParkedCar("Volkswagen","1972","Red","147RHZM",60);
		ParkingMeter meter=new ParkingMeter(60);
		PoliceOfficer officer= new PoliceOfficer("Joe Friday","4788");
		ParkingTicket ticket=officer.patrol(car, meter);
		if(ticket!=null)
		{
			System.out.println(car.toString());
			System.out.println(officer.toString());
			System.out.println(ticket.toString());
		}else{
			System.out.println("No crimes committed!");
		}
	}
}
