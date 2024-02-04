$(document).ready(function(){
    $("#btnRegAptPrc").click(function () {
         var aptDtlId = $("#aptDtlId").val();
         var rcntSellPrc = $("#rcntSellPrc").val();
         var rcntSellDt = $("#rcntSellDt").val();
         var rcntRentPrc = $("#rcntRentPrc").val();
         var rcntRentDt = $("#rcntRentDt").val();
         var nvrSellPrc = $("#nvrSellPrc").val();
         var nvrSellDt = $("#nvrSellDt").val();
         var nvrRentPrc = $("#nvrRentPrc").val();
         var nvrRentDt = $("#nvrRentDt").val();

         var data = {
             "aptDtlId": aptDtlId,
             "rcntSellPrc": rcntSellPrc,
             "rcntSellDt": rcntSellDt,
             "rcntRentPrc": rcntRentPrc,
             "rcntRentDt": rcntRentDt,
             "nvrSellPrc": nvrSellPrc,
             "nvrSellDt": nvrSellDt,
             "nvrRentPrc": nvrRentPrc,
             "nvrRentDt": nvrRentDt
         };

         $.ajax({
             type: "POST",
             url: "/save/apt/prc",
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