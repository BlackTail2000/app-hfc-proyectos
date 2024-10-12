package pe.edu.cibertec.app_hfc_proyectos.controller.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-hfc-gestion-equipos")
public interface GestionEquiposClient {

    @GetMapping("/verificar")
    String verificarDisponibilidad();
}
