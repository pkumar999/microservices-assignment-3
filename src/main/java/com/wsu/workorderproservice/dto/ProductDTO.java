package com.wsu.workorderproservice.dto;

import java.math.BigDecimal;

import com.wsu.workorderproservice.model.Product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    private String code;
    private String name;
    private BigDecimal unitCost;
    private Character typeCode;
    private String universalProductCode;
    private boolean active;

    public Product mapToEntity() {
        return Product.builder().code(this.getCode()).name(this.getName())
                .unitCost(this.getUnitCost()).typeCode(this.getTypeCode())
                .universalProductCode(this.getUniversalProductCode()).active(this.isActive()).build();
    }
}
