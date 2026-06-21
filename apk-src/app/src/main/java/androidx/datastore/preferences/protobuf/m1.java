package androidx.datastore.preferences.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1444b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1(Unsafe unsafe, int i) {
        super(unsafe);
        this.f1444b = i;
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final boolean c(long j10, Object obj) {
        switch (this.f1444b) {
            case 0:
                if (!p1.f1463g) {
                }
                break;
            default:
                if (!p1.f1463g) {
                }
                break;
        }
        return p1.c(j10, obj);
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final double d(long j10, Object obj) {
        switch (this.f1444b) {
        }
        return Double.longBitsToDouble(g(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final float e(long j10, Object obj) {
        switch (this.f1444b) {
        }
        return Float.intBitsToFloat(f(j10, obj));
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void j(Object obj, long j10, boolean z5) {
        switch (this.f1444b) {
            case 0:
                if (!p1.f1463g) {
                    p1.l(obj, j10, z5 ? (byte) 1 : (byte) 0);
                } else {
                    p1.k(obj, j10, z5 ? (byte) 1 : (byte) 0);
                }
                break;
            default:
                if (!p1.f1463g) {
                    p1.l(obj, j10, z5 ? (byte) 1 : (byte) 0);
                } else {
                    p1.k(obj, j10, z5 ? (byte) 1 : (byte) 0);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void k(Object obj, long j10, byte b2) {
        switch (this.f1444b) {
            case 0:
                if (!p1.f1463g) {
                    p1.l(obj, j10, b2);
                } else {
                    p1.k(obj, j10, b2);
                }
                break;
            default:
                if (!p1.f1463g) {
                    p1.l(obj, j10, b2);
                } else {
                    p1.k(obj, j10, b2);
                }
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void l(Object obj, long j10, double d10) {
        switch (this.f1444b) {
            case 0:
                o(obj, j10, Double.doubleToLongBits(d10));
                break;
            default:
                o(obj, j10, Double.doubleToLongBits(d10));
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final void m(Object obj, long j10, float f10) {
        switch (this.f1444b) {
            case 0:
                n(Float.floatToIntBits(f10), j10, obj);
                break;
            default:
                n(Float.floatToIntBits(f10), j10, obj);
                break;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.o1
    public final boolean r() {
        switch (this.f1444b) {
        }
        return false;
    }
}
