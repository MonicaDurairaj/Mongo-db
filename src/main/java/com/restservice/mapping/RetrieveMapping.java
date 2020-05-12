package com.restservice.mapping;

import com.user.information.response.RetrieveUserData;
import com.user.information.response.Users;

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
}
