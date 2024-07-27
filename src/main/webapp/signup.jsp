<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles/log.css">
    <title>Sign Up</title>
</head>
<body>
<div class="form-wrapper sign-up">
    <form action="">
        <h2>Sign Up</h2>
        <div class="input-group">
            <input type="text" id="full-name" required>
            <label for="full-name">Full name</label>
        </div>
        <div class="input-group">
            <input type="email" id="email" required>
            <label for="email">Email</label>
        </div>
        <div class="input-group">
            <input type="number" id="phone-number" required>
            <label for="phone-number">Phone Number</label>
        </div>
        <div class="input-group">
            <input type="text" id="username" required>
            <label for="username">Username</label>
        </div>
        <div class="input-group">
            <input type="password" id="password" required>
            <label for="password">Password</label>
        </div>
        <div class="input-group">
            <input type="password" id="confirm-password" required>
            <label for="confirm-password">Confirm password</label>
        </div>
        <div class="remember">
            <label><input type="checkbox"> I agree to the terms & conditions</label>
        </div>
        <button type="submit">Sign Up</button>
        <div class="signUp-link">
            <p>Already have an account? <a href="login.jsp" class="signInBtn-link">Sign In</a></p>
        </div>
    </form>
</div>
<script src="js/log.js"></script>
</body>
</html>

