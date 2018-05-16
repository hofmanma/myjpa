package myjpa;


import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "auftritt")
    private List<comment> comments;
    
    @ManyToMany(mappedBy = "auftritte")
    private List<song> songs = new ArrayList<>();
    
	@Override
	public String toString() {
		
		return "Auftritt am " + DATUM + " in " + ORT ;
	}
}
