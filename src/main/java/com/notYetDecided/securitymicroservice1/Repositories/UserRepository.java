package com.notYetDecided.securitymicroservice1.Repositories;

import com.notYetDecided.securitymicroservice1.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    Optional<User> findByUserName(String userName);

    @Query(value = "select * from user_table where user_name =:substring",nativeQuery = true)
    User  findBySyntax(@Param("substring")String s);

}
