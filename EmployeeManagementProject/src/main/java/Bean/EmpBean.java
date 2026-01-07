package Bean;

import java.io.Serializable;

public class EmpBean implements Serializable{
	int eno,esal;
	String ename,search;
	
    public EmpBean() {
    }
    
	public EmpBean(int eno,String ename, int esal) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	public EmpBean(int eno) {
		this.eno = eno;
	}

	public int getEno() {
		return eno;
	}

	public int getEsal() {
		return esal;
	}

	public String getEname() {
		return ename;
	}
	
	public void setSearch(String s) {
		search = s;
	}
	
	public String getSearch() {
		return search;
	}


}
