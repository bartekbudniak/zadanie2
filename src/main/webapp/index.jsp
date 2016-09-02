<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Logowanie</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">

	<h2>Formularz logowania</h2>
        <form class="form-horizontal" role="form" method="get" action="LoginApplicantServlet">
            <div class="form-group">
              <label class="col-sm-4 control-label" for="usr">Username</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" id="usr" placeholder="" name="username" required>
                </div>
            </div>
            <div class="form-group">
              <label class="col-sm-4 control-label" for="usr">Password</label>
                <div class="col-sm-8">
                    <input type="password" class="form-control" id="usr" placeholder="" name="password" required>
                </div>
            </div>
            <div class="form-group">        
              <div class="col-sm-offset-4 col-sm-8">
                <input type="submit" class="btn btn-success" name="wyslij" value="Zatwierdź i wyślij"><br>
              </div>
            </div>
        </form>
    
   </div> 
    	     

    
    
<script>
$(document).ready(function(){
    $('[data-toggle="tooltip"]').tooltip();   
});
</script>
</body>