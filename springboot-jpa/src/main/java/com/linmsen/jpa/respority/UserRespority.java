package com.linmsen.jpa.respority;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.Optional;

@Repository
public interface UserRespority extends CrudRepository<UserDo,Integer> {


    UserDo findByIdAndUsername(Integer id,String userName);

    Page<UserDo> findByCreateTimeAfter(Date createTime, Pageable pageable);

    @Query(value = "UPDATE users  u SET u.username = :username WHERE u.id = :id",nativeQuery = true)
    @Modifying
    int updateUsernameById(Integer id, String username);

}
