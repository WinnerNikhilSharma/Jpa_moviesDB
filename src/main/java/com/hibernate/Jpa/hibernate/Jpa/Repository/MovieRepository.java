package com.hibernate.Jpa.hibernate.Jpa.Repository;

import com.hibernate.Jpa.hibernate.Jpa.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface MovieRepository extends JpaRepository<Movie, String> {
}
