package myjpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="comment", catalog = "horizonte", schema = "horizonte") 
public class comment implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long COMMENTID;
	private String DATUM;
	private String USERNAME;
	private Long  SONGID;
	private Long  AUFTRAGID;
	private String TEXTSTR;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SONGID", referencedColumnName="SONGID", insertable=false, updatable=false)
	private song song;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "AUFTRID", referencedColumnName="AUFTRID", insertable=false, updatable=false)
	private auftritt auftritt;
}
