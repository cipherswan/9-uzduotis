package lt.java.uzduotys.uzduotishelpme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
    List<Genre> findAllById(@Param("id") Long id);
    List<Genre> findAllByGenreName(@Param("name") String name);
    List<Genre> findAlbumsByGenreNameContaining(@Param("letter") String letter);
}
