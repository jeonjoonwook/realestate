<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HelloWorld!</title>
</head>
<body>
    <table border="1">
        <th>아파트ID</th>
        <th>이력시작일시</th>
        <th>이력종료일시</th>
        <th>아파트명</th>
        <th>지역코드</th>
        <th>지역상세코드</th>
        <th>주소</th>
        <th>연식</th>
        <th>세대수</th>
        <th>용적률</th>
        <th>등록일시</th>
        <th>등록자</th>
        <th>수정일시</th>
        <th>수정자</th>
        <c:forEach var="apartment" items="${apartments}" varStatus="status">
            <tr>
                <td>${apartment.aptId}</td>
                <td>${apartment.histStrtDts}</td>
                <td>${apartment.histEndDts}</td>
                <td>${apartment.aptNm}</td>
                <td>${apartment.rgnCd}</td>
                <td>${apartment.rgnDtlCd}</td>
                <td>${apartment.address}</td>
                <td>${apartment.aptYear}</td>
                <td>${apartment.unitAmt}</td>
                <td>${apartment.plotRate}</td>
                <td>${apartment.regDts}</td>
                <td>${apartment.regpeId}</td>
                <td>${apartment.modDts}</td>
                <td>${apartment.modpeId}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

<script>
    $(document).ready(function(){

    });
</script>