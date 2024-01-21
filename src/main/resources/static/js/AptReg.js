$(document).ready(function(){
      $("#btnRegApt").click(function () {
         var aptNm = $("#aptNm").val();
         var rgnCd = $("#rgnCd").val();
         var rgnDtlCd = $("#rgnDtlCd").val();
         var address = $("#address").val();
         var aptYear = $("#aptYear").val();
         var unitAmt = $("#unitAmt").val();
         var plotRate = $("#plotRate").val();

         var data = {
             "aptNm": aptNm,
             "rgnCd": rgnCd,
             "rgnDtlCd": rgnDtlCd,
             "address": address,
             "aptYear": aptYear,
             "unitAmt": unitAmt,
             "plotRate": plotRate
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
});