package com.voxeo.tropo.enums;

public enum Format {

	WAV, MP3;
	
	@Override public String toString() {
		
		String s = super.toString();
		return "audio/"+s.toLowerCase();
	}
}
