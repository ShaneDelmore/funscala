package objsets

object tweetsheet {
    val set1 = new Empty                          //> set1  : objsets.Empty = objsets.Empty@2dec8909
    val set2 = set1.incl(new Tweet("a", "a body", 20))
                                                  //> set2  : objsets.TweetSet = objsets.NonEmpty@1bbb60c3
    val set3 = set2.incl(new Tweet("b", "b body", 20))
                                                  //> set3  : objsets.TweetSet = objsets.NonEmpty@47315d34
    val c = new Tweet("c", "c body", 7)           //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [7]
    val d = new Tweet("d", "d body", 9)           //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
    
    val e = new Tweet("e", "e body", 11)          //> e  : objsets.Tweet = User: e
                                                  //| Text: e body [11]
    val set4c = set3.incl(c)                      //> set4c  : objsets.TweetSet = objsets.NonEmpty@79de256f
    val set4d = set3.incl(d)                      //> set4d  : objsets.TweetSet = objsets.NonEmpty@676bd8ea
    val set5 = set4c.incl(d)                      //> set5  : objsets.TweetSet = objsets.NonEmpty@596e1fb1
    //set5.contains(e)
    set5.filter(tw => tw.user == "c").contains(e) //> User: c
                                                  //| Text: c body [7]
                                                  //| res0: Boolean = false
}