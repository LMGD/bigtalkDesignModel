package com.lmgd.proxy;

import java.io.Serializable;

public abstract class Send  implements Serializable {
    public abstract void sendFlows();

    public abstract void sendEat();
}
