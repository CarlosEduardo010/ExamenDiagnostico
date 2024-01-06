package mx.edu.utez.diagnostico.controller;
import mx.edu.utez.diagnostico.service.iclientes;
import mx.edu.utez.diagnostico.model.entity.beanclientes;
import mx.edu.utez.diagnostico.model.dto.dtoclientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class controllerclientes {
    @Autowired
    private iclientes clientesservice;

    @PostMapping("/cliente")
    public dtoclientes create(@RequestBody dtoclientes dtoclientes){
        beanclientes clientesave = clientesservice.save(dtoclientes);
        return dtoclientes.builder()
                .cliente_id(clientesave.getCliente_id())
                .nombre(clientesave.getNombre())
                .apellido(clientesave.getApellido())
                .curp(clientesave.getCurp())
                .fecha_naci(clientesave.getFecha_naci())
                .build();
    }

    @PutMapping("/cliente")
    public dtoclientes update (@RequestBody dtoclientes dtoclientes) {
        beanclientes clienteUpdate = clientesservice.save(dtoclientes);
        return dtoclientes.builder()
                .cliente_id(clienteUpdate.getCliente_id())
                .nombre(clienteUpdate.getNombre())
                .apellido(clienteUpdate.getApellido())
                .curp(clienteUpdate.getCurp())
                .fecha_naci(clienteUpdate.getFecha_naci())
                .build();
    }

    @DeleteMapping("cliente/{id}")
    public void delete(@PathVariable Integer id) {
        beanclientes cliente = clientesservice.findById(id);
        clientesservice.delete(cliente);
    }

    @GetMapping("cliente/{id}")
    public beanclientes showById(@PathVariable Integer id) {
        return clientesservice.findById(id);
    }


    @GetMapping("/cliente")
    public List<beanclientes> getClientes() {
        return clientesservice.findAll();
    }
}
