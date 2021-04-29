<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Nomina</title>
</head>
<body>
<h1>Calcular Nomina
</h1>

<form action="Servlet" method="Post">

    <br><label>
    Nombre:
    <input type="text" name="nombres" autofocus pattern="[A-Za-z]{2,30}" placeholder="Ingrese sus nombres"><br>
</label><br>

    <br><label>
    Apellidos>
    <input type="text" name="apellido"  pattern="[A-Za-z]{2,30}" placeholder="Ingrese sus Apellidos"><br>
</label><br>

    <br><label>
    documento
    <input type="number"  name="quantity"  placeholder="Ingrese su documento"><br>
</label><br>

    <br><label>
    Dias trabajados<br>
    <br><input type="number"  name="dias"   placeholder=" Ingrese Dias trabajados"><br>
</label>

    <br><label>
    Sueldo Mensual
    <input type="number"  name="sm"  placeholder="Ingrese Sueldo mensual"><br>
</label><br>

    <br><input type="submit"  value="Enviar"><br>


</form>
</body>
</html>
