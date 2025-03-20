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
        String country = request.getParameter("born");
        int day = Integer.parseInt(request.getParameter("dd"));
        int month = Integer.parseInt(request.getParameter("mm"));
        int year = Integer.parseInt(request.getParameter("yyyy"));
        int hour = Integer.parseInt(request.getParameter("hh"));
        int minute = Integer.parseInt(request.getParameter("minute"));
        String ampm = request.getParameter("ampm");

        if ("PM".equalsIgnoreCase(ampm) && hour != 12) {
            hour += 12;
        } else if ("AM".equalsIgnoreCase(ampm) && hour == 12) {
            hour = 0;
        }

        String sunPosition = calculatePlanetPosition("Sun", country, hour, minute);
        String moonPosition = calculatePlanetPosition("Moon", country, hour, minute);
        String mercuryPosition = calculatePlanetPosition("Mercury", country, hour, minute);
        String venusPosition = calculatePlanetPosition("Venus", country, hour, minute);
        String marsPosition = calculatePlanetPosition("Mars", country, hour, minute);
        String jupiterPosition = calculatePlanetPosition("Jupiter", country, hour, minute);
        String saturnPosition = calculatePlanetPosition("Saturn", country, hour, minute);
        String uranusPosition = calculatePlanetPosition("Uranus", country, hour, minute);
        String neptunePosition = calculatePlanetPosition("Neptune", country, hour, minute);
        String plutoPosition = calculatePlanetPosition("Pluto", country, hour, minute);
        String northNodePosition = calculatePlanetPosition("North node", country, hour, minute);
        String chironPosition = calculatePlanetPosition("Chiron", country, hour, minute);
        String ascendantPosition = calculatePlanetPosition("Ascendant", country, hour, minute);
        String mcPosition = calculatePlanetPosition("Mc", country, hour, minute);

        String zodiacSign = getZodiacSign(day, month);
        String randomMessage = getRandomMessage();
        String randomMessage2 = getRandomMessage2();
        String randomMessage3 = getRandomMessage3();
        String randomMessage4 = getRandomMessage4();
        
        request.setAttribute("name", name);
        request.setAttribute("country", country);
        request.setAttribute("day", day);
        request.setAttribute("month", month);
        request.setAttribute("year", year);
        request.setAttribute("hour", hour);
        request.setAttribute("minute", minute);
        request.setAttribute("ampm", ampm);
        request.setAttribute("zodiacSign", zodiacSign);
        request.setAttribute("message", randomMessage);
        request.setAttribute("message2", randomMessage2);
        request.setAttribute("message3", randomMessage3);
        request.setAttribute("message4", randomMessage4);

        request.setAttribute("sunPosition", sunPosition);
        request.setAttribute("moonPosition", moonPosition);
        request.setAttribute("mercuryPosition", mercuryPosition);
        request.setAttribute("venusPosition", venusPosition);
        request.setAttribute("marsPosition", marsPosition);
        request.setAttribute("jupiterPosition", jupiterPosition);
        request.setAttribute("saturnPosition", saturnPosition);
        request.setAttribute("uranusPosition", uranusPosition);
        request.setAttribute("neptunePosition", neptunePosition);
        request.setAttribute("plutoPosition", plutoPosition);
        request.setAttribute("northNodePosition", northNodePosition);
        request.setAttribute("chironPosition", chironPosition);
        request.setAttribute("ascendantPosition", ascendantPosition);
        request.setAttribute("mcPosition", mcPosition);

        RequestDispatcher dis = request.getRequestDispatcher("cung.jsp");
        dis.forward(request, response);
    }

    private String calculatePlanetPosition(String planet, String country, int hour, int minute) {
        // Xử lý logic riêng cho từng hành tinh
        int baseDegree = 0;
        int baseMinute = 0;

        switch (planet.toLowerCase()) {
            case "Sun":
                baseDegree = (15 + hour + minute / 10) % 360; // Mặt Trời (Sun)
                baseMinute = minute % 60;
                break;
            case "Moon":
                baseDegree = (5 + hour * 2 + minute / 5) % 360; // Mặt Trăng (Moon)
                baseMinute = (minute + 15) % 60;
                break;
            case "Mercury":
                baseDegree = (10 + hour / 2 + minute / 15) % 360; // Sao Thủy (Mercury)
                baseMinute = (minute + 10) % 60;
                break;
            case "Venus":
                baseDegree = (25 + hour / 3 + minute / 30) % 360; // Sao Kim (Venus)
                baseMinute = (minute + 5) % 60;
                break;
            case "Mars":
                baseDegree = (35 + hour + minute / 20) % 360; // Sao Hỏa (Mars)
                baseMinute = (minute + 25) % 60;
                break;
            case "Jupiter":
                baseDegree = (50 + hour / 5 + minute / 25) % 360; // Sao Mộc (Jupiter)
                baseMinute = (minute + 30) % 60;
                break;
            case "Saturn":
                baseDegree = (70 + hour / 7 + minute / 35) % 360; // Sao Thổ (Saturn)
                baseMinute = (minute + 40) % 60;
                break;
            case "Uranus":
                baseDegree = (90 + hour / 10 + minute / 50) % 360; // Sao Thiên Vương (Uranus)
                baseMinute = (minute + 45) % 60;
                break;
            case "Neptune":
                baseDegree = (110 + hour / 12 + minute / 55) % 360; // Sao Hải Vương (Neptune)
                baseMinute = (minute + 50) % 60;
                break;
            case "Pluto":
                baseDegree = (130 + hour / 15 + minute / 60) % 360; // Sao Diêm Vương (Pluto)
                baseMinute = (minute + 55) % 60;
                break;
            case "North node":
                baseDegree = (150 + hour * 3 + minute / 10) % 360; // Điểm Bắc Node (North Node)
                baseMinute = (minute + 20) % 60;
                break;
            case "Chiron":
                baseDegree = (170 + hour * 2 + minute / 7) % 360; // Chiron (Điểm đau)
                baseMinute = (minute + 25) % 60;
                break;
            case "Ascendant":
                baseDegree = (180 + hour + minute / 5) % 360; // Điểm mọc (Ascendant)
                baseMinute = (minute + 10) % 60;
                break;
            case "Mc":
                baseDegree = (200 + hour * 2 + minute / 5) % 360; // Đỉnh trời (MC - Medium Coeli)
                baseMinute = (minute + 15) % 60;
                break;
            default:
                baseDegree = (hour + minute / 10) % 360; // Giá trị mặc định
                baseMinute = minute % 60;
        }

        switch (country.toLowerCase()) {
            case "vietnam":
                baseDegree += 5; // Điều chỉnh cho từng quốc gia
                baseMinute += 30;
                break;
            case "japan":
                baseDegree += 10;
                baseMinute += 45;
                break;
            case "united states":
                baseDegree += 15;
                baseMinute += 15;
                break;
            case "france":
                baseDegree += 20;
                baseMinute += 5;
                break;
            default:
                baseDegree += 0;
                baseMinute += 0;
        }

        // Xác định cung hoàng đạo
        String zodiacSign = getZodiacSignForPlanet(baseDegree);

        return planet + " in " + " " + baseDegree + "°" + baseMinute + "'" + " " + zodiacSign;
    }

    private String getZodiacSignForPlanet(int degree) {
        if (degree >= 0 && degree < 30) {
            return "Aries";
        } else if (degree >= 30 && degree < 60) {
            return "Taurus";
        } else if (degree >= 60 && degree < 90) {
            return "Gemini";
        } else if (degree >= 90 && degree < 120) {
            return "Cancer";
        } else if (degree >= 120 && degree < 150) {
            return "Leo";
        } else if (degree >= 150 && degree < 180) {
            return "Virgo";
        } else if (degree >= 180 && degree < 210) {
            return "Libra";
        } else if (degree >= 210 && degree < 240) {
            return "Scorpio";
        } else if (degree >= 240 && degree < 270) {
            return "Sagittarius";
        } else if (degree >= 270 && degree < 300) {
            return "Capricorn";
        } else if (degree >= 300 && degree < 330) {
            return "Aquarius";
        } else {
            return "Pisces";
        }
    }

    private String getZodiacSign(int day, int month) {
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else {
            return "Capricorn";
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

        Random random = new Random();

        String today = todayMessages[random.nextInt(todayMessages.length)];

        return "Today:" + today;
    }
    
    private String getRandomMessage2() {
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

        Random random = new Random();
        String health = healthMessages[random.nextInt(healthMessages.length)];
        return"Health:" + " " + health;
    }
    
    private String getRandomMessage3() {
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
        Random random = new Random();
        String love = loveMessages[random.nextInt(loveMessages.length)];
        return"Love:" + " " + love;
    }
    
    private String getRandomMessage4() {
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
        String study = studyMessages[random.nextInt(studyMessages.length)];
        return"Love:" + " " + study;
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
