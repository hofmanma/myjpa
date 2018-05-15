package myjpa;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: auftritt
 *
 */
@Entity
@Table(name="comment", catalog = "horizonte", schema = "horizonte")
public class auftritt implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long AUFTRID;
	private String DATUM;
	private String ORT;
	private String DESCRIPTION;
	private String NOTES;
	private String FILENAME;
	
	@Override
	public String toString() {
		
		return "Auftritt am " + DATUM + " in " + ORT ;
	}
}
