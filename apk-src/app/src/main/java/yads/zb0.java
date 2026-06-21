package yads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.SystemClock;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class zb0 implements jl {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public bl[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public ql X;
    public boolean Y;
    public long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uk f45311a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f45312a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sb0 f45313b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f45314b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f45315c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final st f45316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b93 f45317e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bl[] f45318f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bl[] f45319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vy f45320h;
    public final ol i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayDeque f45321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f45322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f45323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public yb0 f45324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final vb0 f45325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final vb0 f45326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bc0 f45327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public af2 f45328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public gl f45329r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public rb0 f45330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public rb0 f45331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AudioTrack f45332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public pk f45333v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ub0 f45334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ub0 f45335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ge2 f45336y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ByteBuffer f45337z;

    public zb0(qb0 qb0Var) {
        this.f45311a = qb0Var.f42236a;
        sb0 sb0Var = qb0Var.f42237b;
        this.f45313b = sb0Var;
        int i = lb3.f40466a;
        this.f45315c = i >= 21 && qb0Var.f42238c;
        this.f45322k = i >= 23 && qb0Var.f42239d;
        this.f45323l = i >= 29 ? qb0Var.f42240e : 0;
        this.f45327p = qb0Var.f42241f;
        vy vyVar = new vy(0);
        this.f45320h = vyVar;
        vyVar.d();
        this.i = new ol(new wb0(this));
        st stVar = new st();
        this.f45316d = stVar;
        b93 b93Var = new b93();
        this.f45317e = b93Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new tp2(), stVar, b93Var);
        Collections.addAll(arrayList, sb0Var.a());
        this.f45318f = (bl[]) arrayList.toArray(new bl[0]);
        this.f45319g = new bl[]{new fw0()};
        this.J = 1.0f;
        this.f45333v = pk.f41937h;
        this.W = 0;
        this.X = new ql();
        ge2 ge2Var = ge2.f38744e;
        this.f45335x = new ub0(ge2Var, false, 0L, 0L);
        this.f45336y = ge2Var;
        this.R = -1;
        this.K = new bl[0];
        this.L = new ByteBuffer[0];
        this.f45321j = new ArrayDeque();
        this.f45325n = new vb0();
        this.f45326o = new vb0();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r14) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a(long):void");
    }

    public final void b() {
        if (f()) {
            j();
            AudioTrack audioTrack = this.i.f41593c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f45332u.pause();
            }
            if (a(this.f45332u)) {
                yb0 yb0Var = this.f45324m;
                yb0Var.getClass();
                yb0Var.b(this.f45332u);
            }
            AudioTrack audioTrack2 = this.f45332u;
            this.f45332u = null;
            if (lb3.f40466a < 21 && !this.V) {
                this.W = 0;
            }
            rb0 rb0Var = this.f45330s;
            if (rb0Var != null) {
                this.f45331t = rb0Var;
                this.f45330s = null;
            }
            ol olVar = this.i;
            olVar.f41601l = 0L;
            olVar.f41612w = 0;
            olVar.f41611v = 0;
            olVar.f41602m = 0L;
            olVar.C = 0L;
            olVar.F = 0L;
            olVar.f41600k = false;
            olVar.f41593c = null;
            olVar.f41596f = null;
            vy vyVar = this.f45320h;
            synchronized (vyVar) {
                vyVar.f44222a = false;
            }
            new nb0(this, audioTrack2).start();
        }
        this.f45326o.f43984a = null;
        this.f45325n.f43984a = null;
    }

    public final ub0 c() {
        ub0 ub0Var = this.f45334w;
        return ub0Var != null ? ub0Var : !this.f45321j.isEmpty() ? (ub0) this.f45321j.getLast() : this.f45335x;
    }

    public final long d() {
        rb0 rb0Var = this.f45331t;
        return rb0Var.f42529c == 0 ? this.D / ((long) rb0Var.f42530d) : this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e() throws yads.fl {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.e():boolean");
    }

    public final boolean f() {
        return this.f45332u != null;
    }

    public final void g() {
        this.U = false;
        if (f()) {
            ol olVar = this.i;
            olVar.f41601l = 0L;
            olVar.f41612w = 0;
            olVar.f41611v = 0;
            olVar.f41602m = 0L;
            olVar.C = 0L;
            olVar.F = 0L;
            olVar.f41600k = false;
            if (olVar.f41613x == -9223372036854775807L) {
                ml mlVar = olVar.f41596f;
                mlVar.getClass();
                mlVar.a();
                this.f45332u.pause();
            }
        }
    }

    public final void h() {
        this.U = true;
        if (f()) {
            ml mlVar = this.i.f41596f;
            mlVar.getClass();
            mlVar.a();
            this.f45332u.play();
        }
    }

    public final void i() {
        if (this.T) {
            return;
        }
        this.T = true;
        ol olVar = this.i;
        long jD = d();
        olVar.f41615z = olVar.a();
        olVar.f41613x = SystemClock.elapsedRealtime() * 1000;
        olVar.A = jD;
        this.f45332u.stop();
        this.A = 0;
    }

    public final void j() {
        this.B = 0L;
        this.C = 0L;
        this.D = 0L;
        this.E = 0L;
        int i = 0;
        this.f45314b0 = false;
        this.F = 0;
        this.f45335x = new ub0(c().f43617a, c().f43618b, 0L, 0L);
        this.I = 0L;
        this.f45334w = null;
        this.f45321j.clear();
        this.M = null;
        this.N = 0;
        this.O = null;
        this.T = false;
        this.S = false;
        this.R = -1;
        this.f45337z = null;
        this.A = 0;
        this.f45317e.f36974o = 0L;
        while (true) {
            bl[] blVarArr = this.K;
            if (i >= blVarArr.length) {
                return;
            }
            bl blVar = blVarArr[i];
            blVar.flush();
            this.L[i] = blVar.a();
            i++;
        }
    }

    public final void k() {
        if (f()) {
            if (lb3.f40466a >= 21) {
                this.f45332u.setVolume(this.J);
                return;
            }
            AudioTrack audioTrack = this.f45332u;
            float f10 = this.J;
            audioTrack.setStereoVolume(f10, f10);
        }
    }

    public final void b(long j10) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.L[i - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = bl.f37087a;
                }
            }
            if (i == length) {
                a(byteBuffer, j10);
            } else {
                bl blVar = this.K[i];
                if (i > this.R) {
                    blVar.a(byteBuffer);
                }
                ByteBuffer byteBufferA = blVar.a();
                this.L[i] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void a(nx0 nx0Var, int[] iArr) {
        bl[] blVarArr;
        int iB;
        int iB2;
        int i;
        int i10;
        int iA;
        int i11;
        int iMax;
        int i12;
        int i13;
        bl[] blVarArr2;
        int[] iArr2;
        if ("audio/raw".equals(nx0Var.f41375m)) {
            if (lb3.e(nx0Var.B)) {
                iB = lb3.b(nx0Var.B, nx0Var.f41388z);
                int i14 = nx0Var.B;
                if (this.f45315c && (i14 == 536870912 || i14 == 805306368 || i14 == 4)) {
                    blVarArr2 = this.f45319g;
                } else {
                    blVarArr2 = this.f45318f;
                }
                b93 b93Var = this.f45317e;
                int i15 = nx0Var.C;
                int i16 = nx0Var.D;
                b93Var.i = i15;
                b93Var.f36969j = i16;
                if (lb3.f40466a < 21 && nx0Var.f41388z == 8 && iArr == null) {
                    iArr2 = new int[6];
                    for (int i17 = 0; i17 < 6; i17++) {
                        iArr2[i17] = i17;
                    }
                } else {
                    iArr2 = iArr;
                }
                this.f45316d.i = iArr2;
                zk zkVar = new zk(nx0Var.A, nx0Var.f41388z, nx0Var.B);
                for (bl blVar : blVarArr2) {
                    try {
                        zk zkVarA = blVar.a(zkVar);
                        if (blVar.isActive()) {
                            zkVar = zkVarA;
                        }
                    } catch (al e3) {
                        throw new el(e3, nx0Var);
                    }
                }
                int i18 = zkVar.f45446c;
                int i19 = zkVar.f45444a;
                int iA2 = lb3.a(zkVar.f45445b);
                blVarArr = blVarArr2;
                iB2 = lb3.b(i18, zkVar.f45445b);
                i = i19;
                i10 = i18;
                iA = iA2;
                i11 = 0;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            bl[] blVarArr3 = new bl[0];
            int i20 = nx0Var.A;
            if (a(nx0Var, this.f45333v)) {
                String str = nx0Var.f41375m;
                str.getClass();
                int iB3 = jt1.b(str, nx0Var.f41372j);
                blVarArr = blVarArr3;
                iB = -1;
                iB2 = -1;
                i = i20;
                i10 = iB3;
                iA = lb3.a(nx0Var.f41388z);
                i11 = 1;
            } else {
                Pair pairA = this.f45311a.a(nx0Var);
                if (pairA != null) {
                    int iIntValue = ((Integer) pairA.first).intValue();
                    int iIntValue2 = ((Integer) pairA.second).intValue();
                    blVarArr = blVarArr3;
                    iB = -1;
                    iB2 = -1;
                    i = i20;
                    i10 = iIntValue;
                    iA = iIntValue2;
                    i11 = 2;
                } else {
                    throw new el("Unable to configure passthrough for: " + nx0Var, nx0Var);
                }
            }
        }
        bc0 bc0Var = this.f45327p;
        int minBufferSize = AudioTrack.getMinBufferSize(i, iA, i10);
        if (minBufferSize != -2) {
            double d10 = this.f45322k ? 8.0d : 1.0d;
            bc0Var.getClass();
            if (i11 == 0) {
                long j10 = i;
                long j11 = ((long) 250000) * j10;
                long j12 = iB2;
                int iA3 = vd1.a((j11 * j12) / 1000000);
                int iA4 = vd1.a(((((long) 750000) * j10) * j12) / 1000000);
                int i21 = lb3.f40466a;
                iMax = Math.max(iA3, Math.min(minBufferSize * 4, iA4));
            } else if (i11 == 1) {
                switch (i10) {
                    case 5:
                        i12 = 80000;
                        break;
                    case 6:
                    case 18:
                        i12 = 768000;
                        break;
                    case 7:
                        i12 = 192000;
                        break;
                    case 8:
                        i12 = 2250000;
                        break;
                    case 9:
                        i12 = 40000;
                        break;
                    case 10:
                        i12 = 100000;
                        break;
                    case 11:
                        i12 = 16000;
                        break;
                    case 12:
                        i12 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i12 = 3062500;
                        break;
                    case 15:
                        i12 = 8000;
                        break;
                    case 16:
                        i12 = 256000;
                        break;
                    case 17:
                        i12 = 336000;
                        break;
                }
                iMax = vd1.a((((long) 50000000) * ((long) i12)) / 1000000);
            } else if (i11 == 2) {
                int i22 = i10 == 5 ? 500000 : 250000;
                switch (i10) {
                    case 5:
                        i13 = 80000;
                        break;
                    case 6:
                    case 18:
                        i13 = 768000;
                        break;
                    case 7:
                        i13 = 192000;
                        break;
                    case 8:
                        i13 = 2250000;
                        break;
                    case 9:
                        i13 = 40000;
                        break;
                    case 10:
                        i13 = 100000;
                        break;
                    case 11:
                        i13 = 16000;
                        break;
                    case 12:
                        i13 = 7000;
                        break;
                    case 13:
                    default:
                        throw new IllegalArgumentException();
                    case 14:
                        i13 = 3062500;
                        break;
                    case 15:
                        i13 = 8000;
                        break;
                    case 16:
                        i13 = 256000;
                        break;
                    case 17:
                        i13 = 336000;
                        break;
                }
                iMax = vd1.a((((long) i22) * ((long) i13)) / 1000000);
            } else {
                throw new IllegalArgumentException();
            }
            int iMax2 = (((Math.max(minBufferSize, (int) (((double) iMax) * d10)) + iB2) - 1) / iB2) * iB2;
            if (i10 == 0) {
                throw new el("Invalid output encoding (mode=" + i11 + ") for: " + nx0Var, nx0Var);
            }
            if (iA != 0) {
                this.f45312a0 = false;
                rb0 rb0Var = new rb0(nx0Var, iB, i11, iB2, i, iA, i10, iMax2, blVarArr);
                if (f()) {
                    this.f45330s = rb0Var;
                    return;
                } else {
                    this.f45331t = rb0Var;
                    return;
                }
            }
            throw new el("Invalid output channel config (mode=" + i11 + ") for: " + nx0Var, nx0Var);
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.R
            yads.bl[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.b()
        L1f:
            r9.b(r7)
            boolean r0 = r4.isEnded()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a():boolean");
    }

    public final long a(boolean z5) {
        long j10;
        long jA;
        if (!f() || this.H) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.i.a(z5), (d() * 1000000) / ((long) this.f45331t.f42531e));
        while (!this.f45321j.isEmpty() && jMin >= ((ub0) this.f45321j.getFirst()).f43620d) {
            this.f45335x = (ub0) this.f45321j.remove();
        }
        ub0 ub0Var = this.f45335x;
        long j11 = jMin - ub0Var.f43620d;
        if (ub0Var.f43617a.equals(ge2.f38744e)) {
            j10 = this.f45335x.f43619c + j11;
        } else if (this.f45321j.isEmpty()) {
            g23 g23Var = this.f45313b.f42877c;
            if (g23Var.f38635o >= 1024) {
                long j12 = g23Var.f38634n;
                f23 f23Var = g23Var.f38630j;
                f23Var.getClass();
                long j13 = j12 - ((long) ((f23Var.f38348k * f23Var.f38340b) * 2));
                int i = g23Var.f38629h.f45444a;
                int i10 = g23Var.f38628g.f45444a;
                if (i == i10) {
                    jA = lb3.a(j11, j13, g23Var.f38635o);
                } else {
                    jA = lb3.a(j11, j13 * ((long) i), g23Var.f38635o * ((long) i10));
                }
            } else {
                jA = (long) (((double) g23Var.f38624c) * j11);
            }
            j10 = jA + this.f45335x.f43619c;
        } else {
            ub0 ub0Var2 = (ub0) this.f45321j.getFirst();
            long jRound = ub0Var2.f43620d - jMin;
            float f10 = this.f45335x.f43617a.f38745b;
            int i11 = lb3.f40466a;
            if (f10 != 1.0f) {
                jRound = Math.round(jRound * ((double) f10));
            }
            j10 = ub0Var2.f43619c - jRound;
        }
        return ((this.f45313b.f42876b.f44530t * 1000000) / ((long) this.f45331t.f42531e)) + j10;
    }

    public final int a(nx0 nx0Var) {
        if (!"audio/raw".equals(nx0Var.f41375m)) {
            return ((this.f45312a0 || !a(nx0Var, this.f45333v)) && this.f45311a.a(nx0Var) == null) ? 0 : 2;
        }
        if (!lb3.e(nx0Var.B)) {
            kh1.d("DefaultAudioSink", "Invalid PCM encoding: " + nx0Var.B);
            return 0;
        }
        int i = nx0Var.B;
        return (i == 2 || (this.f45315c && i == 4)) ? 2 : 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x02de, code lost:
    
        if (r5 == 0) goto L157;
     */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.nio.ByteBuffer r25, long r26, int r28) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a(java.nio.ByteBuffer, long, int):boolean");
    }

    public final void a(ge2 ge2Var) {
        if (f()) {
            try {
                this.f45332u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(ge2Var.f38745b).setPitch(ge2Var.f38746c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e3) {
                kh1.d("DefaultAudioSink", kh1.a("Failed to set playback params", e3));
            }
            ge2Var = new ge2(this.f45332u.getPlaybackParams().getSpeed(), this.f45332u.getPlaybackParams().getPitch());
            ol olVar = this.i;
            olVar.f41599j = ge2Var.f38745b;
            ml mlVar = olVar.f41596f;
            if (mlVar != null) {
                mlVar.a();
            }
        }
        this.f45336y = ge2Var;
    }

    public final void a(ql qlVar) {
        if (this.X.equals(qlVar)) {
            return;
        }
        qlVar.getClass();
        if (this.f45332u != null) {
            this.X.getClass();
        }
        this.X = qlVar;
    }

    public final void a(gk1 gk1Var) {
        this.f45329r = gk1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.nio.ByteBuffer r13, long r14) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.zb0.a(java.nio.ByteBuffer, long):void");
    }

    public final boolean a(nx0 nx0Var, pk pkVar) {
        int iA;
        int playbackOffloadSupport;
        int i = lb3.f40466a;
        if (i >= 29 && this.f45323l != 0) {
            String str = nx0Var.f41375m;
            str.getClass();
            int iB = jt1.b(str, nx0Var.f41372j);
            if (iB != 0 && (iA = lb3.a(nx0Var.f41388z)) != 0) {
                AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(nx0Var.A).setChannelMask(iA).setEncoding(iB).build();
                if (pkVar.f41943g == null) {
                    pkVar.f41943g = new ok(pkVar);
                }
                AudioAttributes audioAttributes = pkVar.f41943g.f41551a;
                if (i >= 31) {
                    playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatBuild, audioAttributes);
                } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, audioAttributes)) {
                    playbackOffloadSupport = (i == 30 && lb3.f40469d.startsWith("Pixel")) ? 2 : 1;
                } else {
                    playbackOffloadSupport = 0;
                }
                if (playbackOffloadSupport != 0) {
                    if (playbackOffloadSupport == 1) {
                        boolean z5 = (nx0Var.C == 0 && nx0Var.D == 0) ? false : true;
                        boolean z10 = this.f45323l == 1;
                        if (!z5 || !z10) {
                        }
                    } else if (playbackOffloadSupport != 2) {
                        throw new IllegalStateException();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(AudioTrack audioTrack) {
        return lb3.f40466a >= 29 && audioTrack.isOffloadedPlayback();
    }
}
