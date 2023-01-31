
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%    
    //現在日時を取得するコード
    java.util.Date now = new java.util.Date();
    System.out.println(now.toString());
%>
//テスト入力
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">
<title>現在の日時</title>
</head>
<body>
<p>現在の日時は(<%= now %>>)です。</p>>
</body>
</html>