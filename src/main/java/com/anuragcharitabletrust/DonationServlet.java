package com.anuragcharitabletrust;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DonationServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private int amount=5000;
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <title>Anurag Charitable Trust</title>\r\n"
				+ "    <style>\r\n"
				+ "        /* Global styles */\r\n"
				+ "        body {\r\n"
				+ "            margin: 0;\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            font-size: 16px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Header styles */\r\n"
				+ "        header {\r\n"
				+ "            background-color: #ffa318;\r\n"
				+ "            color: #FFFFFF;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "            align-items: center;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        #logo {\r\n"
				+ "            font-size: 24px;\r\n"
				+ "            font-weight: bold;\r\n"
				+ "            color: inherit;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        #menu {\r\n"
				+ "            display: flex;\r\n"
				+ "            gap: 20px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        #menu a {\r\n"
				+ "            color: #FFFFFF;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        #menu a:hover {\r\n"
				+ "            background-color: #FFFFFF;\r\n"
				+ "            color: #0047AB;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Main styles */\r\n"
				+ "        main {\r\n"
				+ "            padding: 20px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        h1 {\r\n"
				+ "            font-size: 36px;\r\n"
				+ "            margin-top: 0;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        p {\r\n"
				+ "            line-height: 1.5;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .causes {\r\n"
				+ "            display: flex;\r\n"
				+ "            gap: 20px;\r\n"
				+ "            margin-top: 20px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .cause {\r\n"
				+ "            flex: 1;\r\n"
				+ "            background-color: #F2F2F2;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .cause h2 {\r\n"
				+ "            font-size: 24px;\r\n"
				+ "            margin-top: 0;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .cause p {\r\n"
				+ "            margin-top: 10px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Counter styles */\r\n"
				+ "        footer {\r\n"
				+ "            background-color: #0047AB;\r\n"
				+ "            color: #FFFFFF;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            text-align: center;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Donate styles*/\r\n"
				+ "        .donate-section {\r\n"
				+ "          background-color: #f8f8f8;\r\n"
				+ "          padding: 50px;\r\n"
				+ "          text-align: center;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section h2 {\r\n"
				+ "          font-size: 36px;\r\n"
				+ "          color: #333333;\r\n"
				+ "          margin-bottom: 20px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section p {\r\n"
				+ "          font-size: 18px;\r\n"
				+ "          color: #666666;\r\n"
				+ "          margin-bottom: 30px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form {\r\n"
				+ "          display: inline-block;\r\n"
				+ "          margin-top: 30px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form input[type=\"number\"] {\r\n"
				+ "          font-size: 18px;\r\n"
				+ "          padding: 10px 15px;\r\n"
				+ "          border: none;\r\n"
				+ "          background-color: #ffffff;\r\n"
				+ "          border-radius: 5px;\r\n"
				+ "          box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form input[type=\"submit\"] {\r\n"
				+ "          font-size: 18px;\r\n"
				+ "          padding: 10px 15px;\r\n"
				+ "          border: none;\r\n"
				+ "          background-color: #ee6e73;\r\n"
				+ "          color: #ffffff;\r\n"
				+ "          border-radius: 5px;\r\n"
				+ "          cursor: pointer;\r\n"
				+ "          transition: all 0.3s ease-in-out;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form input[type=\"submit\"]:hover {\r\n"
				+ "          background-color: #ff8a80;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .donate-section form button {\r\n"
				+ "          background-color: #ffa318;\r\n"
				+ "          color: #fff;\r\n"
				+ "          padding: 10px 20px;\r\n"
				+ "          border-radius: 5px;\r\n"
				+ "          border: none;\r\n"
				+ "          cursor: pointer;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form button:hover {\r\n"
				+ "          background-color: #FFC107;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        \r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "    <header>\r\n"
				+ "        <a href=\"\\ngo1\" id=\"logo\"<div id=\"logo\">Anurag Charitable Trust</div></a>\r\n"
				+ "        <nav id=\"menu\">\r\n"
				+ "            <a href=\"#\">Our Work</a>\r\n"
				+ "            <a href=\"\\ngo1\\getinvolved\">Get Involved</a>\r\n"
				+ "            <a href=\"#\">Gallery</a>\r\n"
				+ "            <a href=\"#\">About Us</a>\r\n"
				+ "            <a href=\"#\">Contact Us</a>\r\n"
				+ "        </nav>\r\n"
				+ "    </header>\r\n"
				+ "    <main>\r\n"
				+ "      <section class=\"donate-section\">\r\n"
				+ "        <div class=\"donate-info\">\r\n"
				+ "          <h1>Help us buy food for the homeless</h1>\r\n"
				+ "          <p>Our mission is to provide food to the homeless people in our community. We need your help to reach our goal of raising &#8377;50000 to purchase food for them. We believe that everyone deserves to have access to basic necessities like food, and your donation can make a difference in someone's life.</p>\r\n"
				+ "          <p>Our team is working tirelessly to reach our goal, and we need your support to make it happen. Please consider making a donation to help us provide food for those in need.</p>\r\n"
				+ "          <p>Thank you for your support!</p>\r\n"
				+ "          <div class=\"donate-progress\">\r\n"
				+ "            <h2>Donation Goal: &#8377;50000</h2>\r\n"
				+ "            <div class=\"progress-bar\">\r\n"
				+ "              <div class=\"progress-fill\" style=\"width: "+amount*100/50000+"%;\"></div>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"progress-info\">\r\n"
				+ "              <span class=\"raised-amount\">&#8377;"+amount+"</span>\r\n"
				+ "              <span class=\"goal-amount\">of &#8377;50000 raised</span>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"donate-form\">\r\n"
				+ "            <form action=\"getinvolved\" method=\"post\">\r\n"
				+ "              <label for=\"amount\">Enter amount to donate:</label>\r\n"
				+ "              <input type=\"number\" min=\"1\" max=\"50000\" id=\"amount\" name=\"amount\" placeholder=\"&#8377;\">\r\n"
				+ "              <button type=\"submit\">Donate Now</button>\r\n"
				+ "            </form>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </section>\r\n"
				+ "    </main>\r\n"
				+ "    <footer>\r\n"
				+ "        Anurag Charitable Trust Inc. - 2015-23\r\n"
				+ "    </footer>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");
	}
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int i=Integer.parseInt(req.getParameter("amount"));
		amount+=i;
		PrintWriter out=res.getWriter();
		out.println("<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <title>Anurag Charitable Trust</title>\r\n"
				+ "    <style>\r\n"
				+ "        /* Global styles */\r\n"
				+ "        body {\r\n"
				+ "            margin: 0;\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            font-size: 16px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Header styles */\r\n"
				+ "        header {\r\n"
				+ "            background-color: #ffa318;\r\n"
				+ "            color: #FFFFFF;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: space-between;\r\n"
				+ "            align-items: center;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        #logo {\r\n"
				+ "            font-size: 24px;\r\n"
				+ "            font-weight: bold;\r\n"
				+ "            color: inherit;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        #menu {\r\n"
				+ "            display: flex;\r\n"
				+ "            gap: 20px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        #menu a {\r\n"
				+ "            color: #FFFFFF;\r\n"
				+ "            text-decoration: none;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        #menu a:hover {\r\n"
				+ "            background-color: #FFFFFF;\r\n"
				+ "            color: #0047AB;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Main styles */\r\n"
				+ "        main {\r\n"
				+ "            padding: 20px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        h1 {\r\n"
				+ "            font-size: 36px;\r\n"
				+ "            margin-top: 0;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        p {\r\n"
				+ "            line-height: 1.5;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .causes {\r\n"
				+ "            display: flex;\r\n"
				+ "            gap: 20px;\r\n"
				+ "            margin-top: 20px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .cause {\r\n"
				+ "            flex: 1;\r\n"
				+ "            background-color: #F2F2F2;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .cause h2 {\r\n"
				+ "            font-size: 24px;\r\n"
				+ "            margin-top: 0;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .cause p {\r\n"
				+ "            margin-top: 10px;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Counter styles */\r\n"
				+ "        footer {\r\n"
				+ "            background-color: #0047AB;\r\n"
				+ "            color: #FFFFFF;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            text-align: center;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        /* Donate styles*/\r\n"
				+ "        .donate-section {\r\n"
				+ "          background-color: #f8f8f8;\r\n"
				+ "          padding: 50px;\r\n"
				+ "          text-align: center;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section h2 {\r\n"
				+ "          font-size: 36px;\r\n"
				+ "          color: #333333;\r\n"
				+ "          margin-bottom: 20px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section p {\r\n"
				+ "          font-size: 18px;\r\n"
				+ "          color: #666666;\r\n"
				+ "          margin-bottom: 30px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form {\r\n"
				+ "          display: inline-block;\r\n"
				+ "          margin-top: 30px;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form input[type=\"number\"] {\r\n"
				+ "          font-size: 18px;\r\n"
				+ "          padding: 10px 15px;\r\n"
				+ "          border: none;\r\n"
				+ "          background-color: #ffffff;\r\n"
				+ "          border-radius: 5px;\r\n"
				+ "          box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form input[type=\"submit\"] {\r\n"
				+ "          font-size: 18px;\r\n"
				+ "          padding: 10px 15px;\r\n"
				+ "          border: none;\r\n"
				+ "          background-color: #ee6e73;\r\n"
				+ "          color: #ffffff;\r\n"
				+ "          border-radius: 5px;\r\n"
				+ "          cursor: pointer;\r\n"
				+ "          transition: all 0.3s ease-in-out;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form input[type=\"submit\"]:hover {\r\n"
				+ "          background-color: #ff8a80;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .donate-section form button {\r\n"
				+ "          background-color: #ffa318;\r\n"
				+ "          color: #fff;\r\n"
				+ "          padding: 10px 20px;\r\n"
				+ "          border-radius: 5px;\r\n"
				+ "          border: none;\r\n"
				+ "          cursor: pointer;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        .donate-section form button:hover {\r\n"
				+ "          background-color: #FFC107;\r\n"
				+ "        }\r\n"
				+ "        \r\n"
				+ "        \r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "    <header>\r\n"
				+ "        <a href=\"\\ngo1\" id=\"logo\"<div id=\"logo\">Anurag Charitable Trust</div></a>\r\n"
				+ "        <nav id=\"menu\">\r\n"
				+ "            <a href=\"#\">Our Work</a>\r\n"
				+ "            <a href=\"\\ngo1\\getinvolved\">Get Involved</a>\r\n"
				+ "            <a href=\"#\">Gallery</a>\r\n"
				+ "            <a href=\"#\">About Us</a>\r\n"
				+ "            <a href=\"#\">Contact Us</a>\r\n"
				+ "        </nav>\r\n"
				+ "    </header>\r\n"
				+ "    <main>\r\n"
				+ "      <section class=\"donate-section\">\r\n"
				+ "        <div class=\"donate-info\">\r\n"
				+ "          <h1>Help us buy food for the homeless</h1>\r\n"
				+ "          <p>Our mission is to provide food to the homeless people in our community. We need your help to reach our goal of raising &#8377;50000 to purchase food for them. We believe that everyone deserves to have access to basic necessities like food, and your donation can make a difference in someone's life.</p>\r\n"
				+ "          <p>Our team is working tirelessly to reach our goal, and we need your support to make it happen. Please consider making a donation to help us provide food for those in need.</p>\r\n"
				+ "          <p>Thank you for your support!</p>\r\n"
				+ "          <div class=\"donate-progress\">\r\n"
				+ "            <h2>Donation Goal: &#8377;50000</h2>\r\n"
				+ "            <div class=\"progress-bar\">\r\n"
				+ "              <div class=\"progress-fill\" style=\"width: "+amount*100/50000+"%;\"></div>\r\n"
				+ "            </div>\r\n"
				+ "            <div class=\"progress-info\">\r\n"
				+ "              <span class=\"raised-amount\">&#8377;"+amount+"</span>\r\n"
				+ "              <span class=\"goal-amount\">of &#8377;50000 raised</span>\r\n"
				+ "            </div>\r\n"
				+ "          </div>\r\n"
				+ "          <div class=\"donate-form\">\r\n"
				+ "            <form action=\"getinvolved\" method=\"post\">\r\n"
				+ "              <label for=\"amount\">Enter amount to donate:</label>\r\n"
				+ "              <input type=\"number\" min=\"1\" max=\"50000\" id=\"amount\" name=\"amount\" placeholder=\"&#8377;\">\r\n"
				+ "              <button type=\"submit\">Donate Now</button>\r\n"
				+ "            </form>\r\n"
				+ "          </div>\r\n"
				+ "        </div>\r\n"
				+ "      </section>\r\n"
				+ "    </main>\r\n"
				+ "    <footer>\r\n"
				+ "        Anurag Charitable Trust Inc. - 2015-23\r\n"
				+ "    </footer>\r\n"
				+ "</body>\r\n"
				+ "\r\n"
				+ "</html>");;
	}
}
