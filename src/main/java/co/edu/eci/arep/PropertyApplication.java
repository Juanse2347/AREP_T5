package co.edu.eci.arep;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PropertyApplication {

    private static final Logger log = LoggerFactory.getLogger(PropertyApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(PropertyApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PropertyRepository repository) {
        return (args) -> {
            // Guardar algunas propiedades
            repository.save(new Property("123 Main St", 250000, 1200, "Beautiful 3-bedroom house."));
            repository.save(new Property("456 Oak Ave", 300000, 1500, "Spacious 4-bedroom house with garden."));
            repository.save(new Property("789 Pine Blvd", 220000, 1000, "Cozy 2-bedroom apartment."));

            // Mostrar todas las propiedades
            log.info("Properties found with findAll():");
            log.info("-------------------------------");
            repository.findAll().forEach(property -> {
                log.info(property.toString());
            });
            log.info("");

            // Buscar una propiedad por ID
            Property property = repository.findById(1L).orElse(null);
            if (property != null) {
                log.info("Property found with findById(1L):");
                log.info("-------------------------------");
                log.info(property.toString());
            }
            log.info("");

            // Actualizar una propiedad
            Property propertyToUpdate = repository.findById(2L).orElse(null);
            if (propertyToUpdate != null) {
                propertyToUpdate.setPrice(320000);  // Actualizar el precio de la propiedad
                repository.save(propertyToUpdate);
                log.info("Updated Property: ");
                log.info(propertyToUpdate.toString());
            }

            // Eliminar una propiedad
            Property propertyToDelete = repository.findById(3L).orElse(null);
            if (propertyToDelete != null) {
                repository.delete(propertyToDelete);
                log.info("Deleted Property: ");
                log.info(propertyToDelete.toString());
            }
        };
    }
}
