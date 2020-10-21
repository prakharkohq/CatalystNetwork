package com.falabella.catalyst.network.entity;

import com.falabella.catalyst.network.constants.OperatorTypes;
import com.falabella.catalyst.network.model.AuditModel;
import com.falabella.catalyst.network.model.customInfo.CustomInfo;
import com.falabella.catalyst.network.util.StringListConverter;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "network_operators")
public class Operator extends AuditModel {

    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Id
    String operatorId;

    //  @OneToMany(mappedBy="operatorId")

    @Column(name = "AliasName")
    String aliasName;

    @Column(name = "OperatorDNI")
    String operatorDNI;

    @Column(name = "OperatorName")
    String operatorName;

    @Enumerated(EnumType.STRING)
    OperatorTypes operatorType;

    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<CustomInfo> customInfo;

    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> imageInfo;

    @Column(name = "createdBy")
    String createdBy;

    @Column(name = "updatedBy", nullable = false)
    String updatedBy;
}
