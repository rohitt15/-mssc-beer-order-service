package com.developer.mssc.beer.order.service.web.mappers;

import com.developer.mssc.beer.order.service.domain.BeerOrderLine;
import com.developer.mssc.beer.order.service.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

    BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}