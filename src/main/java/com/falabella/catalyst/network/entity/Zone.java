package com.falabella.catalyst.network.entity;

import com.falabella.catalyst.network.util.StringListConverter;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "geo_zones")
public class Zone {
    @Id
    String zoneID;

    @Column(name = "zoneName")
    String zoneName;

   // @ManyToOne(targetEntity = Operator.class,fetch = FetchType.LAZY)
    @Column(name = "operatorID")
    String operatorID;

    @Column(name = "countriesIncluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> countriesIncuded;

    @Column(name = "countriesExcluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> countriesExcluded;


    @Column(name = "statesIncluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> statesIncluded;

    @Column(name = "statesExcluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> statesExcluded;

    @Column(name = "districtIncluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> districtIncluded;

    @Column(name = "districtExcluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> districtExcluded;

    @Column(name = "zipCodeIncluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> zipCodeIncluded;

    @Column(name = "zipCodeExcluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> zipCodeExcluded;



    @Column(name = "countyIncluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> countyIncluded;

    @Column(name = "countyExcluded")
    @ElementCollection
    @Convert(converter = StringListConverter.class)
    List<String> countyExcluded;

}
