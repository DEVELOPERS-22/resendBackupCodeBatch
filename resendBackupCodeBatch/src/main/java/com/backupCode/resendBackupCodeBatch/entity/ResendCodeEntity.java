package com.backupCode.resendBackupCodeBatch.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "resend_backup_code_batch" , schema = "backupdata")
public class ResendCodeEntity {
	
	 	@Id
	    @Column(name = "uno_id")
	    private String unoId;

	 	@Column(name = "email")
	    private String email;

	 	@Column(name = "submitted_on")
	    private Instant submittedOn;

	    public ResendCodeEntity() {
	        
	    }

	    public ResendCodeEntity(String unoId, String email, Instant submittedOn) {
	        this.unoId = unoId;
	        this.email = email;
	        this.submittedOn = submittedOn;
	    }

	    public String getUnoId() {
	        return unoId;
	    }

	    public void setUnoId(String unoId) {
	        this.unoId = unoId;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public Instant getSubmittedOn() {
	        return submittedOn;
	    }
	    
	    public void setSubmittedOn(Instant submittedOn) {
	        this.submittedOn = submittedOn;
	    }

	    @Override
	    public String toString() {
	        return "ResendCodeEntity [unoId=" + unoId + ", email=" + email + ", submittedOn=" + submittedOn + "]";
	    }
	
}
