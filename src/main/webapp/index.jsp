<%--
  Created by IntelliJ IDEA.
  User: w-ss
  Date: 2019/8/6
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <title>红色商城网站响应式模板 - 我爱模板网 www.5imoban.net</title>

    <link href="${pageContext.request.contextPath}/static/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="${pageContext.request.contextPath}/static/assets/css/admin.css" rel="stylesheet" type="text/css" />

    <link href="${pageContext.request.contextPath}/static/basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="${pageContext.request.contextPath}/static/css/hmstyle.css" rel="stylesheet" type="text/css"/>
    <link href="${pageContext.request.contextPath}/static/css/skin.css" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/static/assets/js/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/static/assets/js/amazeui.min.js"></script>

</head>

<body>
<div class="hmtop">
    <!--顶部导航条 -->
    <div class="am-container header">
        <ul class="message-l">
            <div class="topMessage">
                <div class="menu-hd">
                    <a href="${pageContext.request.contextPath}/login.jsp" target="_top" class="h">亲，请登录</a>
                    <a href="${pageContext.request.contextPath}/register.jsp" target="_top">免费注册</a>
                </div>
            </div>
        </ul>
        <ul class="message-r">
            <div class="topMessage home">
                <div class="menu-hd"><a href="${pageContext.request.contextPath}/index/showCategaryAll" target="_top" class="h">商城首页</a></div>
            </div>
            <div class="topMessage my-shangcheng">
                <div class="menu-hd MyShangcheng"><a href="person/index.html" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
            </div>
            <div class="topMessage mini-cart">
                <div class="menu-hd"><a id="mc-menu-hd" href="${pageContext.request.contextPath}/shopcart/showShopcart/${userInfo.cartList[0].cartId}" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
            </div>
            <div class="topMessage favorite">
                <div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
            </div>
        </ul>
    </div>

    <!--悬浮搜索框-->

    <div class="nav white">
        <div class="logo"><img src="${pageContext.request.contextPath}/static/images/logo.png" /></div>
        <div class="logoBig">
            <li><img src="${pageContext.request.contextPath}/static/images/logobig.png" /></li>
        </div>

        <div class="search-bar pr">
            <a name="index_none_header_sysc" href="#"></a>
            <form action="${pageContext.request.contextPath}/search/searchByKey?currentPage=1" method="get">
                <input id="searchInput" name="key" type="text" placeholder="搜索" autocomplete="off"/>
                <input id="ai-topsearch" class="submit am-btn" value="搜索" index="1" type="submit"/>
            </form>
        </div>
    </div>

    <div class="clear"></div>
</div>
<div class="banner">
    <!--轮播 -->
    <div class="am-slider am-slider-default scoll" data-am-flexslider id="demo-slider-0">
        <ul class="am-slides">
            <li class="banner1"><a href="introduction.html"><img src="${pageContext.request.contextPath}/static/images/ad1.jpg" /></a></li>
            <li class="banner2"><a><img src="${pageContext.request.contextPath}/static/images/ad2.jpg" /></a></li>
            <li class="banner3"><a><img src="${pageContext.request.contextPath}/static/images/ad3.jpg" /></a></li>
            <li class="banner4"><a><img src="${pageContext.request.contextPath}/static/images/ad4.jpg" /></a></li>

        </ul>
    </div>
    <div class="clear"></div>
</div>
<div class="shopNav">
    <div class="slideall">

        <div class="long-title"><span class="all-goods">全部分类</span></div>
        <div class="nav-cont">
            <ul>
                <li class="index"><a href="#">首页</a></li>
                <li class="qc"><a href="#">闪购</a></li>
                <li class="qc"><a href="#">限时抢</a></li>
                <li class="qc"><a href="#">团购</a></li>
                <li class="qc last"><a href="#">大包装</a></li>
            </ul>
            <div class="nav-extra">
                <i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
                <i class="am-icon-angle-right" style="padding-left: 10px;"></i>
            </div>
        </div>

        <!--侧边导航 -->
        <div id="nav" class="navfull">
            <div class="area clearfix">
                <div class="category-content" id="guide_2">

                    <div class="category">
                        <ul class="category-list" id="js_climit_li">
                            <c:forEach items="${categorys}" var="category">
                            <li class="appliance js_toggle relative first">
                                <div class="category-info">
                                    <h3 class="category-name b-category-name"><i><img src="${pageContext.request.contextPath}/static/images/cake.png"></i><a class="ml-22" title="点心">${category.ctitle}</a></h3>
                                    <em>&gt;</em></div>
                                <div class="menu-item menu-in top">
                                    <div class="area-in">
                                        <div class="area-bg">
                                            <div class="menu-srot">

                                                <div class="sort-side">

                                                    <dl class="dl-sort">
                                                        <dt><span title="蛋糕">${category.ctitle}</span></dt>
                                                        <c:forEach items="${category.subCategory}" var="subC">
                                                             <dd><a title="蒸蛋糕" href="${pageContext.request.contextPath}/search/searchByKey?currentPage=1&key=${subC.ctitle2}"><span>${subC.ctitle}</span></a></dd>
                                                        </c:forEach>
                                                    </dl>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <b class="arrow"></b>
                            </li>
                            </c:forEach>
                        </ul>
                    </div>
                </div>

            </div>
        </div>


        <!--轮播-->

        <script type="text/javascript">
            (function() {
                $('.am-slider').flexslider();
            });
            $(document).ready(function() {
                $("li").hover(function() {
                    $(".category-content .category-list li.first .menu-in").css("display", "none");
                    $(".category-content .category-list li.first").removeClass("hover");
                    $(this).addClass("hover");
                    $(this).children("div.menu-in").css("display", "block")
                }, function() {
                    $(this).removeClass("hover")
                    $(this).children("div.menu-in").css("display", "none")
                });
            })
        </script>



        <!--小导航 -->
        <div class="am-g am-g-fixed smallnav">
            <div class="am-u-sm-3">
                <a href="sort.html"><img src="${pageContext.request.contextPath}/static/images/navsmall.jpg" />
                    <div class="title">商品分类</div>
                </a>
            </div>
            <div class="am-u-sm-3">
                <a href="#"><img src="${pageContext.request.contextPath}/static/images/huismall.jpg" />
                    <div class="title">大聚惠</div>
                </a>
            </div>
            <div class="am-u-sm-3">
                <a href="#"><img src="${pageContext.request.contextPath}/static/images/mansmall.jpg" />
                    <div class="title">个人中心</div>
                </a>
            </div>
            <div class="am-u-sm-3">
                <a href="#"><img src="${pageContext.request.contextPath}/static/images/moneysmall.jpg" />
                    <div class="title">投资理财</div>
                </a>
            </div>
        </div>

        <!--走马灯 -->

        <div class="marqueen">
            <span class="marqueen-title">商城头条</span>
            <div class="demo">

                <ul>
                    <li class="title-first"><a target="_blank" href="#">
                        <img src="${pageContext.request.contextPath}/static/images/TJ2.jpg"></img>
                        <span>[特惠]</span>商城爆品1分秒
                    </a></li>
                    <li class="title-first"><a target="_blank" href="#">
                        <span>[公告]</span>商城与广州市签署战略合作协议
                        <img src="${pageContext.request.contextPath}/static/images/TJ.jpg"></img>
                        <p>XXXXXXXXXXXXXXXXXX</p>
                    </a></li>

                    <div class="mod-vip">
                        <div class="m-baseinfo">
                            <a href="../person/index.html">
                                <img src="${pageContext.request.contextPath}/static/images/getAvatar.do.jpg">
                            </a>
                            <em>
                                Hi,<span class="s-name">小叮当</span>
                                <a href="#"><p>点击更多优惠活动</p></a>
                            </em>
                        </div>
                        <div class="member-logout">
                            <a class="am-btn-warning btn" href="login.html">登录</a>
                            <a class="am-btn-warning btn" href="register.html">注册</a>
                        </div>
                        <div class="member-login">
                            <a href="#"><strong>0</strong>待收货</a>
                            <a href="#"><strong>0</strong>待发货</a>
                            <a href="#"><strong>0</strong>待付款</a>
                            <a href="#"><strong>0</strong>待评价</a>
                        </div>
                        <div class="clear"></div>
                    </div>

                    <li><a target="_blank" href="#"><span>[特惠]</span>洋河年末大促，低至两件五折</a></li>
                    <li><a target="_blank" href="#"><span>[公告]</span>华北、华中部分地区配送延迟</a></li>
                    <li><a target="_blank" href="#"><span>[特惠]</span>家电狂欢千亿礼券 买1送1！</a></li>

                </ul>
                <div class="advTip"><img src="${pageContext.request.contextPath}/static/images/advTip.jpg"/></div>
            </div>
        </div>
        <div class="clear"></div>
    </div>
    <script type="text/javascript">
        if ($(window).width() < 640) {
            function autoScroll(obj) {
                $(obj).find("ul").animate({
                    marginTop: "-39px"
                }, 500, function() {
                    $(this).css({
                        marginTop: "0px"
                    }).find("li:first").appendTo(this);
                })
            }
            $(function() {
                setInterval('autoScroll(".demo")', 3000);
            })
        }
    </script>
</div>
<div class="shopMainbg">
    <div class="shopMain" id="shopmain">

        <!--今日推荐 -->

        <div class="am-g am-g-fixed recommendation">
            <div class="clock am-u-sm-3" >
            <img src="${pageContext.request.contextPath}/static/images/2016.png "></img>
            <p>今日<br>推荐</p>
        </div>
        <div class="am-u-sm-4 am-u-lg-3 ">
            <div class="info ">
                <h3>真的有鱼</h3>
                <h4>开年福利篇</h4>
            </div>
            <div class="recommendationMain one">
                <a href="introduction.html"><img src="${pageContext.request.contextPath}/static/images/tj.png "></img></a>
            </div>
        </div>
        <div class="am-u-sm-4 am-u-lg-3 ">
            <div class="info ">
                <h3>囤货过冬</h3>
                <h4>让爱早回家</h4>
            </div>
            <div class="recommendationMain two">
                <img src="${pageContext.request.contextPath}/static/images/tj1.png "></img>
            </div>
        </div>
        <div class="am-u-sm-4 am-u-lg-3 ">
            <div class="info ">
                <h3>浪漫情人节</h3>
                <h4>甜甜蜜蜜</h4>
            </div>
            <div class="recommendationMain three">
                <img src="${pageContext.request.contextPath}/static/images/tj2.png "></img>
            </div>
        </div>

    </div>
    <div class="clear "></div>
    <!--热门活动 -->

    <div class="am-container activity ">
        <div class="shopTitle ">
            <h4>活动</h4>
            <h3>每期活动 优惠享不停 </h3>
            <span class="more ">
                              <a href="# ">全部活动<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
        </div>
        <div class="am-g am-g-fixed ">
            <div class="am-u-sm-3 ">
                <div class="icon-sale one "></div>
                <h4>秒杀</h4>
                <div class="activityMain ">
                    <img src="${pageContext.request.contextPath}/static/images/activity1.jpg "></img>
                </div>
                <div class="info ">
                    <h3>春节送礼优选</h3>
                </div>
            </div>

            <div class="am-u-sm-3 ">
                <div class="icon-sale two "></div>
                <h4>特惠</h4>
                <div class="activityMain ">
                    <img src="${pageContext.request.contextPath}/static/images/activity2.jpg "></img>
                </div>
                <div class="info ">
                    <h3>春节送礼优选</h3>
                </div>
            </div>

            <div class="am-u-sm-3 ">
                <div class="icon-sale three "></div>
                <h4>团购</h4>
                <div class="activityMain ">
                    <img src="${pageContext.request.contextPath}/static/images/activity3.jpg "></img>
                </div>
                <div class="info ">
                    <h3>春节送礼优选</h3>
                </div>
            </div>

            <div class="am-u-sm-3 last ">
                <div class="icon-sale "></div>
                <h4>超值</h4>
                <div class="activityMain ">
                    <img src="${pageContext.request.contextPath}/static/images/activity.jpg "></img>
                </div>
                <div class="info ">
                    <h3>春节送礼优选</h3>
                </div>
            </div>

        </div>
    </div>
    <div class="clear "></div>


    <div id="f1">
        <!--甜点-->

        <div class="am-container ">
            <div class="shopTitle ">
                <h4>甜品</h4>
                <h3>每一道甜品都有一个故事</h3>
                <div class="today-brands ">
                    <a href="# ">桂花糕</a>
                    <a href="# ">奶皮酥</a>
                    <a href="# ">栗子糕 </a>
                    <a href="# ">马卡龙</a>
                    <a href="# ">铜锣烧</a>
                    <a href="# ">豌豆黄</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>

        <div class="am-g am-g-fixed floodFour">
            <div class="am-u-sm-5 am-u-md-4 text-one list ">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <div class="outer-con ">
                        <div class="title ">
                            开抢啦！
                        </div>
                        <div class="sub-title ">
                            零食大礼包
                        </div>
                    </div>
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                </a>
                <div class="triangle-topright"></div>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two sug">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/2.jpg" /></a>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/1.jpg" /></a>
            </div>


            <div class="am-u-sm-3 am-u-md-2 text-three big">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three sug">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/3.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/4.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three last big ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

        </div>
        <div class="clear "></div>
    </div>


    <div id="f2">
        <!--坚果-->
        <div class="am-container ">
            <div class="shopTitle ">
                <h4>坚果</h4>
                <h3>酥酥脆脆，回味无穷</h3>
                <div class="today-brands ">
                    <a href="# ">腰果</a>
                    <a href="# ">松子</a>
                    <a href="# ">夏威夷果 </a>
                    <a href="# ">碧根果</a>
                    <a href="# ">开心果</a>
                    <a href="# ">核桃仁</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>
        <div class="am-g am-g-fixed floodThree ">
            <div class="am-u-sm-4 text-four list">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                    </div>
                </a>
                <div class="triangle-topright"></div>
            </div>
            <div class="am-u-sm-4 text-four">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/6.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-4 text-four sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/7.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

            <div class="am-u-sm-6 am-u-md-3 text-five big ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/8.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/9.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five big">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

        </div>

        <div class="clear "></div>
    </div>


    <div id="f3">
        <!--甜点-->

        <div class="am-container ">
            <div class="shopTitle ">
                <h4>甜品</h4>
                <h3>每一道甜品都有一个故事</h3>
                <div class="today-brands ">
                    <a href="# ">桂花糕</a>
                    <a href="# ">奶皮酥</a>
                    <a href="# ">栗子糕 </a>
                    <a href="# ">马卡龙</a>
                    <a href="# ">铜锣烧</a>
                    <a href="# ">豌豆黄</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>

        <div class="am-g am-g-fixed floodFour">
            <div class="am-u-sm-5 am-u-md-4 text-one list ">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <div class="outer-con ">
                        <div class="title ">
                            开抢啦！
                        </div>
                        <div class="sub-title ">
                            零食大礼包
                        </div>
                    </div>
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                </a>
                <div class="triangle-topright"></div>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two sug">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/2.jpg" /></a>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/1.jpg" /></a>
            </div>


            <div class="am-u-sm-3 am-u-md-2 text-three big">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three sug">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/3.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/4.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three last big ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

        </div>
        <div class="clear "></div>
    </div>


    <div id="f4">
        <!--坚果-->
        <div class="am-container ">
            <div class="shopTitle ">
                <h4>坚果</h4>
                <h3>酥酥脆脆，回味无穷</h3>
                <div class="today-brands ">
                    <a href="# ">腰果</a>
                    <a href="# ">松子</a>
                    <a href="# ">夏威夷果 </a>
                    <a href="# ">碧根果</a>
                    <a href="# ">开心果</a>
                    <a href="# ">核桃仁</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>
        <div class="am-g am-g-fixed floodThree ">
            <div class="am-u-sm-4 text-four list">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                    </div>
                </a>
                <div class="triangle-topright"></div>
            </div>
            <div class="am-u-sm-4 text-four">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/6.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-4 text-four sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/7.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

            <div class="am-u-sm-6 am-u-md-3 text-five big ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/8.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/9.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five big">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

        </div>

        <div class="clear "></div>
    </div>


    <div id="f5">
        <!--甜点-->

        <div class="am-container ">
            <div class="shopTitle ">
                <h4>甜品</h4>
                <h3>每一道甜品都有一个故事</h3>
                <div class="today-brands ">
                    <a href="# ">桂花糕</a>
                    <a href="# ">奶皮酥</a>
                    <a href="# ">栗子糕 </a>
                    <a href="# ">马卡龙</a>
                    <a href="# ">铜锣烧</a>
                    <a href="# ">豌豆黄</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>

        <div class="am-g am-g-fixed floodFour">
            <div class="am-u-sm-5 am-u-md-4 text-one list ">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <div class="outer-con ">
                        <div class="title ">
                            开抢啦！
                        </div>
                        <div class="sub-title ">
                            零食大礼包
                        </div>
                    </div>
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                </a>
                <div class="triangle-topright"></div>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two sug">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/2.jpg" /></a>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/1.jpg" /></a>
            </div>


            <div class="am-u-sm-3 am-u-md-2 text-three big">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three sug">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/3.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/4.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three last big ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

        </div>
        <div class="clear "></div>
    </div>


    <div id="f6">
        <!--坚果-->
        <div class="am-container ">
            <div class="shopTitle ">
                <h4>坚果</h4>
                <h3>酥酥脆脆，回味无穷</h3>
                <div class="today-brands ">
                    <a href="# ">腰果</a>
                    <a href="# ">松子</a>
                    <a href="# ">夏威夷果 </a>
                    <a href="# ">碧根果</a>
                    <a href="# ">开心果</a>
                    <a href="# ">核桃仁</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>
        <div class="am-g am-g-fixed floodThree ">
            <div class="am-u-sm-4 text-four list">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                    </div>
                </a>
                <div class="triangle-topright"></div>
            </div>
            <div class="am-u-sm-4 text-four">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/6.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-4 text-four sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/7.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

            <div class="am-u-sm-6 am-u-md-3 text-five big ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/8.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/9.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five big">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

        </div>

        <div class="clear "></div>
    </div>



    <div id="f7">
        <!--甜点-->

        <div class="am-container ">
            <div class="shopTitle ">
                <h4>甜品</h4>
                <h3>每一道甜品都有一个故事</h3>
                <div class="today-brands ">
                    <a href="# ">桂花糕</a>
                    <a href="# ">奶皮酥</a>
                    <a href="# ">栗子糕 </a>
                    <a href="# ">马卡龙</a>
                    <a href="# ">铜锣烧</a>
                    <a href="# ">豌豆黄</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>

        <div class="am-g am-g-fixed floodFour">
            <div class="am-u-sm-5 am-u-md-4 text-one list ">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <div class="outer-con ">
                        <div class="title ">
                            开抢啦！
                        </div>
                        <div class="sub-title ">
                            零食大礼包
                        </div>
                    </div>
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                </a>
                <div class="triangle-topright"></div>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two sug">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/2.jpg" /></a>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/1.jpg" /></a>
            </div>


            <div class="am-u-sm-3 am-u-md-2 text-three big">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three sug">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/3.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/4.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three last big ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

        </div>
        <div class="clear "></div>
    </div>

    <div id="f8">
        <!--坚果-->
        <div class="am-container ">
            <div class="shopTitle ">
                <h4>坚果</h4>
                <h3>酥酥脆脆，回味无穷</h3>
                <div class="today-brands ">
                    <a href="# ">腰果</a>
                    <a href="# ">松子</a>
                    <a href="# ">夏威夷果 </a>
                    <a href="# ">碧根果</a>
                    <a href="# ">开心果</a>
                    <a href="# ">核桃仁</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>
        <div class="am-g am-g-fixed floodThree ">
            <div class="am-u-sm-4 text-four list">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                    </div>
                </a>
                <div class="triangle-topright"></div>
            </div>
            <div class="am-u-sm-4 text-four">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/6.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-4 text-four sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/7.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

            <div class="am-u-sm-6 am-u-md-3 text-five big ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/8.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/9.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five big">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

        </div>

        <div class="clear "></div>
    </div>

    <div id="f9">
        <!--甜点-->

        <div class="am-container ">
            <div class="shopTitle ">
                <h4>甜品</h4>
                <h3>每一道甜品都有一个故事</h3>
                <div class="today-brands ">
                    <a href="# ">桂花糕</a>
                    <a href="# ">奶皮酥</a>
                    <a href="# ">栗子糕 </a>
                    <a href="# ">马卡龙</a>
                    <a href="# ">铜锣烧</a>
                    <a href="# ">豌豆黄</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>

        <div class="am-g am-g-fixed floodFour">
            <div class="am-u-sm-5 am-u-md-4 text-one list ">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <div class="outer-con ">
                        <div class="title ">
                            开抢啦！
                        </div>
                        <div class="sub-title ">
                            零食大礼包
                        </div>
                    </div>
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                </a>
                <div class="triangle-topright"></div>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two sug">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/2.jpg" /></a>
            </div>

            <div class="am-u-sm-7 am-u-md-4 text-two">
                <div class="outer-con ">
                    <div class="title ">
                        雪之恋和风大福
                    </div>
                    <div class="sub-title ">
                        ¥13.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/1.jpg" /></a>
            </div>


            <div class="am-u-sm-3 am-u-md-2 text-three big">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three sug">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/3.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/4.jpg" /></a>
            </div>

            <div class="am-u-sm-3 am-u-md-2 text-three last big ">
                <div class="outer-con ">
                    <div class="title ">
                        小优布丁
                    </div>
                    <div class="sub-title ">
                        ¥4.8
                    </div>
                    <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                </div>
                <a href="# "><img src="${pageContext.request.contextPath}/static/images/5.jpg" /></a>
            </div>

        </div>
        <div class="clear "></div>
    </div>


    <div id="f10">
        <!--坚果-->
        <div class="am-container ">
            <div class="shopTitle ">
                <h4>坚果</h4>
                <h3>酥酥脆脆，回味无穷</h3>
                <div class="today-brands ">
                    <a href="# ">腰果</a>
                    <a href="# ">松子</a>
                    <a href="# ">夏威夷果 </a>
                    <a href="# ">碧根果</a>
                    <a href="# ">开心果</a>
                    <a href="# ">核桃仁</a>
                </div>
                <span class="more ">
                    <a href="# ">更多美味<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
            </div>
        </div>
        <div class="am-g am-g-fixed floodThree ">
            <div class="am-u-sm-4 text-four list">
                <div class="word">
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                    <a class="outer" href="#"><span class="inner"><b class="text">核桃</b></span></a>
                </div>
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/act1.png " />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                    </div>
                </a>
                <div class="triangle-topright"></div>
            </div>
            <div class="am-u-sm-4 text-four">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/6.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-4 text-four sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/7.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

            <div class="am-u-sm-6 am-u-md-3 text-five big ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five ">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/8.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five sug">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/9.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>
            <div class="am-u-sm-6 am-u-md-3 text-five big">
                <a href="# ">
                    <img src="${pageContext.request.contextPath}/static/images/10.jpg" />
                    <div class="outer-con ">
                        <div class="title ">
                            雪之恋和风大福
                        </div>
                        <div class="sub-title ">
                            ¥13.8
                        </div>
                        <i class="am-icon-shopping-basket am-icon-md  seprate"></i>
                    </div>
                </a>
            </div>

        </div>

        <div class="clear "></div>
    </div>



    <div class="footer ">
        <div class="footer-hd ">
            <p>
                <a href="# ">恒望科技</a>
                <b>|</b>
                <a href="# ">商城首页</a>
                <b>|</b>
                <a href="# ">支付宝</a>
                <b>|</b>
                <a href="# ">物流</a>
            </p>
        </div>
        <div class="footer-bd ">
            <p>
                <a href="# ">关于恒望</a>
                <a href="# ">合作伙伴</a>
                <a href="# ">联系我们</a>
                <a href="# ">网站地图</a>
                <em><a href="http://www.5imoban.net/" target="_blank" title="html静态模板">我爱模板网</a></em>
            </p>
        </div>
    </div>

</div>
</div>
<!--引导 -->
<div class="navCir">
    <li class="active"><a href="home.html"><i class="am-icon-home "></i>首页</a></li>
    <li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>
    <li><a href="shopcart.html"><i class="am-icon-shopping-basket"></i>购物车</a></li>
    <li><a href="../person/index.html"><i class="am-icon-user"></i>我的</a></li>
</div>


<!--菜单 -->
<div class=tip>
    <div id="sidebar">
        <div id="wrap">
            <div id="prof" class="item ">
                <a href="# ">
                    <span class="setting "></span>
                </a>
                <div class="ibar_login_box status_login ">
                    <div class="avatar_box ">
                        <p class="avatar_imgbox "><img src="${pageContext.request.contextPath}/static/images/no-img_mid_.jpg " /></p>
                        <ul class="user_info ">
                            <li>用户名sl1903</li>
                            <li>级&nbsp;别普通会员</li>
                        </ul>
                    </div>
                    <div class="login_btnbox ">
                        <a href="# " class="login_order ">我的订单</a>
                        <a href="# " class="login_favorite ">我的收藏</a>
                    </div>
                    <i class="icon_arrow_white "></i>
                </div>

            </div>
            <div id="shopCart " class="item ">
                <a href="# ">
                    <span class="message "></span>
                </a>
                <p>
                    购物车
                </p>
                <p class="cart_num ">0</p>
            </div>
            <div id="asset " class="item ">
                <a href="# ">
                    <span class="view "></span>
                </a>
                <div class="mp_tooltip ">
                    我的资产
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div id="foot " class="item ">
                <a href="# ">
                    <span class="zuji "></span>
                </a>
                <div class="mp_tooltip ">
                    我的足迹
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div id="brand " class="item ">
                <a href="#">
                    <span class="wdsc "><img src="${pageContext.request.contextPath}/static/images/wdsc.png " /></span>
                </a>
                <div class="mp_tooltip ">
                    我的收藏
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div id="broadcast " class="item ">
                <a href="# ">
                    <span class="chongzhi "><img src="${pageContext.request.contextPath}/static/images/chongzhi.png " /></span>
                </a>
                <div class="mp_tooltip ">
                    我要充值
                    <i class="icon_arrow_right_black "></i>
                </div>
            </div>

            <div class="quick_toggle ">
                <li class="qtitem ">
                    <a href="# "><span class="kfzx "></span></a>
                    <div class="mp_tooltip ">客服中心<i class="icon_arrow_right_black "></i></div>
                </li>
                <!--二维码 -->
                <li class="qtitem ">
                    <a href="#none "><span class="mpbtn_qrcode "></span></a>
                    <div class="mp_qrcode " style="display:none; "><img src="${pageContext.request.contextPath}/static/images/weixin_code_145.png " /><i class="icon_arrow_white "></i></div>
                </li>
                <li class="qtitem ">
                    <a href="#top " class="return_top "><span class="top "></span></a>
                </li>
            </div>

            <!--回到顶部 -->
            <div id="quick_links_pop " class="quick_links_pop hide "></div>

        </div>

    </div>
    <div id="prof-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            我
        </div>
    </div>
    <div id="shopCart-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            购物车
        </div>
    </div>
    <div id="asset-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            资产
        </div>

        <div class="ia-head-list ">
            <a href="# " target="_blank " class="pl ">
                <div class="num ">0</div>
                <div class="text ">优惠券</div>
            </a>
            <a href="# " target="_blank " class="pl ">
                <div class="num ">0</div>
                <div class="text ">红包</div>
            </a>
            <a href="# " target="_blank " class="pl money ">
                <div class="num ">￥0</div>
                <div class="text ">余额</div>
            </a>
        </div>

    </div>
    <div id="foot-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            足迹
        </div>
    </div>
    <div id="brand-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            收藏
        </div>
    </div>
    <div id="broadcast-content " class="nav-content ">
        <div class="nav-con-close ">
            <i class="am-icon-angle-right am-icon-fw "></i>
        </div>
        <div>
            充值
        </div>
    </div>
</div>
<script>
    window.jQuery || document.write('<script src="basic/js/jquery.min.js "><\/script>');
</script>
<script type="text/javascript " src="basic/js/quick_links.js "></script>
</body>
</html>