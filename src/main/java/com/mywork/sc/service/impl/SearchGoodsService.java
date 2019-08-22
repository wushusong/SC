package com.mywork.sc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mywork.sc.entity.Goods;
import com.mywork.sc.mapper.SearchMapper;
import com.mywork.sc.service.ISearchGoodsService;
import com.mywork.sc.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@Service
public class SearchGoodsService implements ISearchGoodsService {

    @Autowired
    SearchMapper searchMapper;

    public SearchMapper getSearchMapper() {
        return searchMapper;
    }

    public void setSearchMapper(SearchMapper searchMapper) {
        this.searchMapper = searchMapper;
    }

    public Properties getInstence(){
        Properties properties = new Properties();

        InputStream inputStream = SearchGoodsService.class.getClassLoader().getResourceAsStream("Page.properties");

        try {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }


    @Override
    public PageBean<Goods> searchGoods(String key,Integer currentPage) {
        Properties properties = getInstence();

        Integer pageSize = Integer.parseInt(properties.getProperty("pageSize"));

        PageBean<Goods> pageBean = new PageBean<>();

        PageHelper.startPage(currentPage,pageSize);

        List<Goods> goodsLists;

        if(key.endsWith(".do")){
            key = key.replaceAll(".do", "");
            goodsLists = searchMapper.getGoodsByLabel(key);
            key = key+".do";
        }else {
            goodsLists = searchMapper.getGoodsByKey(key);
        }
        pageBean.setCurrentPage(currentPage);
        pageBean.setPageSize(pageSize);

        PageInfo<Goods> pageInfo = new PageInfo<>(goodsLists);

        ArrayList<Goods> goodsList = new ArrayList<>();
        for(int i=0;i<pageInfo.getList().size();i++){
            goodsList.add(pageInfo.getList().get(i));

            String goodsImg = goodsList.get(i).getGoodsImg();
            goodsList.get(i).setGoodsImg("http://localhost:8080/SC/static/"+goodsImg);

        }

        int totalSize = (int)pageInfo.getTotal();
        int totalPage = (int) Math.ceil(totalSize*1.0/pageSize);

        pageBean.setData(goodsList);
        pageBean.setTotalSize(totalSize);
        pageBean.setTotalPage(totalPage);
        pageBean.setKey(key);

        pageBean.setUrl("");

        System.out.println("wss1:"+key);
        //System.out.println("wss2:"+pageBean.getData().get(1).getGoodsImg());
        System.out.println("wss3");
        return pageBean;
    }

//   @Override
//  public PageBean<Goods> searchGoodsByLabel(String key, Integer currentPage) {
//        Properties properties = getInstence();
//
//        Integer pageSize = Integer.parseInt(properties.getProperty("pageSize"));
//
//       PageBean<Goods> pageBean = new PageBean<>();
//
//        PageHelper.startPage(currentPage,pageSize);
//
//        List<Goods> goodsLists = searchMapper.getGoodsByLabel(key);
//
//        pageBean.setCurrentPage(currentPage);
//        pageBean.setPageSize(pageSize);
//
//        PageInfo<Goods> pageInfo = new PageInfo<>(goodsLists);
//
//        ArrayList<Goods> goodsList = new ArrayList<>();
//        for(int i=0;i<pageInfo.getList().size();i++){
//            goodsList.add(pageInfo.getList().get(i));
//
//            String goodsImg = goodsList.get(i).getGoodsImg();
//            goodsList.get(i).setGoodsImg("http://localhost:8080/SC/static/"+goodsImg);
//
//        }
//
//        int totalSize = (int)pageInfo.getTotal();
//        int totalPage = (int) Math.ceil(totalSize*1.0/pageSize);
//
//        pageBean.setData(goodsList);
//        pageBean.setTotalSize(totalSize);
//        pageBean.setTotalPage(totalPage);
//        pageBean.setKey(key);
//
//        pageBean.setUrl("");
//
//        System.out.println("wss:"+key);
//        System.out.println(pageBean.getData().get(1).getGoodsImg());
//
 //      return pageBean;
//
//
//
 //  }


}
