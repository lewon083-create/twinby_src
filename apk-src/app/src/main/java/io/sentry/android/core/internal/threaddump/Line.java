package io.sentry.android.core.internal.threaddump;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class Line {
    public int lineno;

    @NotNull
    public String text;

    public Line(int i, @NotNull String str) {
        this.lineno = i;
        this.text = str;
    }
}
