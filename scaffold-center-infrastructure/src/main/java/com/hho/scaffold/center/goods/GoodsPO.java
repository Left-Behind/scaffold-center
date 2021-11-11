package com.hho.scaffold.center.goods;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 货品
 * @author azhu
 * @date 2021/10/15 9:31 上午
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "goods")
public class GoodsPO {

    /** 商品编码*/
    @TableId
    private String goodsId;

    /** 商品名称*/
    private String title;

    /** 项目Id(选品侧传)*/
    private String projectCode;

    /** 图片*/
    private String imagesUrl;

    /** 类目*/
    private String topCategory;

    /** 商品介绍*/
    private String introduce;

    /** 供应商编码*/
    private String vendorCode;

    /** 供应商名称*/
    private String vendorName;

    /** 供应商链接*/
    private String vendorUrl;

    /** 供应商状态*/
    private Integer vendorStatus;

    /** 货品物料*/
    private String materials;

    /** 认领平台*/
    private String platform;

    /** 状态*/
    private Integer status;

    /** 来源*/
    private Integer source;

    /** 扩展信息*/
    private String extra;

    /** 操作人*/
    private String updater;

    /** 创建时间*/
    private Date createdAt;

    /** 更新时间*/
    private Date updatedAt;
}
