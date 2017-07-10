package model;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OtherData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dato1; 
	private String dato2;
	private String dato3; 
	private Date fechaInicial;
	private float numeroFloat;
			
	public OtherData(){
		id=-1;
		}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDato1() {
		return dato1;
	}

	public void setDato1(String dato1) {
		this.dato1 = dato1;
	}

	public String getDato2() {
		return dato2;
	}

	public void setDato2(String dato2) {
		this.dato2 = dato2;
	}

	public String getDato3() {
		return dato3;
	}

	public void setDato3(String dato3) {
		this.dato3 = dato3;
	}

	public Date getDataInicial() {
		return fechaInicial;
	}

	public void setDataInicial(Date dataInicial) {
		this.fechaInicial = dataInicial;
	}

	public float getNumeroFloat() {
		return numeroFloat;
	}

	public void setNumeroFloat(float numeroFloat) {
		this.numeroFloat = numeroFloat;
	}

}
