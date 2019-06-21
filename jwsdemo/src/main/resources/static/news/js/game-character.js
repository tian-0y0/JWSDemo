var timer = null; //全局命名定时器的名字
		var img; //全局命名img
		var r = 0; //全局命名角度
		img = document.getElementById('mus');
		var audio = document.getElementById('music');
		var flag = true; //全局声明状态切换的初始值
		mus.onclick = function() {
			if (audio.paused) {
				audio.play();
				timer = setInterval(() => {
					img.style.transform = 'rotate(' + (r += 10) + 'deg)';
					img.style.transition = 'all 1s linear';
					console.log('定时器启动');
				}, 400);
			} else{
				audio.pause(); // 暂停
				clearInterval(timer);
				console.log('定时器已停止');
			}
		}