package pe.edu.cibertec.app_hfc_proyectos.controller.remoteservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app-hfc-facturacion")
public interface FacturacionClient {

    @GetMapping("/generar")
    public String generarFactura();
}
