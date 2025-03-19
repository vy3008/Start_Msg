package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.Random;


public class ProcessCung extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        int day = Integer.parseInt(request.getParameter("dd"));
        int month = Integer.parseInt(request.getParameter("mm"));
        int year = Integer.parseInt(request.getParameter("yyyy"));
        
        String zodiacSign = getZodiacSign(day, month);
        String randomMessage = getRandomMessage();
        request.setAttribute("name", name);
        request.setAttribute("zodiacSign", zodiacSign);
        request.setAttribute("message", randomMessage);
        RequestDispatcher dis = request.getRequestDispatcher("cung.jsp");
        dis.forward(request, response);
    }
    
    private String getZodiacSign(int day, int month) {
        if((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Bảo Bình";
        } else if((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Song Ngư";
        } else if((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Bạch Dương";
        } else if((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Kim Ngưu";
        } else if((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Song Tử";
        } else if((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cự Giải";
        } else if((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Sư Tử";
        } else if((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Xử Nữ";
        } else if((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Thiên Bình";
        } else if((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Hổ Cáp";
        } else if((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Nhân Mã";
        } else {
            return "Ma Kết";
        }
    }
    
    private String getRandomMessage() {
        String[] messages = {
            "Hãy luôn vững vàng trên con đường bạn chọn!",
            "Một ngày tuyệt vời đang chờ bạn phía trước.",
            "Bạn có sức mạnh để vượt qua mọi thử thách!",
            "Hãy tự tin vào khả năng của chính mình.",
            "Điều kỳ diệu sẽ xảy ra nếu bạn tin tưởng vào bản thân."
        };

        Random random = new Random();
        int index = random.nextInt(messages.length);

        return messages[index];
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
