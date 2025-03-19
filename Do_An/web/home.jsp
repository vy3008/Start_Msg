<%-- 
    Document   : home
    Created on : Mar 9, 2025, 7:07:11 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
        integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
        integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
        crossorigin="anonymous" referrerpolicy="no-referrer" />

    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script:wght@400..700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100..900;1,100..900&display=swap"
        rel="stylesheet">

    <title>Home</title>
</head>

<body>
    <style>
        :root {
            --color-one: #BA9545;
            --color-text: #232323;
            --bg-1: #F1EDE8;

            --font: 'Gilda Display', serif;
            --font-2: 'Roboto', sans-serif
        }
    </style>

    <!-- Header -->
    <style>
        .header {
            padding: 5px;
            position: fixed;
            top: 0;
            width: 100%;
            z-index: 1000;
            background: #fff;
        }

        .header .inner-head {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .header .inner-head .inner-menu {
            display: flex;
            justify-content: center;
            align-items: center;
            background: #000;
            width: 40px;
            height: 40px;
            color: #fff;
        }

        .header .inner-head .inner-logo span {
            font-family: 'Dancing Script', cursive;
            font-size: 50px;
            font-weight: bold;
            color: #000;
        }

        .header .inner-head .inner-info {
            display: flex;
        }

        .header .inner-head .inner-info .inner-sign-up a {
            color: #7A7A7A;
            text-decoration: none;
            font-family: var(--font);
        }

        .header .inner-head .inner-info .inner-login a {
            color: #7A7A7A;
            text-decoration: none;
            font-family: var(--font);
        }

        .header .inner-head .inner-info .inner-sign-up::after {
            content: "/";
            margin-right: 5px;
            margin-left: 5px;
            color: #7A7A7A;
        }

        .header .inner-head .inner-info .inner-login::after {
            content: "|";
            margin-left: 10px;
            margin-right: 10px;
            color: #7A7A7A;
        }

        .header .inner-head .inner-info .inner-notification {
            position: relative;
        }

        .header .inner-head .inner-info .inner-notification a {
            color: #7A7A7A;
            font-size: 20px;
        }

        .header .inner-head .inner-info .inner-notification::after {
            content: "0";
            position: absolute;
            width: 10px;
            height: 10px;
            top: 15px;
            left: 10px;
            border-radius: 50%;
            background: #F1EDE8;
            font-size: 8px;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .header .inner-head .inner-menu-mobi {
            display: none;
        }

        .header .inner-head .inner-logo-mobi {
            display: none;
        }

        @media (max-width: 991.98px) {
            .header .inner-head .inner-logo-mobi {
                display: block;
            }

            .header .inner-head .inner-logo-mobi span {
                font-family: 'Dancing Script', cursive;
                font-size: 50px;
                font-weight: bold;
                color: #000;
            }

            .header .inner-head .inner-menu {
                display: none;
            }

            .header .inner-head .inner-logo {
                display: none;
            }

            .header .inner-head .inner-info {
                display: none;
            }

            .header .inner-head .inner-menu-mobi {
                display: flex;
                justify-content: center;
                align-items: center;
                background: #000;
                width: 40px;
                height: 40px;
                color: #fff;
            }
        }
    </style>
    <header class="header">
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="inner-head">
                        <div class="inner-logo-mobi">
                            <a href="#">
                                <span>AC</span>
                            </a>
                        </div>
                        <div class="inner-menu">
                            <i class="fa-solid fa-bars"></i>
                        </div>
                        <div class="inner-logo">
                            <a href="#">
                                <span>StarMsg</span>
                            </a>
                        </div>
                        <div class="inner-info">
                            <div class="inner-sign-up">
                                <a href="./register">
                                    Sign Up
                                </a>
                            </div>
                            <div class="inner-login">
                                <a href="./login">
                                    Login
                                </a>
                            </div>
                            <div class="inner-notification">
                                <a href="#">
                                    <i class="fa-solid fa-bell"></i>
                                </a>
                            </div>
                        </div>
                        <div class="inner-menu-mobi">
                            <i class="fa-solid fa-bars"></i>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- End Header -->

    <!-- Menu -->
    <style>
        .menu {
            margin-top: 100px;
        }

        .menu .inner-list {
            margin-right: auto;
            margin-left: auto;
        }

        .menu ul {
            display: flex;
            list-style: none;
        }

        .menu ul li {
            margin-left: 50px;
        }

        .menu ul li a {
            font-family: "Roboto", serif;
            text-transform: uppercase;
            text-decoration: none;
            color: #000;
            font-size: 12px;
        }

        @media (max-width: 991.98px) {
            .menu {
                display: none;
            }
        }
    </style>

    <div class="menu">
        <div class="container">
            <div class="row">
                <div class="inner-list">
                    <ul>
                        <li>
                            <a href="#">Home</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- End Menu -->

    <!-- Section One -->
    <style>
        .section-one {
            padding: 50px;
        }

        .section-one .inner-box {
            display: flex;
            flex-wrap: wrap;
        }

        .section-one .inner-box .inner-content {
            position: relative;
            margin-left: 20px;
            flex: 1;
        }

        .section-one .inner-box .inner-content .inner-desc {
            font-family: var(--font);
            font-size: 16px;
        }

        .section-one .inner-box .inner-content .inner-desc::after {
            position: absolute;
            content: "";
            width: 150px;
            height: 2px;
            background-color: #E5E5E5;
            top: 100px;
            left: 0;
        }

        .section-one .inner-box .inner-content .inner-title {
            margin-top: 40px;
        }

        .section-one .inner-box .inner-content .inner-title a {
            text-decoration: none;
        }

        .section-one .inner-box .inner-content .inner-title span {
            color: #BA9545;
            text-transform: uppercase;
            font-family: var(--font-2);
            font-size: 16px;
        }

        .section-one .inner-box .inner-content .inner-title::after {
            content: "\f061";
            font-weight: 900;
            font-family: "Font Awesome 6 Free";
            color: var(--color-one);
        }

        @media (max-width: 991.98px) {
            .section-one .inner-box .inner-image {
                width: 100%;
            }

            .section-one .inner-box .inner-content {
                width: 100%;
                margin: 0;
                margin-top: 10px;
            }
        }

        @media (max-width: 767.98px) {
            .section-one .inner-box {
                margin-bottom: 20px;
            }

            .section-one .inner-box .inner-image {
                width: 30%;
            }

            .section-one .inner-box .inner-content {
                width: 70%;
                margin-left: 10px;
            }

            .section-one .inner-box .inner-content .inner-desc::after {
                width: 400px;
                top: 60px;
            }

            .section-one .inner-box .inner-content .inner-title {
                margin-top: 20px;
            }
        }

        @media (max-width: 575.98px) {
            .section-one .inner-box {
                text-align: center;
            }

            .section-one .inner-box .inner-image {
                width: 100%;
            }

            .section-one .inner-box .inner-content {
                width: 100%;
            }

            .section-one .inner-box .inner-content .inner-desc::after {
                width: 400px;
                top: 55px;
            }
        }
    </style>

    <div class="section-one">
        <div class="container">
            <div class="row">
                <div class="col-xl-4 col-lg-4 col-md-4 col-sm-12">
                    <div class="inner-box">
                        <div class="inner-image">
                            <a href="#">
                                <img src="https://assets.astro-charts.com/site/woman-hp.webp" alt="">
                            </a>
                        </div>
                        <div class="inner-content">
                            <div class="inner-desc">
                                Discover your astrological planetary positions, aspects, patterns, and more.
                            </div>
                            <div class="inner-title">
                                <a href="#">
                                    <span>Birth Chart</span>
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Section One -->

    <!-- Section Two -->
    <style>
        .section-two {
            padding: 30px 0;
            background: var(--bg-1);
        }

        .section-two .inner-top {
            text-align: center;
            margin-bottom: 30px;
        }

        .section-two .inner-top .inner-title {
            font-size: 32px;
            font-family: var(--font);
            margin-bottom: 20px;
        }

        .section-two .inner-top .inner-desc {
            font-size: 12px;
            max-width: 600px;
            margin: 0 auto;
            color: #7A7A7A;
            line-height: 20px;
        }

        .section-two .inner-form {
            padding: 50px 20px;
            background: #fff;
        }

        .section-two .inner-form h4 {
            color: var(--color-one);
            font-family: var(--font-2);
            font-size: 12px;
            text-transform: uppercase;
        }

        .section-two .inner-form .inner-content {
            display: flex;
            margin-top: 30px;
        }

        .section-two .inner-form .inner-content label {
            font-size: 16px;
            font-family: var(--font);
        }

        .section-two .inner-form .inner-content input {
            border: none;
            border-bottom: 1px solid #000;
            width: 350px;
        }

        .section-two .inner-form .inner-content input:focus {
            outline: none;
        }

        .section-two .inner-form .inner-info {
            position: relative;
            display: flex;
        }

        .section-two .inner-form .inner-info .info {
            margin-left: 50px;
        }

        .section-two .inner-form .inner-info .info input {
            border: none;
            border-bottom: 1px solid #000;
            width: 50px;
        }

        .section-two .inner-form .inner-info-2 {
            display: flex;
            justify-content: right;
            margin-top: 30px;
        }

        .section-two .inner-form .inner-info-2 .info {
            margin-left: 30px;
        }

        .section-two .inner-form .inner-info-2 .info input[type="text"] {
            border: none;
            border-bottom: 1px solid #000;
            width: 50px;
        }

        .section-two .inner-form .inner-info-2 .info input[type="radio"]:checked {
            accent-color: black;
        }

        .section-two .inner-form a {
            width: 100%;
            background: #1A291B;
            color: #fff;
            margin-top: 30px;
            text-transform: uppercase;
            letter-spacing: 2px;
        }

        .section-two .inner-image img {
            width: 100%;
        }
    </style>

    <div class="section-two">
        <div class="container">
            <div class="row">
                <div class="col-xl-12">
                    <div class="inner-top">
                        <div class="inner-title">Create Your Astrology Birth Chart</div>
                        <p class="inner-desc">Create your free, personalized, and highly customizable birth chart (natal
                            chart) by filling in the form below. Using our tools you can hide/show planets and
                            asteroids, choose a house system, customize orbs, show declinations, sidereal charts and
                            more...</p>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-xl-6">
                    <div class="inner-form">
                        <h4>Fill in your details</h4>
                        <form method="post" action="./cung">
                            <div class="row">
                                <div class="col-xl-12">
                                    <div class="inner-content">
                                        <label for="name">My name is:</label>
                                        <input type="text" id="name" name="name">
                                    </div>
                                </div>
                                <div class="col-xl-12">
                                    <div class="inner-content">
                                        <label for="born">I was born in:</label>
                                        <input type="text" id="name" name="born" placeholder="City, state, country">
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="inner-content">
                                    <div class="col-xl-4">
                                        <div class="inner-title">
                                            <label for="date">My date of birth is:</label>
                                        </div>
                                    </div>
                                    <div class="col-xl-8">
                                        <div class="inner-info">
                                            <div class="info">
                                                <input type="text" id="mm" name="mm" placeholder="MM">
                                            </div>
                                            <div class="info">
                                                <input type="text" id="dd" name="dd" placeholder="DD">
                                            </div>
                                            <div class="info">
                                                <input type="text" id="yyyy" name="yyyy" placeholder="YYYY">
                                            </div>
                                        </div>
                                    </div>
                                </div>

                                <div class="col-xl-12">
                                    <div class="inner-info-2">
                                        <div class="info">
                                            <input type="text" id="hh" placeholder="hh">
                                        </div>
                                        <div class="info">
                                            <input type="text" id="mm" placeholder="mm">
                                        </div>
                                        <div class="info">
                                            <input type="radio" id="am" name="ampm" value="AM">
                                            <label for="am">AM</label>
                                        </div>
                                        <div class="info">
                                            <input type="radio" id="pm" name="ampm" value="PM" checked>
                                            <label for="pm">PM</label>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-xl-12">
                                     <button type="submit" class="btn">Create Chart</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
                <div class="col-xl-6">
                    <div class="inner-image">
                        <img src="https://assets.astro-charts.com/site/illustration-form.webp" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- End Section Two -->

    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>
</body>

</html>