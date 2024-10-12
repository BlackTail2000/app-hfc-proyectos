package pe.edu.cibertec.app_hfc_proyectos.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_hfc_proyectos.controller.remoteservice.FacturacionClient;
import pe.edu.cibertec.app_hfc_proyectos.controller.remoteservice.GestionEquiposClient;

@RestController
@RequiredArgsConstructor
public class ProyectoController {
    private final FacturacionClient facturacionClient;
    private final GestionEquiposClient gestionEquiposClient;

    @GetMapping("/verificar/materiales")
    public String obtenerInformacionProyecto() {
        String disponibilidad = gestionEquiposClient.verificarDisponibilidad();
        return "Respuesta: " + disponibilidad;
    }

    @GetMapping("/finalizar")
    public String finalizarProyecto() {
        String factura = facturacionClient.generarFactura();
        return "Proyecto Finalizado. Factura: " + factura;
    }

    @GetMapping("/estado")
    public String verEstadoProyecto(){
        int random = (int) (Math.random()*2);
        if (random == 1) return "Proyecto Activo";
        else return "Proyecto Finalizado";
    }
    @GetMapping("/factura")
    public String verFactura(){
        int random = (int) (Math.random() * 100000)+5000;
        return "Monto fina: S/." + random;
    }
}
