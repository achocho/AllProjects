import java.util.*;
import java.util.stream.*;
public class SortingString {
public static void main(String[] args) 
{
List<String> lis=new ArrayList<>();
lis.add("gosho");
lis.add("adrian");
lis.add("daniel");
lis.add("boqn");
List<String> SortedList=lis.stream().sorted().collect(Collectors.toList());
for(int i=0;i<SortedList.size();i++) 
{
	System.out.println(SortedList.get(i));
}
}
}
