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
        <th>아파트명</th>
        <th>연식</th>
        <th>세대수</th>
        <th>공급면적</th>
        <th>전용면적</th>
        <th>매매최고가</th>
        <th>전세최고가</th>
        <th>저층탑층여부</th>
        <th>현매매가</th>
        <th>평당가</th>
        <th>현전세가</th>
        <th>전세가율</th>
        <c:forEach var="apartment" items="${apartments}" varStatus="status">
            <tr>
                <td>${apartment.name}</td>
                <td>${apartment.age}</td>
                <td>${apartment.numRooms}</td>
                <td>${apartment.supplySize}</td>
                <td>${apartment.realSize}</td>
                <td>${apartment.highestMarketPrice}</td>
                <td>${apartment.highestRentPrice}</td>
                <td>${apartment.topLowFloorYn}</td>
                <td>${apartment.nowMarketPrice}</td>
                <td>${apartment.pricePerSize}</td>
                <td>${apartment.nowRentPrice}</td>
                <td>${apartment.marketPerRent}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

<script>
    $(document).ready(function(){

    });
</script>