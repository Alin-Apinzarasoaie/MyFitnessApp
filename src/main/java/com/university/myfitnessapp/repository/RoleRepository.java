package com.university.myfitnessapp.repository;

import com.university.myfitnessapp.repository.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
}
