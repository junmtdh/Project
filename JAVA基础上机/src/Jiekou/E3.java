package Jiekou;

//创建CentralPartyCommittee接口
interface CentralPartyCommittee {
    void partyLeader();
}
abstract class StateCouncil {
    //创建安全生产的方法
    abstract void safetyInProduction();
}
// 创建Province类继承StateCouncil类并且实现CentralPartyCommittee接口
class Province extends StateCouncil implements CentralPartyCommittee{
    void safetyInProduction() {//实现safetyInProduction()方法
        System.out.println("我们各省人民一定按照国务院的指示进行安全生产！");
    }
    public void partyLeader() {//实现partyLeader()方法
        System.out.println("我们各省人民一定坚持党的领导");
    }
}
//创建主类E
public class E3 {
    public static void main(String[] args) {

        Province p = new Province();
        p.safetyInProduction();
        p.partyLeader();
    }
}

