package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m31 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f7757b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CharSequence f7759d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7758c = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7760e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7761f = Integer.MAX_VALUE;

    public m31(CharSequence charSequence) {
        this.f7759d = charSequence;
    }

    public abstract int a(int i);

    public abstract int b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int iB;
        ix.k0(this.f7758c != 4);
        int i = this.f7758c;
        int i10 = i - 1;
        String string = null;
        if (i == 0) {
            throw null;
        }
        if (i10 == 0) {
            return true;
        }
        if (i10 != 2) {
            this.f7758c = 4;
            int i11 = this.f7760e;
            while (true) {
                int i12 = this.f7760e;
                if (i12 == -1) {
                    this.f7758c = 3;
                    break;
                }
                int iA = a(i12);
                CharSequence charSequence = this.f7759d;
                if (iA == -1) {
                    iA = charSequence.length();
                    this.f7760e = -1;
                    iB = -1;
                } else {
                    iB = b(iA);
                    this.f7760e = iB;
                }
                if (iB == i11) {
                    int i13 = iB + 1;
                    this.f7760e = i13;
                    if (i13 > charSequence.length()) {
                        this.f7760e = -1;
                    }
                } else {
                    if (i11 < iA) {
                        charSequence.charAt(i11);
                    }
                    if (i11 < iA) {
                        charSequence.charAt(iA - 1);
                    }
                    int i14 = this.f7761f;
                    if (i14 == 1) {
                        iA = charSequence.length();
                        this.f7760e = -1;
                        if (iA > i11) {
                            charSequence.charAt(iA - 1);
                        }
                    } else {
                        this.f7761f = i14 - 1;
                    }
                    string = charSequence.subSequence(i11, iA).toString();
                }
            }
            this.f7757b = string;
            if (this.f7758c != 3) {
                this.f7758c = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f7758c = 2;
        String str = this.f7757b;
        this.f7757b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
