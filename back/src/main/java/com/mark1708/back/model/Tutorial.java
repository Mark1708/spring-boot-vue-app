package com.mark1708.back.model;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String title;
	private String description;
	private Boolean published;

	public Boolean isPublished() {
		return published;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Tutorial)) return false;
		Tutorial tutorial = (Tutorial) o;
		return getId().equals(tutorial.getId()) && getTitle().equals(tutorial.getTitle()) && getDescription().equals(tutorial.getDescription()) && getPublished().equals(tutorial.getPublished());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getTitle(), getDescription(), getPublished());
	}
}
