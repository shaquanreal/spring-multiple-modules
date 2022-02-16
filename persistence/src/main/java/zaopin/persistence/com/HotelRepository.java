package zaopin.persistence.com;

import org.springframework.data.jpa.repository.JpaRepository;
import zaopin.domain.com.Workshop;

public interface HotelRepository extends JpaRepository<Workshop, Long> {
}
