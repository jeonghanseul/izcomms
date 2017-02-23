<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
  function changeDate(){
	  var curMonth = $("#curMonthSelect").val();
	  var curYear = $("#curYearSelect").val();
	  
	  var url = "./scdulList.do?curYear="+curYear+"&curMonth="+curMonth;
	  $(location).attr('href',url);
  }
</script>
</head>
<body>

<div class="mid">
	<!-- 왼쪽 달력 시작 -->
	<div>
		<select id="curMonthSelect" onchange="changeDate();">
			<option value="">월</option>
			<c:forEach var="i" begin="1" end="12" step="1">
				<option value="${i}" <c:if test="${scdulVO.curMonth == i}">selected="selected"</c:if>><c:out value="${i}"/></option>
			</c:forEach>
		</select>
		월
		<select id="curYearSelect" onchange="changeDate();">
			<option value="">년도</option>
			<c:forEach var="i" begin="2015" end="2200" step="1">
				<option value="${i}" <c:if test="${scdulVO.curYear == i}">selected="selected"</c:if>><c:out value="${i}"/></option>
			</c:forEach>
		</select>
		년
	</div>
	<div style="margin:0 auto"  align="right">
		
		<form name="theForm">
		<%-- base table --%>
			<table cellpadding="0" cellspacing="0" border="0" bgcolor="#ffffff" width="300" height="240" class="right_calendar"  style="padding-left:17px" >
			    <tr height="3">
			        <td colspan="2"></td>
			    </tr>
			    <tr>
		          <td align="left" valign="top">
			          <%-- body table --%>
				          <table border="0" cellspacing="0" cellpadding="0">
			          		<tr>
			          			<td valign="top"  align="left">
				                  <%-- month outline table --%>
				                    <table border="0" cellspacing="0" cellpadding="0">
				                    <tr height="40">
				                          <td align=left>
				                              <font color=red>Su</font>
				                          </td>
				                        <td align=left width="300">Mo</td>
				                        <td align=left>Th</td>
				                        <td align=left>We</td>
				                        <td align=left>Th</td>
				                        <td align=left>Fr</td>
				                        <td align=left>Sa</td>
				                    </tr>
				                    <tr>
				                    	<td colspan=7 bgcolor=#888888 height=1></td>
				                    </tr>
				                    <tr>
				                    	<td colspan=7 bgcolor=#ffffff height=5></td>
				                    </tr>
				                    <tr>
			                          <td colspan=7>
				                          <%-- month content table --%>
				                          <table border='0' cellspacing='1' cellpadding='0' bgcolor=#ededed class="right_calendar_content">
				                              <tr>
				                                <c:if test="${firstDayOfWeek != '1'}">
				                                  <%-- 해당 월의 가장 첫째줄에 있는 공백부분을 셈해서 처리한다.--%>
				                                  <c:forEach var="i" begin="1" end="${firstDayOfWeek-1}">
				                                    	<td width="20" height="20" class="uline" valign="top" align="right" style="padding:5">
				                                    	</td>
				                                	</c:forEach>
				                                </c:if>
				                                <%-- 이 달의 끝날까지 메모의 제목과 날짜(숫자)를 출력한다 --%>
				                                <c:set var="dbIndex" value="0"/>
				                                  <c:forEach var="currentDay" begin="01" end="${lastDayOfMonth}">                                    
				                                  	<td bgcolor="#ffffff" style="padding:5">
				                                        <table cellpadding="0" cellsping="0" border="0" width="20">
					                                        <tr>
					                                            <td height="10" width="20" class="uline" valign="top" align="left">
					                                                <!-- 일요일 -->
					                                                <c:choose>
					                                                    <c:when test="${((currentDay-(8-firstDayOfWeek)) % 7) == 1}">
					                                                        <!-- 일요일 -->
					                                                        <font color="red">                                                    
					                                                            <c:out value="${currentDay}"/>
					                                                        </font>
					                                                    </c:when>
					                                                    <c:otherwise>
					                                                        <c:out value="${currentDay}"/>
					                                                    </c:otherwise>
					                                                </c:choose>
					                                            </td>
					                                        </tr>
					                                        <tr>
					                                            <td height="10" width="5" valign="top">
					                                            <!-- month_query : DB 조회하는 list -->
				                                            	</td>
					                                        </tr>
				                                        </table>        
				                                    </td>
				                                    <%-- 만약 한주의 마지막날(토요일)이고 이 달의 마지막 날이 아니라면 다음 줄로 넘어간다. --%>
				                                    <c:if test="${((currentDay-(8-firstDayOfWeek)) % 7) == 0}">
		                                       	 </tr>
		                                         <tr>
			                                    	</c:if>
				                                  </c:forEach>
				                                <%-- 해당 월의 가장 마지막 줄에 있는 공백부분을 셈해서 처리한다.--%>
				                                <c:if test="${lastDayOfLastWeek != '7'}">
					                                <c:forEach var="i" begin="1" end="${7-lastDayOfLastWeek}">
					                                    <td width="5" height="10" class=uline valign=top align=right style='padding:5'>
					                                    </td>
					                                </c:forEach>
				                                </c:if>                            
				                            </tr>
				                        </table>
				                        <%-- end month content table --%>
			                        	</td>
				                    </tr>
				                  </table>
				                  <%-- end month outline table --%>
			                  </td>
			          		</tr>
				          </table>
			        <%-- end body table --%>
			        </td>
			    </tr>
		        <tr height=10>
		        	<td></td>
		      	</tr>
			    <tr>
			        <td align=right></td>
			    </tr>
			</table>
		<%-- end base table --%>
		</form>
	</div>
  </div>
</body>
</html>