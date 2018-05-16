package myjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: program
 *
 */
@Entity
@Table(name="program", catalog = "horizonte", schema = "horizonte")
public class program implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PROGID;
	private Long AUFTRID;
	private Long SONGID;
	
}
