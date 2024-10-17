package com.krishav.project.RideFlow.RideFlow.configs;

import com.krishav.project.RideFlow.RideFlow.dto.PointDTO;
import com.krishav.project.RideFlow.RideFlow.utils.GeometryUtil;
import org.locationtech.jts.geom.Point;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

 @Bean
 public ModelMapper modelMapper()
 {
  ModelMapper mapper = new ModelMapper();

  mapper.typeMap(PointDTO.class, Point.class).setConverter(mappingContext -> {

   PointDTO pointDTO = mappingContext.getSource();
   return GeometryUtil.createPoint(pointDTO);

  });

  mapper.typeMap(Point.class, PointDTO.class).setConverter(mappingContext ->
          {
           Point point = mappingContext.getSource();
           double coordinates[] = {
                   point.getX(),
                   point.getY()
           };
           return new PointDTO(coordinates);
          });


  return mapper;
 }

}
