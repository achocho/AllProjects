import java.util.*;
public class Main {

	public static void main(String[] args) {
		SickPatient patient1=new SickPatient("Ivan","Sofia","0340486346","Authisem","Fight",false,300);
		SickPatient patient2=new SickPatient("Peter","Plovdiv","0340484394","Headache","Medicine",true,300);
		patient1.SetMedicine("Antibiotic");
		patient2.SetMedicine("BolkoUspokoitelno");
		
		
		List<SickPatient> patients=new ArrayList<SickPatient>();
		patients.add(patient1);
		patients.add(patient2);
	Iterator itr=patients.iterator();
	while(itr.hasNext()) {
		SickPatient data=(SickPatient)itr.next();
		String status;
data.Cure();
		if(data.GetStatus()) 
		{
			status="Cured";
			
		}else 
		{
			status="NotCured";
			
		}
		System.out.println(data.GetName()+"-"+data.GetAddress()+"-"+data.GetEGN()+"-"+data.GetDisease()+"-"+status);
	    System.out.println();
	    System.out.println("Medicine :"+data.GetMedicine()+"\n");
	    System.out.println("Doses :"+data.GetDose()+"\n");
	}
	}

}
