package net.security.dao;

import net.security.model.Roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RolesDao extends JpaRepository<Roles, Long>, JpaSpecificationExecutor<Roles> {

}
