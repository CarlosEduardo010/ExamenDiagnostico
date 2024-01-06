package mx.edu.utez.diagnostico.service;
import mx.edu.utez.diagnostico.model.dto.dtoclientes;
import mx.edu.utez.diagnostico.model.entity.beanclientes;
import java.util.List;

public interface iclientes {
    beanclientes save(dtoclientes editorialedto);

    beanclientes findById(Integer id);

    void delete(beanclientes beanclientes);

    List<beanclientes> findAll();

}
