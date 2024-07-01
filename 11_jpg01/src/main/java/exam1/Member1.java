package exam1;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name="JpaMember1")
public class Member1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto 자동으로 순번 나오게 해줌 
	private Long id;
	
	
	private String username;
	
	@Column (name="create_date")
	private LocalDate createDate;
	
	public Member1() {}
	

	public Member1(String username, LocalDate createDate) {
		super();
		this.username = username;
		this.createDate = createDate;
	}
	
}
