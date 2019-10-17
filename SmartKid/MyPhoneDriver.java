
public class MyPhoneDriver
{
    public static void main(){
        Song s1 = new Song("piano man", 5);
        Song s2 = new Song("bean", 600);
        Song s3 = new Song("onaip", 30);
        MyPhone phone1 = new MyPhone("white", 1000, s1, s2, s3);
        Song[] five = new Song[4];
        five[0]=new Song("cat",800);
        five[1]=new Song("chop-sticks",10000);
        five[2]=new Song("The Entertaner",36);
        five[3]=new Song("All Star",9);
        MyPhone phone2 = new MyPhone("white", 50, five);
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone1.getTotalPlayTime() + " seconds");
        System.out.println(phone1.getTotalPlayTimeMinSec());
        System.out.println(phone2.getTotalPlayTime() + " seconds");
        System.out.println(phone2.getTotalPlayTimeMinSec());
        phone1.deleteAllSongs();
        phone2.deleteAllSongs();
        System.out.println("\n\n\n\n");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone1.getTotalPlayTime() + " seconds");
        System.out.println(phone1.getTotalPlayTimeMinSec());
        System.out.println(phone2.getTotalPlayTime() + " seconds");
        System.out.println(phone2.getTotalPlayTimeMinSec());
    }
}
