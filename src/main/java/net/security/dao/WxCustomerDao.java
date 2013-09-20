/**
 * 
 */
package net.security.dao;

import net.security.model.WxCustomer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author bo
 * 
 */
public interface WxCustomerDao extends JpaRepository<WxCustomer, Long>, JpaSpecificationExecutor<WxCustomer> {

	// @Query("from Draw c where c.drawName=:drawName")
	// Draw findByName(@Param("drawName") String drawName);

}
