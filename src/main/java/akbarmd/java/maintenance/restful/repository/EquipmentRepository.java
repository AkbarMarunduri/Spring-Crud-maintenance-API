package akbarmd.java.maintenance.restful.repository;

import akbarmd.java.maintenance.restful.entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment,String> {
}
