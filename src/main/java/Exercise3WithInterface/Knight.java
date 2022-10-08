package Exercise3WithInterface;

public class Knight {

    Quest quest;

//    public Knight (Quest quest){
//        this.quest = quest;
//    }

    public String questValidator(Quest quest){
        return "This quest is completed: " + quest.process();
    }
}
