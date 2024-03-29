// 全局变量a和b，分别获取用户框和密码框的value值
var a = document.getElementsByName("id").item("value").value;
var b = document.getElementsByName("user").item("value").value;

//用户框失去焦点后验证value值
function oBlur_1() {
    a = document.getElementsByName("id").item("value").value;

    if (!a) { //用户框value值为空
        document.getElementById("remind_1").innerHTML = "请输入用户名！";
        document.getElementById("change_margin_1").style.marginBottom = 1 + "px";
    } else { //用户框value值不为空
        document.getElementById("remind_1").innerHTML = "";
        document.getElementById("change_margin_1").style.marginBottom = 19 + "px";
    }
}

//密码框失去焦点后验证value值
function oBlur_2() {
    b = document.getElementsByName("user").item("value").value;
    if (!b) { //密码框value值为空
        document.getElementById("remind_2").innerHTML = "请输入密码！";
        document.getElementById("change_margin_2").style.marginBottom = 1 + "px";
        document.getElementById("change_margin_3").style.marginTop = 2 + "px";
    } else { //密码框value值不为空
        document.getElementById("remind_2").innerHTML = "";
        document.getElementById("change_margin_2").style.marginBottom = 19 + "px";
        document.getElementById("change_margin_3").style.marginTop = 19 + "px";
    }
}

//用户框获得焦点的隐藏提醒
function oFocus_1() {
    document.getElementById("remind_1").innerHTML = "";
    document.getElementById("change_margin_1").style.marginBottom = 19 + "px";
}

//密码框获得焦点的隐藏提醒
function oFocus_2() {
    document.getElementById("remind_2").innerHTML = "";
    document.getElementById("change_margin_2").style.marginBottom = 19 + "px";
    document.getElementById("change_margin_3").style.marginTop = 19 + "px";
}

//若输入框为空，阻止表单的提交
function submitTest() {
    a = document.getElementsByName("id").item("value").value;
    b = document.getElementsByName("user").item("value").value;
    if (!a && !b) { //用户框value值和密码框value值都为空
        document.getElementById("remind_1").innerHTML = "请输入工号！";
        document.getElementById("change_margin_1").style.marginBottom = 1 + "px";
        document.getElementById("remind_2").innerHTML = "请输入姓名！";
        document.getElementById("change_margin_2").style.marginBottom = 1 + "px";
        document.getElementById("remind_3").innerHTML = "请输入部门！";
        document.getElementById("change_margin_3").style.marginBottom = 1 + "px";
        document.getElementById("remind_4").innerHTML = "请输入车牌号！";
        document.getElementById("change_margin_4").style.marginBottom = 1 + "px";
        document.getElementById("remind_5").innerHTML = "请输入起始时间！";
        document.getElementById("change_margin_5").style.marginBottom = 1 + "px";
        document.getElementById("remind_6").innerHTML = "请输入结束时间！";
        document.getElementById("change_margin_6").style.marginBottom = 1 + "px";
        document.getElementById("change_margin_7").style.marginTop = 1 + "px";
        return false; //只有返回true表单才会提交
    } else if (!a) { //用户框value值为空
        document.getElementById("remind_1").innerHTML = "请输入用户名！";
        document.getElementById("change_margin_1").style.marginBottom = 1 + "px";
        return false;
    } else if (!b) { //密码框value值为空
        document.getElementById("remind_2").innerHTML = "请输入密码！";
        document.getElementById("change_margin_2").style.marginBottom = 1 + "px";
        document.getElementById("change_margin_3").style.marginTop = 2 + "px";
        return false;
    }
}