package myjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="dokument", catalog = "horizonte", schema = "horizonte") 
public class dokument {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long DOCID;
    private Long SONGID;
	
	@Override
	public String toString() {
		
		return "dokument willibald";
	}
}
