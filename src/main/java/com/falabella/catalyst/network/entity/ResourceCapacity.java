package com.falabella.catalyst.network.entity;

import com.falabella.catalyst.network.constants.ResourceConsumptionCycle;
import com.falabella.catalyst.network.util.StringListConverter;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "resource_capacity")
public class ResourceCapacity {
    @Id
    @Column(name = "capacityId",nullable = false,updatable = false)
    protected String capacityId;

    @ManyToOne(targetEntity = Resource.class,fetch = FetchType.LAZY)
    @JoinColumn(name="resourceId", referencedColumnName = "resourceId", nullable=false)
    String resourceId;

    @Column(name = "resourceConsumptionCycle")
    @Enumerated(EnumType.STRING)
    ResourceConsumptionCycle resourceConsumptionCycle;

    @Column(name = "dayOfWeeks")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> dayOfWeeks;


    @Column(name = "hourOfDays")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> hourOfDays;

    @Column(name = "maxVolumeM3")
    Long maxVolumeInM3;

    @Column(name = "maxWeightKg")
    Long maxWeightInKg;

    @Column(name = "maxOrders")
    Long maxOrders;

    @Column(name = "maxUnits")
    Long maxUnits;

}


