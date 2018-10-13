package com.lmgd02.prototype;

/**
 * 具体原型类
 */
public class ConcreteProtoType extends ProtoType {
    public ConcreteProtoType(String id) {
        super(id);
    }


    @Override
    public ProtoType clone() {
//        return this.clone();
        return null;
    }
}
