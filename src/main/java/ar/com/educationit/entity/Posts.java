package ar.com.educationit.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Posts {

	private Long userId;
	private Long id;
	private String title;
	private String body;
	
}
