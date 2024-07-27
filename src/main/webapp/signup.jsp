<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="log.css">
    <title>Sign Up</title>
</head>
<body>
<div class="form-wrapper sign-up">
    <form action="">
        <h2>Sign Up</h2>
        <div class="input-group">
            <input type="text" required>
            <label for="">Full name</label>
        </div>
        <div class="input-group">
            <input type="email" required>
            <label for="">Email</label>
        </div>
        <div class="input-group">
            <input type="number" required>
            <label for="">Phone Number</label>
        </div>
        <div class="input-group">
            <input type="text" required>
            <label for="">Username</label>
        </div>
        <div class="input-group">
            <input type="password" required>
            <label for="">Password</label>
        </div>
        <div class="input-group">
            <input type="password" required>
            <label for="">Confirm password</label>
        </div>
        <div class="remember">
            <label><input type="checkbox"> I agree to the terms & conditions</label>
        </div>
        <button type="submit">Sign Up</button>
        <div class="signUp-link">
            <p>Already have an account? <a href="log.html" class="signInBtn-link">Sign In</a></p>
        </div>
    </form>
</div>
</body>
</html>

