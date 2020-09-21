package com.wenjieyue.pojo;

import com.definesys.mpaas.query.annotation.Table;

@Table("Music")
public class Music {

  private String id;
  private String musicrid;
  private String isstar;
  private String islistenfee;
  private String hasmv;
  private String haslossless;
  private String duration;
  private String contenttype;
  private Integer artistid;
  private String artist;
  private String albumpic;
  private Integer albumid;
  private String album;


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public String getMusicrid() {
    return musicrid;
  }

  public void setMusicrid(String musicrid) {
    this.musicrid = musicrid;
  }


  public String getIsstar() {
    return isstar;
  }

  public void setIsstar(String isstar) {
    this.isstar = isstar;
  }


  public String getIslistenfee() {
    return islistenfee;
  }

  public void setIslistenfee(String islistenfee) {
    this.islistenfee = islistenfee;
  }


  public String getHasmv() {
    return hasmv;
  }

  public void setHasmv(String hasmv) {
    this.hasmv = hasmv;
  }


  public String getHaslossless() {
    return haslossless;
  }

  public void setHaslossless(String haslossless) {
    this.haslossless = haslossless;
  }


  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }


  public String getContenttype() {
    return contenttype;
  }

  public void setContenttype(String contenttype) {
    this.contenttype = contenttype;
  }


  public Integer getArtistid() {
    return artistid;
  }

  public void setArtistid(Integer artistid) {
    this.artistid = artistid;
  }


  public String getArtist() {
    return artist;
  }

  public void setArtist(String artist) {
    this.artist = artist;
  }


  public String getAlbumpic() {
    return albumpic;
  }

  public void setAlbumpic(String albumpic) {
    this.albumpic = albumpic;
  }


  public Integer getAlbumid() {
    return albumid;
  }

  public void setAlbumid(Integer albumid) {
    this.albumid = albumid;
  }


  public String getAlbum() {
    return album;
  }

  public void setAlbum(String album) {
    this.album = album;
  }

}
