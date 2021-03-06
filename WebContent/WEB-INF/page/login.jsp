<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<c:url value="/sources/css/bootstrap.css" /> ">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>
<style type="text/css">
	body{
		margin:0 auto;
		width:50%;
	}
</style>
</head>
<body>

<c:if test="${SPRING_SECURITY_LAST_EXCEPTION != null}">
		<div class="alert alert-danger ">
			<strong>
			<c:choose>
				<c:when test="${fn:indexOf(SPRING_SECURITY_LAST_EXCEPTION.message, 'User is disabled') != -1}">
					<c:out value="Compte d�sactiv�, veuillez contacter l'administrateur"></c:out>
				</c:when>
				<c:when test="${fn:indexOf(SPRING_SECURITY_LAST_EXCEPTION.message, 'Maximum sessions of 1 for this principal exceeded') != -1}">
					<c:out value="Votre compte est actuel connect� !!! "></c:out>
				</c:when>
				<c:otherwise> 
					<c:out value="[Login / mot de passse] incorrect"></c:out>
				</c:otherwise>
			</c:choose></strong><br>
			<i class="fi-alert" style="font-size: 30px"></i>
			<br>			
		</div>
	</c:if>
    <form class="form-signin" role="form" name='f' action="<c:url value="/j_spring_security_check"/>" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="text"
				name="j_username" class="form-control" value="" id="input-login-username" required autofocus placeholder="Login-nom utilisateur">
        <input type="password" class="form-control" required
        name="j_password" id="input-login-pass" placeholder="Mot de passe" >
        <label class="checkbox">
          <input type="checkbox" value="remember-me" name="j_remember_me"> Remember me
        </label>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
      
      

	
</body>
</html>