package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.repositories.PatientRepository;

@RestController
public class PatientController {
	
	@Autowired
	public PatientRepository patientRepository;
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	@RequestMapping(value="/all")
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}
	
	@PostMapping(value="/create")
	public Patient createRecord(@RequestBody Patient patient) {
		Patient insertedRecord = patientRepository.insert(patient);
		return insertedRecord;
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Patient> getPatientById(@PathVariable String id) {
		Optional<Patient> patient = patientRepository.findById(id);
		return patient;
	}

	@DeleteMapping("/{id}")
	public String deletePatient(@PathVariable String id) {
		patientRepository.deleteById(id);
		return "Deleted: " + id;
	}

	@PutMapping("/{id}")
	public Patient updatePatient(@RequestBody Patient patient, @PathVariable String id) {
		patient.setId(id);
		patientRepository.save(patient);
		return patient;
	}
	
	// Analytics Queries
	@GetMapping("/totalLungsCancer")
	public long analyticQuery1() {
		Query query = new Query();
		query.addCriteria(Criteria.where("LungCancer").is("YES"));
		long patients = mongoTemplate .count(query, Patient.class);
		return patients;
	}
	
	// Age > 20 & < 50 and having lungs diseases
	@GetMapping("/ageGroup")
	public long analyticQuery2() {
		Query query = new Query();
		query.addCriteria(Criteria.where("Age").lt(50).gt(20));
		query.addCriteria(Criteria.where("LungCancer").is("YES"));
		long patients = mongoTemplate.count(query, Patient.class);
		return patients;
	}
	
	// Number of Male patients having lungs cancer.
	@GetMapping("/NumberOfmalesWithCancer")
	public long analyticQuery3() {

		Query query = new Query();
		query.addCriteria(Criteria.where("Gender").is("M"));
		query.addCriteria(Criteria.where("LungCancer").is("YES"));
		long male = mongoTemplate.count(query, Patient.class);
		return male;
	}
	
	// Number of Female patients having lungs cancer.
		@GetMapping("/NumberOfFemalesWithCancer")
		public long analyticQuery4() {

			Query query = new Query();
			query.addCriteria(Criteria.where("Gender").is("F"));
			query.addCriteria(Criteria.where("LungCancer").is("YES"));
			long male = mongoTemplate.count(query, Patient.class);
			return male;
		}
}
