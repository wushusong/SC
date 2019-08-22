import com.mywork.sc.entity.Goods;
import com.mywork.sc.entity.ShopcartBean;
import com.mywork.sc.entity.ShopcartBeanList;
import com.mywork.sc.entity.Users;
import com.mywork.sc.mapper.*;
import com.mywork.sc.service.IGoodsDetailService;
import com.mywork.sc.service.IScService;
import com.mywork.sc.service.ISearchGoodsService;
import com.mywork.sc.service.IShopcartService;
import com.mywork.sc.service.impl.GoodsDetailService;
import com.mywork.sc.service.impl.RegisterService;
import com.mywork.sc.service.impl.SearchGoodsService;
import com.mywork.sc.util.PageBean;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestSC {
    /**
     @Test
     public void testEntity(){
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        //注意这里路径的书写
        File configFile = new File("src/main/resources/generator.xml");

        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = null;
        try {
            config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
     */

//    @Autowired
//    UsersMapper scMapper;

    @Test
    public void testMapper(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        UsersMapper usersMapper = classPathXmlApplicationContext.getBean("scMapper", UsersMapper.class);


        Users users = new Users();
        users.setUname("aaa");
        Users user = usersMapper.getUserByUname(users);
        System.out.println(user.getUname());
    }

    @Autowired
    IScService scService;
    @Test
    public void testService(){

        //System.out.println( scService.getUserByUname("aaa","123"));

    }

    @Test
    public void testMapper02(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        SearchMapper searchMapper = classPathXmlApplicationContext.getBean("searchMapper", SearchMapper.class);

        List<Goods> goodsList = searchMapper.getGoodsByKey("匹");

        System.out.println(goodsList);
    }

    @Test
    public void testService02(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        ISearchGoodsService searchGoodsService = classPathXmlApplicationContext.getBean("searchGoodsService", ISearchGoodsService.class);

        PageBean<Goods> goodsPageBean = searchGoodsService.searchGoods("匹", 1);

        System.out.println(goodsPageBean);
    }


    @Test
    public void testService03(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        IGoodsDetailService goodsDetailService = classPathXmlApplicationContext.getBean("goodsDetailService", IGoodsDetailService.class);

        Goods goods = goodsDetailService.goodsDetail(1005);


        System.out.println(goods);
    }

    @Test
    public void testMapper2(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        RegisterMapper registerMapper = classPathXmlApplicationContext.getBean("registerMapper", RegisterMapper.class);

        Users users = new Users();

        users.setMobile("1535039");
        users.setUpwd("123");

        Integer userId = registerMapper.registerUser(users);

        System.out.println(userId);
    }

    @Test
    public void testService4(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        RegisterService registerService = classPathXmlApplicationContext.getBean("registerService", RegisterService.class);

        Users users = new Users();

        users.setMobile("1535000");
        users.setUpwd("123");

        String register = registerService.register(users);

        System.out.println(register);
    }
    @Test
    public void testMapper3(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        AddCarMapper addCarMapper = classPathXmlApplicationContext.getBean("addCarMapper", AddCarMapper.class);

        Users users = new Users();

        users.setMobile("1535000");
        users.setUpwd("123");

        Integer skuId = addCarMapper.getSkuId("2001:3001;2002:3011;2003:3020",1);

        System.out.println("test01:"+skuId);

        Integer integer1 = addCarMapper.addCart((float) 3000.0, 3, 9);


        Integer integer = addCarMapper.addCartInfo(2, skuId, 3);

    }

    @Test
    public void testMapper4(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        ShopcartMapper shopcartMapper = classPathXmlApplicationContext.getBean("shopcartMapper", ShopcartMapper.class);

        List<ShopcartBean> shopcartBeanList = shopcartMapper.getShopcartBean(2);

        for(ShopcartBean shopcartBean :shopcartBeanList){
            String skuProperties = shopcartBean.getSkuProperties();

            String[] skuBean = skuProperties.split(";");

            StringBuilder skuB = new StringBuilder("'");

            for(String s:skuBean){
                skuB.append(s+"','");
            }

            skuB.replace(skuB.length() - 3, skuB.length() - 1, "");

            String s = skuB.toString();

            shopcartBean.setSkuProperties(s);
        }

        HashMap<String, Object> map = new HashMap<>();
        map.put("list",shopcartBeanList);
        map.put("cartId",2);

        System.out.println("wss:***"+shopcartBeanList);
        List<ShopcartBean> shopcartBean2List = shopcartMapper.getShopcartBean2(map);
        System.out.println("wss:***"+shopcartBean2List);


    }

    @Test
    public void testService5(){

        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring-ioc.xml");
        IShopcartService shopcartService = classPathXmlApplicationContext.getBean("shopcartService", IShopcartService.class);

        List<ShopcartBean> shopcartBeans = shopcartService.shopcartAll(2);

        System.out.println(shopcartBeans);


    }
}
