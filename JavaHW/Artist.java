package JavaHW;

public class Artist{
    private String artistName;
    private int birthYear;
    private int deathYear;
   
   Artist(){
    artistName = "Unknown";
    birthYear = -1;
    deathYear = -1;
   }

   Artist(String artistName, int birthYear, int deathYear){
    this.artistName = artistName;
    this.birthYear = birthYear;
    this.deathYear = deathYear;

   }
   String getArtistName(){
    return artistName;
   }
   int getBirthYear(){
    return birthYear;
   }
   int getDeathYear(){
    return deathYear;
   }

   // TODO: Define printInfo() method
   //       If deathYear is entered as -1, only print birthYear
   void printInfo(){
    if(deathYear == -1){
        System.out.printf("Artist: %s (%d to present)\n",artistName, birthYear);
    }
    if(birthYear == -1 || deathYear == -1){
        System.out.printf("Artist: %s (Unknown)\n",artistName);
    }
    else{
        System.out.printf("Artist: %s (%d to %d)\n",artistName, birthYear, deathYear);
    }
   }
}

