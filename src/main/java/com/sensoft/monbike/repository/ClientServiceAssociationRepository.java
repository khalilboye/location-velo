package com.sensoft.monbike.repository;

import com.sensoft.monbike.entities.ClientServiceAssocPK;
import com.sensoft.monbike.entities.ClientServiceAssociation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface ClientServiceAssociationRepository extends
        JpaRepository<ClientServiceAssociation, ClientServiceAssocPK> {
/*
	List<ClientServiceAssociation> findClientServiceAssociationsById_Client_EmailOrderById_Service_IndiceTriAsc(String email);

	@Transactional
	void deleteClientServiceAssociationsById_Client_IdAndId_Service_Id(Long idClient, Long idService);

	List<ClientServiceAssociation> findClientServiceAssociationsById_Client_Id(Long idClient);

	@Transactional
	void deleteClientServiceAssociationsById_Client_Id(Long idClient);

 */
}
