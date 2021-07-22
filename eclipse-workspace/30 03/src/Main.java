
public class Main {

	public static void main(String[] args) {
	Person[] persons=new Person[3];
persons[0]=new Teacher("krasi","23523");
persons[1]=new Student("Ivan","234523",24235);
persons[2]=new Student("Mladen","2523634",2352346);
for(int i=0;i<persons.length;i++) 
{
	System.out.println(persons[i]);
}
	}

}
