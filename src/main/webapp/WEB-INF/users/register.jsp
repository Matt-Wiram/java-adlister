<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 1/5/23
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Create Users</title>
  </head>
  <body>
      <div class="container">
          <h1>Create a new User</h1>
          <form action="/register" method="post">
              <div class="form-group">
                  <label for="username">Username</label>
                  <input id="username" name="username" class="form-control" type="text">
              </div>
                   <div class="form-group">
                                <label for="title">Email</label>
                                <input id="email" name="email" class="form-control" type="email">
                            </div>
              <div class="form-group">
                  <label for="description">Password</label>
                  <textarea id="password" name="password" class="form-control" type="text"></textarea>
              </div>
              <input type="submit" class="btn btn-block btn-primary">
          </form>
      </div>
  </body>
</html>
