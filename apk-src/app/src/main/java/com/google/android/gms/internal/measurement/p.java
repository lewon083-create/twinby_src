package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Iterator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13914c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f13915d;

    public /* synthetic */ p(int i, Object obj) {
        this.f13913b = i;
        this.f13915d = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13913b) {
            case 0:
                if (this.f13914c < ((q) this.f13915d).f13924b.length()) {
                }
                break;
            case 1:
                if (this.f13914c < ((q) this.f13915d).f13924b.length()) {
                }
                break;
            default:
                if (this.f13914c < ((d) this.f13915d).r()) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        switch (this.f13913b) {
            case 0:
                String str = ((q) this.f13915d).f13924b;
                int i = this.f13914c;
                if (i >= str.length()) {
                    throw new NoSuchElementException();
                }
                this.f13914c = i + 1;
                return new q(String.valueOf(i));
            case 1:
                q qVar = (q) this.f13915d;
                String str2 = qVar.f13924b;
                int i10 = this.f13914c;
                if (i10 >= str2.length()) {
                    throw new NoSuchElementException();
                }
                this.f13914c = i10 + 1;
                return new q(String.valueOf(qVar.f13924b.charAt(i10)));
            default:
                d dVar = (d) this.f13915d;
                if (this.f13914c >= dVar.r()) {
                    int i11 = this.f13914c;
                    throw new NoSuchElementException(l7.o.j(i11, "Out of bounds index: ", new StringBuilder(String.valueOf(i11).length() + 21)));
                }
                int i12 = this.f13914c;
                this.f13914c = i12 + 1;
                return dVar.t(i12);
        }
    }
}
