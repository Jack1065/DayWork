package JavaHW;

public class Artwork {

private String title;
private int yearCreated;
private Artist artist;
  
Artwork(){
    this.title ="Unknown";
    this.yearCreated = -1;
    this.artist = new Artist();
}

String getTitle(){
    return title;
}
int getYearCreated(){
    return yearCreated;
}
Artist getArtist(){
    
}

Artwork(String title, int yearCreated, Artist artist){
    this.title = title;
    this.yearCreated = yearCreated;
    this.artist = artist;
}   

   // TODO: Define printInfo() method
   //       Call the printInfo() method in Artist.java to print an artist's information                                                                                          
    void printInfo(){
        artist.printInfo();
        if(yearCreated == -1){
            System.out.println();("Title: " + title);
        }
        else{
            System.out.println("Title: " + title + ", " + yearCreated);
        }
    }
}
