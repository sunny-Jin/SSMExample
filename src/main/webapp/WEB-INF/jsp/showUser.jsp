<%--
  Created by IntelliJ IDEA.
  User: jzy
  Date: 2017/5/19
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" href="../css/bootstrap.min.css">
<html>
<head>
  <title>用户信息列表</title>
</head>
<body>
<script type="text/javascript" src="../js/jquery.min.js"></script>
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<button id="btn" type="button"></button>
<table id="dataTable" class="table table-striped table-condensed">
  <thead>
  <tr>
    <th>id</th>
    <th>name</th>
  </tr>
  </thead>
  <tbody>

  </tbody>
</table>


<script type="text/javascript">
  $('#btn').click(function () {
            alert("aaaaa");
            $.ajax({
              type: "post",
              url: "../user/get",
              contentType: "application/json; charset=utf-8",
              dataType: "json",
              success: function (resp) {
                alert("是否执行了该函数");
                showRespData(resp);
              },
              error: function (err) {

              }
            });
          });

   /* $.post('../user/get',data,
            function(resp){
              alert("是否执行了该函数");
              showRespData(resp);
            });
  }*/

  function showRespData(resp)
  {
    alert("执行resp函数");
    if(resp)
    {
      var tbody=$('#dataTable>tbody').html('');
      var users=resp.users;
      for(var i=0;i<users.length;i++)
      {
        alert("输出数据");
        var user=users[i];
        var tr='<tr>';
        tr=tr+'<td>'+user.id;
        tr=tr+'<td>'+user.userName;
        tr=tr+'</tr>';
        tbody.append(tr);
      }
    }
  }
   /* $(function(){
      alert("是否执行function函数");
      $.post('user/get',
              function(resp){
                alert("是否执行了该函数");
                showRespData(resp);
      })
    });

    function showRespData(resp)
    {
      alert("执行resp函数");
      if(resp)
      {
        var tbody=$('#dataTable>tbody').html('');
        var users=resp.users;
        for(var i=0;i<users.length;i++)
        {
          alert("输出数据");
          var user=users[i];
          var tr='<tr>';
          tr=tr+'<td>'+user.id;
          tr=tr+'<td>'+user.userName;
          tr=tr+'</tr>';
          tbody.append(tr);
        }
      }
    }*/
</script>
</body>
</html>