package com.techelevator.model;

public interface UserInfoDao {
	
	public boolean saveUserInfo(String firstName, String lastName, Long familyId, Long userId);
	
	public Long getUserId (String userName);
	
	public Long getFamilyId(Long userId);
	

}
