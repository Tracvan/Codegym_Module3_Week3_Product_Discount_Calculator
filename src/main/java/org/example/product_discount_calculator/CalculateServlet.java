package org.example.product_discount_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;

@WebServlet(name="CalculateServlet", urlPatterns ="/calculate")
public class CalculateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Double amount = Double.parseDouble(req.getParameter("price") );
        Double percent = Double.parseDouble(req.getParameter("percent") );
        Double discountAmount = amount * percent *0.01;
        Double discountPrice = amount- discountAmount;

        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        String formattedAmount = decimalFormat.format(discountAmount);

        String formattedPrice = decimalFormat.format(discountPrice);

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h3>Discount Amount: " + formattedAmount);
        writer.println("<h3>Discount price: " + formattedPrice);
        writer.println("</html>");
    }
}
