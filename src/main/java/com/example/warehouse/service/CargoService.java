package com.example.warehouse.service;

import com.example.warehouse.entity.Cargo;
import com.example.warehouse.utils.Rest;

public interface CargoService {

    public boolean addCargo(Cargo cargo);
    public Rest deleteCargo(String cid, String num);
    public boolean updateCargo(Cargo cargo);
    public Cargo getCargoById(String cid);
    public Rest getCargoListByUserId(String userid);
}
