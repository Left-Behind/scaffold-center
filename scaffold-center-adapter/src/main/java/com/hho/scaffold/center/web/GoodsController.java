package com.hho.scaffold.center.web;

import com.alibaba.cola.dto.PageQuery;
import com.alibaba.cola.dto.PageResponse;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hho.scaffold.center.dto.goods.query.GoodsPageByMultiQry;
import com.hho.scaffold.center.goods.GoodsMapper;
import com.hho.scaffold.center.goods.GoodsPO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 货品管理控制器
 * @author azhu
 * @date 2021/11/11 4:36 下午
 */
@Slf4j
@RestController
@RequestMapping("api/item/center/goods")
@Api(tags = "GoodsController", description = "货品操作类")
public class GoodsController {

    @Autowired
    private GoodsMapper goodsMapper;

    @ApiOperation(value = "首页多条件查询")
    @GetMapping(value = "/query")
    public PageResponse<GoodsPO> query(GoodsPageByMultiQry query){
        Page<GoodsPO> page = new Page<>(query.getPageIndex(), query.getPageSize());
        QueryWrapper<GoodsPO> wrapper = new QueryWrapper<>();
        goodsMapper.selectPage(page, wrapper);
        Integer total = goodsMapper.selectCount(wrapper).intValue();
        List<GoodsPO> records = page.getRecords();
        return PageResponse.of(records, total, query.getPageIndex(), query.getPageSize());
    }
}
