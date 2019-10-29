public class LogMessage
   {
   private String machineID;
   private String description;
   
   public LogMessage( String message ){
       String id = "";
       String des = "";
       for (int i = 0; i<message.indexOf(":"); i++){
           id += message.substring(i,i+1);
        }
       for(int i = message.indexOf(":")+1; i<message.length(); i++){
           des+=message.substring(i,i+1);
        }
       this.machineID = id;
       this.description = des;
    }
   public boolean containsWord( String keyword ){
       if(this.description.equals(keyword)){return true;}
       if(this.description.substring(0, keyword.length()).equals(keyword) && this.description.substring(keyword.length(), keyword.length()+1).equals(" ")){return true;}
       if(this.description.substring(this.description.length()-keyword.length(), this.description.length()).equals(keyword) && this.description.substring(this.description.length()-(keyword.length())-1,this.description.length()-(keyword.length())).equals(" ")){return true;}
       String space = " "+keyword+" ";
       for(int i = 0; i<description.length()-space.length();i++){
           if(description.substring(i, i+space.length()).equals(space)){return true;}
       }
       return false;
      } // end method containsWord
      
   public String getMachineID(){
      
      return machineID;    
      } // end method getMachineID
      
   public String getDescription(){
      
      return description;    
   } // end method getDescription
    
      
   


   public String toString(){
      
         return machineID + ":" + description;
   } // end method toString
}