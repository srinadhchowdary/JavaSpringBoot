package com.telusko;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("In Service");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>TastyBites Blog</title>\n" +
                "  <style>\n" +
                "    body {\n" +
                "      font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;\n" +
                "      margin: 0;\n" +
                "      padding: 0;\n" +
                "      line-height: 1.6;\n" +
                "      background-color: #fff8f0;\n" +
                "    }\n" +
                "    header {\n" +
                "      background: linear-gradient(135deg, #ff6a00, #ee0979);\n" +
                "      color: #fff;\n" +
                "      padding: 40px 20px;\n" +
                "      text-align: center;\n" +
                "    }\n" +
                "    header h1 {\n" +
                "      margin: 0;\n" +
                "      font-size: 2.5rem;\n" +
                "    }\n" +
                "    nav {\n" +
                "      background: #ff9800;\n" +
                "      padding: 15px;\n" +
                "      text-align: center;\n" +
                "      border-bottom: 3px solid #e65100;\n" +
                "    }\n" +
                "    nav a {\n" +
                "      color: #fff;\n" +
                "      margin: 0 20px;\n" +
                "      text-decoration: none;\n" +
                "      font-weight: bold;\n" +
                "      font-size: 1.1rem;\n" +
                "    }\n" +
                "    nav a:hover {\n" +
                "      color: #222;\n" +
                "    }\n" +
                "    .container {\n" +
                "      width: 85%;\n" +
                "      margin: auto;\n" +
                "      overflow: hidden;\n" +
                "      padding: 20px;\n" +
                "    }\n" +
                "    section {\n" +
                "      margin-bottom: 50px;\n" +
                "      padding: 20px;\n" +
                "      border-radius: 12px;\n" +
                "    }\n" +
                "    #home {\n" +
                "      background: #fff3e0;\n" +
                "    }\n" +
                "    #about {\n" +
                "      background: #f1f8e9;\n" +
                "    }\n" +
                "    #articles {\n" +
                "      background: #e3f2fd;\n" +
                "    }\n" +
                "    #contact {\n" +
                "      background: #fce4ec;\n" +
                "    }\n" +
                "    section h2 {\n" +
                "      margin-top: 0;\n" +
                "      color: #333;\n" +
                "      font-size: 1.8rem;\n" +
                "    }\n" +
                "    article {\n" +
                "      background: #fff;\n" +
                "      padding: 15px;\n" +
                "      border-radius: 10px;\n" +
                "      margin-bottom: 20px;\n" +
                "      box-shadow: 0 3px 6px rgba(0,0,0,0.1);\n" +
                "    }\n" +
                "    article h3 {\n" +
                "      margin: 0 0 10px 0;\n" +
                "      color: #ff5722;\n" +
                "    }\n" +
                "    footer {\n" +
                "      text-align: center;\n" +
                "      padding: 20px;\n" +
                "      background: #ee0979;\n" +
                "      color: #fff;\n" +
                "      margin-top: 30px;\n" +
                "    }\n" +
                "    ul {\n" +
                "      list-style: none;\n" +
                "      padding: 0;\n" +
                "    }\n" +
                "    ul li {\n" +
                "      margin: 8px 0;\n" +
                "    }\n" +
                "    ul li a {\n" +
                "      color: #d81b60;\n" +
                "      text-decoration: none;\n" +
                "    }\n" +
                "    ul li a:hover {\n" +
                "      text-decoration: underline;\n" +
                "    }\n" +
                "    /* Button Style */\n" +
                "    .btn {\n" +
                "      display: inline-block;\n" +
                "      padding: 10px 20px;\n" +
                "      background: #ff6a00;\n" +
                "      color: #fff;\n" +
                "      border-radius: 20px;\n" +
                "      text-decoration: none;\n" +
                "      font-weight: bold;\n" +
                "      transition: background 0.3s;\n" +
                "    }\n" +
                "    .btn:hover {\n" +
                "      background: #e65100;\n" +
                "    }\n" +
                "  </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "  <header>\n" +
                "    <h1>\uD83C\uDF55 TastyBites Blog \uD83C\uDF54</h1>\n" +
                "    <p>Delicious stories, recipes, and foodie adventures</p>\n" +
                "  </header>\n" +
                "  \n" +
                "  <nav>\n" +
                "    <a href=\"#home\">Home</a>\n" +
                "    <a href=\"#about\">About</a>\n" +
                "    <a href=\"#articles\">Articles</a>\n" +
                "    <a href=\"#contact\">Contact</a>\n" +
                "  </nav>\n" +
                "  \n" +
                "  <div class=\"container\">\n" +
                "    <!-- Home Section -->\n" +
                "    <section id=\"home\">\n" +
                "      <h2>Welcome to TastyBites</h2>\n" +
                "      <p>\n" +
                "        Hungry? You’re in the right place! \uD83D\uDE80  \n" +
                "        We deliver not just food, but happiness on your plate.  \n" +
                "        Explore tasty recipes, cooking hacks, and foodie adventures with us.  \n" +
                "      </p>\n" +
                "      <a href=\"#articles\" class=\"btn\">\uD83C\uDF74 Explore Articles</a>\n" +
                "    </section>\n" +
                "    \n" +
                "    <!-- About Section -->\n" +
                "    <section id=\"about\">\n" +
                "      <h2>About Us</h2>\n" +
                "      <p>\n" +
                "        At <b>TastyBites</b>, we believe food is more than just fuel – it’s love ❤\uFE0F.  \n" +
                "        From cheesy pizzas \uD83C\uDF55 to healthy salads \uD83E\uDD57, we’ve got stories and recipes for everyone.  \n" +
                "      </p>\n" +
                "      <p>\n" +
                "        Fun fact: Our team once cooked 500 burgers \uD83C\uDF54 in one night for a charity event!\n" +
                "      </p>\n" +
                "    </section>\n" +
                "    \n" +
                "    <!-- Articles Section -->\n" +
                "    <section id=\"articles\">\n" +
                "      <h2>Latest Foodie Articles</h2>\n" +
                "      \n" +
                "      <article>\n" +
                "        <h3>Top 5 Street Foods You Must Try</h3>\n" +
                "        <p><small>Posted on August 20, 2025</small></p>\n" +
                "        <p>\n" +
                "          From spicy pani puri \uD83C\uDF36\uFE0F to crispy dosa \uD83E\uDD5E,  \n" +
                "          here’s our list of must-try street foods that’ll make your taste buds dance.\n" +
                "        </p>\n" +
                "      </article>\n" +
                "      \n" +
                "      <article>\n" +
                "        <h3>Homemade Pizza Secrets</h3>\n" +
                "        <p><small>Posted on August 18, 2025</small></p>\n" +
                "        <p>\n" +
                "          Want to make restaurant-style pizza at home? \uD83C\uDF55  \n" +
                "          Here are the 3 secret ingredients that will change your game forever.\n" +
                "        </p>\n" +
                "      </article>\n" +
                "      \n" +
                "      <article>\n" +
                "        <h3>Healthy Smoothies That Taste Amazing</h3>\n" +
                "        <p><small>Posted on August 15, 2025</small></p>\n" +
                "        <p>\n" +
                "          Green smoothies don’t have to taste like grass \uD83D\uDE05.  \n" +
                "          Try these fruity blends \uD83C\uDF53\uD83C\uDF4C\uD83E\uDD6D that are delicious AND healthy.\n" +
                "        </p>\n" +
                "      </article>\n" +
                "    </section>\n" +
                "    \n" +
                "    <!-- Contact Section -->\n" +
                "    <section id=\"contact\">\n" +
                "      <h2>Contact Us</h2>\n" +
                "      <p>We’d love to hear from you! \uD83D\uDCE9</p>\n" +
                "      <ul>\n" +
                "        <li>Email: <a href=\"mailto:tastybites@example.com\">tastybites@example.com</a></li>\n" +
                "        <li>Instagram: <a href=\"https://instagram.com/\" target=\"_blank\">@tastybites</a></li>\n" +
                "        <li>Facebook: <a href=\"https://facebook.com/\" target=\"_blank\">TastyBites Page</a></li>\n" +
                "      </ul>\n" +
                "    </section>\n" +
                "  </div>\n" +
                "  \n" +
                "  <footer>\n" +
                "    <p>\uD83C\uDF74 TastyBites Blog &copy; 2025 | Made with Love ❤\uFE0F</p>\n" +
                "  </footer>\n" +
                "</body>\n" +
                "</html>\n");

    }
}
