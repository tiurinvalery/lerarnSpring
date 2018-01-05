package Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class User {
     private Long Id;
     private String username;
     private String password;
     private String passwordConfirm;
     private Set<Role> roles = new HashSet<Role>();

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     public void setId(Long id) {
         this.Id = id;
     }
     public Long getId() {
         return this.Id;
     }

     public void setUsername(String uName) {
         this.username = uName;
     }
     public String getUsername() {
         return this.username;
     }
     public void setPassword(String pass) {
         this.password = pass;
     }
     public String getPassword() {
         return this.password;
     }
     public void setPasswordConfirm(String passConfirm) {
         this.passwordConfirm = passConfirm;
     }
     public String getPasswordConfirm() {
         return this.passwordConfirm;
     }

     @ManyToMany
     @JoinTable(name = "user_role" , joinColumns = @JoinColumn(name = "user_id") , inverseJoinColumns = @JoinColumn(name = "role_id"))
     public Set<Role> getRoles() {
         return this.roles;
     }
     public void setRoles(Set<Role> r) {
         this.roles = r;
     }
}
