<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Product Discount Calculator</title>
</head>
<body>
<h1><%= "Product Discount Calculator" %></h1>
<form action="calculate" method="post">
<p>Product Description:</p>
<input type="text" name="description" value="" placeholder="Product description">
<p>List Price</p>
<input type="text" name="price" value="" placeholder="List Price">
<p>Discount percent</p>
<input type="text" name="percent" value="" placeholder="Discount percent">
  <input type="submit" name="submit" value="submit">
</form>
</body>
</html>