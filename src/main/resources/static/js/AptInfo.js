$(document).ready(function(){

    $("#btnRtvApt").click(function () {
         var rgnCd = $("#rgnCd").val();
         var rgnDtlCd = $("#rgnDtlCd").val();

         var data = {
            "rgnCd" : rgnCd,
            "rgnDtlCd" : rgnDtlCd
         };

         $.ajax({
             type: "POST",
             url: "/info/apt",
             contentType: "application/json",
             data: JSON.stringify(data),
             dataType : "json",
             success: function (response) {

                 // 성공 시 처리
                 $('#tbApt tbody').empty();

                 // Loop through the retrieved data and append rows to the table
                 for (var i = 0; i < response.length; i++) {
                     var apartment = response[i];
                     var row = '<tr>' +
                         '<td class="aptIdCell" onclick="rtvAtpDtl(this)">' + apartment.aptId + '</td>' +
                         '<td>' + apartment.aptNm + '</td>' +
                         '<td>' + apartment.rgnCd + '</td>' +
                         '<td>' + apartment.rgnDtlCd + '</td>' +
                         '<td>' + apartment.address + '</td>' +
                         '<td>' + apartment.aptYear + '</td>' +
                         '<td>' + apartment.unitAmt + '</td>' +
                         '<td>' + apartment.plotRate + '</td>' +
                         '<td><a href="/reg/apt/dtl?aptId=' + apartment.aptId + '">아파트상세저장</a></td>' +
                         '</tr>';

                     $('#tbApt tbody').append(row);
                 }
             },
             error: function (error) {
                alert("조회에 실패했습니다.");
             }
         });
     });

     $('#rgnCd').change(function() {
                 // 선택된 지역코드 값을 가져옴
         var rgnCd = $(this).val();

         // AJAX를 사용하여 서버에 선택된 지역코드에 대한 상세 정보를 요청
         $.ajax({
             type: 'GET',
             url: '/region/detail',  // 실제로 사용할 서버의 엔드포인트
             data: {rgnCd: rgnCd},
             success: function(data) {
                 // 서버에서 받은 데이터를 사용하여 지역코드상세 select 박스를 업데이트
                var rgnDtlCdSel = $('#rgnDtlCd');

                // 기존 옵션 제거
                rgnDtlCdSel.empty();
                rgnDtlCdSel.append('<option value="">전체</option>');
                // 새로운 옵션 추가
                $.each(data, function(index, item) {
                    rgnDtlCdSel.append('<option value="' + item.rgnDtlCd + '">' + item.rgnDtlNm + '</option>');
                });
             },
             error: function() {
                 console.error('지역코드상세 조회에 실패했습니다.');
             }
         });
     });
});

function rtvAtpDtl(element){
     console.log('아파트 ID 클릭됨: ' + element.textContent);
     // 아파트 ID 가져오기
     var aptId = element.textContent;

     var data = {
        "aptId" : aptId
     };

     $.ajax({
         type: "POST",
         url: "/info/apt/dtl",
         contentType: "application/json",
         data: JSON.stringify(data),
         dataType : "json",
         success: function (response) {

             // 성공 시 처리
             $('#tbAptDtl tbody').empty();

             // Loop through the retrieved data and append rows to the table
             for (var i = 0; i < response.length; i++) {
                 var apartment = response[i];
                 var row = '<tr>' +
                     '<td>' + apartment.aptId + '</td>' +
                     '<td>' + apartment.aptDtlId + '</td>' +
                     '<td>' + apartment.aptNm + '</td>' +
                     '<td>' + apartment.rgnDtlCd + '</td>' +
                     '<td>' + apartment.address + '</td>' +
                     '<td>' + apartment.aptYear + '</td>' +
                     '<td>' + apartment.unitAmt + '</td>' +
                     '<td>' + apartment.plotRate + '</td>' +
                     '<td>' + apartment.totArea + '/'+apartment.usblArea+'</td>' +
                     '<td>' + apartment.roomAmt + '/'+apartment.toiletAmt+'</td>' +
                     '<td>' + apartment.highSellPrc + '('+apartment.lowSellPrc+')</td>' +
                     '<td>' + apartment.highRentPrc + '('+apartment.lowRentPrc+')</td>' +
                     '</tr>';

                 $('#tbAptDtl tbody').append(row);
             }
         },
         error: function (error) {
            alert("조회에 실패했습니다.");
         }
     });
}