public enum Direction {
    N {
        @Override
        public Direction right() {
            return E;
        }
    },
    S {
        @Override
        public Direction right() {
            return W;
        }
    },
    E {
        @Override
        public Direction right() {
            return S;
        }
    },
    W {
        @Override
        public Direction right() {
            return N;
        }
    },
    ;

    public abstract Direction right();
}
