package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;
import com.mmall.vo.ProductDetailVo;

import java.util.List;

public interface ICategoryService {
    /**
     * 添加商品品类
     * @param catehoryName
     * @param parentId
     * @return
     */
    ServerResponse addCategory(String catehoryName, Integer parentId);

    /**
     * 更新品类名称
     * @param categoryId
     * @param categoryName
     * @return
     */
    ServerResponse updateCategoryName(Integer categoryId,String categoryName);

    /**
     * 获取平级子节点的个数
     */

    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);

    /**
     * 递归查询本节点id及孩子节点Id
     * @param categoryId
     * @return
     */
    ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);



}
