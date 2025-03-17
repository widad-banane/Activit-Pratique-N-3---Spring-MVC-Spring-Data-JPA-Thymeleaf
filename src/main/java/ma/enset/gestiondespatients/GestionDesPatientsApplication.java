package ma.enset.gestiondespatients;

import ma.enset.gestiondespatients.entities.Patient;
import ma.enset.gestiondespatients.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class GestionDesPatientsApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionDesPatientsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Patient patient = new Patient();
        patient.setId(null);
        patient.setName("Hassan");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(10);

        Patient patient2 = new Patient(null, "Khalid", new Date(), false, 20);

        //En utilisant Builder
        Patient patient3 = Patient.builder()
                .name("Amine")
                .dateNaissance(new Date())
                .malade(true)
                .score(130)
                .build();
    }}
