package application;

import java.util.ArrayList;
import java.util.Collections;

public class StageObject {
	private String imgUrl;
	private ArrayList<String> options = new ArrayList<String>();
	private String correctOption;
	
	public StageObject(String url, String cOpt, String opt2, String opt3){
		imgUrl = url;
		correctOption = cOpt;
		options.add(cOpt);
		options.add(opt2);
		options.add(opt3);
		Collections.shuffle(options);
	}
	
	public ArrayList<String> getOptions(){
		return options;
	}
	
	public String getCorrectOption() {
		return correctOption;
	}
	
	public String getImgUrl() {
		return imgUrl;
	}
}
