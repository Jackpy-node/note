/**封装登录、注册处理**/

//实时监听input输入内容变化
function InputChange(e) {
    document.getElementById(e).style.display = 'none';
}

/**页面初始化之后加载**/
$(function () { //使用jquery方式，页面载入完毕调用
    //给登录按钮绑定单击处理
    $("#login").on("click", CheckLogin);
    //给注册按钮绑定单击处理
    $("#register").on("click", RegisterUser);
});

function RegisterUser() {
    //获取参数
    const username = $("#register_username").val().trim();    //获取账号
    const nick = $("#nickname").val().trim();                 //获取昵称
    const password = $("#register_password").val().trim();    //获取密码
    const final_password = $("#final_password").val().trim(); //确认密码
    //检查数据格式
    let ok = true;//表示参数状态

    //检查用户
    if (username == "") {
        document.getElementById("register_username").focus();
        $("#warning_1 span").html("用户名不能为空");
        $("#warning_1").show();//显示警告信息
        ok = false;
    }

    //检查密码
    if (password == "") {
        document.getElementById("register_password").focus();
        $("#warning_2 span").html("密码不能为空");
        $("#warning_2").show();//显示警告信息
        ok = false;
    } else if (password.length < 6) {
        document.getElementById("register_password").focus();
        $("#warning_2 span").html("密码长度不能小于6位");
        $("#warning_2").show();//显示警告信息
        ok = false;
    } else if (password.length > 25) {
        document.getElementById("register_password").focus();
        $("#warning_2 span").html("密码长度不能超过25位");
        $("#warning_2").show();//显示警告信息
        ok = false;
    }

    //检测确认密码
    if (final_password == "") {
        document.getElementById("final_password").focus();
        $("#warning_3 span").html("确认密码不能为空");
        $("#warning_3").show();//显示警告信息
        ok = false;
    } else if (final_password != password) {
        document.getElementById("final_password").focus();
        $("#warning_3 span").html("两次输入密码不一致");
        $("#warning_3").show();//显示警告信息
        ok = false;
    }
}


function CheckLogin() {
    const username = $("#count").val().trim();    //获取账号
    const password = $("#password").val().trim();    //获取密码
    //格式检测
    let ok = true;

    if (username == "") {
        document.getElementById("count").focus();
        $("#count_span").html("用户名不能为空").show();
        ok = false;
    }
    if (password == "") {
        document.getElementById("password").focus();
        $("#password_span").html("密码不能为空").show();
        ok = false;
    }
}


