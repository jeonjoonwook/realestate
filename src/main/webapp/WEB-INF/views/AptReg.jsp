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
</head>
<body>
    <h2>아파트 기본정보 저장</h2>
    <form action="/save/apt" method="post">
        <label for="aptNm">Apartment Name:</label>
        <input type="text" id="aptNm" name="aptNm" required><br>

        <label for="rgnCd">Region Code:</label>
        <input type="text" id="rgnCd" name="rgnCd" required><br>

        <label for="rgnDtlCd">Region Detail Code:</label>
        <input type="text" id="rgnDtlCd" name="rgnDtlCd" required><br>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required><br>

        <label for="aptYear">Year of Construction:</label>
        <input type="number" id="aptYear" name="aptYear" required><br>

        <label for="unitAmt">Unit Amount:</label>
        <input type="text" id="unitAmt" name="unitAmt" required><br>

        <label for="plotRate">Plot Rate:</label>
        <input type="text" id="plotRate" name="plotRate" required><br>

        <input type="submit" value="Save">
    </form>
</body>
</html>