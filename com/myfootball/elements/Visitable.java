package com.myfootball.elements;

import com.myfootball.visitor.Visitor;

public interface Visitable {
    void accept(Visitor visitor);
}
