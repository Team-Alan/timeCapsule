var music = new Audio();
music.src="../snd/snd.mp3";
music.loop=true;
music.play();
function playAudio()
{
    var play=document.getElementById("play");
    var mute=document.getElementById("mute");

    play.addEventListener('click', fplay);
    play.addEventListener('click', fmute);

    function fplay(){
        if(music.paused){
            music.play();
            play.style.background="url(../img/pause.png)"
        }else{
            music.pause();
            play.style.background="url(../img/play.png)"
        }
    }

    function fmute(){
        if(music.muted){
            music.muted = false;
            mute.style.background="url(mute.png)";
        }else{
            music.muted = true;
            mute.style.background="url(test.png)";
        }
    }
}
window.addEventListener('load', playAudio);

/* test
setTimeout(function() {
    alert('http://naver.com');
    location.href="http://naver.com";
}, 3000);
 */

/* sample in html
<script>
    var music = new Audio();
    music.src="snd.mp3";
    music.loop=true;
    music.play();
    function playAudio()
    {
        var play=document.getElementById("play");
        var mute=document.getElementById("mute");

        play.addEventListener('click', fplay);
        play.addEventListener('click', fmute);

        function fplay(){
            if(music.paused){
                music.play();
                play.style.background="url(pause.png)";
            }else{
                music.pause();
                play.style.background="url(play.png)";
            }
        }

        function fmute(){
            if(music.muted){
                music.muted = false;
                mute.style.background="url(mute.png)";
            }else{
                music.muted = true;
                mute.style.background="url(unmute.png)";
            }
        }
    }
    window.addEventListener('load', playAudio);
</script>
 */