/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
public class PedidoItemId implements Serializable {

    @Column(name = "pedido_id", nullable = false)
    private Integer pedidoId;

    @Column(name = "sequencia", nullable = false)
    private Integer sequencia;

}
