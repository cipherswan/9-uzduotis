package lt.java.uzduotys.uzduotishelpme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    List<Artist> findAllById(@Param("id") Long id);
    List<Artist> findAllByArtistName(@Param("name") String name);
    List<Artist> findAlbumsByArtistNameContaining(@Param("letter") String letter);
}
