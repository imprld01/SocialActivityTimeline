package com.model;

import java.util.ArrayList;

/**
 * Created by WeiRenChen on 2016/6/13.
 */
public class EventProcess {
	private ArrayList<Event> eventList;
	
	public ArrayList<Event> getEventList() {
        return eventList;
    }

    public void setEventList(ArrayList<Event> eventList) {
        this.eventList = eventList;
    }

    public ArrayList<Event> eventSelect(ArrayList<Event> eList, String[] clubList) {
        return eList;
    }

    public String toJson(ArrayList<Event> eList) {
     return " { \"events\": [ { \"media\": { \"url\": \"https://upload.wikimedia.org/wikipedia/commons/thumb/c/c9/AKB48_logo2.svg/2000px-AKB48_logo2.svg.png\" }, \"start_date\": { \"year\": \"2016\", \"month\": \"6\", \"day\": \"19\" }, \"text\": { \"headline\": \"<a href ='/EventInfoServlet.do?id=0' >AKB48</a>\", \"text\": \"<div style = 'width: 500px;'>第8屆總選舉</div>\" } }, { \"media\": { \"url\": \"http://cdn3.techbang.com.tw/system/excerpt_images/13714/inpage/373f3d621cc50b38115812226c9c434f.png?1371486249\" }, \"start_date\": { \"year\": \"2016\", \"month\": \"6\", \"day\": \"22\" }, \"text\": { \"headline\": \"<a href ='/EventInfoServlet.do?id=1' >期末考來襲</a>\", \"text\": \"下周準備翹課\"}}]}";
      //  for(Event e:eList){
			
			
		//}
    }
}
