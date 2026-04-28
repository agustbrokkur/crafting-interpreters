package com.craftinginterpreters.lox;

abstract class Expr2 {
    static class Binary extends Expr2 {
        Binary(Expr2 left, Token operator, Expr2 right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }

        final Expr2 left;
        final Token operator;
        final Expr2 right;
    }
}
