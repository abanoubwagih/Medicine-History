/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developerxgroup.medicinehistory.repository;

import com.developerxgroup.medicinehistory.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Mohamed.Hamed
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
    public Users findByEmailAndActive(String email, Boolean active);
}
