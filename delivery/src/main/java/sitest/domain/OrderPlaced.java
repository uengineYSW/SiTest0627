package sitest.domain;

import java.util.*;
import lombok.*;
import sitest.domain.*;
import sitest.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String productId;
    private Integer qty;
    private String customerId;
    private Double amount;
    private String status;
    private String address;
}
