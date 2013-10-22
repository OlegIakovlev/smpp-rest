<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE HTML>
<html>
  <head>
    <title>Spring MVC - SMS</title>
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <style>
    	body { background-color: #eee; font: helvetica; }
    	#container { width: 500px; background-color: #fff; margin: 30px auto; padding: 30px; border-radius: 5px; box-shadow: 5px; }
    	.green { font-weight: bold; color: green; }
    	.message { margin-bottom: 10px; }
    	label { width:140px; display:inline-block;}
    	.hide { display: none; }
    	.error { color: red; font-size: 0.8em; }
    </style>
  </head>
  <body>

	<div id="container">

		<h1>SMS Page</h1>
		<p>This page uses Spring MVC to send SMS text message.
           It issues POST call using AJAX to transfer JSON object to the server.
		</p>

		<h2>Submit new SMS message</h2>
		<form id="newSmsForm">
            <label for="sender">Sender number: </label>
            <input type="text" name="sender" id="sender" />
            <br/>

            <label for="recipients">Receiver numbers: </label>
            <input type="text" name="recipients" id="recipients" />
            <br/>

            <label for="msg">Message text: </label>
			<input type="text" name="msg" id="msg" />
			<br/>

			<input type="submit" value="Send SMS" /><br/><br/>
			<div id="smsFormResponse" class="green"> </div>
		</form>
	</div>


	<script type="text/javascript">

		$(document).ready(function() {

			$('#newSmsForm').submit(function(e) {
				// will pass the form date using the jQuery serialize function
				$.post('${pageContext.request.contextPath}/smpp/api/sendSMS', $(this).serialize(), function(response) {
					$('#smsFormResponse').text(response);
				});

				e.preventDefault(); // prevent actual form submit and page reload
			});

		});

	</script>

  </body>
</html>