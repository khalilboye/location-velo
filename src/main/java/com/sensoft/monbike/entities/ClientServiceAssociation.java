package com.sensoft.monbike.entities;

import com.manpower.services.acces.client.audit.AuditListener;
import com.manpower.services.acces.client.audit.AuditedEntity;
import com.manpower.services.acces.client.security.persistence.JpaSecurityListener;
import com.manpower.services.acces.client.security.persistence.SecuredEntity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.io.Serializable;

@Entity(name = ClientServiceAssociation.TABLE_NAME)
@EntityListeners({ JpaSecurityListener.class, AuditListener.class })
public class ClientServiceAssociation implements SecuredEntity, AuditedEntity, Serializable {

	private static final long serialVersionUID = 1905822041950851207L;

	public static final String TABLE_NAME = "CLIENT_SERVICE_ASSOCIATION";

	@EmbeddedId
	private ClientServiceAssocPK id;

	public ClientServiceAssocPK getId() {
		return id;
	}

	public void setId(ClientServiceAssocPK id) {
		this.id = id;
	}

	@Override
	public String getOwnerId() {
		return id.getClient().getEmail();
	}

	@Override
	public Long getIdClient() {
		return id.getClient().getId();
	}

	@Override
	public String getTableName() {
		return TABLE_NAME;
	}

	@Override
	public String getKeys() {
		return id.getClient().getKeys() + "-" + id.getService().getId();
	}
}
