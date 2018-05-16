package myjpa;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: probe
 *
 */
@Entity
@Table(name="probe", catalog = "horizonte", schema = "horizonte")
public class probe implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PROBEID;
	private String DATUM;
	private String ORT;
	private String DESCRIPTION;
	
    @ManyToMany(mappedBy = "proben")
    private List<song> songs = new ArrayList<>();
    
	@Override
	public String toString() {
		
		return "Probe am " + DATUM + " in " + ORT;
	}
}
