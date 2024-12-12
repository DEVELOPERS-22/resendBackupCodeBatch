package com.backupCode.resendBackupCodeBatch.controller;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backupCode.resendBackupCodeBatch.entity.ResendCodeEntity;
import com.backupCode.resendBackupCodeBatch.repository.ResendCodeRepository;

@RestController
@RequestMapping("/api/players")
public class ResendCodeController {
	
	@Autowired
    private ResendCodeRepository resendCodeRepository;

	@PostMapping("/mass-send-2fa-backup-codes-email")
    public ResponseEntity<List<ResendCodeEntity>> saveData(@RequestBody List<ResendCodeEntity> batchRequest) {
        try {
            List<ResendCodeEntity> entities = batchRequest.stream()
                .map(item -> new ResendCodeEntity(
                    item.getUnoId(),
                    item.getEmail(),
                    Instant.now() // Set the current time as the submitted time
                ))
                .collect(Collectors.toList());

             resendCodeRepository.saveAll(entities);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            // Log the exception (use a logger in production)
            e.printStackTrace();
            return ResponseEntity.status(500).body(null);
        }
    }

	


	 
//	@GetMapping("/get/{unoId}")
//    public Optional<ResendCodeEntity> getResendCodeByUnoId(@PathVariable Integer unoId) {
//        return resendCodeService.getResendCodeByUnoId(unoId);
//    }
//	
//	//Delete a unoId
//		@DeleteMapping("/delete/{unoId}")
//		public ResponseEntity<?> deleteResendCodeByUnoId(@PathVariable Integer unoId){
//			Optional<ResendCodeEntity> entity = resendCodeService.deleteResendCodeByUnoId(unoId);
//			if(entity.isPresent()) {
//				return ResponseEntity.ok(entity.get());
//			}
//			else {
//				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("resend code entry with unoId " + unoId + " not found");
//			}
//		}
//		
//	
//	//To update a data
//		
//		@PutMapping("/{unoId}")
//		public ResponseEntity<ResendCodeEntity> updateResendCodeByUnoId(@PathVariable Integer unoId, @RequestBody BatchRequest batchRequest){
//			Optional<ResendCodeEntity> updateEntity = resendCodeService.updateResendCodeByUnoId(unoId, batchRequest);
//			return updateEntity.map(resendCodeEntity -> new ResponseEntity<>(resendCodeEntity, HttpStatus.OK))
//					.orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
//		}
//	
//		@DeleteMapping("/delete-all")
//	    public ResponseEntity<?> deleteAllResendCodes() {
//	        try {
//	            resendCodeService.deleteAllResendCodes();
//	            return ResponseEntity.ok("All records have been deleted.");
//	        } catch (Exception e) {
//	            return ResponseEntity.status(500).body("An error occurred while deleting records: " + e.getMessage());
//	        }
//	    }
	

	
}
    

	
	
	
	


	
	 

