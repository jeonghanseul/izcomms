<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<link href="../resources/css/default.css" rel="stylesheet" type="text/css" />
<link href="../resources/css/jquery-ui.css" rel="stylesheet" type="text/css" />

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>메일관리</title>
</head>
<body>
	<div class="head" style="margin-top:-9px;">

<table width="1500" border="0" cellspacing="0" cellpadding="0" align="center">
  <tr>
    <td width="264"><img src="../resources/img/logo.jpg" width="264" height="119" /></td>
    <td>
    <table width="1236" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td>
    <table width="1236" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="617"></td>
    <td><a href="../scdulList.do"><img src="../resources/img/top_menu_sche.jpg" width="118" height="26" /></a></td>		
    <td width="7"></td>
    <td><a href="./adManagerList.do"><img src="../resources/img/top_menu_mail.jpg" width="118" height="26" /></a></td>
    <td width="7"></td>
    <td><a href="#"><img src="../resources/img/top_menu_adv.jpg" width="118" height="26" /></a></td>
    <td width="8"></td>
    <td><a href="./selectMemberList.do"><img src="../resources/img/top_menu_admin.jpg" width="118" height="26" /></a></td>
    <td width="7"></td>
     <c:if test="${loginVO == null}">
	    <td><a href="../loginUsr.do">로그인</a></td>
    </c:if>
    <c:if test="${loginVO != null}">
	    <td><a href="../actionLogout.do"><img src="../resources/img/top_menu_logout.jpg" width="118" height="26" /></a></td>
    </c:if>
<!--     <td><a href="#"><img src="../resources/img/top_menu_logout.jpg" width="118" height="26" /></a></td> -->
  </tr>
</table>
</td>
  </tr>
  <tr>
    <td height="36"></td>
  </tr>
  <tr>
    <td>
    
    <table width="1236" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="352"></td>
    <td><img src="./resources/img/id_icon.jpg" width="22" height="23" /></td>
    <td width="244">${name}님 환영합니다. </td>
    <td class="txt01" width="269" background="./resources/img/bg01.jpg">전월개인매출 : 100,000,000,000,000</td>
    <td width="11"></td>
    <td class="txt02" width="219" background="./resources/img/bg02.jpg">당월예상배당건 : 100/150</td>
    <td width="119" class="txt03">(진행율 87.1%)</td>
  </tr>
</table>

    </td>
  </tr>
  <tr>
    <td height="34"></td>
  </tr>
</table>

    
    </td>
  </tr>
</table>


</div>
</body>
</html>