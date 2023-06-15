package com.example.FullStackbackend.Repository;

import com.example.FullStackbackend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> { // jpaRepository has goood functions.
/*

JpaRepository< User, Long>

User - the Model class

Long - the data type of the PrimaryKey -- >

-- >
    ----------------
    @Id
    @GeneratedValue
    private long id;
    ----------------

 */
}
