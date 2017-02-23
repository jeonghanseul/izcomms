<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form"   uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
	<jsp:include page="./head.jsp"/>
	<div>
		<form:form commandName="adManagerVO" method="POST" action="insertAdManagerDo.do"> 
			<form:hidden path="adGroup" value="AdCenterTel"/>
			<table width="100%">
				<colgroup>
					<col />
				</colgroup>
				<tbody>
					<tr>
						<td>
							 회사명
						</td>
						<td>
							 <form:input path="bizName"/>
						</td>
					</tr>
					<tr>
						<td>
							 업종
						</td>
						<td>
							<form:select path="bizType">
								<form:option value="">해당 업종의 전문마케터가 연락드립니다.</form:option>
								<form:option value="음식점">음식점</form:option>
								<form:option value="뷰티샵">뷰티샵</form:option>
								<form:option value="뷰티제품">뷰티제품</form:option>
								<form:option value="식품">식품</form:option>
								<form:option value="생활용품">생활용품</form:option>
								<form:option value="디지털기기">디지털기기</form:option>
								<form:option value="가전제품">가전제품</form:option>
								<form:option value="패션잡화">패션잡화</form:option>
								<form:option value="의류">의류</form:option>
								<form:option value="액세서리">액세서리</form:option>
								<form:option value="유아동용품">유아동용품</form:option>
								<form:option value="도서">도서</form:option>
								<form:option value="앱서비스">앱서비스</form:option>
								<form:option value="숙박">숙박</form:option>
								<form:option value="기타 상품 및 서비스">기타 상품 및 서비스</form:option>
							</form:select>
						</td>
					</tr>
					<tr>
						<td>
							 담당자
						</td>
						<td>
							<form:input path="bizUser"/>
						</td>
					</tr>
					<tr>
						<td>
							 연락처
						</td>
						<td>
							<form:input path="bizTelNo" placeholder=" - 없이 작성해주세요 EX)01012345678"/>
						</td>
					</tr>
					<tr>
						<td>
							지역
						</td>
						<td>
							<form:select path="bizArea">
								<form:option value="">지역을 선택해주세요.</form:option>
								<form:option value="서울특별시">서울특별시</form:option>
								<form:option value="경기도">경기도</form:option>
								<form:option value="경상남도">경상남도</form:option>
								<form:option value="경상북도">경상북도</form:option>
								<form:option value="광주광역시">광주광역시</form:option>
								<form:option value="대구광역시">대구광역시</form:option>
								<form:option value="대전광역시">대전광역시</form:option>
								<form:option value="부산광역시">부산광역시</form:option>
								<form:option value="세종특별자치시">세종특별자치시</form:option>
								<form:option value="울산광역시">울산광역시</form:option>
								<form:option value="인천광역시">인천광역시</form:option>
								<form:option value="전라남도">전라남도</form:option>
								<form:option value="전라북도">전라북도</form:option>
								<form:option value="제주특별자치도">제주특별자치도</form:option>
								<form:option value="충청남도">충청남도</form:option>
								<form:option value="충청북도">충청북도</form:option>
								<form:option value="기타지역">기타지역</form:option>
							</form:select>
						</td>
					</tr>
					<tr>
						<td>
							이메일
						</td>
						<td>
							<form:input path="bizEmail"/>
						</td>
					</tr>
					<tr>
						<td>
							상담내용
						</td>
						<td>
							<form:select path="bizCounsel">
								<form:option value="">상담내용을 선택해주세요.</form:option>
								<form:option value="제품 체험단">제품 체험단</form:option>
								<form:option value="방문 체험단">방문 체험단</form:option>
								<form:option value="기자단">기자단</form:option>
								<form:option value="인스타그램 체험단">인스타그램 체험단</form:option>
								<form:option value="페이스북 체험단">페이스북 체험단</form:option>
								<form:option value="키워드광고">키워드광고</form:option>
								<form:option value="통합마케팅">통합마케팅</form:option>
							</form:select>
						</td>
					</tr>
					<tr>
						<td>
							예상광고예산
						</td>
						<td>
							<form:input path="adExpectMoney"/>
						</td>
					</tr>
					<tr>
						<td>
							현재 진행중인 광고
						</td>
						<td>
							<form:input path="adAding"/>
						</td>
					</tr>
					<tr>
						<td>
							체험단광고시기
						</td>
						<td>
							<form:input path="adExperienceDate"/>
						</td>
					</tr>
					<tr>
						<td>
							상세문의
						</td>
						<td>
							<form:textarea path="bizAsk"/>
						</td>
					</tr>
				</tbody>
			</table>
			<div>
				<input type="submit" value="등록"> 
				<a href="./adManagerList.do">취소</a>
			</div>
		</form:form>
	</div>
	<jsp:include page="./tail.jsp"/>
</body>
</html>