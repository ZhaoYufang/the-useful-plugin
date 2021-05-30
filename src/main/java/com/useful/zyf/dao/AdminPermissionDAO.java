package com.useful.zyf.dao;

import com.useful.zyf.entity.AdminPermission;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 */
public interface AdminPermissionDAO extends JpaRepository<AdminPermission, Integer> {
    AdminPermission findById(int id);
}