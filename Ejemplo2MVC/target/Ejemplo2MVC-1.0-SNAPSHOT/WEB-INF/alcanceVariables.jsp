
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance de Variables</title>
    </head>
    <body>
        <h1>Alcance de Variables</h1>
        <br/>
        <h1>Variable request:</h1>
        <h2>Base: ${rectanguloRequest.base}</h2>
        <h2>Altura: ${rectanguloRequest.altura}</h2>
        <h2>Area: ${rectanguloRequest.area}</h2>
        <br/><br/>
        <h1>Variable sesion:</h1>
        <h2>Base: ${rectanguloSesion.base}</h2>
        <h2>Altura: ${rectanguloSesion.altura}</h2>
        <h2>Area: ${rectanguloSesion.area}</h2>
        <br/><br/>
        <h1>Variable aplicacion:</h1>
        <h2>Base: ${rectanguloAplicacion.base}</h2>
        <h2>Altura: ${rectanguloAplicacion.altura}</h2>
        <h2>Area: ${rectanguloAplicacion.area}</h2>
        <br/><br/>
        <a href="${pageContext.request.contextPath}/>index.jsp"> Regresar al inicio</a>
    </body>
</html>
