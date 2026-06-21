package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class im1 implements CharSequence {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public char[] f6550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f6551c;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f6550b[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6550b.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i10) {
        return new String(this.f6550b, i, i10 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f6551c == null) {
            this.f6551c = new String(this.f6550b);
        }
        return this.f6551c;
    }
}
