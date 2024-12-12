//package com.backupCode.resendBackupCodeBatch.service;
//
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.backupCode.resendBackupCodeBatch.entity.ResendCodeEntity;
//import com.backupCode.resendBackupCodeBatch.repository.ResendCodeRepository;
//
//@Service
//public class ResendCodeService {
//
//	 @Autowired
//	    private ResendCodeRepository resendCodeRepository;
//
////	 //Save Method
////	 public ResendCodeEntity saveResendCode(ResendCodeEntity resendCodeEntity) {
////	        return resendCodeRepository.save(resendCodeEntity);
////	   }
////	 
//// 
////	    //To get unoId
////		public Optional<ResendCodeEntity> getResendCodeByUnoId(Integer unoId) {
////			return resendCodeRepository.findById(unoId);
////		}
////
////
////		//To delete a unoId
////		public Optional<ResendCodeEntity> deleteResendCodeByUnoId(Integer unoId) {
////			Optional<ResendCodeEntity> entity = resendCodeRepository.findById(unoId);
////			if(entity.isPresent()) {
////				resendCodeRepository.deleteById(unoId);
////			}
////			return entity;
////		}
////
////		public Optional<ResendCodeEntity> updateResendCodeByUnoId(Integer unoId, BatchRequest batchRequest) {
////			return resendCodeRepository.findById(unoId).map(existingEntity -> {
////				existingEntity.setEmail(batchRequest.getEmails());
////				existingEntity.setSubmittedOn(LocalDateTime.now());
////				return resendCodeRepository.save(existingEntity);
////			});
////		}
////
////
////
////		public void deleteAllResendCodes() {
////	        resendCodeRepository.deleteAll();
////	    }
//
//}
//	    
//	   
//	    