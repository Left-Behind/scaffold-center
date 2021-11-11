package com.hho.scaffold.center.dto.goods.query;

import com.alibaba.cola.dto.PageQuery;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author azhu
 * @date 2021/10/11 11:33 上午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoodsPageByMultiQry extends PageQuery {

    @ApiModelProperty(value = "货品名称")
    private String title;

    @ApiModelProperty(value = "项目ID")
    private String projectCode;

}
