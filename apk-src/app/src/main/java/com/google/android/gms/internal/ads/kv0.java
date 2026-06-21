package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kv0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7316c;

    public static String b(int i) {
        return "" + ((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE)) + ((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    public static void n(StringBuilder sb2) {
        if (sb2 != null) {
            sb2.delete(0, sb2.length());
        }
    }

    public static String p(int i) {
        char c8 = (char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        int length = String.valueOf(c8).length();
        char c9 = (char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        int length2 = String.valueOf(c9).length();
        char c10 = (char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int length3 = String.valueOf(c10).length();
        char c11 = (char) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        StringBuilder sb2 = new StringBuilder(l7.o.v(length, length2, length3, String.valueOf(c11).length()));
        sb2.append(c8);
        sb2.append(c9);
        sb2.append(c10);
        sb2.append(c11);
        return sb2.toString();
    }

    public void a(int i) {
        this.f7316c = i | this.f7316c;
    }

    public boolean c(int i) {
        return (this.f7316c & i) == i;
    }

    public boolean e() {
        return this.f7316c == 4;
    }

    public boolean g() {
        return this.f7316c == 1;
    }

    public boolean i() {
        return this.f7316c == 6;
    }

    public boolean j() {
        return this.f7316c == 3;
    }

    public boolean k() {
        return this.f7316c == 2;
    }

    public abstract kv0 m();

    public boolean o() {
        return q(1);
    }

    public boolean q(int i) {
        return (this.f7316c & i) == i;
    }

    public String toString() {
        switch (this.f7315b) {
            case 0:
                return p(this.f7316c);
            case 1:
            default:
                return super.toString();
            case 2:
                return b(this.f7316c);
        }
    }

    public /* synthetic */ kv0(int i, int i10) {
        this.f7315b = i10;
        this.f7316c = i;
    }
}
