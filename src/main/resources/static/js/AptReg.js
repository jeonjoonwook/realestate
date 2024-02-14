$(document).ready(function(){
      $("#btnRegApt").click(function () {
         var aptNm = $("#aptNm").val();
         var rgnCd = $("#rgnCd").val();
         var rgnDtlCd = $("#rgnDtlCd").val();
         var address = $("#address").val();
         var aptYear = $("#aptYear").val();
         var unitAmt = $("#unitAmt").val();
         var plotRate = $("#plotRate").val();
         var aptDesc = $("#aptDesc").val();

         var data = {
             "aptNm": aptNm,
             "rgnCd": rgnCd,
             "rgnDtlCd": rgnDtlCd,
             "address": address,
             "aptYear": aptYear,
             "unitAmt": unitAmt,
             "plotRate": plotRate,
             "aptDesc": aptDesc
         };

         $.ajax({
             type: "POST",
             url: "/save/apt",
             contentType: "application/json",
             data: JSON.stringify(data),
             dataType : "json",
             success: function (response) {
                 // 성공 시 처리
                 if(response.status=="success"){
                    alert("등록되었습니다.");
                 }
             },
             error: function (error) {
                if(response.status=="error"){
                    alert("등록에 실패했습니다.");
                }
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
                rgnDtlCdSel.append('<option value="">==선택==</option>');
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