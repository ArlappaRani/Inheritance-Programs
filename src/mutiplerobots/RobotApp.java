package mutiplerobots;

public class RobotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating teacher object and calling its data members and member functions
		TeacherRobot tr=new TeacherRobot();
		tr.name="teacherRobo";
		tr.talk();
		tr.Walk();
		tr.charge();
		tr.teach();
	    ChefRobot cr=new ChefRobot();
		cr.name="ChefRobo";
		cr.talk();
		cr.Walk();
		cr.charge();
		cr.cook();
		DoctorRobot dr=new DoctorRobot();
		dr.name="DocRobo";
		dr.talk();
		dr.Walk();
		dr.charge();
		dr.surgery();

	}

}
