package dev.sai.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired // We want the framework to instantiate this class for us.
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();//findAll is there in mongoRepository class.
    }
    //optional class - used because when there isn't any movie, this will return NULL
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
