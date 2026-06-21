package yads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class g23 implements bl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f38624c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f38625d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public zk f38626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public zk f38627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zk f38628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zk f38629h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f23 f38630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f38631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ShortBuffer f38632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ByteBuffer f38633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f38634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f38635o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f38636p;

    public g23() {
        zk zkVar = zk.f45443e;
        this.f38626e = zkVar;
        this.f38627f = zkVar;
        this.f38628g = zkVar;
        this.f38629h = zkVar;
        ByteBuffer byteBuffer = bl.f37087a;
        this.f38631k = byteBuffer;
        this.f38632l = byteBuffer.asShortBuffer();
        this.f38633m = byteBuffer;
        this.f38623b = -1;
    }

    @Override // yads.bl
    public final zk a(zk zkVar) throws al {
        if (zkVar.f45446c != 2) {
            throw new al(zkVar);
        }
        int i = this.f38623b;
        if (i == -1) {
            i = zkVar.f45444a;
        }
        this.f38626e = zkVar;
        zk zkVar2 = new zk(i, zkVar.f45445b, 2);
        this.f38627f = zkVar2;
        this.i = true;
        return zkVar2;
    }

    @Override // yads.bl
    public final void b() {
        int i;
        f23 f23Var = this.f38630j;
        if (f23Var != null) {
            int i10 = f23Var.f38348k;
            float f10 = f23Var.f38341c;
            float f11 = f23Var.f38342d;
            int i11 = f23Var.f38350m + ((int) ((((i10 / (f10 / f11)) + f23Var.f38352o) / (f23Var.f38343e * f11)) + 0.5f));
            f23Var.f38347j = f23Var.b(f23Var.f38347j, i10, (f23Var.f38346h * 2) + i10);
            int i12 = 0;
            while (true) {
                i = f23Var.f38346h * 2;
                int i13 = f23Var.f38340b;
                if (i12 >= i * i13) {
                    break;
                }
                f23Var.f38347j[(i13 * i10) + i12] = 0;
                i12++;
            }
            f23Var.f38348k = i + f23Var.f38348k;
            f23Var.a();
            if (f23Var.f38350m > i11) {
                f23Var.f38350m = i11;
            }
            f23Var.f38348k = 0;
            f23Var.f38355r = 0;
            f23Var.f38352o = 0;
        }
        this.f38636p = true;
    }

    @Override // yads.bl
    public final void flush() {
        if (isActive()) {
            zk zkVar = this.f38626e;
            this.f38628g = zkVar;
            zk zkVar2 = this.f38627f;
            this.f38629h = zkVar2;
            if (this.i) {
                this.f38630j = new f23(zkVar.f45444a, zkVar.f45445b, this.f38624c, this.f38625d, zkVar2.f45444a);
            } else {
                f23 f23Var = this.f38630j;
                if (f23Var != null) {
                    f23Var.f38348k = 0;
                    f23Var.f38350m = 0;
                    f23Var.f38352o = 0;
                    f23Var.f38353p = 0;
                    f23Var.f38354q = 0;
                    f23Var.f38355r = 0;
                    f23Var.f38356s = 0;
                    f23Var.f38357t = 0;
                    f23Var.f38358u = 0;
                    f23Var.f38359v = 0;
                }
            }
        }
        this.f38633m = bl.f37087a;
        this.f38634n = 0L;
        this.f38635o = 0L;
        this.f38636p = false;
    }

    @Override // yads.bl
    public final boolean isActive() {
        if (this.f38627f.f45444a != -1) {
            return Math.abs(this.f38624c - 1.0f) >= 1.0E-4f || Math.abs(this.f38625d - 1.0f) >= 1.0E-4f || this.f38627f.f45444a != this.f38626e.f45444a;
        }
        return false;
    }

    @Override // yads.bl
    public final boolean isEnded() {
        if (!this.f38636p) {
            return false;
        }
        f23 f23Var = this.f38630j;
        return f23Var == null || (f23Var.f38350m * f23Var.f38340b) * 2 == 0;
    }

    @Override // yads.bl
    public final void reset() {
        this.f38624c = 1.0f;
        this.f38625d = 1.0f;
        zk zkVar = zk.f45443e;
        this.f38626e = zkVar;
        this.f38627f = zkVar;
        this.f38628g = zkVar;
        this.f38629h = zkVar;
        ByteBuffer byteBuffer = bl.f37087a;
        this.f38631k = byteBuffer;
        this.f38632l = byteBuffer.asShortBuffer();
        this.f38633m = byteBuffer;
        this.f38623b = -1;
        this.i = false;
        this.f38630j = null;
        this.f38634n = 0L;
        this.f38635o = 0L;
        this.f38636p = false;
    }

    @Override // yads.bl
    public final ByteBuffer a() {
        int i;
        f23 f23Var = this.f38630j;
        if (f23Var != null && (i = f23Var.f38350m * f23Var.f38340b * 2) > 0) {
            if (this.f38631k.capacity() < i) {
                ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                this.f38631k = byteBufferOrder;
                this.f38632l = byteBufferOrder.asShortBuffer();
            } else {
                this.f38631k.clear();
                this.f38632l.clear();
            }
            ShortBuffer shortBuffer = this.f38632l;
            int iMin = Math.min(shortBuffer.remaining() / f23Var.f38340b, f23Var.f38350m);
            shortBuffer.put(f23Var.f38349l, 0, f23Var.f38340b * iMin);
            int i10 = f23Var.f38350m - iMin;
            f23Var.f38350m = i10;
            short[] sArr = f23Var.f38349l;
            int i11 = f23Var.f38340b;
            System.arraycopy(sArr, iMin * i11, sArr, 0, i10 * i11);
            this.f38635o += (long) i;
            this.f38631k.limit(i);
            this.f38633m = this.f38631k;
        }
        ByteBuffer byteBuffer = this.f38633m;
        this.f38633m = bl.f37087a;
        return byteBuffer;
    }

    @Override // yads.bl
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            f23 f23Var = this.f38630j;
            f23Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f38634n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = f23Var.f38340b;
            int i10 = iRemaining2 / i;
            short[] sArrB = f23Var.b(f23Var.f38347j, f23Var.f38348k, i10);
            f23Var.f38347j = sArrB;
            shortBufferAsShortBuffer.get(sArrB, f23Var.f38348k * f23Var.f38340b, ((i * i10) * 2) / 2);
            f23Var.f38348k += i10;
            f23Var.a();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }
}
