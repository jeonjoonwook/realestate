<%@ page import="java.util.Calendar" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>아파트 기본정보 조회</title>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="/js/AptInfo.js"></script>
    <style>
        td.aptIdCell {
          cursor: pointer;
          text-decoration: underline;
          color: red; /* Optional: Change link color */
        }

        #aptDtlDiv {
            margin-top: 200px;
        }
    </style>
</head>
<body>
    <h2>아파트 기본정보 조회</h2>
    <div>
        <label for="rgnCd">지역코드:</label>
        <select id="rgnCd">
            <c:forEach var="region" items="${regions}">
                <option value="${region.rgnCd}">${region.rgnNm}</option>
            </c:forEach>
        </select>
        <select id="rgnDtlCd"></select>
        <input type="button" id="btnRtvApt" value="조회">
        <input type="button" id="btnMoveRegApt" onClick="location.href='/reg/apt'" value="저장화면이동">
        <input type="button" id="btnMoveAtlDtl" onClick="location.href='/apt/dtl'" value="아파트상세화면이동">
        <table border="1" id = "tbApt">
            <thead>
                <th>아파트ID</th>
                <th>아파트명</th>
                <th>지역코드</th>
                <th>지역상세코드</th>
                <th>주소</th>
                <th>연식</th>
                <th>세대수</th>
                <th>용적률</th>
                <th>저장</th>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>
    <div id = "aptDtlDiv">
        <table border="1" id = "tbAptDtl">
            <thead>
                <th>아파트ID</th>
                <th>아파트상세ID</th>
                <th>아파트명</th>
                <th>지역명</th>
                <th>주소</th>
                <th>연식</th>
                <th>세대수</th>
                <th>용적률</th>
                <th>공급면적/전용면적</th>
                <th>방수/화장실수</th>
                <th>매매최고가</th>
                <th>전세최고가</th>
            </thead>
            <tbody>
            </tbody>
        </table>
    </div>
</body>
</html>

