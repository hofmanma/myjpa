package myjpa;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;
import java.util.ArrayList;

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
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "song")
    private List<comment> comments;
	
    ///////////////////////////////////////
    // Autritte, bei dem ein Song gespielt
    // wurde.
    @ManyToMany
    @JoinTable(name = "program",
            joinColumns = @JoinColumn(name = "SONGID", 
            						  referencedColumnName="SONGID" ),
            inverseJoinColumns = @JoinColumn(name = "PROGID", 
            								 referencedColumnName="PROGID" )
     )
     private List<auftritt> auftritte = new ArrayList<>();
    
     /////////////////////////////////////////
     // Proben, in denen ein Song geübt wurde.
     @ManyToMany
     @JoinTable(name = "programprobe",
             joinColumns = @JoinColumn( name = "SONGID", 
             						    referencedColumnName="SONGID"),
             inverseJoinColumns = @JoinColumn( name = "PROBEID", 
             							       referencedColumnName="PROBEID")
      )
      private List<probe> proben = new ArrayList<>();
    
	@Override
	public String toString() {
		
		return TITLE;
	}
	
	public List<comment> getComments(){
		
		return null;
	}
	
	public List<auftritt> getAuftritte(){
		
		return auftritte;
	}
	
	public List<probe> getProben(){
		
		return proben;
	}
}
