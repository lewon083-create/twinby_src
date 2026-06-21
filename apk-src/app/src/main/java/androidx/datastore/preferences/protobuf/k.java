package androidx.datastore.preferences.protobuf;

import com.google.android.gms.internal.ads.vb1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1433b;

    public abstract int[] A(int i, int[] iArr);

    public abstract int B();

    public ByteBuffer C(int i, byte[] bArr) {
        int[] iArrA = A(i, vb1.c(bArr));
        int[] iArr = (int[]) iArrA.clone();
        vb1.a(iArr);
        for (int i10 = 0; i10 < 16; i10++) {
            iArrA[i10] = iArrA[i10] + iArr[i10];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrA, 0, 16);
        return byteBufferOrder;
    }

    public abstract void a(int i);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i);

    public abstract int e(int i);

    public abstract boolean f();

    public abstract h g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public void x(char[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        synchronized (this) {
            try {
                int i = this.f1432a;
                if (array.length + i < wk.a.f35278a) {
                    this.f1432a = i + array.length;
                    ((kotlin.collections.l) this.f1433b).addLast(array);
                }
                Unit unit = Unit.f27471a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract boolean y(int i);

    public void z() {
        int iU;
        do {
            iU = u();
            if (iU == 0) {
                return;
            }
            int i = this.f1432a;
            if (i >= 100) {
                throw new e0("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f1432a = i + 1;
            this.f1432a--;
        } while (y(iU));
    }
}
