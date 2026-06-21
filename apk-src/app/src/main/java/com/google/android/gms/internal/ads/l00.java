package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class l00 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l00 f7359e = new l00(-1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7363d;

    public l00(int i, int i10, int i11) {
        this.f7360a = i;
        this.f7361b = i10;
        this.f7362c = i11;
        this.f7363d = cq0.a(i11) ? cq0.d(i11) * i10 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l00)) {
            return false;
        }
        l00 l00Var = (l00) obj;
        return this.f7360a == l00Var.f7360a && this.f7361b == l00Var.f7361b && this.f7362c == l00Var.f7362c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f7360a), Integer.valueOf(this.f7361b), Integer.valueOf(this.f7362c));
    }

    public final String toString() {
        int i = this.f7360a;
        int length = String.valueOf(i).length();
        int i10 = this.f7361b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f7362c;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i11).length() + 1);
        om1.u(sb2, "AudioFormat[sampleRate=", i, ", channelCount=", i10);
        return l7.o.l(sb2, ", encoding=", i11, "]");
    }
}
