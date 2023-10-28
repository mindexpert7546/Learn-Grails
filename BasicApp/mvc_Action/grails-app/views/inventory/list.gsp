<%-- <!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Basic HTML Page</title>
</head>
<body>
    <header>
        <h1>Welcome to basic mvc application</h1>
    </header>

    ${allProducts}
    ${allProducts.name} ${allProducts.sku} ${allProducts.price}

    <table border="1">
       <g:each in="${allProducts}" var="thisProduct">
          <tr>
            <td>${thisProduct.name}</td>
            <td>${thisProduct.sku}</td>
            <td>${thisProduct.price}</td>
          </tr>
       </g.each>
    </table>
</body>
</html> --%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>My Basic HTML Page</title>
</head>
<body>
    <header>
        <h1>Welcome to basic mvc application</h1>
    </header>

    <table border="1">
       <g:each in="${allProducts}" var="thisProduct">
          <tr>
            <td>${thisProduct.name}</td>
            <td>${thisProduct.sku}</td>
            <td>${thisProduct.price}</td>
          </tr>
       </g:each>
    </table>
</body>
</html>
