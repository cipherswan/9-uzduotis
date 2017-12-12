package lt.java.uzduotys.uzduotishelpme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    List<Album> findAllById(@Param("id") Long id);
    List<Album> findAllByAlbumName(@Param("name") String name);
    List<Album> findAlbumsByAlbumNameContaining(@Param("letter") String name);
}
