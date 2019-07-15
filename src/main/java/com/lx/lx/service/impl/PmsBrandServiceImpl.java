package com.lx.lx.service.impl;
import com.github.pagehelper.PageHelper;
import com.lx.lx.mbg.mapper.PmsBrandMapper;
import com.lx.lx.mbg.model.PmsBrand;
import com.lx.lx.mbg.model.PmsBrandExample;
import com.lx.lx.service.PmsBrandService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PmsBrandServiceImpl implements PmsBrandService {

        @Resource
        private PmsBrandMapper brandMapper;
        @Override
        public List<PmsBrand> listAllBrand() {
            return brandMapper.selectByExample(new PmsBrandExample());
        }

        @Override
        public int createBrand(PmsBrand brand) {
            return brandMapper.insertSelective(brand);
        }

        @Override
        public int updateBrand(Long id, PmsBrand brand) {
            brand.setId(id);
            return brandMapper.updateByPrimaryKeySelective(brand);
        }
        @Override
        public int deleteBrand(Long id) {
            return brandMapper.deleteByPrimaryKey(id);
        }
        @Override

        public List<PmsBrand> listBrand(int pageNum, int pageSize) {
            PageHelper.startPage(pageNum, pageSize);
            return brandMapper.selectByExample(new PmsBrandExample());
        }
        @Override
        public PmsBrand getBrand(Long id) {
            return brandMapper.selectByPrimaryKey(id);

        }

    }

