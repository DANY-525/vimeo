/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package src;

import com.clickntap.vimeo.Vimeo;
import com.clickntap.vimeo.VimeoResponse;
import java.io.File;
/**
 *
 * @author daniel
 */
public class VImeoSample {
    public static void main(String[] args) throws Exception {
    Vimeo vimeo = new Vimeo("24b4c7ad22fcee59a5060e202229b730"); 
    
    //add a video
    boolean upgradeTo1080 = true;
    String videoEndPoint = vimeo.addVideo(new File("/home/daniel/Documentos/Vimeo-master/video5.mp4"), upgradeTo1080);
    
    //get video info
    VimeoResponse info = vimeo.getVideoInfo(videoEndPoint);
    System.out.println(info);
    
    //edit video
    String name = "Name";
    String desc = "Description";
    String license = ""; //see Vimeo API Documentation
    String privacyView = "password"; //see Vimeo API Documentation
    String privacyEmbed = "private"; //see Vimeo API Documentation
    boolean reviewLink = false;
    vimeo.updateVideoMetadata(videoEndPoint, name, desc, license, privacyView, privacyEmbed, reviewLink);
    
    //add video privacy domain
    vimeo.addVideoPrivacyDomain(videoEndPoint, "clickntap.com");
   
    //delete video
//    vimeo.removeVideo(videoEndPoint);
}
}
