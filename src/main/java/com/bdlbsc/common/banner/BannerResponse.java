package com.bdlbsc.common.banner;

import com.bdlbsc.common.base.BaseResponse;
import lombok.*;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BannerResponse extends BaseResponse {

    private List<BannerItem> banners;

}
