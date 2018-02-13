package com.effectivejava.items.item2;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class BabsBatter extends BaseballPlayer {
    private Optional<PLAYINGTIME>PT;
    private Optional<POWER> PW;
    private Optional<SPEED> SP;
    private Optional<AVERAGE> AVG;
    private Optional<String> OBPDisplay;

    public static class Builder extends BaseballPlayer.Builder<Builder> {

        private Optional<PLAYINGTIME>PT = Optional.empty();
        private Optional<POWER> PW = Optional.empty();
        private Optional<SPEED> SP = Optional.empty();
        private Optional<AVERAGE> AVG = Optional.empty();
        private Optional<String> OBPDisplay = Optional.empty();

        public Builder() {
        }

        public Builder power(POWER val) {
            PW = Optional.ofNullable(val);
            return this;
        }

        public Builder speed(SPEED val) {
            SP = Optional.ofNullable(val);
            return this;
        }

        public Builder average(AVERAGE val) {
            AVG = Optional.ofNullable(val);
            return this;
        }

        public Builder playingTime(PLAYINGTIME val) {
            PT = Optional.ofNullable(val);
            return this;
        }

        @Override
        public BabsBatter build() {
            return new BabsBatter(this);
        }

        @Override
        protected Builder self() { return this; }
    }

    private BabsBatter(Builder builder) {
        super(builder);
        PW = builder.PW;
        SP = builder.SP;
        AVG = builder.AVG;
    }

    @Override
    public String toString() {
        List<String> strings = new LinkedList<>();
        strings.add(super.toString());
        strings.add(PW.map(h -> String.valueOf(h.impact())).orElse(" "));
        strings.add(SP.map(h -> String.valueOf(h.impact())).orElse(" "));
        strings.add(AVG.map(h -> String.valueOf(h.impact())).orElse(" "));
        return String.join(":", strings);
    }
}
