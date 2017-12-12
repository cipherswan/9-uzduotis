package lt.java.uzduotys.uzduotishelpme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LabelRepository extends JpaRepository<Label, Long>{
    List<Label> findAllById(@Param("id") Long id);
    List<Label> findAllByLabelName(@Param("name") String name);
    List<Label> findAlbumsByLabelNameContaining(@Param("letter") String letter);
}
