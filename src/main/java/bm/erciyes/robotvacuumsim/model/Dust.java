package bm.erciyes.robotvacuumsim.model;

import bm.erciyes.robotvacuumsim.util.DirtType;

public class Dust extends Dirt {
    public Dust(){
        this.type = DirtType.DUST;
        this.batteryCost = 1;
        this.remainingTime = 1;
    }

    @Override
    public void clean() {
        if(remainingTime > 0)
            remainingTime -=1;
    }
}
