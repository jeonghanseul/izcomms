<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link href="./resources/css/default.css" rel="stylesheet" type="text/css" />
<link href="./resources/css/jquery-ui.css" rel="stylesheet" type="text/css" />

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="bg">
	<div class="logo">
    <a href="./scdulList.do"><img src="./resources/img/logo.jpg" width="264" height="119" /></a>
    </div>
	
    <div class="head_right">

		<div>
            <table width="1236" border="0" cellspacing="0" cellpadding="0">
              <tr class="top_menu">
                <td><a href="./scdulList.do"><img src="./resources/img/top_menu_sche.jpg" width="118" height="26" /></a></td>
                <td><a href="./admin/adManagerList.do"><img src="./resources/img/top_menu_mail.jpg" width="118" height="26" /></a></td>
                <td><a href="#"><img src="./resources/img/top_menu_adv.jpg" width="118" height="26" /></a></td>
                <td><a href="./admin/selectMemberList.do"><img src="./resources/img/top_menu_admin.jpg" width="118" height="26" /></a></td>
                <c:if test="${loginVO == null}">
				    <td><a href="./loginUsr.do">로그인</a></td>
			    </c:if>
			    <c:if test="${loginVO != null}">
				    <td><a href="./actionLogout.do"><img src="./resources/img/top_menu_logout.jpg" width="118" height="26" /></a></td>
			    </c:if>
              </tr>
            </table>

        </div>
        
        <div>
            <table width="1236" border="0" cellspacing="0" cellpadding="0">
              <tr class="membership">
             
                <td>
                	  <span style="width:22px">
                    	<img src="./resources/img/id_icon.jpg" width="22" height="23" />
                      </span>
                      <span>
                    	${name}님 환영합니다.
                      </span>
                      <span class="membership_txt02">
               			<span class="sales">전월개인매출 : 100,000,000,000,00</span>
                      </span>
                      <span class="membership_txt03" style="background:url(./resources/img/bg02.jpg); width:219px; height:23px" >
                      	<span class="case">당월예상배당건 : 100/150</span>
                      </span>
                      <span>
                    	  (진행율 87.1%)
                      </span>
                  </td>

              </tr>
            </table>

        </div>
        



    	
  </div>
</div>
</body>
</html>