public class DiscountTicket extends Ticket{

	DiscountTicket(String SceneName, double price,int people) {
		super(SceneName, price/2*people);
		
	}

}