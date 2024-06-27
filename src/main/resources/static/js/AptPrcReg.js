$(document).ready(function(){
    $("#btnRegAptPrc").click(function () {
         var aptDtlId = $("#aptDtlId").val();
         var prcTypeCd = $('input[name="prcTypeCd"]:checked').val();
         var dealTypeCd = $('input[name="dealTypeCd"]:checked').val();
         var floor = $("#floor").val();
         var price = $("#price").val();
         var prcDt = $("#prcDt").val();
         var aptPrcDesc = $("#aptPrcDesc").val();


         var data = {
             "aptDtlId": aptDtlId,
             "prcTypeCd": prcTypeCd,
             "dealTypeCd": dealTypeCd,
             "floor": floor,
             "price": price,
             "prcDt": prcDt,
             "aptPrcDesc": aptPrcDesc
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