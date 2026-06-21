package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class BaggageHeader {

    @NotNull
    public static final String BAGGAGE_HEADER = "baggage";

    @NotNull
    private final String value;

    public BaggageHeader(@NotNull String str) {
        this.value = str;
    }

    @Nullable
    public static BaggageHeader fromBaggageAndOutgoingHeader(@NotNull Baggage baggage, @Nullable List<String> list) {
        String headerString = baggage.toHeaderString(Baggage.fromHeader(list, true, baggage.logger).getThirdPartyHeader());
        if (headerString.isEmpty()) {
            return null;
        }
        return new BaggageHeader(headerString);
    }

    @NotNull
    public String getName() {
        return BAGGAGE_HEADER;
    }

    @NotNull
    public String getValue() {
        return this.value;
    }
}
