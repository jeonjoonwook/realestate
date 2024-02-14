<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>아파트 가격정보 저장</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="/js/AptPrcReg.js"></script>
</head>
<body>
    <h2>아파트 가격정보 저장</h2>

    <div id="regAptPrcForm">
        <label for="aptDtlId">아파트상세Id:</label>
        <input type="text" id="aptDtlId" name="aptDtlId" value = "${aptDtlId}" required><br>

        <label>가격유형:</label>
        <input type="radio" name="prcTypeCd" value="10" checked> 실거래가
        <input type="radio" name="prcTypeCd" value="20" > 호가
        <br>
        <label>거래유형:</label>
        <input type="radio" name="dealTypeCd" value="10" checked> 매매
        <input type="radio" name="dealTypeCd" value="20"> 전세
        <br>
        <label for="price">가격:</label>
        <input type="text" id="price" name="price" required><br>
        <label for="prcDt">일자:</label>
        <input type="text" id="prcDt" name="prcDt" required><br>

        <label for="aptPrcDesc">기타상세:</label>
        <input type="text" id="aptPrcDesc" name="aptPrcDesc" required><br>

        <input type="button" id="btnRegAptPrc" value="저장">
        <input type="button" id="btnMoveRtvAptDtl" onClick="location.href='/apt/dtl'" value="상세조회화면이동">
    </div>
</body>
</html>