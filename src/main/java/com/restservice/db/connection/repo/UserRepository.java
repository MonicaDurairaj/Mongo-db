package com.restservice.db.connection.repo;

import java.util.List;
import java.util.Optional;

import com.user.information.response.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<Users, String>  {
	
	Users findFirstByName(String name);
	Optional<Users> findById(String id);
    @Query("{address:'?0'}")
    List<Users> findCustomByAddress(String address);

    @Query("{address : { $regex: ?0 } }")
    List<Users> findCustomByRegExAddress(String domain);

	

}
