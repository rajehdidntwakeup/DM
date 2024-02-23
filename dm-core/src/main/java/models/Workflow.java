package models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import models.enums.ReadProcess;

@Entity
public class Workflow {

	@Id
	@SequenceGenerator(name = "seqWorkflwoID", initialValue = 1, allocationSize = 100)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqWorkflwoID")
	private long workflowId;

	@Nonnull
	private String workflowUUID;
	private Timestamp timestamp;
	@Enumerated(EnumType.STRING)
	private ReadProcess readProcess;

	@OneToMany(mappedBy = "workflow", cascade = CascadeType.REMOVE)
	List<Document> documents = new ArrayList<Document>(1);

	/**
	 * Constructor.
	 *
	 */
	public Workflow() {
		super();
	}

	/**
	 * Constructor.
	 *
	 * @param workflowId
	 * @param workflowUUID
	 * @param timestamp
	 * @param readProcess
	 * @param documents
	 */
	public Workflow(long workflowId, String workflowUUID, Timestamp timestamp, ReadProcess readProcess,
			List<Document> documents) {
		super();
		this.workflowId = workflowId;
		this.workflowUUID = workflowUUID;
		this.timestamp = timestamp;
		this.readProcess = readProcess;
		this.documents = documents;
	}

	/**
	 * Getter.
	 *
	 * @return the workflowId
	 */
	public long getWorkflowId() {
		return workflowId;
	}

	/**
	 * Setter.
	 *
	 * @param workflowId the workflowId to set
	 */
	public void setWorkflowId(long workflowId) {
		this.workflowId = workflowId;
	}

	/**
	 * Getter.
	 *
	 * @return the workflowUUID
	 */
	public String getWorkflowUUID() {
		return workflowUUID;
	}

	/**
	 * Setter.
	 *
	 * @param workflowUUID the workflowUUID to set
	 */
	public void setWorkflowUUID(String workflowUUID) {
		this.workflowUUID = workflowUUID;
	}

	/**
	 * Getter.
	 *
	 * @return the timestamp
	 */
	public Timestamp getTimestamp() {
		return timestamp;
	}

	/**
	 * Setter.
	 *
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Getter.
	 *
	 * @return the readProcess
	 */
	public ReadProcess getReadProcess() {
		return readProcess;
	}

	/**
	 * Setter.
	 *
	 * @param readProcess the readProcess to set
	 */
	public void setReadProcess(ReadProcess readProcess) {
		this.readProcess = readProcess;
	}

	/**
	 * Getter.
	 *
	 * @return the documents
	 */
	public List<Document> getDocuments() {
		return documents;
	}

	/**
	 * Setter.
	 *
	 * @param documents the documents to set
	 */
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

}
