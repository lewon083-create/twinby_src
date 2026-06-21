package yads;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes2.dex */
public final class bj1 implements nq0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f37037c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f37038d0 = lb3.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f37039e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f37040f0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final UUID f37041g0 = new UUID(72057594037932032L, -9223371306706625679L);
    public static final Map h0;
    public long A;
    public long B;
    public mh1 C;
    public mh1 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ul0 f37042a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f37043a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zb3 f37044b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public qq0 f37045b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f37046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lb2 f37048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final lb2 f37049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final lb2 f37050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb2 f37051h;
    public final lb2 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lb2 f37052j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lb2 f37053k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final lb2 f37054l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lb2 f37055m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final lb2 f37056n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f37057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f37058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f37059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f37060r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f37061s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f37062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public aj1 f37063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f37064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f37065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f37066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f37067y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f37068z;

    static {
        HashMap map = new HashMap();
        yi1.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        yi1.a(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        h0 = Collections.unmodifiableMap(map);
    }

    public bj1() {
        this(new jd0(), 0);
    }

    public final void a(int i) throws qb2 {
        if (this.f37063u == null) {
            throw new qb2(a0.u.k(i, "Element ", " must be in a TrackEntry"), null, true, 1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0870  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0a10  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a6  */
    /* JADX WARN: Type inference failed for: r3v0, types: [yads.qq0] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Exception] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r28) throws yads.qb2 {
        /*
            Method dump skipped, instruction units count: 3284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bj1.b(int):void");
    }

    @Override // yads.nq0
    public final void seek(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        ((jd0) this.f37042a).a();
        zb3 zb3Var = this.f37044b;
        zb3Var.f45343b = 0;
        zb3Var.f45344c = 0;
        b();
        for (int i = 0; i < this.f37046c.size(); i++) {
            c93 c93Var = ((aj1) this.f37046c.valueAt(i)).T;
            if (c93Var != null) {
                c93Var.f37317b = false;
                c93Var.f37318c = 0;
            }
        }
    }

    public bj1(jd0 jd0Var, int i) {
        this.f37059q = -1L;
        this.f37060r = -9223372036854775807L;
        this.f37061s = -9223372036854775807L;
        this.f37062t = -9223372036854775807L;
        this.f37068z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f37042a = jd0Var;
        jd0Var.a(new zi1(this));
        this.f37047d = (i & 1) == 0;
        this.f37044b = new zb3();
        this.f37046c = new SparseArray();
        this.f37050g = new lb2(4);
        this.f37051h = new lb2(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new lb2(4);
        this.f37048e = new lb2(fy1.f38575a);
        this.f37049f = new lb2(4);
        this.f37052j = new lb2();
        this.f37053k = new lb2();
        this.f37054l = new lb2(8);
        this.f37055m = new lb2();
        this.f37056n = new lb2();
        this.L = new int[1];
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(yads.aj1 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.bj1.a(yads.aj1, long, int, int, int):void");
    }

    @Override // yads.nq0
    public final void release() {
    }

    public static byte[] a(String str, long j10, long j11) {
        if (j10 != -9223372036854775807L) {
            int i = (int) (j10 / 3600000000L);
            long j12 = j10 - (((long) i) * 3600000000L);
            int i10 = (int) (j12 / 60000000);
            long j13 = j12 - (((long) i10) * 60000000);
            int i11 = (int) (j13 / 1000000);
            return lb3.c(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j13 - (((long) i11) * 1000000)) / j11))));
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.nq0
    public final void a(qq0 qq0Var) {
        this.f37045b0 = qq0Var;
    }

    @Override // yads.nq0
    public final int a(oq0 oq0Var, ig2 ig2Var) {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            ld0 ld0Var = (ld0) oq0Var;
            zA = ((jd0) this.f37042a).a(ld0Var);
            if (zA) {
                long j10 = ld0Var.f40505d;
                if (this.f37067y) {
                    this.A = j10;
                    ig2Var.f39538a = this.f37068z;
                    this.f37067y = false;
                } else if (this.f37064v) {
                    long j11 = this.A;
                    if (j11 != -1) {
                        ig2Var.f39538a = j11;
                        this.A = -1L;
                    }
                } else {
                    continue;
                }
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i = 0; i < this.f37046c.size(); i++) {
            aj1 aj1Var = (aj1) this.f37046c.valueAt(i);
            aj1Var.X.getClass();
            c93 c93Var = aj1Var.T;
            if (c93Var != null) {
                p73 p73Var = aj1Var.X;
                o73 o73Var = aj1Var.f36738j;
                if (c93Var.f37318c > 0) {
                    p73Var.a(c93Var.f37319d, c93Var.f37320e, c93Var.f37321f, c93Var.f37322g, o73Var);
                    c93Var.f37318c = 0;
                }
            }
        }
        return -1;
    }

    public final void a(ld0 ld0Var, int i) throws EOFException, InterruptedIOException {
        lb2 lb2Var = this.f37050g;
        if (lb2Var.f40465c >= i) {
            return;
        }
        byte[] bArr = lb2Var.f40463a;
        if (bArr.length < i) {
            lb2Var.a(Math.max(bArr.length * 2, i));
        }
        lb2 lb2Var2 = this.f37050g;
        byte[] bArr2 = lb2Var2.f40463a;
        int i10 = lb2Var2.f40465c;
        ld0Var.a(bArr2, i10, i - i10, false);
        this.f37050g.d(i);
    }

    public final long a(long j10) throws qb2 {
        long j11 = this.f37060r;
        if (j11 != -9223372036854775807L) {
            return lb3.a(j10, j11, 1000L);
        }
        throw new qb2("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    @Override // yads.nq0
    public final boolean a(oq0 oq0Var) {
        w13 w13Var = new w13();
        ld0 ld0Var = (ld0) oq0Var;
        long j10 = ld0Var.f40504c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i = (int) j11;
        ld0Var.b(w13Var.f44257a.f40463a, 0, 4, false);
        long jN = w13Var.f44257a.n();
        w13Var.f44258b = 4;
        while (true) {
            if (jN != 440786851) {
                int i10 = w13Var.f44258b + 1;
                w13Var.f44258b = i10;
                if (i10 == i) {
                    break;
                }
                ld0Var.b(w13Var.f44257a.f40463a, 0, 1, false);
                jN = ((jN << 8) & (-256)) | ((long) (w13Var.f44257a.f40463a[0] & 255));
            } else {
                long jA = w13Var.a(ld0Var);
                long j12 = w13Var.f44258b;
                if (jA != Long.MIN_VALUE && (j10 == -1 || j12 + jA < j10)) {
                    while (true) {
                        long j13 = w13Var.f44258b;
                        long j14 = j12 + jA;
                        if (j13 < j14) {
                            if (w13Var.a(ld0Var) == Long.MIN_VALUE) {
                                break;
                            }
                            long jA2 = w13Var.a(ld0Var);
                            if (jA2 < 0 || jA2 > 2147483647L) {
                                break;
                            }
                            if (jA2 != 0) {
                                int i11 = (int) jA2;
                                ld0Var.a(false, i11);
                                w13Var.f44258b += i11;
                            }
                        } else if (j13 == j14) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int a(ld0 ld0Var, aj1 aj1Var, int i, boolean z5) throws qb2, EOFException, InterruptedIOException {
        int iA;
        int iA2;
        int i10;
        if ("S_TEXT/UTF8".equals(aj1Var.f36731b)) {
            a(ld0Var, f37037c0, i);
            int i11 = this.T;
            b();
            return i11;
        }
        if ("S_TEXT/ASS".equals(aj1Var.f36731b)) {
            a(ld0Var, f37039e0, i);
            int i12 = this.T;
            b();
            return i12;
        }
        if ("S_TEXT/WEBVTT".equals(aj1Var.f36731b)) {
            a(ld0Var, f37040f0, i);
            int i13 = this.T;
            b();
            return i13;
        }
        p73 p73Var = aj1Var.X;
        if (!this.V) {
            if (aj1Var.f36737h) {
                this.O &= -1073741825;
                if (!this.W) {
                    ld0Var.a(this.f37050g.f40463a, 0, 1, false);
                    this.S++;
                    byte b2 = this.f37050g.f40463a[0];
                    if ((b2 & 128) != 128) {
                        this.Z = b2;
                        this.W = true;
                    } else {
                        throw new qb2("Extension bit is set in signal byte", null, true, 1);
                    }
                }
                byte b10 = this.Z;
                if ((b10 & 1) == 1) {
                    boolean z10 = (b10 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f37043a0) {
                        ld0Var.a(this.f37054l.f40463a, 0, 8, false);
                        this.S += 8;
                        this.f37043a0 = true;
                        lb2 lb2Var = this.f37050g;
                        lb2Var.f40463a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        lb2Var.e(0);
                        p73Var.a(1, this.f37050g);
                        this.T++;
                        this.f37054l.e(0);
                        p73Var.a(8, this.f37054l);
                        this.T += 8;
                    }
                    if (z10) {
                        if (!this.X) {
                            ld0Var.a(this.f37050g.f40463a, 0, 1, false);
                            this.S++;
                            this.f37050g.e(0);
                            this.Y = this.f37050g.m();
                            this.X = true;
                        }
                        int i14 = this.Y * 4;
                        this.f37050g.c(i14);
                        ld0Var.a(this.f37050g.f40463a, 0, i14, false);
                        this.S += i14;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i15 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f37057o;
                        if (byteBuffer == null || byteBuffer.capacity() < i15) {
                            this.f37057o = ByteBuffer.allocate(i15);
                        }
                        this.f37057o.position(0);
                        this.f37057o.putShort(s10);
                        int i16 = 0;
                        int i17 = 0;
                        while (true) {
                            i10 = this.Y;
                            if (i16 >= i10) {
                                break;
                            }
                            int iP = this.f37050g.p();
                            if (i16 % 2 == 0) {
                                this.f37057o.putShort((short) (iP - i17));
                            } else {
                                this.f37057o.putInt(iP - i17);
                            }
                            i16++;
                            i17 = iP;
                        }
                        int i18 = (i - this.S) - i17;
                        if (i10 % 2 == 1) {
                            this.f37057o.putInt(i18);
                        } else {
                            this.f37057o.putShort((short) i18);
                            this.f37057o.putInt(0);
                        }
                        lb2 lb2Var2 = this.f37055m;
                        lb2Var2.f40463a = this.f37057o.array();
                        lb2Var2.f40465c = i15;
                        lb2Var2.f40464b = 0;
                        p73Var.a(i15, this.f37055m);
                        this.T += i15;
                    }
                }
            } else {
                byte[] bArr = aj1Var.i;
                if (bArr != null) {
                    lb2 lb2Var3 = this.f37052j;
                    int length = bArr.length;
                    lb2Var3.f40463a = bArr;
                    lb2Var3.f40465c = length;
                    lb2Var3.f40464b = 0;
                }
            }
            if (!"A_OPUS".equals(aj1Var.f36731b) ? aj1Var.f36735f > 0 : z5) {
                this.O |= 268435456;
                this.f37056n.c(0);
                int i19 = (this.f37052j.f40465c + i) - this.S;
                this.f37050g.c(4);
                lb2 lb2Var4 = this.f37050g;
                byte[] bArr2 = lb2Var4.f40463a;
                bArr2[0] = (byte) ((i19 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[1] = (byte) ((i19 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[2] = (byte) ((i19 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr2[3] = (byte) (i19 & KotlinVersion.MAX_COMPONENT_VALUE);
                p73Var.a(4, lb2Var4);
                this.T += 4;
            }
            this.V = true;
        }
        int i20 = i + this.f37052j.f40465c;
        if (!"V_MPEG4/ISO/AVC".equals(aj1Var.f36731b) && !"V_MPEGH/ISO/HEVC".equals(aj1Var.f36731b)) {
            c93 c93Var = aj1Var.T;
            if (c93Var != null) {
                if (this.f37052j.f40465c == 0) {
                    c93Var.a(ld0Var);
                } else {
                    throw new IllegalStateException();
                }
            }
            while (true) {
                int i21 = this.S;
                if (i21 >= i20) {
                    break;
                }
                int i22 = i20 - i21;
                lb2 lb2Var5 = this.f37052j;
                int i23 = lb2Var5.f40465c - lb2Var5.f40464b;
                if (i23 > 0) {
                    iA2 = Math.min(i22, i23);
                    p73Var.a(iA2, this.f37052j);
                } else {
                    iA2 = p73Var.a(ld0Var, i22, false);
                }
                this.S += iA2;
                this.T += iA2;
            }
        } else {
            byte[] bArr3 = this.f37049f.f40463a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i24 = aj1Var.Y;
            int i25 = 4 - i24;
            while (this.S < i20) {
                int i26 = this.U;
                if (i26 == 0) {
                    lb2 lb2Var6 = this.f37052j;
                    int iMin = Math.min(i24, lb2Var6.f40465c - lb2Var6.f40464b);
                    ld0Var.a(bArr3, i25 + iMin, i24 - iMin, false);
                    if (iMin > 0) {
                        this.f37052j.a(bArr3, i25, iMin);
                    }
                    this.S += i24;
                    this.f37049f.e(0);
                    this.U = this.f37049f.p();
                    this.f37048e.e(0);
                    p73Var.a(4, this.f37048e);
                    this.T += 4;
                } else {
                    lb2 lb2Var7 = this.f37052j;
                    int i27 = lb2Var7.f40465c - lb2Var7.f40464b;
                    if (i27 > 0) {
                        iA = Math.min(i26, i27);
                        p73Var.a(iA, this.f37052j);
                    } else {
                        iA = p73Var.a(ld0Var, i26, false);
                    }
                    this.S += iA;
                    this.T += iA;
                    this.U -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(aj1Var.f36731b)) {
            this.f37051h.e(0);
            p73Var.a(4, this.f37051h);
            this.T += 4;
        }
        int i28 = this.T;
        b();
        return i28;
    }

    public final void a(ld0 ld0Var, byte[] bArr, int i) throws EOFException, InterruptedIOException {
        int length = bArr.length + i;
        lb2 lb2Var = this.f37053k;
        byte[] bArr2 = lb2Var.f40463a;
        if (bArr2.length < length) {
            lb2Var.a(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ld0Var.a(this.f37053k.f40463a, bArr.length, i, false);
        this.f37053k.e(0);
        this.f37053k.d(length);
    }

    public final void b() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f37043a0 = false;
        this.f37052j.c(0);
    }

    public static nq0[] a() {
        return new nq0[]{new bj1(new jd0(), 0)};
    }
}
