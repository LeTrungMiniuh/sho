package com.example.car.DTO;



import com.example.car.enums.UserRole;

import lombok.Data;

@Data
public class UserDTO {
	 private Long id ;
	    private String name ;
	    private String email;
	  
	    private UserRole userrole;
	    
	    
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		
		public UserRole getUserrole() {
			return userrole;
		}
		public void setUserrole(UserRole userrole) {
			this.userrole = userrole;
		}
	    
	    
	    

}
