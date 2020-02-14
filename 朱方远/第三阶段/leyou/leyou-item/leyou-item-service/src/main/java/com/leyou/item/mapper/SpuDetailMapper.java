package com.leyou.item.mapper;

import com.leyou.item.pojo.Brand;
import com.leyou.item.pojo.SpuDetail;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface SpuDetailMapper extends Mapper<SpuDetail> {
    @Select("SELECT * from tb_spu_detail where spuId=#{spuID}")
    List<Brand> selectCid(Long spuID);
}
