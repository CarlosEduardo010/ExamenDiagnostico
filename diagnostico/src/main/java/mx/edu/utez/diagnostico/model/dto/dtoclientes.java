package mx.edu.utez.diagnostico.model.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class dtoclientes {
    private Integer cliente_id;
    private String nombre;
    private String apellido;
    private String fecha_naci;
    private String curp;
}
