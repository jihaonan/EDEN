$(document).ready(function(){

  var myPlaylist = new jPlayerPlaylist({
    jPlayer: "#jplayer_N",
    cssSelectorAncestor: "#jp_container_N"
  }, eval(playlist), {
    playlistOptions: {
      enableRemoveControls: true,
      autoPlay: true,
      shuffleOnLoop:true
    },
    swfPath: "js/jPlayer",
    supplied: "webmv, ogv, m4v, oga, mp3",
    smoothPlayBar: true,
    keyEnabled: true,
    audioFullScreen: false
  });


  //设置默认播放列表
  function setPlaylist(playlist){
    myPlaylist.setPlaylist(eval(playlist));
  }



  $(document).on($.jPlayer.event.pause, myPlaylist.cssSelector.jPlayer,  function(){
    $('.musicbar').removeClass('animate');
    $('.jp-play-me').removeClass('active');
    $('.jp-play-me').parent('li').removeClass('active');
  });

  $(document).on($.jPlayer.event.play, myPlaylist.cssSelector.jPlayer,  function(){
    $('.musicbar').addClass('animate');
  });

  $(document).on('click', '.jp-play-me', function(e){
    e && e.preventDefault();
    var $this = $(e.target);
    if (!$this.is('a')) $this = $this.closest('a');

    $('.jp-play-me').not($this).removeClass('active');
    $('.jp-play-me').parent('li').not($this.parent('li')).removeClass('active');

    $this.toggleClass('active');
    $this.parent('li').toggleClass('active');
    if( !$this.hasClass('active') ){
      myPlaylist.pause();
    }else{
      //var i = Math.floor(Math.random() * (1 + 7 - 1));
      //myPlaylist.play(i);

      //添加到播放列表
     //myPlaylist.add({
     //   title: "Your Face",
     //   artist: "The Stark Palace",
     //   mp3: "http://www.jplayer.org/audio/mp3/TSP-05-Your_face.mp3",
     //   oga: "http://www.jplayer.org/audio/ogg/TSP-05-Your_face.ogg",
     //   poster: "http://www.jplayer.org/audio/poster/The_Stark_Palace_640x360.png"
     //
     // },[true]);



      //设置播放列表
      //var str=[{
      //  title:"Bright - 逢うたび好きになって",
      //  artist:"ADG3 Studios",
      //  mp3:"mp3/Bright - 逢うたび好きになって.mp3",
      //  poster: "images/m0.jpg"
      //},
      //  {
      //    title:"Prayer In C",
      //    artist:"Studios",
      //    mp3:"mp3/Lilly Wood & The Prick,Robin Schulz - Prayer In C.mp3",
      //    poster: "images/m0.jpg"
      //  }];
      //myPlaylist.setPlaylist(eval(str));






      ////播放列表的长度
      ////alert(myPlaylist.playlist.length);
      //
      //
      var music_url=$this.data("music_url");
      //播放单首音乐
      $("#jplayer_N").jPlayer("setMedia",{
        mp3:music_url
      });
      $("#jplayer_N").jPlayer("play");



    }
    
  });





//测试，可以这样获取当前播放时间
  $("#jplayer_N").bind($.jPlayer.event.timeupdate, function(event) {
    //console.log("Play began at time = " + event.jPlayer.status.currentTime);
  });

//播放事件，可以在这里向服务器，发起请求，更新歌曲的播放量


  $("#jplayer_N").bind($.jPlayer.event.play,function(event){
    //可以拿到播放音乐的url
    console.log("我被播放了:"+event.jPlayer.status.src);

//

  });



  //这是我自定义的事件，index是要移除的播放列表myPlaylist中的下标，可以获取到要移除歌曲的url，然后向服务器发请求，移除播放列表中的歌曲
  $("#jplayer_N").bind("myevent",function(event, index){
    //playlist是歌曲的Json对象
    var playlist=myPlaylist.playlist[c];
    console.log("我拿到了");

  });








  $(document).on('click', '.jp-play-discover', function(e){
    e && e.preventDefault();
    var $this = $(e.target);
    if (!$this.is('a')) $this = $this.closest('a');

    //判断以前是否处于激活状态

    //alert($this.hasClass("active"));
    var state=$this.hasClass("active");

    if(state){
      //true，播放音乐.
      var music_url=$this.data("music_url");

      //通过url和discoverlist进行匹配，找到歌的详细信息
      var discovers=eval(discoverlist);
      $.each(discovers, function (n, value) {
        if(value.mp3==music_url){
          console.log("下标："+n);
          var discover_item=discovers[n];

          $("#jplayer_N").jPlayer("setMedia",discover_item);
          $("#jplayer_N").jPlayer("play");
        }
      });


    }else{
      //false，暂停音乐
      $("#jplayer_N").jPlayer("pause");
    }

    //其它item的播放按钮都要取消激活
    //其它的父级的父级取消激活
    $('.jp-play-discover').not($this).removeClass('active');
    $('.jp-play-discover').parent('div').parent('div').not($this.parent('div').parent('div')).removeClass("active");


    //把自己的父级的父级激活
    $this.parent('div').parent('div').toggleClass('active');

  });




  //New Songs
  $(document).on('click', '.jp-play-newsongs', function(e) {
    e && e.preventDefault();
    var $this = $(e.target);
    if (!$this.is('a')) $this = $this.closest('a');


    //取消所有discover中所有激活状态
    $('.jp-play-discover').removeClass('active');
    $('.jp-play-discover').parent('div').parent('div').removeClass('active');


    var music_url = $this.data("music_url");


    var newsongs=eval(newsonglist);
    $.each(newsongs, function (n, value) {
      if(value.mp3==music_url){
        console.log("下标："+n);
        var newsong_item=newsongs[n];

        $("#jplayer_N").jPlayer("setMedia",newsong_item);
        $("#jplayer_N").jPlayer("play");
      }
    });



  //  //同一首歌曲不能重复添加
  //
  //  //遍历json数组，判断
  //  //下面使用each进行遍历
  //  var state=false;
  //  $.each(myPlaylist.playlist, function (n, value) {
  //    if(value.mp3==music_url){
  //      console.log("有相同的");
  //      myPlaylist.play(n);
  //      console.log("下标："+n);
  //      state=true ;
  //    }
  //  });
  //
  //if(state){
  //  return;
  //}



//把json对象转为字符串
    //alert(JSON.stringify(myPlaylist.playlist));



    ////添加到播放列表，并播放
    //myPlaylist.add({
    //  title: "名字等会儿再弄",
    //  mp3:music_url},[true]);

  });

  //Top songs
  $(document).on('click', '.jp-play-topsongs', function(e) {
    e && e.preventDefault();
    var $this = $(e.target);
    if (!$this.is('a')) $this = $this.closest('a');


    var music_url = $this.data("music_url");
    //取消所有discover中所有激活状态
    $('.jp-play-discover').removeClass('active');
    $('.jp-play-discover').parent('div').parent('div').removeClass('active');

    //与toplist中匹配
    var topsongs=eval(topsonglist);
    $.each(topsongs, function (n, value) {
      if(value.mp3==music_url){
        console.log("下标："+n);
        var topsong_item=topsongs[n];

        $("#jplayer_N").jPlayer("setMedia",topsong_item);
        $("#jplayer_N").jPlayer("play");
      }
    });


  });


  $("#refresh").click(function(){
	  
	//发送ajax请求
	    console.log("我要刷新");
	    $.ajax({
	        url:baseurl+"/music/discover",
	        type:'post',
	        //data:'data_id='+del_data_id,
	        async: true, //默认为true 异步
	        error:function(){
	          alert('error');
	      
	        },
	        success:function(data){
	          //返回json数据
	          var data=eval(data);
	        //  alert(JSON.stringify(data));
	          
	          $("#mydiscover").setTemplateURL(baseurl+"/static/template/template_discover.html?date="+(+new Date()), null, {filter_data: true});
	          $("#mydiscover").processTemplate(data);
	          
	          
	          //再绑定事件
	          $(".jp-play-discover").click( function(e){
	            e && e.preventDefault();
	            var $this = $(e.target);
	            if (!$this.is('a')) $this = $this.closest('a');

	            //判断以前是否处于激活状态

	            //alert($this.hasClass("active"));
	            var state=$this.hasClass("active");

	            if(!state){
	              //true，播放音乐.
	              var music_url=$this.data("music_url");

	              //通过url和discoverlist进行匹配，找到歌的详细信息
	              var discovers=eval(discoverlist);
	              discovers=data;
	              $.each(discovers, function (n, value) {
	                if(value.mp3==music_url){
	                  console.log("下标："+n);
	                  var discover_item=discovers[n];

	                  $("#jplayer_N").jPlayer("setMedia",discover_item);
	                  $("#jplayer_N").jPlayer("play");
	                }
	              });


	            }else{
	              //false，暂停音乐
	              //$("#jplayer_N").jPlayer("pause");
	            }

	            //其它item的播放按钮都要取消激活
	            //其它的父级的父级取消激活
	            $('.jp-play-discover').not($this).removeClass('active');
	            $('.jp-play-discover').parent('div').parent('div').not($this.parent('div').parent('div')).removeClass("active");


	            //把自己的父级的父级激活
	            $this.parent('div').parent('div').toggleClass('active');

	          });
	          
	          
	          
	          
	          
	          
	      
	        }
	      });
	  
	  
  });





  // video

  $("#jplayer_1").jPlayer({
    ready: function () {
      $(this).jPlayer("setMedia", {
        title: "Big Buck Bunny",
        m4v: "http://127.0.0.1:8080/sources/video/lua.flv.bapi.1_remux.mp4",
        //ogv: "http://127.0.0.1:8080/sources/video/lua.flv.bapi.1_remux.mp4",
        //webmv: "http://127.0.0.1:8080/sources/video/lua.flv.bapi.1_remux.mp4",

        poster: "images/m41.jpg"
      });
    },
    swfPath: "js",
    supplied: "webmv, ogv, m4v",
    size: {
      width: "100%",
      height: "auto",
      cssClass: "jp-video-360p"
    },
    globalVolume: true,
    smoothPlayBar: true,
    keyEnabled: true
  });

});


