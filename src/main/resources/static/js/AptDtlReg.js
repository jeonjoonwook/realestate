$(document).ready(function(){
    $("#btnRegAptDtl").click(function () {
         var aptId = $("#aptId").val();
         var totArea = $("#totArea").val();
         var usblArea = $("#usblArea").val();
         var roomAmt = $("#roomAmt").val();
         var toiletAmt = $("#toiletAmt").val();
         var highSellPrc = $("#highSellPrc").val();
         var lowSellPrc = $("#lowSellPrc").val();
         var highRentPrc = $("#highRentPrc").val();
         var lowRentPrc = $("#lowRentPrc").val();
         var aptDtlDesc = $("#aptDtlDesc").val();

         var data = {
             "aptId": aptId,
             "totArea": totArea,
             "usblArea": usblArea,
             "roomAmt": roomAmt,
             "toiletAmt": toiletAmt,
             "highSellPrc": highSellPrc,
             "lowSellPrc": lowSellPrc,
             "highRentPrc": highRentPrc,
             "lowRentPrc": lowRentPrc,
             "aptDtlDesc": aptDtlDesc
         };

         $.ajax({
             type: "POST",
             url: "/save/apt/dtl",
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