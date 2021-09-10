import java.util.Random;

public class Weekend implements student{
	String name,place,stream,special;
	char gender;
	int year;
	float m1,m2,m3,m4,m5;
	static String id;
	public void addDetails(String name,String place,char gender,int year,String stream,String special)
	{
		this.name=name;
		this.place=place;
		this.gender=gender;
		this.year=year;
		this.stream=stream;
		this.special=special;
	}
	static void validate(int coun)throws IDInvalidException{  
            if(coun>=4)  
                throw new IDInvalidException("StudentID must have atlest 4 digts");  
        }  
	public String generateID()
	{
		Random r = new Random( System.currentTimeMillis() );
		int i=r.nextInt(10000);
		String s=String.valueOf(i);
		id="IT"+s;
                
            int count = 0, num = i;
            while (num != 0) {
            num /= 10;
            ++count;
        } 
            try{  
                validate(count);  
            }catch(Exception m){System.out.println("Exception occured: "+m);}
        return id;
	}
	public void addMark(float m1,float m2,float m3,float m4,float m5)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
		this.m5=m5;
		double gpa = (m1+m2+m3+m4+m5)/5;
	}
	public void ShowDetails()
	{
		System.out.println("Student Name "+name);
		System.out.println("Student Address "+place);
		System.out.println("Gender "+gender);
		System.out.println("Student Year "+year);
		System.out.println("Student Specialization "+stream);
		System.out.println("Student Job Title "+special);
	}

}
