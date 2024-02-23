package models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import models.enums.PagePlexStatus;

@Entity
public class Page {

	@Id
	@SequenceGenerator(name = "seqPageID", initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqPageID")
	private long pageId;

	@Enumerated(EnumType.STRING)
	private PagePlexStatus pagePlexStatus;
	private int pageNumber;
	@ManyToOne
	@JoinColumn(name = "document_id", nullable = false)
	private Document document;

	/**
	 * Constructor.
	 *
	 */
	public Page() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param pageId
	 * @param pagePlexStatus
	 * @param pageNumber
	 * @param document
	 */
	public Page(long pageId, PagePlexStatus pagePlexStatus, int pageNumber, Document document) {
		super();
		this.pageId = pageId;
		this.pagePlexStatus = pagePlexStatus;
		this.pageNumber = pageNumber;
		this.document = document;
	}

	/**
	 * Getter.
	 *
	 * @return the pageId
	 */
	public long getPageId() {
		return pageId;
	}

	/**
	 * Setter.
	 *
	 * @param pageId the pageId to set
	 */
	public void setPageId(long pageId) {
		this.pageId = pageId;
	}

	/**
	 * Getter.
	 *
	 * @return the pagePlexStatus
	 */
	public PagePlexStatus getPagePlexStatus() {
		return pagePlexStatus;
	}

	/**
	 * Setter.
	 *
	 * @param pagePlexStatus the pagePlexStatus to set
	 */
	public void setPagePlexStatus(PagePlexStatus pagePlexStatus) {
		this.pagePlexStatus = pagePlexStatus;
	}

	/**
	 * Getter.
	 *
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**
	 * Setter.
	 *
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
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
