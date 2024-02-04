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

        <label for="rcntSellPrc">최근매매실거래가:</label>
        <input type="text" id="rcntSellPrc" name="rcntSellPrc" required><br>

        <label for="rcntSellDt">최근매매일자:</label>
        <input type="text" id="rcntSellDt" name="rcntSellDt" required><br>

        <label for="rcntRentPrc">최근전세실거래가:</label>
        <input type="text" id="rcntRentPrc" name="rcntRentPrc" required><br>

        <label for="rcntRentDt">최근전세일자:</label>
        <input type="text" id="rcntRentDt" name="rcntRentDt" required><br>

        <label for="nvrSellPrc">네이버매매가:</label>
        <input type="text" id="nvrSellPrc" name="nvrSellPrc" required><br>

        <label for="nvrSellDt">네이버매매일자:</label>
        <input type="text" id="nvrSellDt" name="nvrSellDt" required><br>

        <label for="nvrRentPrc">네이버전세가:</label>
        <input type="text" id="nvrRentPrc" name="nvrRentPrc" required><br>

        <label for="nvrRentDt">네이버전세일자:</label>
        <input type="text" id="nvrRentDt" name="nvrRentDt" required><br>

        <input type="button" id="btnRegAptPrc" value="저장">
        <input type="button" id="btnMoveRtvAptDtl" onClick="location.href='/apt/dtl'" value="상세조회화면이동">
    </div>
</body>
</html>