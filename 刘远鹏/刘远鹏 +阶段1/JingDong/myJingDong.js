var myCart = document.getElementById("mycart"),
    myCartCon = document.getElementById("mycartCon");

myCart.onmouseover = function(){
    this.style.borderBottom = "none";
    myCartCon.style.display = "block";
}
myCartCon.onmouseover = function(){
    myCart.style.borderBottom = "none";
    this.style.display = "block";
}
myCartCon.onmouseout = function(){
    myCart.style.borderBottom = "1px solid #dedede";
    this.style.display = "none";
}
myCart.onmouseout = function(){
    this.style.borderBottom = "1px solid #dedede";
    myCartCon.style.display = "none";
}
