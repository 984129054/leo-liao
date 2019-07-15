package com.lx.lx.dao;

import com.lx.lx.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 搜索系统中的商品管理自定义Dao
 * Created by leo on 2019/6/19.
 */

public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}