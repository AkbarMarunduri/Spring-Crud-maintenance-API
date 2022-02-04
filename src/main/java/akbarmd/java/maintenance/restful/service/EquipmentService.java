package akbarmd.java.maintenance.restful.service;

import akbarmd.java.maintenance.restful.entity.Equipment;
import akbarmd.java.maintenance.restful.model.EquipmentResponse;

public interface EquipmentService {
    EquipmentResponse createEquipment(Equipment equipment);
}
