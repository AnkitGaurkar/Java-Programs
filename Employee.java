package userObjects;

public class Employee {
	
	private int eid;
	private String ename;
	private float esal;
	
	public Employee()
	{
		
	}
	public Employee(int eid, String ename, float esal)
	{
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public float getEsal() {
		return esal;
	}



	public void setEsal(float esal) {
		this.esal = esal;
	}
	
	}
