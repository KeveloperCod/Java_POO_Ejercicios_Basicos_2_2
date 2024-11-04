package semana_02;

public class Video {
	
	
	private int codigo;
	private String nomVid;
	private double duracion , pSoles , tCambio;
	
	
	public Video(int codigo, String nomVid, double duracion, double pSoles, double tCambio) {
		this.codigo = codigo;
		this.nomVid = nomVid;
		this.duracion = duracion;
		this.pSoles = pSoles;
		this.tCambio = tCambio;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getNomVid() {
		return nomVid;
	}


	public void setNomVid(String nomVid) {
		this.nomVid = nomVid;
	}


	public double getDuracion() {
		return duracion;
	}


	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}


	public double getpSoles() {
		return pSoles;
	}


	public void setpSoles(double pSoles) {
		this.pSoles = pSoles;
	}


	public double gettCambio() {
		return tCambio;
	}


	public void settCambio(double tCambio) {
		this.tCambio = tCambio;
	}
	
	
	public double pDolares (){
		return pSoles * tCambio ;
	}
	
	
	
	
	
	
	
	
}
