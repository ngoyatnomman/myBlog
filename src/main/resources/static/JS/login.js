function toggleBtn(){
    var username = $('#username').val();
    var password = $('#password').val();
    var loginBtn = $('#loginBtn');
    if(username.length !== 0 && password.length !== 0){//用户名和密码都存在改变登录按钮颜色
        loginBtn.css({'background-color':'#C87800','border':'#C87800'});
    }else{
        disableBtn();
    }
}

function disableBtn(){//禁用按钮
    var loginBtn =  $('#loginBtn');
    loginBtn.css({'background-color':'#ccc','border':'#ccc'});
    loginBtn.unbind();//解绑事件
}

function login(){
    $.post('/myBlog/login',function (data) {
        if(data.length === 0){
            $('#error').show();
        }else {
            location.href='showArticles.html';
        }
    });
}

$(function () {
    var userName = $('#username');
    var pwd = $('#password');
    var del = $('#delete');

    userName.keyup(function () {//绑定按键事件
        if(userName.val().length === 0){//输入框有内容才显示delete图片
            del.css('display','block');
        }else{
            del.css('display','none');
        }
        toggleBtn();
    });

    pwd.bind('keyup',toggleBtn);

    $('#see').click(function () {//点击see图片切换输入框样式
        if(pwd.attr('type')==='text'){
            pwd.attr('type','password');
        }else{
            pwd.attr('type','text');
        }
    });

    del.click(function () {//delete图片点击清空用户名，并隐藏自身
        userName.val('');
        disableBtn();
        del.css('display','none');
    });

    $('.inputText').click(function () {//重定向之后鼠标点击，删除错误提示
        var p = $('#error');
        if(p.html()!==""){
            p.html("");
        }
    });

});



/*
* <%
    Object error = request.getAttribute("error");
    String msg = "";
    if(error!=null){
    msg = "用户名或密码不存在";
    }
    %>
* */