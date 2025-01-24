package com.example.cse_410_buldr_backend.Repository;

import com.example.cse_410_buldr_backend.Entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value="SELECT * FROM  account  WHERE   account.userID=?1",nativeQuery = true)
    User searchByID(long id);
    @Query(value="SELECT * FROM  account  WHERE   account.email=?1",nativeQuery = true)
    User searchByEmail(String email);

    @Transactional
    @Modifying
    @Query(value="UPDATE account SET name = ?2, designation= ?3, company= ?4, email= ?5, phone_no= ?6, address = ?7, portfolio = ?8, github= ?9, linkedin = ?10, buldr = ?11, city = ?12, country= ?13,  image= ?14, bio = ?15 ,scholar_id=?16 WHERE account.userid= ?1",nativeQuery = true)
    int updateUser(long id, String name,String designation,String company,  String email, String phoneNo, String address,  String portfolio, String github,
                   String linkedin,  String buldr, String city, String country, String image, String bio,String scholar_id);
}
