package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends n0 {
    public static final Object[] i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final q0 f13521j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f13522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f13523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f13524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f13525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f13526h;

    static {
        Object[] objArr = new Object[0];
        i = objArr;
        f13521j = new q0(objArr, 0, objArr, 0, 0);
    }

    public q0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f13522d = objArr;
        this.f13523e = i10;
        this.f13524f = objArr2;
        this.f13525g = i11;
        this.f13526h = i12;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.f13522d;
        int i10 = this.f13526h;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final int c() {
        return this.f13526h;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        Object[] objArr = this.f13524f;
        if (objArr.length == 0) {
            return false;
        }
        int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) obj.hashCode()) * (-862048943)), 15)) * 461845907);
        while (true) {
            int i10 = iRotateLeft & this.f13525g;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iRotateLeft = i10 + 1;
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.consent_sdk.j0
    public final Object[] f() {
        return this.f13522d;
    }

    @Override // com.google.android.gms.internal.consent_sdk.n0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f13523e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        m0 p0Var = this.f13494c;
        if (p0Var == null) {
            k0 k0Var = m0.f13467c;
            int i10 = this.f13526h;
            p0Var = i10 == 0 ? p0.f13513f : new p0(i10, this.f13522d);
            this.f13494c = p0Var;
        }
        return p0Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13526h;
    }
}
