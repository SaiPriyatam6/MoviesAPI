package dev.sai.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection="movies") //this class represents each document in the movies collection
@Data //takes care of getters and setters
@AllArgsConstructor //creates a constructor that takes all these param
@NoArgsConstructor
public class Movie {
    @Id // this let the framework know that this property should be treated as the unique identifier for each movie inside database.
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;//poster link
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference // this causes the database to store only ids of the review and the reviews will be in separate collection.
    private List<Review> reviewIds;
}
