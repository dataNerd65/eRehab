<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Animated Login & Registration Form </title>
    <link rel="stylesheet" type="text/css" href="log.css">
</head>
<body>
<div class="wrapper">
    <div class="form-wrapper sign-in">
        <form action="">
            <h2>Login</h2>
            <div class="input-group">
                <input type="text" required>
                <label for="">Username</label>
            </div>
            <div class="input-group">
                <input type="password" required>
                <label for="">Password</label>
            </div>
            <div class="remember">
                <label><input type="checkbox"> Remember me</label>
            </div>
            <button type="submit">Login</button>
            <div class="signUp-link">
                <p>Don't have an account? <a href="signup.html" class="signInBtn-link">Sign Up</a></p>
            </div>
            <div class="forgot-password">
                <p>Forgot password? <a href="https://example.com/reset-password">Reset it here</a></p>
            </div>
        </form>
    </div>
</div>
<script src="log.js"></script>
</body>
</html>
