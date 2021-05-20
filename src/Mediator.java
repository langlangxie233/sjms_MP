public class Mediator {
    private Colleague ConcreteColleagueA;
    private Colleague ConcreteColleagueB;

    public Mediator(Colleague ConcreteColleagueA, Colleague ConcreteColleagueB) {
        this.ConcreteColleagueA = ConcreteColleagueA;
        this.ConcreteColleagueB = ConcreteColleagueB;
    }

    public void notifyOthers(String info, Colleague colleague){
        String name = colleague.getClass().getName();
        name = name.substring(name.lastIndexOf(".")+1);
        switch (name){
            case "ConcreteColleagueA": {
                ConcreteColleagueB.getInfo(name,info);
                break;
            }
            case "ConcreteColleagueB": {
                ConcreteColleagueA.getInfo(name,info);
                break;
            }
        }
    }
}