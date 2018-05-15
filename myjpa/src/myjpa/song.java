package myjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: song
 *
 */
@Entity
@Table(name="song", catalog = "horizonte", schema = "horizonte")
public class song implements Serializable {
 
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long SONGID;	
	private String TITLE;
	private Long ORDERNMB;
	private String NOTES;
	private String DESCRIPTION;
	private String FILENAME;
	private String CATEGORY;
	private String SUBCATEGORY;
	
	@Override
	public String toString() {
		
		return TITLE;
	}
}
