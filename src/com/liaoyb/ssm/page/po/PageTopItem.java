package com.liaoyb.ssm.page.po;

public class PageTopItem extends PageMusic{
	//排名
		private int rank;
		
		//歌手头像的url
		private String artistImg;

		public String getArtistImg() {
			return artistImg;
		}

		public void setArtistImg(String artistImg) {
			this.artistImg = artistImg;
		}

		public int getRank() {
			return rank;
		}

		public void setRank(int rank) {
			this.rank = rank;
		}
}
