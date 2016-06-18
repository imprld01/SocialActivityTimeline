package com.web;


import com.model.Event;
import com.model.EventProcess;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IndexServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		response.setCharacterEncoding("UTF-8"); 
		PrintWriter out = response.getWriter(); 
		response.setContentType("text/html;charset=UTF-8");	
		
		EventProcess ep = (EventProcess) getServletContext().getAttribute("event");
		if(ep==null){
			System.out.println(">>Make test data");
		/***test data***/
			ArrayList<Event> testEventList = new ArrayList<Event>(); 
			Event e = new Event(0,"2016Join The World青年領袖民主營","(代表台灣免費參加國際會議)二天一夜的課程，與全國最優秀的青年領袖們一起向最頂尖的講者請益國際民主事務潛能。課程主題包括『培養鍛鍊團隊溝通』、『自我價值成長』、『如何參與國際事務』、『外交官看世界』、『大師觀點--國際政治經濟的脈動以及實際與外籍青年互動的『國際之夜』等，課程精彩豐富，是絕對不能錯過的擴展國際視野營隊！！","<p class='MsoNormal'><strong><span style='font-size: 30px;'><span style='color: rgb(155, 187, 89);'>參加方式</span></span></strong></p><p class='MsoNormal' style='margin-bottom: 10px; font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial; line-height: 20px; background-color: rgb(255, 255, 255);'>【參加對象】全國大專院校一年級(含)以上至研究所碩士班在學學生<br></p><p class='MsoNormal' style='margin-bottom: 10px; font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial; line-height: 20px; background-color: rgb(255, 255, 255);'>【報名時間】即日起至6/12&nbsp;(SUN)&nbsp;23:59</p><p class='MsoNormal' style='margin-bottom: 10px; font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial; line-height: 20px; background-color: rgb(255, 255, 255);'>【公佈時間】7/7 <span style='font-size: 10px;'>(THU)</span>&nbsp;17:00&nbsp; <span style='background-color: rgb(229, 185, 183);'>&nbsp; &nbsp;&nbsp;</span><strong><span style='background-color: rgb(75, 172, 198);'><span style='color: rgb(192, 80, 77);'><span style='background-color: rgb(95, 73, 122);'><span style='color: rgb(242, 195, 20);'><span style='background-color: rgb(149, 55, 52);'>&nbsp;公佈!!!&nbsp;</span></span></span></span></span></strong></p><p class='MsoNormal' style='margin-bottom: 10px; font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial; line-height: 20px; background-color: rgb(255, 255, 255);'>【活動時間】9/24 <span style='font-size: 10px;'>(SAT)</span>&nbsp;-&nbsp;9/25 <span style='font-size: 10px;'>(SUN)</span> </p><p class='MsoNormal' style='margin-bottom: 10px; font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial; line-height: 20px; background-color: rgb(255, 255, 255);'>【主辦單位】<span style='color: rgb(84, 141, 212);'><strong><span style='color: rgb(141, 179, 226);'><a href='http://www.zephyr.org.tw/' target='_blank' rel='nofollow'>季風文教基金會</a>&nbsp;</span><a href='http://www.zephyr.org.tw/' target='_blank' rel='nofollow'></a></strong></span>&nbsp;<a href='https://www.facebook.com/zephyrorg/' target='_blank' rel='nofollow'><img src='https://az796311.vo.msecnd.net/userupload/bd99bef0bf9e4ca4bfd106b794f347e1.jpg' alt=''></a>&nbsp;、&nbsp;<a href='http://www.newtaiwanese.org.tw/main.php' target='_blank' rel='nofollow'><strong>新台灣人文教基金會</strong></a> </p><p class='MsoNormal' style='margin-bottom: 10px; font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial; line-height: 20px; background-color: rgb(255, 255, 255);'><span></span>【講者】高希均、金溥聰、羅智成、王文華、郭壽旺等（講師邀約中）</p><p class='MsoNormal' style='margin-bottom: 10px; font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial; line-height: 20px; background-color: rgb(255, 255, 255);'>【地點】台北&nbsp;/&nbsp;劍潭清活動中心&nbsp;<span lang='EN-US'>(</span>台北市士林區中山北路四段16號<span lang='EN-US'>)<o:p></o:p></span></p><p class='MsoNormal' style='margin-bottom: 10px; font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial; line-height: 20px; background-color: rgb(255, 255, 255);'>【內容】營隊 <span style='color: rgb(242, 195, 20);'>x</span> 演講 <span style='color: rgb(242, 195, 20);'>x</span> 世界咖啡館</p><p class='MsoNormal' style='margin-bottom: 10px; font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial; line-height: 20px; background-color: rgb(255, 255, 255);'>【報名資料】<br></p><ol start='1' type='1'><li class='MsoNormal'><strong><span style='color: rgb(247, 150, 70);'>英文影片（30%)：以英文自我介紹，影片長度以2分鐘為限，影片上傳至Youtube。</span></strong></li><li class='MsoNormal'><strong><span style='color: rgb(247, 150, 70);'>申論題(50%)：「台灣問題翻轉的契機」(600字以內) (以中文撰寫）</span></strong></li><li class='MsoNormal'><strong><span style='color: rgb(247, 150, 70);'>加分項目(20%)：社團經驗、獲獎經驗等等。</span></strong><span lang='EN-US'><o:p></o:p></span></li></ol><p class='MsoNormal' style='margin-bottom: 10px; line-height: 20px; background-color: rgb(255, 255, 255); font-family: 'Lantinghei TC Extralight', 'Microsoft JhengHei', Arial;'>【費用】新台幣 2,000 (未入選者全額退費，入選者於二天一夜活動結束後，退還保證金1,000元）</p>","http://gec.nuk.edu.tw/ezfiles/1/1001/pictures/372/part_3773_9185833_91240.jpg",2016,9,24,12,0,71);
			testEventList.add(e);
			Event f = new Event(1,"薈萃坊企業參訪阿默蛋糕工廠","感謝 孫寶年教授幫忙介紹，這學期薈萃坊團隊有幸能參觀 阿默蛋糕企業工廠！（聽說阿默品管十分嚴苛常規都是拒絕參觀的！）","因為機會十分難得～教授希望讓更多學生可以了解深入企業實作及薈萃坊經營團隊在此開放少量名額給予積極主動且有興趣瞭解更多的學生～免費與我們一同企業參訪！👉名額有限！報名請洽 薈萃坊粉絲專頁👉有意願加入薈萃坊團隊者可告知粉專，會優先考","https://scontent-tpe1-1.xx.fbcdn.net/v/t1.0-9/12347900_496405827200968_672082238145456609_n.png?oh=662382e0449427d87dfff155283a6cb5&oe=57CE21F0",2016,6,16,15,30,124);
			testEventList.add(f);
			Event g = new Event(2,"★★★2016鷗海YO演唱會~~","18:00 在育樂館前X型廣場 2016海大畢業演唱會","‪#‎highyoung鷗海yo‬‪#‎highyiung鷗海yo畢業演唱會‬‪#‎玖壹壹‬‪#‎閻奕格‬‪#‎郭靜‬‪#‎宇宙人‬‪#‎林愷倫‬‪#‎Karen‬‪#‎張立東‬‪#‎鄧福如‬‪#‎187INC‬‪#‎賴慈泓‬#鄧福如‪#‎小宇‬","https://scontent-tpe1-1.xx.fbcdn.net/l/t31.0-8/s960x960/13418596_1163327487031344_3758416313258538140_o.jpg",2016,6,16,18,0,412);
			testEventList.add(g);
			Event h = new Event(3,"物聯網實物教學平台演講","各位同學好 資工系特邀請飆機器人_普特企業王經理前來介紹雲端物聯網(IOT)實物教學平台 時間：105/6/24(五)9:20~17:00 地點：205教室","詳細請看資工系公告‬","https://upload.wikimedia.org/wikipedia/commons/a/ab/Internet_of_Things.jpg",2016,6,24,9,20,69);
			testEventList.add(h);
			Event i = new Event(4,"『翻譯工讀生及義工』招募活動","美國教育基金會每年舉辦兩次美國教育展，展覽期間招募及培訓對美國教育文化有興趣、有熱情的在校學生擔任翻譯工讀生及義工。教育展的翻譯及義工是臺灣同學與美國校方的溝通橋樑。","美國教育基金會每年舉辦兩次美國教育展，展覽期間招募及培訓對美國教育文化有興趣、有熱情的在校學生擔任翻譯工讀生及義工。教育展的翻譯及義工是臺灣同學與美國校方的溝通橋樑。","http://www.aief-usa.org/sites/default/files/aief%20logo%202015_0.jpg",2016,6,29,0,0,241);
			testEventList.add(i);
			Event j = new Event(5,"相聲瓦舍《賣橘子的》","遊走紫湖畔，遇見馮翊綱的浪漫情懷；登上五行山，撞見宋少卿的恣意江湖；躲進松林裡，窺見黃士偉的風情萬種。一部集結《西遊記》唐僧師徒、《水滸傳》梁山好漢以及《三國演義》群雄豪傑的相聲作品。","‪遊走紫湖畔，遇見馮翊綱的浪漫情懷；登上五行山，撞見宋少卿的恣意江湖；躲進松林裡，窺見黃士偉的風情萬種。一部集結《西遊記》唐僧師徒、《水滸傳》梁山好漢以及《三國演義》群雄豪傑的相聲作品。‬","https://scontent.cdninstagram.com/t51.2885-15/e15/1172917_722423961192127_2000300105_n.jpg?ig_cache_key=MTE1Njk2MzM4MzcxNzkyMTQ0Ng%3D%3D.2",2016,6,14,18,0,421);
			testEventList.add(j);
			Event k = new Event(6,"孤女的願望-柳依蘭傳奇","圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","‪圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","http://artouch.com/imagefile/modern/1/2016041816046-1.jpg",2016,4,28,0,0,132);
			testEventList.add(k);
			Event l = new Event(7,"孤女的願望-柳依蘭傳奇","圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","‪圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","http://artouch.com/imagefile/modern/1/2016041816046-1.jpg",2016,4,28,0,0,32);
			testEventList.add(l);
			Event m = new Event(8,"孤女的願望-柳依蘭傳奇","圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","‪圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","http://artouch.com/imagefile/modern/1/2016041816046-1.jpg",2016,4,28,0,0,321);
			testEventList.add(m);
			Event n = new Event(9,"孤女的願望-柳依蘭傳奇","圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","‪圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","http://artouch.com/imagefile/modern/1/2016041816046-1.jpg",2016,4,28,0,0,12);
			testEventList.add(n);
			Event o = new Event(10,"孤女的願望-柳依蘭傳奇","圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","‪圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","http://artouch.com/imagefile/modern/1/2016041816046-1.jpg",2016,4,28,0,0,352);
			testEventList.add(o);
			Event p = new Event(11,"孤女的願望-柳依蘭傳奇","圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","‪圖書館1F，如果你對於柳依蘭老師想要進一步了解，千萬不要錯過專題講座。蕭瓊瑞老師略帶沙啞嗓音，搭配優美的音樂，將柳依蘭的傳奇，深深印入你的腦中，絕對要聽一次的演講，千萬不要錯過。(開放旁聽~)","http://artouch.com/imagefile/modern/1/2016041816046-1.jpg",2016,4,28,0,0,751);
			testEventList.add(p);
			EventProcess testEP = new EventProcess();
			testEP.setEventList(testEventList);
			getServletContext().setAttribute("event",testEP);
		/***************/	
		}
		
		ArrayList<Event> eList = ep.getEventList();
		if(eList==null){System.out.println("eList is null.\n");}
				
		/*******Filt event arraylist according user selection*/
		String[] clubList=(String[])request.getAttribute("club");
		eList = ep.eventSelect(eList,clubList);//get clubList to filt
				
		
		/*******make json file to timeline.js，and send to jsp via request**/
		String TLJsonFile = ep.toJson(eList);
		request.setAttribute("TLJsonFile",TLJsonFile);
				
		RequestDispatcher view = request.getRequestDispatcher("index.jsp");
		view.forward(request,response); //next web
		}
}