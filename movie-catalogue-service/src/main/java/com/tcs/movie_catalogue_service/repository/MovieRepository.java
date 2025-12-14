package com.tcs.movie_catalogue_service.repository;

import org.springframework.stereotype.Repository;

import com.tcs.movie_catalogue_service.model.MovieInfo;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface MovieRepository extends JpaRepository<MovieInfo, Long>{

}
