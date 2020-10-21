package com.falabella.catalyst.network.entity;

import com.falabella.catalyst.network.constants.ResourceConsumptionCycle;
import com.falabella.catalyst.network.constants.ResourceUsage;
import com.falabella.catalyst.network.model.AuditModel;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name="Domain_Resource", uniqueConstraints = {@UniqueConstraint(columnNames = {"resourceID"})})
public class Resource extends AuditModel {
    @Id
    @Column(name = "resourceId",nullable = false,updatable = false)
    protected String resourceId;

    @Column(unique = true)
    String name;

    @Column(name = "resourceConsumptionCycle")
    @Enumerated(EnumType.STRING)
    ResourceConsumptionCycle resourceConsumptionCycle;

    @Column(name = "parentResourceId",nullable = true,updatable = true)
    protected String parentResourceId;

    @OneToMany(mappedBy="resourceId")
    Set<ResourceCapacity> resourceCapacities;

    @Column(name = "resourceUsage")
    @Enumerated(EnumType.STRING)
    ResourceUsage resourceUsage;

    @NotNull
    String source;

    @Column(name = "ConsumerReference")
    String reference;

    @Column(name = "ConsumptionDate")
    Date consumptionDate;

    @Column(name = "AvailabilityDate")
    Date availabilityDate;

    @Column(name = "ConsumptionHour")
    Integer consumption_hour;

    @Column(name = "AvailabilityHour")
    Integer availability_hour;

    @Column(name = "ConsumptionVolume")
    Long consumption_volume;

    @Column(name = "ConsumptionVolumeUOM")
    String consumption_volume_uom;

    @Column(name = "ConsumptionWeight")
    Long consumption_weight;

    @Column(name = "ConsumptionWeightUOM")
    String consumption_weight_uom;

    @Column(name = "isResourceModified")
    boolean isResourceModified;

    @Column(name = "isResourceAvailable")
    boolean isResourceAvailable;

    @Column(name = "maxAvailableVolume")
    Long maxAvailableVolume;

    @Column(name = "ConsumedVolume")
    Long ConsumedVolume;

    @Column(name = "AvailableVolume")
    Long AvailableVolume;

    @Column(name = "AvailableVolumeUOM")
    String AvailableVolumeUOM;

    @Column(name = "maxAvailableWeight")
    Long maxAvailableWeight;

    @Column(name = "AvailableWeight")
    Long availableWeight;

    @Column(name = "AvailableWeightUOM")
    String AvailableWeightUOM;

    @Column(name = "maxOrders")
    Long maxOrders;

    @Column(name = "consumedOrders")
    Long consumedOrders;

    @Column(name = "availableOrders")
    Long availableOrders;

    @Column(name = "maxAvailableUnits")
    Long maxAvailableUnits;

    @Column(name = "maxConsumedUnits")
    Long consumedUnits;

    @Column(name = "AvailableUnits")
    Long AvailableUnits;

}
