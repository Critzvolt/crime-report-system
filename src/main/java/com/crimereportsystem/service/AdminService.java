package com.crimereportsystem.service;
import java.util.List;
import com.crimereportsystem.entity.Admin;

public interface AdminService {
    List<Admin> getAllAdmins();
    Admin saveAdmin(Admin admin);
    Admin getAdminById(Long id);
    Admin updateAdmin(Admin admin);
    void deleteAdminById(Long id);
}