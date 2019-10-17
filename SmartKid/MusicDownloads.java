import java.util.List;
import java.util.ArrayList;

public class MusicDownloads
   {
   private List<DownloadInfo> downloadList;
   
   public MusicDownloads()
      {
      downloadList = new ArrayList<DownloadInfo>();
      downloadList.add( new DownloadInfo( "Hey Jude", 5 ) );
      downloadList.add( new DownloadInfo( "Soul Sister", 3 ) );
      downloadList.add( new DownloadInfo( "Aqualung", 10 ) );
      } // end constructor
      
   public DownloadInfo getDownloadInfo(String title)
   {
      int b=-1;
      for(int i=0; i<downloadList.size(); i++){
          if (downloadList.get(i).getTitle().equals(title)){
              b=i;
          }
      }
      if(b==-1){
          return null;
      }
      else{
          return downloadList.get(b);
      }
   } // end method getDownloadInfo
      
   public void updateDownloads( List<String> titles )
   {
       for(int i=0;i<titles.size();i++){
           DownloadInfo d = getDownloadInfo(titles.get(i));
           if(d == null){
               downloadList.add(new DownloadInfo(titles.get(i)));
           }
           else{
               d.incrementTimesDownloaded();
           }
       }
   } // end method updateDownloads
      
   public String toString()
      {
      String musicDownloads = new String( "" );
      
      for( DownloadInfo item : downloadList )
         {
         musicDownloads = musicDownloads + item;    
         } // end for each
         
      return musicDownloads;
      } // end toString
   } // end class MusicDownloads