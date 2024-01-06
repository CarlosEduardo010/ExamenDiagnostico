package mx.edu.utez.diagnostico.service.impl;
import lombok.AllArgsConstructor;
import mx.edu.utez.diagnostico.model.dao.daoclientes;
import mx.edu.utez.diagnostico.model.entity.beanclientes;
import mx.edu.utez.diagnostico.model.dto.dtoclientes;
import mx.edu.utez.diagnostico.service.iclientes;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@AllArgsConstructor
@Service
public class implclientes implements iclientes{
    private final daoclientes daoclientes;

    @Transactional
    @Override
    public beanclientes save(dtoclientes dtoclientes) {
        beanclientes clientes = beanclientes.builder()
                .cliente_id(dtoclientes.getCliente_id())
                .nombre(dtoclientes.getNombre())
                .apellido(dtoclientes.getApellido())
                .curp(dtoclientes.getCurp())
                .fecha_naci(dtoclientes.getFecha_naci())
                .build();
        return daoclientes.save(clientes);
    }
    @Transactional(readOnly = true)
    @Override
    public beanclientes findById(Integer id) { return daoclientes.findById(id).orElse(null);
    }

    @Override
    public void delete(beanclientes clientes) { daoclientes.delete(clientes);

    }

    @Override
    public List<beanclientes> findAll() { return (List<beanclientes>) daoclientes.findAll();
    }
}
