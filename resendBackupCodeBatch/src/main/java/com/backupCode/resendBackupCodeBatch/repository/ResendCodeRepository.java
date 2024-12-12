package com.backupCode.resendBackupCodeBatch.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backupCode.resendBackupCodeBatch.entity.ResendCodeEntity;

@Repository
public interface ResendCodeRepository extends CrudRepository<ResendCodeEntity, String> {

	
}
