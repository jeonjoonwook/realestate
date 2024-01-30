<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>아파트 기본정보 저장</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="/js/AptDtlReg.js"></script>
</head>
<body>
    <h2>아파트 상세정보 저장</h2>

    <div id="regAptDtlForm">
        <label for="aptId">아파트Id:</label>
        <input type="text" id="aptId" name="aptId" value = "${aptId}" required><br>

        <label for="totArea">공급면적:</label>
        <input type="text" id="totArea" name="totArea" required><br>

        <label for="usblArea">전용면적:</label>
        <input type="text" id="usblArea" name="usblArea" required><br>

        <label for="roomAmt">방수:</label>
        <input type="text" id="roomAmt" name="roomAmt" required><br>

        <label for="toiletAmt">화장실수:</label>
        <input type="text" id="toiletAmt" name="toiletAmt" required><br>

        <label for="highSellPrc">매매최고가:</label>
        <input type="text" id="highSellPrc" name="highSellPrc" required><br>

        <label for="highSellDt">매매최고일자:</label>
        <input type="text" id="highSellDt" name="highSellDt" required><br>

        <label for="highRentPrc">전세최고가:</label>
        <input type="text" id="highRentPrc" name="highRentPrc" required><br>

        <label for="highRentDt">전세최고일자:</label>
        <input type="text" id="highRentDt" name="highRentDt" required><br>


        <input type="button" id="btnRegAptDtl" value="저장">
        <input type="button" id="btnMoveRtvApt" onClick="location.href='/apt'" value="조회화면이동">
    </div>
</body>
</html>