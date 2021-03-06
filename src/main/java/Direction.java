public enum Direction {
    N {
        @Override
        public Direction right() {
            return E;
        }

        @Override
        public Direction left() {
            return W;
        }
    },
    S {
        @Override
        public Direction right() {
            return W;
        }

        @Override
        public Direction left() {
            return E;
        }
    },
    E {
        @Override
        public Direction right() {
            return S;
        }

        @Override
        public Direction left() {
            return N;
        }
    },
    W {
        @Override
        public Direction right() {
            return N;
        }

        @Override
        public Direction left() {
            return S;
        }
    },
    ;

    public abstract Direction right();

    public abstract Direction left();
}
