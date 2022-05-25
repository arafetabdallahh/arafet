package com.arafet.anime.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.arafet.anime.entities.Genre;


@RepositoryRestResource(path = "rest")
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
