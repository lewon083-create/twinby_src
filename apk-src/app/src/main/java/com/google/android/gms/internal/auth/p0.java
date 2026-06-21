package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends IOException {
    public static p0 a() {
        return new p0("Protocol message had invalid UTF-8.");
    }

    public static p0 b() {
        return new p0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static p0 c() {
        return new p0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
