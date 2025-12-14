package com.tcs.movie_catalogue_service.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.*;

import com.tcs.movie_catalogue_service.model.MovieInfo;
import com.tcs.movie_catalogue_service.repository.MovieRepository;

@RestController
@RequestMapping("/movie-info")
public class MovieInfoController {
	
	@Autowired
	private MovieRepository repository;
	

   @PostMapping("/save")
   public List<MovieInfo> saveAll(@RequestBody List<MovieInfo> movieInfoList){
	   
	   return repository.saveAll(movieInfoList);
   }
   
   @GetMapping("/list")
   public List<MovieInfo> getAll(){
	   return repository.findAll();
   }
   
   @GetMapping("/findPathById/{movieInfoId}")
   public String findPathById(@PathVariable Long movieInfoId) {
	   var videoInfoOptional= repository.findById(movieInfoId);
	   return videoInfoOptional.map(movieInfo -> movieInfo.getPath()).orElse(null);
	   
   }
   
   @GetMapping("/test")
   public String jj() {
	   return "test-route is Working fine";   }
}
