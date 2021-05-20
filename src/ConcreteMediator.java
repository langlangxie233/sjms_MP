public class ConcreteMediator {
        public static void main(String[] args) {

            Colleague ConcreteColleagueA = new ConcreteColleagueA();
            Colleague ConcreteColleagueB = new ConcreteColleagueB();
            Mediator mediator = new Mediator(ConcreteColleagueA, ConcreteColleagueB);
            ConcreteColleagueA.setMediator(mediator);
            ConcreteColleagueB.setMediator(mediator);

            ConcreteColleagueA.notifyOthers("我是A发的消息");
            ConcreteColleagueB.notifyOthers("我是B发的消息");
        }
    }