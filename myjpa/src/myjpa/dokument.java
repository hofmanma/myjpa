package myjpa;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dokument", catalog = "horizonte", schema = "horizonte") 
public class dokument {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long DOCID;
    private Long SONGID;
	
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SONGID", referencedColumnName="SONGID", insertable=false, updatable=false)
	private song song;
    
	@Override
	public String toString() {
		
		return "dokument willibald";
	}
}
