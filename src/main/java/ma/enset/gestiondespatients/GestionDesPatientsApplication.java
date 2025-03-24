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
        // Utilisation du constructeur généré par Lombok
        patientRepository.save(new Patient(null, "Hassan", new Date(), false, 24));
        patientRepository.save(new Patient(null, "Rihame", new Date(), false, 316));
        patientRepository.save(new Patient(null, "Omar", new Date(), true, 12));
    }
}
