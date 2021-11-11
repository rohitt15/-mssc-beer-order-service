package com.developer.mssc.beer.order.service.web.mappers;

import com.developer.mssc.beer.order.service.domain.BeerOrder;
import com.developer.mssc.beer.order.service.model.BeerOrderDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class, BeerOrderLineMapper.class})
public interface BeerOrderMapper {
    BeerOrderDto beerOrderToDto(BeerOrder beerOrder);

    BeerOrder dtoToBeerOrder(BeerOrderDto dto);

}