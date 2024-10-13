<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@ page import = "java.util.*"%>

 <>
<!DOCTYPE html>
<html>
    <head>
        <title>Addition Quiz</title>
    </head>
    <body>
        <%
            int a, b, answer, correctAnswer;

            Random rand = new Random();
             a = rand.nextInt(1000); 
             b = rand.nextInt(1000);

             %>

             <input>
             <%= a %> + <%= b %> =
             <input type="number" value="answer" name="answer"><br><br>
             <input type="submit" value="Submit">
        

             <%

                 request.getParameter("answer");

                 correctAnswer = a + b;

                 if (answer==(correctAnswer);) {

                     out.print("Correct");

                 } else if (answer!=(correctAnswer)) {

                     out.print("Incorrect");
                 }
%>

    </body>
</html>