// by 2019 7 24
    // 轮播图
    var items = document.getElementsByClassName('item'); //图片
    var points = document.getElementsByClassName('point'); //点
    var goPreBtn = document.getElementById('goPre');
    var nav = document.getElementById('nav');
    var goNextBtn = document.getElementById('goNext');

var index =0;
var time = 0;//定时器图片跳转参数

    // index表示第几张图片在展示 既class=‘active’
    var clearActive = function() {
        for(var i = 0; i < items.length; i++) {
            items[i].className = 'item';
        }
        for(var i = 0; i < points.length; i++) {
            points[i].className = 'point';
        }
    }
    var goIndex = function() {
        clearActive();
        points[index].className = 'point active';
        items[index].className = 'item active';
    }
var goNext=function(){
    if(index<7){
        index++
    }else{
        index=0;
    }
    goIndex();
    time = 0;
}

var goPre=function(){
   if(index==0){
       index=7
   }else{
       index--
   }
    goIndex();
    
}

goNextBtn.addEventListener("click",function(){
    goNext();
})
goPreBtn.addEventListener("click",function(){
    goPre();
})
nav.addEventListener('mousemove',function(){
    time=-9999;
})
nav.addEventListener('mouseout',function(){
    time=0;
})


for(var i=0;i<points.length;i++){
    points[i].addEventListener('click',function(){
        var pointIndex =this.getAttribute('data-index');
        index=pointIndex;
        goIndex();
    })
}

setInterval(function() {
    time++;
    if(time == 20){
        goNext();
        time = 0;
    }
}, 100)

// 轮播图
