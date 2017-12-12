JavaScript中setInterval函数的作用：每隔指定时间执行某段代码或某个函数。

语法：
	setInterval(code,millisecs,[args...])

参数：
	code为需要执行的代码或函数；
	millisecs为间隔时间，单位毫秒；
	args是可选参数，为所调用函数的参数。

返回值：
	setInterval()函数的返回值为一个唯一标识符ID。

取消执行setInterval():
	使用cleatInterval(arg)函数可以取消执行setInterval()。clearInterval()函数需要接收一个参数，就是setInterval()函数的返回值ID。

示例：
	code为一段代码，
	//每隔1s弹出一次"How you doing?"
	setInterval('alert("How you doing?");',1000);
	
	参数code为函数调用时，它可以是函数名或者匿名函数，
	//每隔1s调用一次函数Greeting()
	//不含参数
	setInterval(Greeting,1000);
	function Greeting(){
		alert("Hello C!");
	}
	//含参数
	setInterval(Greeting,1000,'Yap','How you do?');
	function Greeting(name,greeting){
		alert("Hello" + name + "," + greeting);
	}
	
	//每隔1s执行一次匿名函数
	setInterval(function(){
		alert("Hello!");
	},1000);
