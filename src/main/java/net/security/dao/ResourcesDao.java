package net.security.dao;

import net.security.model.Resources;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ResourcesDao extends JpaRepository<Resources, Long>, JpaSpecificationExecutor<Resources> {

}
