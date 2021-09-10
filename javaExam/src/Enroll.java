
import java.util.ArrayList;
import java.util.List;


public class Enroll {
	String stream,id;
        List<String> Ids = new ArrayList<>();
        List<String> Streams = new ArrayList<>();
	public void enrollStudent(String id,String stream) 
	{
		this.id=id;
		this.stream=stream;
                Ids.add(id);
                Streams.add(stream);
	}
	public void displayEnrolledStudents() 
	{
		for (int i = 0; i < Ids.size(); i++) {
            System.out.print(Ids.get(i));
            System.out.println(" : " + Streams.get(i));
        }
	}

}
