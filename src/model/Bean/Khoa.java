package model.Bean;

public class Khoa {
	private String idkhoa;
	private String tenkhoa;
	
	public Khoa() {
		
	}

	public Khoa(String idkhoa, String tenkhoa) {
		super();
		this.idkhoa = idkhoa;
		this.tenkhoa = tenkhoa;
	}

	public String getIdkhoa() {
		return idkhoa;
	}

	public void setIdkhoa(String idkhoa) {
		this.idkhoa = idkhoa;
	}

	public String getTenkhoa() {
		return tenkhoa;
	}

	public void setTenkhoa(String tenkhoa) {
		this.tenkhoa = tenkhoa;
	}
	
	
}
