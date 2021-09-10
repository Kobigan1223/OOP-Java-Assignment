
import java.util.ArrayList;
import java.util.List;


public class Specialization {
	String stream;
	double gpa;
        List<String> Stream = new ArrayList<>();
        List<Double> list = new ArrayList<Double>();
	public void addSpecialization(String stream,double gpa)
	{
		this.stream=stream;
		this.gpa=gpa;
                Stream.add(stream);
                list.add(gpa);
	}

}
