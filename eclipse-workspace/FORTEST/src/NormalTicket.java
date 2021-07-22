public class NormalTicket extends Ticket{

	NormalTicket(String SceneName, double price,int people) {
		super(SceneName, price*people);
		
	}

}