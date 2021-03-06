package io.es.entity;

import io.es.entity.annotation.DistrictRestricted;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Resource {

  @Id
  @GeneratedValue
  Long id;

  String value;

  // @DistrictRestricted
  @Getter(onMethod = @__(@DistrictRestricted))
  @ManyToOne
  District district;

}
