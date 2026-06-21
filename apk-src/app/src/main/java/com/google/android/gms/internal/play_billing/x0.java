package com.google.android.gms.internal.play_billing;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends h0 {
    public static final Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x0 f14357j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f14358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f14359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f14360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f14361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f14362h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        f14357j = new x0(objArr, 0, objArr, 0, 0);
    }

    public x0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f14358d = objArr;
        this.f14359e = i10;
        this.f14360f = objArr2;
        this.f14361g = i11;
        this.f14362h = i12;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f14358d;
        int i10 = this.f14362h;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int c() {
        return this.f14362h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f14360f;
            if (objArr.length != 0) {
                int iB = d3.b(obj.hashCode());
                while (true) {
                    int i10 = iB & this.f14361g;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iB = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.h0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f14359e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.play_billing.x
    public final Object[] n() {
        return this.f14358d;
    }

    @Override // com.google.android.gms.internal.play_billing.h0
    public final c0 p() {
        return c0.q(this.f14362h, this.f14358d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f14362h;
    }
}
