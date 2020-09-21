package com.wenjieyue.pojo;

import com.definesys.mpaas.query.annotation.Table;

@Table("Singer")
public class Singer {

  private String aartist;
  private String albumnum;
  private String artistfans;
  private String contentType;
  private Integer id;
  private String isstar;
  private Integer musicnum;
  private Integer mvnum;
  private String name;
  private String pic;
  private String pic70;
  private String pic120;
  private String pic300;


  public String getAartist() {
    return aartist;
  }

  public void setAartist(String aartist) {
    this.aartist = aartist;
  }


  public String getAlbumnum() {
    return albumnum;
  }

  public void setAlbumnum(String albumnum) {
    this.albumnum = albumnum;
  }


  public String getArtistfans() {
    return artistfans;
  }

  public void setArtistfans(String artistfans) {
    this.artistfans = artistfans;
  }


  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getIsstar() {
    return isstar;
  }

  public void setIsstar(String isstar) {
    this.isstar = isstar;
  }


  public Integer getMusicnum() {
    return musicnum;
  }

  public void setMusicnum(Integer musicnum) {
    this.musicnum = musicnum;
  }


  public Integer getMvnum() {
    return mvnum;
  }

  public void setMvnum(Integer mvnum) {
    this.mvnum = mvnum;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }


  public String getPic70() {
    return pic70;
  }

  public void setPic70(String pic70) {
    this.pic70 = pic70;
  }


  public String getPic120() {
    return pic120;
  }

  public void setPic120(String pic120) {
    this.pic120 = pic120;
  }


  public String getPic300() {
    return pic300;
  }

  public void setPic300(String pic300) {
    this.pic300 = pic300;
  }

}
