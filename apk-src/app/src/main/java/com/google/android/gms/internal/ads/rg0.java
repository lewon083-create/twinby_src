package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class rg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f9934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9935e;

    public long a() {
        int i = this.f9933c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f9934d;
        int i10 = this.f9931a;
        long j10 = jArr[i10];
        this.f9931a = this.f9935e & (i10 + 1);
        this.f9933c = i - 1;
        return j10;
    }

    public long b() {
        int i = this.f9933c;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = this.f9934d;
        int i10 = this.f9931a;
        long j10 = jArr[i10];
        this.f9931a = this.f9935e & (i10 + 1);
        this.f9933c = i - 1;
        return j10;
    }
}
