package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class d31 extends gr implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f4444d;

    public d31(Pattern pattern) {
        super(false);
        pattern.getClass();
        this.f4444d = pattern;
    }

    @Override // com.google.android.gms.internal.ads.gr
    public final String toString() {
        return this.f4444d.toString();
    }
}
