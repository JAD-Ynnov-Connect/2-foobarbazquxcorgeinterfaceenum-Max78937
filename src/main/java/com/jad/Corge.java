package com.jad;

public class Corge implements ICorge {
    private IFoo foo;

    public Corge(IFoo foo) {
        this.foo = foo;
    }

    public void setFoo(IFoo foo) {
        this.foo = foo;
    }

    public IFoo getFoo() {
        return foo;
    }
}
