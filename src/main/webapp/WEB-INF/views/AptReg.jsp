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
    <script type="text/javascript" src="/js/AptReg.js"></script>
</head>
<body>
    <h2>아파트 기본정보 저장</h2>

    <div id="regAptForm">
        <label for="aptNm">아파트명:</label>
        <input type="text" id="aptNm" name="aptNm" required><br>

        <label for="rgnCd">지역코드:</label>
        <input type="text" id="rgnCd" name="rgnCd" required><br>

        <label for="rgnDtlCd">지역상세코드:</label>
        <input type="text" id="rgnDtlCd" name="rgnDtlCd" required><br>

        <label for="address">주소:</label>
        <input type="text" id="address" name="address" required><br>

        <label for="aptYear">연식:</label>
        <input type="number" id="aptYear" name="aptYear" required><br>

        <label for="unitAmt">세대수:</label>
        <input type="text" id="unitAmt" name="unitAmt" required><br>

        <label for="plotRate">용적률:</label>
        <input type="text" id="plotRate" name="plotRate" required><br>

        <input type="button" id="btnRegApt" value="저장">
    </div>
</body>
</html>