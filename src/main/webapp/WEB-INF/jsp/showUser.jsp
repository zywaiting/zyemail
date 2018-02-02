<%--
  Created by IntelliJ IDEA.
  User: Zhangxq
  Date: 2016/7/16
  Time: 0:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>

<script language="JavaScript">
    function myrefresh()
    {
        window.location.reload();
    }
    setTimeout("myrefresh()",5000); //指定5秒刷新一次

    window.onload=function(){
        var tab = document.getElementById("subtable");
        var maxCol = 1, val, count, start;
        var ys="";
        for(var col = maxCol-1; col >= 0 ; col--) {
            count = 1;
            val = "";
            for(var i=0; i<tab.rows.length; i++){
                if(val == tab.rows[i].cells[col].innerHTML){
                    count++;
                }else{
                    if(count > 1){
                        //合并
                        start = i - count;
                        if(ys=="#00FFFF"){
                            ys="#EEEE00";
                        }else{
                            ys="#00FFFF";
                        }
                        tab.rows[start].cells[col].rowSpan = count;
                        tab.rows[start].cells[1].style.backgroundColor=ys;//改变颜色
                        // ys="#EEEE00";
                        // tab.rows[i].cells[1].style.backgroundColor="#00FFFF";//改变颜色绿色
                        for(var j=start+1; j<i; j++){ //
                            tab.rows[j].cells[col].style.display = "none";
                            tab.rows[j].removeChild(tab.rows[j].cells[col]);
                        }
                        count = 1;
                    }
                    val = tab.rows[i].cells[col].innerHTML;
                }
            }

            if(count > 1 ){ //合并，最后几行相同的情况下
                start = i - count;
                tab.rows[start].cells[col].rowSpan = count;
                for(var j=start+1; j<i; j++) {
                    tab.rows[j].removeChild(tab.rows[j].cells[col]);
                }
            }
        }
    }

</script>
<head>
    <title>用户信息列表</title>
</head>
<body>
    <c:if test="${!empty userList}">
        <TABLE border="1">
                <TR>
                    <th>通道</th>
                    <th>银行</th>
                    <th>发送量</th>
                    <th>成功量</th>
                    <th>实际成功</th>
                    <th>失败</th>
                    <th>未知</th>
                    <th>pv</th>
                    <th>uv</th>
                    <th>ip</th>
                </TR>
                <TR>111</TR>
                <TR>222</TR>
                <TR>222</TR>
        </TABLE>
        <c:forEach var="user" items="${userList}">
            姓名：${user.userName} &nbsp;&nbsp;手机号：${user.userPhone} &nbsp;&nbsp;邮箱：${user.userEmail} &nbsp;&nbsp;<br>
        </c:forEach>
    </c:if>
</body>

<body>
    <c:if test="${!empty itemList}">
        <TABLE border="1" align="center" cellspacing="0" id="subtable">
            <TR>
                <th>通道</th>
                <th>银行</th>
                <th>发送量</th>
                <th>成功量</th>
                <th>实际成功</th>
                <th>失败</th>
                <th>未知</th>
                <th>pv</th>
                <th>uv</th>
                <th>ip</th>
            </TR>
            <c:forEach var="item" items="${itemList}">
                <tr>
                    <td>${item.label}</td>
                    <td>${item.bank}</td>
                    <td>${item.send}</td>
                    <td>${item.success}</td>
                    <td>${item.truesuccess}</td>
                    <td>${item.fail}</td>
                    <td>${item.unknow}</td>
                    <td>${item.uv}</td>
                    <td>${item.pv}</td>
                    <td>${item.ip}</td>
                </tr>
            </c:forEach>
        </TABLE>

    </c:if>
</body>

</html>
