package com.ayoub.avions.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomAv", types = { Avion.class })
public interface AvionProjection {
    public String getNomAvion();
}
