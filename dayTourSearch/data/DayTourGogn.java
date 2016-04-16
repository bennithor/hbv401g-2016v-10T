package dayTourSearch.data;

import dayTourSearch.DayTours;

/**
 *
 * @author Jökull Jóhannsson, Háskóli Íslands, jokullj@gmail.com
 */
public class DayTourGogn {
    private String[][] gogn = {
        {"Northern Lights Tour","See the magic of the northern lights in this excellent evening tour","9900", "-1", "18:30", "6 hours", "0000011", "TRUE", "-1", "", "-1", "SW","50"},
        {"Blue Lagoon Tour", "The most famous tourist attraction in Iceland. Known for its skin healing powers","99000", "-1", "09:20", "4 hours", "1010100", "TRUE", "-1", "", "-1","SW","150"},
        {"The Golden Circle","World famous Geysir and the incredible Gullfoss all in one trip","20000","-1","09:00","4 hours", "0000011","TRUE","-1","","-1","SW","250"},
        {"Reykjavik Walking Tour","Take to the streets of Reykjavík and be amazed","9000","-1","15:00","90 mins","1010100","FALSE","-1","","-1","SW","25"},
	{"4*4 MonsterTruck Glacier Awesomness","Ride a heavily modified truck on top of a glacier. Nuff said","59900","-1","09:00","10 hours","1010100","TRUE","-1","","-1","SW","12"},
	{"Cave Hopping","The Reykjanes has a lot of little known caves worth exploring","15900","18","09:00","6 hours","1010100","TRUE","-1","","-1","SW","25"},
	{"Sub-bars","Visit the local bars in different suburbs of Reykjavík and experience real icelandic culture. Afterparty optional.","9900","20","17:00","12 hours","1010100","TRUE","-1","","-1","SW","230"},
	{"Laugavegurinn - Hiking Trail","Experience the incredible landscape of the icelandic highlands on this epic trail","69900","14","09:00","5 days","1010100","TRUE","-1","","-1","W","15"},
	{"Whalewatching","The magnificent sight of a Minkeewhale will leave you breathless and astound.","29000","-1","10:00","6 hours","1010100","TRUE","-1","","-1","SW","100"},
	{"Best of the east","Visit Kárahnjúkar, learn about the icelandic Lochness monster{Lagarfljótsormurinn} and visit Seyðisfjörður","14900","-1","10:00","6 hours","1010100","TRUE","-1","","-1","E","99"},
	{"Kaldi Brewery","Visit the first successful microbrewery in Iceland and get drunk.","15990","20","16:00","6 hours","1010100","TRUE","-1","","-1","N","40"},
	{"Strandir Hiking Trail","The landscape at Strandir is one to die for. One of the most remote hiking trail in Iceland.","25900","16","07:30","6 days","0000011","TRUE","-1","","-1","NW","25"}
        };
  public DayTourGogn () {
  }   
  
    public String[][] getData(){
        return gogn;
    }
    
}
