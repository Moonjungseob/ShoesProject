package com.busanit501.shoesproject.dto.mjsdto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShoesDTO {
    private Long item_id;

    private String item_name;

    private String item_type;

    private String item_brand;

    private String item_price;

    private String item_review_rank_avg;

    private String item_gender;

    private List<String> fileNames;



}
