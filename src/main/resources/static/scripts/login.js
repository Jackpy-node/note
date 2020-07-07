/**页面初始化**/
$(function () {

    console.debug("count:", GetCookie("count"));
    console.debug("password:", GetCookie("password"));

    if (GetCookie("count") && GetCookie("password")) {
        $("count").val(GetCookie("count"));
        $("password").val(GetCookie("password"));
    }

    //注册
    $("#register").on("click", Register);

    //登录
    $("#login").on("click", Login);


});

//注册
function Register() {
    //获取参数
    const username = $("#register_username").val().trim();    //获取账号
    const nick = $("#nickname").val().trim();                 //获取昵称
    const password = $("#register_password").val().trim();    //获取密码
    const final_password = $("#final_password").val().trim(); //确认密码

    const reg = /^\w{3,20}$/;
    if (!reg.test(username)) {
        $("#warning_1").text("3-20位的英文、数字、下划线.").show();
        return;
    }

    //校验密码
    if (password.length < 6 || password != final_password) {
        return;
    }

    //组装json数据报文
    const user = {
        "username": username,
        "nick": nick,
        "password": password
    };

    $.ajax({
        type: 'POST',
        contentType: 'application/json;charset=UTF-8',   //定义发送请求的数据格式为JSON
        url: '/register',
        data: JSON.stringify(user),                     //将javascript对象转化为Json字符串
        dataType: 'JSON',
        success: function (result) {
            if (result.status == 0) {
                alert("注册成功.")
                $("#zc").attr("class", "sig sig_out");
                $("#dl").attr("class", "log log_in");
            } else {
                alert(result.message);
            }
        },
        error: function () {
            alert("请求失败.");
        }
    });
}

//登录
function Login() {

    const username = $("#count").val().trim();     //获取登录用户名
    const password = $("#password").val().trim();  //获取登录用户密码

    if (username == "" && password == "") {
        return;
    }

    console.debug("login username:", username);
    console.debug("login password:", username);


    //组装Json报文
    const user = {
        username: username,
        password: password
    };

    $.ajax({
        type: 'POST',
        contentType: 'application/json;charset=UTF-8',
        url: '/login.do',
        data: JSON.stringify(user),
        dataType: 'JSON',
        success: function (result) {

        },
        error: function (result) {

        }

    });


}

//退出
function Logout() {

}

//修改密码
function ChangePwd() {

}

//设置cookie
function SetCookie(name, value, day) {
    const date = new Date();
    date.setDate(date.getDate() + day);
    document.cookie = name + '=' + value + ';expires' + date;
}

//获取cookie
function GetCookie(name) {
    const cookies = document.cookie.split(";");
    for (let i = 0; i < cookies.length; i++) {
        const cks = cookies[i];
        if (cks != "") {
            while (cks.charAt(0) == '') {
                cks.substring(1);
            }
            if (cks != null) {
                if (cks.indexOf(name)) {
                    return cks.substring(name.toString().length, cks.length);
                }
            }
        } else {
            return "";
        }
    }
    return "";
}

//删除cookie
function DelCookie(name) {
    SetCookie(name, null, -1);
}