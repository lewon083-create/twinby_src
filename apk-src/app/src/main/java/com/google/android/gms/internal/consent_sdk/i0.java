package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f13407b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f13409d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13408c = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13410e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13411f = Integer.MAX_VALUE;

    public i0(String str) {
        this.f13409d = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        int i10 = this.f13408c;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int i11 = i10 - 1;
        String string = null;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f13408c = 4;
            int i12 = this.f13410e;
            while (true) {
                int length = this.f13410e;
                if (length == -1) {
                    this.f13408c = 3;
                    break;
                }
                String str = this.f13409d;
                int length2 = str.length();
                h0.d(length, length2);
                while (true) {
                    if (length >= length2) {
                        length = -1;
                        break;
                    }
                    if (str.charAt(length) == ',') {
                        break;
                    }
                    length++;
                }
                if (length == -1) {
                    length = str.length();
                    this.f13410e = -1;
                    i = -1;
                } else {
                    i = length + 1;
                    this.f13410e = i;
                }
                if (i == i12) {
                    int i13 = i + 1;
                    this.f13410e = i13;
                    if (i13 > str.length()) {
                        this.f13410e = -1;
                    }
                } else {
                    if (i12 < length) {
                        str.charAt(i12);
                    }
                    if (i12 < length) {
                        str.charAt(length - 1);
                    }
                    int i14 = this.f13411f;
                    if (i14 == 1) {
                        length = str.length();
                        this.f13410e = -1;
                        if (length > i12) {
                            str.charAt(length - 1);
                        }
                    } else {
                        this.f13411f = i14 - 1;
                    }
                    string = str.subSequence(i12, length).toString();
                }
            }
            this.f13407b = string;
            if (this.f13408c != 3) {
                this.f13408c = 1;
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
        this.f13408c = 2;
        String str = this.f13407b;
        this.f13407b = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
