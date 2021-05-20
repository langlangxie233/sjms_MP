public class ConcreteColleagueA extends Colleague{
    @Override
    public void notifyOthers(String info) {
        super.mediator.notifyOthers(info,this);
    }
}
