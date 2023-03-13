package com.barreto.courses.courses_cafe;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.barreto.courses.courses_cafe.enums.Category;
import com.barreto.courses.courses_cafe.model.Course;
import com.barreto.courses.courses_cafe.repository.CourseRepository;

@SpringBootApplication
public class CoursesCafeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoursesCafeApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRepository courseRepository) {

		return args -> {
			courseRepository.deleteAll();

			Course c = new Course();
			c.setName("Angular");
			c.setCategory(Category.FRONTEND);

			courseRepository.save(c);
		};
	}

}
