package org.dimigo.crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class YTCrawling {
    public static void main(String[] args) {
        String videoID = "rd6m-6l2xQQ";
        try {
            //네이버 웹툰 크롤링
            Document doc = Jsoup.connect("").get();
            System.out.println(doc);
            //List<String> list = result.eachText(); //result의 구성요소를 List<String>으로 뽑는다


        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
