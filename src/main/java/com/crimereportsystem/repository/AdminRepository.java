package com.crimereportsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.crimereportsystem.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{}