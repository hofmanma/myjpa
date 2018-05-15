package myjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Access;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.AccessType.FIELD;

/**
 * Entity implementation class for Entity: musiker
 *
 */
@Entity
@Table(name="musiker", catalog = "horizonte", schema = "horizonte") 
public class musiker implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long MUSIKERID;
	private String NAME;
	private String VORNAME;
	private String STRASSE;
	private String PLZ;
	private String ORT;
	private String EMAIL;
	private String TEL;
	private String USERNAME;
	private String PASSWORD;
	  
	@Override
	public String toString() {
		
		return VORNAME + " " + NAME ;
	}
}
