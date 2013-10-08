package objsets

object tweetsheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
    val set1 = new Empty;System.out.println("""set1  : objsets.Empty = """ + $show(set1 ));$skip(55); 
    val set2 = set1.incl(new Tweet("a", "a body", 20));System.out.println("""set2  : objsets.TweetSet = """ + $show(set2 ));$skip(55); 
    val set3 = set2.incl(new Tweet("b", "b body", 20));System.out.println("""set3  : objsets.TweetSet = """ + $show(set3 ));$skip(40); 
    val c = new Tweet("c", "c body", 7);System.out.println("""c  : objsets.Tweet = """ + $show(c ));$skip(40); 
    val d = new Tweet("d", "d body", 9);System.out.println("""d  : objsets.Tweet = """ + $show(d ));$skip(46); 
    
    val e = new Tweet("e", "e body", 11);System.out.println("""e  : objsets.Tweet = """ + $show(e ));$skip(29); 
    val set4c = set3.incl(c);System.out.println("""set4c  : objsets.TweetSet = """ + $show(set4c ));$skip(29); 
    val set4d = set3.incl(d);System.out.println("""set4d  : objsets.TweetSet = """ + $show(set4d ));$skip(29); 
    val set5 = set4c.incl(d);System.out.println("""set5  : objsets.TweetSet = """ + $show(set5 ));$skip(73); val res$0 = 
    //set5.contains(e)
    set5.filter(tw => tw.user == "c").contains(e);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(68); val res$1 = 
    
    set5.filter(tw => tw.retweets > this.retweets).contains(e);System.out.println("""res1: <error> = """ + $show(res$1))}
}
