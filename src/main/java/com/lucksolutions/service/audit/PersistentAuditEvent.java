package com.lucksolutions.service.audit;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

import com.lucksolutions.service.model.AbstractModelObject;

@Table(name="audit_event")
@Data
@Entity
public class PersistentAuditEvent extends AbstractModelObject {

	private static final long serialVersionUID = -7232193999832309900L;

	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String principal;
	
	@Column(nullable = false)
	private Date time = new Date();
	
	@Column(nullable = false)
	private String type;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="event", cascade=CascadeType.ALL)
	private List<PersistentAuditEventData> data;

}
