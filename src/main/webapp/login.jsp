<%--
  Created by IntelliJ IDEA.
  User: w-ss
  Date: 2019/8/6
  Time: 16:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head lang="en">
    <meta charset="UTF-8">
    <title>登录</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <meta name="format-detection" content="telephone=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />

    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/css/amazeui.css" />
    <link href="${pageContext.request.contextPath}/static/css/dlstyle.css" rel="stylesheet" type="text/css">

    <script src="${pageContext.request.contextPath}/static/js/jquery-1.7.2.min.js"></script>
    <script>
        $(function () {

            var sub = $("#sub");
            var fo = $("#fo");

            sub.click(function () {
                fo.submit();
            });
        })
    </script>

</head>

<body>

<div class="login-boxtitle">
    <a href="${pageContext.request.contextPath}/index/showCategaryAll"><img alt="logo" src="${pageContext.request.contextPath}/static/images/logobig.png" /></a>
</div>

<div class="login-banner">
    <div class="login-main">
        <div class="login-banner-bg"><span></span><img src="${pageContext.request.contextPath}/static/images/big.jpg" /></div>
        <div class="login-box">

            <h3 class="title">登录商城</h3>

            <div class="clear"></div>

            <div class="login-form">
                <form id="fo" action="${pageContext.request.contextPath}/index/login" method="post">
                    <div class="user-name">
                        <label for="user"><i class="am-icon-user"></i></label>
                        <input  type="text" name="uname" id="user" placeholder="邮箱/手机/用户名">
                    </div><div>${result}</div>
                    <div class="user-pass">
                        <label for="password"><i class="am-icon-lock"></i></label>
                        <input type="password" name="upwd" id="password" placeholder="请输入密码">
                    </div>
                </form>
            </div>

            <div class="login-links">
                <label for="remember-me"><input id="remember-me" type="checkbox">记住密码</label>
                <a href="#" class="am-fr">忘记密码</a>
                <a href="${pageContext.request.contextPath}/register.jsp" class="zcnext am-fr am-btn-default">注册</a>
                <br />
            </div>
            <div class="am-cf">
                <input type="submit" id="sub" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm">
            </div>
            <div class="partner">
                <h3>合作账号</h3>
                <div class="am-btn-group">
                    <li><a href="#"><i class="am-icon-qq am-icon-sm"></i><span>QQ登录</span></a></li>
                    <li><a href="#"><i class="am-icon-weibo am-icon-sm"></i><span>微博登录</span> </a></li>
                    <li><a href="#"><i class="am-icon-weixin am-icon-sm"></i><span>微信登录</span> </a></li>
                </div>
            </div>

        </div>
    </div>
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
</body>
</html>