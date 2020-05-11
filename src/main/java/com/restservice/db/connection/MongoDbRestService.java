package com.restservice.db.connection;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


import com.user.information.response.Users;
import com.restservice.db.connection.repo.UserRepository;
import com.user.information.request.UsersInformation;
import org.springframework.beans.factory.annotation.Autowired;


@Path("/MonogoDbConnection")
public class MongoDbRestService {
	@Autowired
	UserRepository repository;
	Users users = new Users();

	@POST
	@Consumes("application/json")
	public Response addSampleData(UsersInformation userInformation) {
		System.out.println("Adding sample data");
		users.setName(userInformation.getName());
		users.setLastname(userInformation.getLastname());
		users.setAddress(userInformation.getAddress());
		users.setSalary(userInformation.getSalary());
		repository.save(users);
			return Response.status(201).build();
	}
	@DELETE
	@Path("/{name}")
	@Consumes("application/json")
	public Response deleteAll(@PathParam("name") String name) {
		System.out.println("Deleting all records..");
		Users u = repository.findFirstByName(name);
		//u.setLastname("Baby");
		//repository.save(u);
		repository.delete(u);
		return Response.status(200).build();
	}
	@PUT
	@Path("/{id}")
	@Consumes("application/json")
	public Response addSampleData(@PathParam("id") String id) {
		System.out.println("Adding sample data");
		String firstname;
		  firstname=id;
		  System.out.println("firstname" +firstname);
		System.out.println("Finding first by Name");
		//repository.findById(firstname);
		Users u = repository.findFirstByName(firstname);
		u.setLastname("Baby");
		repository.save(u);

		return Response.status(201).build();
	}
	
	@GET
	@Produces("application/json")
	public Response listAll() {
		System.out.println("Listing sample data");
		List<Users> userList = new ArrayList<Users>();
		repository.findAll().forEach(u -> 
		userList.add(u)
		);		
		return Response.status(200).build();
	}
	
	  @GET
	  @Path("/{name}")
	  @Produces("application/json")
	public Response getDetails( @PathParam("name") String name){
		  String firstname;
		  firstname=name;
		  System.out.println("firstname" +firstname);
		System.out.println("Finding first by Name");
		Users u = repository.findFirstByName(firstname);
		users.setName(u.getName());
		System.out.println(users.getName());
		System.out.println(u.getLastname().toString());
		return Response.status(200).entity(u).build();
	}


}
