package com.falabella.catalyst.network.entity;

import com.falabella.catalyst.network.model.AuditModel;
import com.falabella.catalyst.network.util.StringListConverter;
import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map;

@Entity
@Data
@Table(name = "geo_resource_alias")
public class GeoAlias extends AuditModel {
    @Id
    protected Long aliasID;

    @Column(name = "AliasName")
    String aliasName;

    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "oms_refrence_alias", joinColumns = @JoinColumn(name ="oms_refrence_id"))
    @MapKeyColumn(name = "oms_refrence_key", length = 100)
    @Column(name = "oms_refrence_value", length = 1000)
    @BatchSize(size = 20)
    private Map<String, String> omsRefrenceVales = new HashMap<String, String>();

    @Column(name = "oms_refrence_id")
    private long refrenceID;
}
