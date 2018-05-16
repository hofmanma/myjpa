package myjpa;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: programprobe
 *
 */
@Entity
@Table(name="programprobe", catalog = "horizonte", schema = "horizonte")
public class programprobe implements Serializable {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long PROGPROBEID;
	private Long SONGID;
	private Long PROBEID;
}
