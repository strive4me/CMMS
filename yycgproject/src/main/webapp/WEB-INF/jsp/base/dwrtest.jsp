<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>Insert title here</title>
</head>

<script type="text/javascript" src="dwr/engine.js"></script>  
<script type="text/javascript" src="dwr/util.js"></script>  
<script type="text/javascript" src="dwr/interface/DWRTest.js"></script>  
<script type="text/javascript">  
//java方法的javascript函数  
function test1(){  
DWRTest.hello(  helloreturn   );   
}  
//接收返回值的回调函数  
function   helloreturn(value){  
//value接收方法的返回值,可以在这个回调函数里对返回值进行处理-->  
alert(value);  
}  
//或者采用第二种写法，将回调函数放到javascript函数内部  
//function test1(){  
//      DWRTest.hello(  
//          function(data){  
//              alert(data);  
//          }  
//      );  
//  }   
</script>  
  
<body>  
    <input type="button" value="hello" onclick="test1()">  
</body>  