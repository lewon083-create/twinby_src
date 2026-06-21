package yads;

import android.util.SparseArray;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class ar implements qq0, fu {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final du f36835k = new zf.a(15);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ig2 f36836l = new ig2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nq0 f36837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nx0 f36839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SparseArray f36840e = new SparseArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36841f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public eu f36842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f36843h;
    public yw2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public nx0[] f36844j;

    public ar(nq0 nq0Var, int i, nx0 nx0Var) {
        this.f36837b = nq0Var;
        this.f36838c = i;
        this.f36839d = nx0Var;
    }

    @Override // yads.qq0
    public final void a() {
        nx0[] nx0VarArr = new nx0[this.f36840e.size()];
        for (int i = 0; i < this.f36840e.size(); i++) {
            nx0 nx0Var = ((zq) this.f36840e.valueAt(i)).f45514d;
            if (nx0Var == null) {
                throw new IllegalStateException();
            }
            nx0VarArr[i] = nx0Var;
        }
        this.f36844j = nx0VarArr;
    }

    public final hu b() {
        yw2 yw2Var = this.i;
        if (yw2Var instanceof hu) {
            return (hu) yw2Var;
        }
        return null;
    }

    public final void c() {
        this.f36837b.release();
    }

    public final void a(eu euVar, long j10, long j11) {
        p73 bl0Var;
        this.f36842g = euVar;
        this.f36843h = j11;
        if (!this.f36841f) {
            this.f36837b.a(this);
            if (j10 != -9223372036854775807L) {
                this.f36837b.seek(0L, j10);
            }
            this.f36841f = true;
            return;
        }
        nq0 nq0Var = this.f36837b;
        if (j10 == -9223372036854775807L) {
            j10 = 0;
        }
        nq0Var.seek(0L, j10);
        for (int i = 0; i < this.f36840e.size(); i++) {
            zq zqVar = (zq) this.f36840e.valueAt(i);
            if (euVar == null) {
                zqVar.f45515e = zqVar.f45513c;
            } else {
                zqVar.f45516f = j11;
                int i10 = zqVar.f45511a;
                lo loVar = (lo) euVar;
                int i11 = 0;
                while (true) {
                    int[] iArr = loVar.f40627a;
                    if (i11 < iArr.length) {
                        if (i10 == iArr[i11]) {
                            bl0Var = loVar.f40628b[i11];
                            break;
                        }
                        i11++;
                    } else {
                        kh1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                        bl0Var = new bl0();
                        break;
                    }
                }
                zqVar.f45515e = bl0Var;
                nx0 nx0Var = zqVar.f45514d;
                if (nx0Var != null) {
                    bl0Var.a(nx0Var);
                }
            }
        }
    }

    public static fu a(int i, nx0 nx0Var, boolean z5, List list, p73 p73Var, af2 af2Var) {
        nq0 tx0Var;
        String str = nx0Var.f41374l;
        if (jt1.e(str)) {
            return null;
        }
        if (str == null || (!str.startsWith("video/webm") && !str.startsWith("audio/webm") && !str.startsWith("application/webm") && !str.startsWith("video/x-matroska") && !str.startsWith("audio/x-matroska") && !str.startsWith("application/x-matroska"))) {
            tx0Var = new tx0(z5 ? 4 : 0, list, p73Var);
        } else {
            tx0Var = new bj1(new jd0(), 1);
        }
        return new ar(tx0Var, i, nx0Var);
    }

    @Override // yads.qq0
    public final void a(yw2 yw2Var) {
        this.i = yw2Var;
    }

    @Override // yads.qq0
    public final p73 a(int i, int i10) {
        p73 bl0Var;
        zq zqVar = (zq) this.f36840e.get(i);
        if (zqVar != null) {
            return zqVar;
        }
        if (this.f36844j == null) {
            zq zqVar2 = new zq(i, i10, i10 == this.f36838c ? this.f36839d : null);
            eu euVar = this.f36842g;
            long j10 = this.f36843h;
            if (euVar == null) {
                zqVar2.f45515e = zqVar2.f45513c;
            } else {
                zqVar2.f45516f = j10;
                lo loVar = (lo) euVar;
                int i11 = 0;
                while (true) {
                    int[] iArr = loVar.f40627a;
                    if (i11 < iArr.length) {
                        if (i10 == iArr[i11]) {
                            bl0Var = loVar.f40628b[i11];
                            break;
                        }
                        i11++;
                    } else {
                        kh1.b("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                        bl0Var = new bl0();
                        break;
                    }
                }
                zqVar2.f45515e = bl0Var;
                nx0 nx0Var = zqVar2.f45514d;
                if (nx0Var != null) {
                    bl0Var.a(nx0Var);
                }
            }
            this.f36840e.put(i, zqVar2);
            return zqVar2;
        }
        throw new IllegalStateException();
    }
}
