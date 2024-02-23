package models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import models.enums.Color;
import models.enums.DocumentStatus;
import models.enums.Plex;

@Entity
public class Document {

	@Id
	@SequenceGenerator(name = "seqDocumentID", initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqDocumentID")
	private long documentId;

	@Enumerated(EnumType.STRING)
	private DocumentStatus documentStatus;
	private String errorMessage;
	@Enumerated(EnumType.STRING)
	private Plex plex;
	@Enumerated(EnumType.STRING)
	private Color color;
	private String documentDesc;
	private int pageCount;
	private int sheetCount;
	@ManyToOne
	@JoinColumn(name = "workflow_id", nullable = false)
	private Workflow workflow;
	@OneToMany(mappedBy = "document", cascade = CascadeType.REMOVE)
	private List<Page> pages = new ArrayList<Page>(1);
	@OneToMany(mappedBy = "document", cascade = CascadeType.REMOVE)
	private List<HandlingParameter> handlingParameters = new ArrayList<HandlingParameter>(1);

	/**
	 * Constructor.
	 *
	 */
	public Document() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param documentId
	 * @param documentStatus
	 * @param errorMessage
	 * @param plex
	 * @param color
	 * @param documentDesc
	 * @param pageCount
	 * @param sheetCount
	 * @param workflow
	 * @param pages
	 * @param handlingParameters
	 */
	public Document(long documentId, DocumentStatus documentStatus, String errorMessage, Plex plex, Color color,
			String documentDesc, int pageCount, int sheetCount, Workflow workflow, List<Page> pages,
			List<HandlingParameter> handlingParameters) {
		super();
		this.documentId = documentId;
		this.documentStatus = documentStatus;
		this.errorMessage = errorMessage;
		this.plex = plex;
		this.color = color;
		this.documentDesc = documentDesc;
		this.pageCount = pageCount;
		this.sheetCount = sheetCount;
		this.workflow = workflow;
		this.pages = pages;
		this.handlingParameters = handlingParameters;
	}

	/**
	 * Getter.
	 *
	 * @return the documentId
	 */
	public long getDocumentId() {
		return documentId;
	}

	/**
	 * Setter.
	 *
	 * @param documentId the documentId to set
	 */
	public void setDocumentId(long documentId) {
		this.documentId = documentId;
	}

	/**
	 * Getter.
	 *
	 * @return the documentStatus
	 */
	public DocumentStatus getDocumentStatus() {
		return documentStatus;
	}

	/**
	 * Setter.
	 *
	 * @param documentStatus the documentStatus to set
	 */
	public void setDocumentStatus(DocumentStatus documentStatus) {
		this.documentStatus = documentStatus;
	}

	/**
	 * Getter.
	 *
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Setter.
	 *
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	/**
	 * Getter.
	 *
	 * @return the plex
	 */
	public Plex getPlex() {
		return plex;
	}

	/**
	 * Setter.
	 *
	 * @param plex the plex to set
	 */
	public void setPlex(Plex plex) {
		this.plex = plex;
	}

	/**
	 * Getter.
	 *
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * Setter.
	 *
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Getter.
	 *
	 * @return the documentDesc
	 */
	public String getDocumentDesc() {
		return documentDesc;
	}

	/**
	 * Setter.
	 *
	 * @param documentDesc the documentDesc to set
	 */
	public void setDocumentDesc(String documentDesc) {
		this.documentDesc = documentDesc;
	}

	/**
	 * Getter.
	 *
	 * @return the pageCount
	 */
	public int getPageCount() {
		return pageCount;
	}

	/**
	 * Setter.
	 *
	 * @param pageCount the pageCount to set
	 */
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	/**
	 * Getter.
	 *
	 * @return the sheetCount
	 */
	public int getSheetCount() {
		return sheetCount;
	}

	/**
	 * Setter.
	 *
	 * @param sheetCount the sheetCount to set
	 */
	public void setSheetCount(int sheetCount) {
		this.sheetCount = sheetCount;
	}

	/**
	 * Getter.
	 *
	 * @return the workflow
	 */
	public Workflow getWorkflow() {
		return workflow;
	}

	/**
	 * Setter.
	 *
	 * @param workflow the workflow to set
	 */
	public void setWorkflow(Workflow workflow) {
		this.workflow = workflow;
	}

	/**
	 * Getter.
	 *
	 * @return the pages
	 */
	public List<Page> getPages() {
		return pages;
	}

	/**
	 * Setter.
	 *
	 * @param pages the pages to set
	 */
	public void setPages(List<Page> pages) {
		this.pages = pages;
	}

	/**
	 * Getter.
	 *
	 * @return the handlingParameters
	 */
	public List<HandlingParameter> getHandlingParameters() {
		return handlingParameters;
	}

	/**
	 * Setter.
	 *
	 * @param handlingParameters the handlingParameters to set
	 */
	public void setHandlingParameters(List<HandlingParameter> handlingParameters) {
		this.handlingParameters = handlingParameters;
	}

}
