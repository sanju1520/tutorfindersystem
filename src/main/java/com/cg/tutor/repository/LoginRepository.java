package com.cg.tutor.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.tutor.dto.UserDto1;
import com.cg.tutor.entity.Parent;
import com.cg.tutor.entity.Tutor;
import com.cg.tutor.entity.User;

@Repository
public interface LoginRepository extends JpaRepository<User, Long> {
 Parent save(UserDto1 userDto1);
 Parent findByUsername(String username);
 Tutor findByusername(String username);
 Parent findByEmail(String email);
 Tutor findByemail(String email);
}
