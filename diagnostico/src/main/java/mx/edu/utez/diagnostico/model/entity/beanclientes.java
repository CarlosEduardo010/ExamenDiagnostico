package mx.edu.utez.diagnostico.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "clientes")
public class beanclientes {
    @Id
    @Column(name = "cliente_id", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cliente_id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "fecha_naci")
    private String fecha_naci;
    @Column(name = "curp")
    private String curp;
}
