package guru.springframework.msscjacksonexamples.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest {
    
    BeerDto getDto() {
        return BeerDto.builder()
        .beerName("Ale Beer")
        .beerStyle("Ale")
        .id(UUID.randomUUID())
        .createdDate(OffsetDateTime.now())
        .lastUpdatedDate(OffsetDateTime.now())
        .price(new BigDecimal(("12.99")))
        .upc(12344L).myLocalDate(LocalDate.now())
        .build();
    }

}
