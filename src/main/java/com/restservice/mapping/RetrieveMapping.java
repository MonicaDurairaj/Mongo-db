package com.restservice.mapping;

import com.user.information.response.RetrieveUserData;
import com.user.information.response.Users;

import java.util.Optional;

public class RetrieveMapping {
    RetrieveUserData retrieveUserData = new RetrieveUserData();
    public RetrieveUserData retrieveResponseMapping(Users u) {
        retrieveUserData.setId(u.getId());
        retrieveUserData.setName(u.getName());
        retrieveUserData.setLastname(u.getLastname());
        retrieveUserData.setSalary(u.getSalary());
        retrieveUserData.setAddress(u.getAddress());
        return retrieveUserData;
    }

    public RetrieveUserData retrieveResponseMappingById(Optional<Users> u) {
        retrieveUserData.setId(u.get().getId());
        retrieveUserData.setAddress(u.get().getAddress());
        retrieveUserData.setName(u.get().getName());
        retrieveUserData.setLastname(u.get().getLastname());
        retrieveUserData.setSalary(u.get().getSalary());
        return retrieveUserData;
    }
}
