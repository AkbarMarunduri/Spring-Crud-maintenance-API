package akbarmd.java.maintenance.restful.service.impl;

import akbarmd.java.maintenance.restful.entity.Equipment;
import akbarmd.java.maintenance.restful.model.EquipmentResponse;
import akbarmd.java.maintenance.restful.repository.EquipmentRepository;
import akbarmd.java.maintenance.restful.service.EquipmentService;
import akbarmd.java.maintenance.restful.validation.ValidationUtil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EquipmentImplementation implements EquipmentService {
    EquipmentRepository equipmentRepository;
    ValidationUtil validationUtil;

    @Override
    public EquipmentResponse createEquipment(Equipment equipment) {
        return null;
    }
}
