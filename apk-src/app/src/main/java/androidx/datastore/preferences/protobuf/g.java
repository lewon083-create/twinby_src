package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1399g;

    public g(byte[] bArr, int i, int i10) {
        super(bArr);
        h.c(i, i + i10, bArr.length);
        this.f1398f = i;
        this.f1399g = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final byte a(int i) {
        int i10 = this.f1399g;
        if (((i10 - (i + 1)) | i) >= 0) {
            return this.f1408c[this.f1398f + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(l7.o.i(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a0.u.j(i, i10, "Index > length: ", ", "));
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final void f(int i, byte[] bArr) {
        System.arraycopy(this.f1408c, this.f1398f, bArr, 0, i);
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final int g() {
        return this.f1398f;
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final byte n(int i) {
        return this.f1408c[this.f1398f + i];
    }

    @Override // androidx.datastore.preferences.protobuf.h
    public final int size() {
        return this.f1399g;
    }
}
