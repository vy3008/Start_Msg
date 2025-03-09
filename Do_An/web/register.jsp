<%-- 
    Document   : register
    Created on : Mar 9, 2025, 7:16:19 PM
    Author     : ACER
--%>

<%@page import="utils.StringHelper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Log in - Astro Charts</title>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
        integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>

<body>
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Gilda+Display&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100..900;1,100..900&display=swap');

        :root {
            --color-one: #BA9545;
            --color-text: #232323;
            --bg-1: #F1EDE8;

            --font: 'Gilda Display', serif;
            --font-2: 'Roboto', sans-serif;
        }

        * {
            padding: 0;
            margin: 0;
            border: 0;
            box-sizing: border-box !important;
        }

        body {
            background: var(--bg-1);
        }

        .sign-up .inner-wrap {
            display: flex;
            background: #fff;
            width: 700px;
            height: 600px;
            margin-left: auto;
            margin-right: auto;
            margin-top: 50px;
            padding: 50px;
        }

        .sign-up .inner-wrap .login-img {
            display: flex;
            flex-direction: column;
            align-items: center;
            width: 100%;
            margin-top: 30px;
        }

        .sign-up .inner-wrap .login-img a {
            color: #101010ac;
        }

        .sign-up .inner-wrap .login-img img {
            width: 100%;
            height: auto;
            margin-bottom: 20px;
        }

        .sign-up .inner-wrap h1 {
            font-family: var(--font-2);
            text-transform: uppercase;
            letter-spacing: 2px;
            margin-bottom: 20px;
        }

        .sign-up .inner-wrap .flex .inner-sub-title {
            color: #7A7A7A;
            line-height: 30px;
        }

        .sign-up .inner-wrap .login-google {
            margin-top: 20px;
            margin-bottom: 20px;
        }

        .sign-up .inner-wrap form {
            margin-top: 20px;
        }

        .sign-up.inner-wrap section {
            margin-top: 20px;
        }

        .sign-up .inner-wrap .flex {
            margin-left: 50px;
        }

        .sign-up .inner-wrap form input {
            border: none;
        }

        .sign-up.inner-wrap input:focus {
            outline: none;
            border: none;
        }

        .sign-up .inner-wrap .horizontal-line {
            border-bottom: 1px solid #E5E5E5;
            height: 10px;
            width: 300px;

            margin-bottom: 10px;
        }

        .sign-up .inner-wrap .button-one {
            padding: 15px 100px;
            margin-top: 40px;
            background: #1B1B1B;
            color: #fff;
            text-transform: uppercase;
            letter-spacing: 2px;
            cursor: pointer;
        }
    </style>

    <div class="sign-up">
        <div class="inner-wrap">
            <div class="login-img">
                <img src='https://assets.astro-charts.com/site/lyra.png' alt="an illustration of goddess with Lyra">
                <a href="#">Already have an account?Login here</a>
            </div>
            <div class="flex">
                <h1 class="inner-title">Welcome</h1>

                <p class="inner-sub-title">Create a free account to save your astrology charts. Sign up using your google account or by entering an email and password below.</p>
                
                <div class="login-google">
                    <a id="google-oauth2-button" name="google oauth2" href="#">
                        <img src="https://astro-charts.com/client/common/images/site/btn_google.696c081ae56a.png">
                    </a>
                </div>

                <span class="form-choice">Or</span>

                <form method="post" action="./create-user" id="sign-up-form">
                    <section>
                        <div class="input-icon-wrap">
                            <span class="input-icon">
                                <i class="fa-solid fa-user"></i>
                            </span>
                            <label for="email" style="display:none">
                                <span>Email</span>
                            </label>
                            <input id="id_username" name="username" type="text" placeholder="Your Email"
                                autocomplete="off">
                        </div>
                    </section>

                    <div class="horizontal-line"></div>

                    <section>
                        <div class="input-icon-wrap">
                            <span class="input-icon">
                                <i class="fa-solid fa-key"></i>
                            </span>
                            <label for="password" style="display:none">
                                <span>Password</span>
                            </label>
                            <input id="id_password" name="password" type="password" placeholder="Your Password"
                                autocomplete="off">
                        </div>
                    </section>

                    <div class="horizontal-line"></div>
                    
                     <section>
                        <div class="input-icon-wrap">
                            <span class="input-icon">
                                <i class="fa-solid fa-key"></i>
                            </span>
                            <label for="confirm-password" style="display:none">
                                <span>confirm-password</span>
                            </label>
                            <input id="id_confirm_password" name="confirm-password" type="password" placeholder="Your confirm password"
                                autocomplete="off">
                        </div>
                    </section>
                    
                    <div class="horizontal-line"></div>
                    
                    <% String message = (String)request.getAttribute("message"); %>
                    <span style="color: red;"><%= StringHelper.getString(message) %></span>

                    <div>
                        <button class="button button-one" id="login" type="submit">Sign Up</button>
                        <input type="hidden" name="next" value="" />
                    </div>
                </form>
            </div>
        </div>
    </div>
</body>

</html>

