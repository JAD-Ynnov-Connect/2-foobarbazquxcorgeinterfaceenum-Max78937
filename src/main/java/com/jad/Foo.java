package com.jad;

import java.util.ArrayList;

public class Foo implements IFoo {
    private IBaz baz;
    private ArrayList<IBar> bars = new ArrayList<IBar>();
    private IQux qux = new IQux() {
        @Override
        public void doSomethingLikeAQux() {
        }
    };
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
    }

    public ICorge getCorge() {
        return this.corge;
    }

    public ICorge setCorge(ICorge corge) {
        this.corge = corge;
        return corge;
    }

    public IQux getQux() {
        return this.qux;
    }

    public ArrayList<IBar> getBars() {
        return this.bars;
    }

    public IBaz getBaz() {
        return this.baz;
    }

    public IBar addBar(IBar bar) {
        this.bars.add(bar);
        return bar;
    }
}