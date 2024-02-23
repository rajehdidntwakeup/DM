package models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import models.enums.HandlingStatus;

@Entity
public class HandlingParameter {

	private long handlingParameterId;
	@Enumerated(EnumType.STRING)
	private HandlingStatus handlingStatus;
	private String Desc;
	@ManyToOne
	@JoinColumn(name = "document_id", nullable = false)
	private Document document;

	/**
	 * Constructor.
	 *
	 */
	public HandlingParameter() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param handlingParameterId
	 * @param handlingStatus
	 * @param desc
	 * @param document
	 */
	public HandlingParameter(long handlingParameterId, HandlingStatus handlingStatus, String desc, Document document) {
		super();
		this.handlingParameterId = handlingParameterId;
		this.handlingStatus = handlingStatus;
		Desc = desc;
		this.document = document;
	}

	/**
	 * Getter.
	 *
	 * @return the handlingParameterId
	 */
	public long getHandlingParameterId() {
		return handlingParameterId;
	}

	/**
	 * Setter.
	 *
	 * @param handlingParameterId the handlingParameterId to set
	 */
	public void setHandlingParameterId(long handlingParameterId) {
		this.handlingParameterId = handlingParameterId;
	}

	/**
	 * Getter.
	 *
	 * @return the handlingStatus
	 */
	public HandlingStatus getHandlingStatus() {
		return handlingStatus;
	}

	/**
	 * Setter.
	 *
	 * @param handlingStatus the handlingStatus to set
	 */
	public void setHandlingStatus(HandlingStatus handlingStatus) {
		this.handlingStatus = handlingStatus;
	}

	/**
	 * Getter.
	 *
	 * @return the desc
	 */
	public String getDesc() {
		return Desc;
	}

	/**
	 * Setter.
	 *
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		Desc = desc;
	}

	/**
	 * Getter.
	 *
	 * @return the document
	 */
	public Document getDocument() {
		return document;
	}

	/**
	 * Setter.
	 *
	 * @param document the document to set
	 */
	public void setDocument(Document document) {
		this.document = document;
	}

}
