package com.brunalima.bookstoremanager.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
	
	private Long id;
	
	@NotBlank
	@Size(max = 200)
	private String name;
	
	@NotNull
	@Size(max = 100)
	private Integer age;
	

}
