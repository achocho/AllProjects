public class GroupTicket extends Ticket{

	GroupTicket(String SceneName, double price,int people) {
		super(SceneName, (price*people)-(people*(price*0.2)));
		
		
	}

}
