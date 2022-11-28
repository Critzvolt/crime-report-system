package com.crimereportsystem.service.impl;

import java.util.List;
import org.springframework.stereotype.Service;

import com.crimereportsystem.entity.Admin;
import com.crimereportsystem.repository.AdminRepository;
import com.crimereportsystem.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{

    private AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        super();
        this.adminRepository = adminRepository;
    }

    @Override
    public List<Admin> getAllAdmins() {return adminRepository.findAll();}

    @Override
    public Admin saveAdmin(Admin admin) {return adminRepository.save(admin);}

    @Override
    public Admin getAdminById(Long id) {return adminRepository.findById(id).get();}

    @Override
    public Admin updateAdmin(Admin admin) {return adminRepository.save(admin);}

    @Override
    public void deleteAdminById(Long id) {adminRepository.deleteById(id);}

}
