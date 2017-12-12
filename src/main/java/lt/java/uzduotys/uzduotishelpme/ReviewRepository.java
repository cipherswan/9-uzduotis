package lt.java.uzduotys.uzduotishelpme;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
    List<Review> findAllById(@Param("id") Long id);
    List<Review> findAllByReview(@Param("name") String name);
    List<Review> findAlbumsByReviewContaining(@Param("letter") String letter);
}
