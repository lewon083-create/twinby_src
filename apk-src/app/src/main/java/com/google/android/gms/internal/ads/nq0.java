package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pattern f8431a;

    public nq0() {
        Pattern patternCompile;
        try {
            patternCompile = Pattern.compile((String) q9.s.f31967e.f31970c.a(al.D7));
        } catch (PatternSyntaxException unused) {
            patternCompile = null;
        }
        this.f8431a = patternCompile;
    }
}
