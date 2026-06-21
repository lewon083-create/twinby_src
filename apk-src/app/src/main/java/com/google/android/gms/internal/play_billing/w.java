package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f14343c;

    public w(int i) {
        switch (i) {
            case 1:
                this.f14343c = null;
                this.f14341a = false;
                this.f14342b = 0;
                break;
            default:
                d3.i(4, "initialCapacity");
                this.f14343c = new Object[4];
                this.f14342b = 0;
                break;
        }
    }

    public static ac.h a() {
        ac.h hVar = new ac.h();
        hVar.f751b = true;
        hVar.f752c = 0;
        return hVar;
    }

    public static int d(int i, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
        }
        if (i10 <= i) {
            return i;
        }
        int i11 = i + (i >> 1) + 1;
        if (i11 < i10) {
            int iHighestOneBit = Integer.highestOneBit(i10 - 1);
            i11 = iHighestOneBit + iHighestOneBit;
        }
        if (i11 < 0) {
            return Integer.MAX_VALUE;
        }
        return i11;
    }

    public abstract void b(na.c cVar, sb.g gVar);

    public void c(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f14343c;
        int i = this.f14342b;
        this.f14342b = i + 1;
        objArr[i] = obj;
    }

    public void e(int i) {
        int length = this.f14343c.length;
        int iD = d(length, this.f14342b + i);
        if (iD > length || this.f14341a) {
            this.f14343c = Arrays.copyOf(this.f14343c, iD);
            this.f14341a = false;
        }
    }
}
