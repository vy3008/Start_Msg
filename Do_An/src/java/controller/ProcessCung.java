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
        String[] todayMessages = {
        "Today is a great day to start something new!",
        "An unexpected opportunity may arise, be ready to seize it.",
        "You will receive good news from someone important.",
        "Don't let small things affect your mood today.",
        "Live every moment of today to the fullest!",
        "Everything will go smoothly today if you keep believing in yourself.",
        "Someone may need your help today, be open-hearted.",
        "If difficulties arise, remember they are only temporary.",
        "A small but meaningful thing may bring you joy all day long.",
        "Try something different today to boost your motivation.",
        "An old friend may reach out to you today.",
        "Creative ideas will come to you at unexpected moments.",
        "Don't overlook small opportunities; they could lead to something big.",
        "Your patience today will bring good results.",
        "A sign from the universe will help you make the right decision.",
        "Today is a great day to reflect and set new goals.",
        "Positive energy will attract good fortune.",
        "A surprise will make today memorable.",
        "You are getting closer to success, don’t give up!",
        "Listen to your intuition; it will guide you in the right direction."

        };

        String[] healthMessages = {
        "Remember to stay hydrated and eat well to keep your body strong.",
        "Take some time to relax and reduce stress.",
        "Light exercise will give you extra energy today.",
        "A good night's sleep will help you stay alert and productive.",
        "Take care of your mental health by meditating or listening to your favorite music.",
        "Don’t forget to take vitamins and eat healthy foods.",
        "Stay away from negativity to keep your mind at ease.",
        "Your body needs some movement; try walking or yoga.",
        "If you feel tired, make sure to rest properly.",
        "Healthy eating will give you energy throughout the day.",
        "Pay attention to your sleep, it greatly affects your well-being.",
        "Don’t skip breakfast; it’s the foundation for a productive day.",
        "Your mood is just as important as your physical health; stay positive!",
        "Today is a great day to try a new sport.",
        "Take a few minutes to breathe deeply and release stress.",
        "Sleeping early will give you a fresh start tomorrow.",
        "Limit screen time before bed for a better night’s sleep.",
        "Do something that makes you happy—mental health matters too!",
        "Try drinking herbal tea to relax your mind.",
        "A healthy body starts with small daily habits."
        };

        String[] loveMessages = {
        "Today is the perfect day to express your feelings to someone special.",
        "If you're single, be open to meeting new people!",
"A sweet surprise from your loved one could make your whole day.",
        "Don’t be afraid to start a conversation with someone you care about.",
        "True love is not always perfect, but it is always worth waiting for.",
        "Someone secretly likes you—pay attention to the signs around you.",
        "An honest conversation will help strengthen your relationship.",
        "Today is a good day to reconcile if misunderstandings have occurred.",
        "Take some time to remember the beautiful memories in your love life.",
        "If you're in a relationship, do something special for your partner today.",
        "A heartfelt letter or message will touch someone’s heart.",
        "Love is like a plant—nurture it daily.",
        "If you’re single, remember to love yourself first.",
        "Sincerity is the key to every lasting relationship.",
        "Sometimes, a simple smile can brighten someone’s entire day.",
        "A small date or thoughtful gesture will deepen your connection.",
        "Love is not just about receiving, but also about giving.",
        "Listening more will help you understand your partner better.",
        "A song you love might remind you of someone special today.",
        "Today is the perfect day to be open about your emotions."

        };

        String[] studyMessages = {
        "Focus on your learning goals—your efforts today will pay off in the future.",
        "If you feel unmotivated, remember why you started.",
        "A new approach might help you study more effectively—try changing your method!",
        "Learning from mistakes will help you grow faster.",
        "Knowledge is the key to success—never stop improving yourself.",
        "Set a small goal for today and accomplish it!",
        "Try a different study method to boost efficiency.",
        "If you're feeling stuck, take a short break and come back refreshed.",
        "Taking notes on key points will help you remember better.",
        "Reading books is a great way to expand your knowledge.",
        "Test yourself by asking questions about what you've learned.",
        "A well-structured study plan will lead to better results.",
        "Find a quiet place to focus better.",
        "Listening to soft music while studying may improve concentration.",
        "Challenge yourself with a small task to stay motivated.",
        "Studying with friends might help you grasp concepts faster.",
        "Don't cram too much at once—break down your learning into small sections.",
        "Persistence is the key to success in studying.",
        "Take five minutes to review what you learned today.",
        "An effective study day starts with a clear and relaxed mind!"
        };

        Random random = new Random();

        String today = todayMessages[random.nextInt(todayMessages.length)];
        String health = healthMessages[random.nextInt(healthMessages.length)];
        String love = loveMessages[random.nextInt(loveMessages.length)];
        String study = studyMessages[random.nextInt(studyMessages.length)];

        return today + " " + health + " " + love + " " + study;
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
