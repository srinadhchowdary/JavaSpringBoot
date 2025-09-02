package com.telusko.spring_data_jpa_ex;

import com.telusko.spring_data_jpa_ex.Repository.StudentRepo;
import com.telusko.spring_data_jpa_ex.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {

		ApplicationContext context =SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepo repo=context.getBean(StudentRepo.class);

//		Student s1 = context.getBean(Student.class);
//		Student s2 = context.getBean(Student.class);
//		Student s3 = context.getBean(Student.class);
//
//		s1.setRollNo(101);
//		s1.setName("Srinadh");
//		s1.setMarks(99);
//
//		s2.setRollNo(102);
//		s2.setName("Harsha");
//		s2.setMarks(99);
//
//		s3.setRollNo(103);
//		s3.setName("Tarun");
//		s3.setMarks(99);

//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

		//System.out.println(repo.findAll());
//		System.out.println(repo.findById(103));

		//Optional<Student> s = repo.findById(101);

		//System.out.println(s.orElse(new Student()));

		//System.out.println(repo.findByName("Srinadh"));

		//System.out.println(repo.findByMarks(99));

		//System.out.println(repo.findByMarksGreaterThan(50));
//		System.out.println(repo.findByMarksLessThan(100));


		Student s2 = context.getBean(Student.class);

		s2.setRollNo(102);
		s2.setName("Harsha");
		s2.setMarks(60);


		repo.save(s2);

		//repo.delete(s2);



	}

}
