package org.vamsi.restapi.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.vamsi.restapi.messenger.models.Profile;
import org.vamsi.restapi.messenger.services.ProfileService;

@Path("/profiles")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileResource {

	private ProfileService profileService = new ProfileService();
	@GET
	public List<Profile> getProfiles(){
		
		return profileService.getAllProfiles();
		
	}
	
	@GET
	@Path("/{profileName}")
	public Profile getProfile(@PathParam("profileName")String profileName){
		return profileService.getProfile(profileName);
	}
	
	@POST
	public Profile addProfile(Profile profile){
	
		return profileService.addProfile(profile);
	}
	
	@PUT
	@Path("/{profileName}")
	public Profile updateProfile(@PathParam("profileName")String pName, Profile profile){
	   profile.setProfileName(pName);
	   
	   return profileService.updateProfile(profile);
		
	}
	
	@DELETE
	@Path("/{profileName}")
	public void deleteProfile(@PathParam("profileName")String pName){
		
		profileService.deleteProfile(pName);
	}
}
