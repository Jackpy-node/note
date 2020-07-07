/**封装登录、注册页面切换功能**/

function get(e) {
    return document.getElementById(e);
}

function init() {
    get("count").onfocus = function () {
        get("count_span").style.display = 'none';
    }

    get("password").onfocus = function () {
        get("password_span").style.display = 'none';
    }

    get("register_username").onfocus = function () {
        get("warning_1").style.display = 'none';
    }

    get("register_password").onfocus = function () {
        get("warning_2").style.display = 'none';
    }

    get("final_password").onfocus = function () {
        get("warning_3").style.display = 'none';
    }
}

/*注册*/
get("sig_in").onclick = function () {

    get("dl").className = "log log_out";
    get("zc").className = "sig sig_in";

    //初始化注册页面鼠标聚焦
    //get("register_username").focus();

    //清空上一次输入内容
    const allInput = document.body.getElementsByTagName("input");
    for (let i = 0; i < allInput.length; i++) {
        const item = allInput[i];
        if (item.type == "text" || item.type == "password") {
            item.value = "";
        }
    }
}

/*返回*/
get("back").onclick = function () {
    get("zc").className = "sig sig_out";
    get("dl").className = "log log_in";
}
window.onload = function () {

    console.debug("window onload!")

    get("count").focus();

    setTimeout("get('zc').style.visibility='visible'", 800);

    init();

}

