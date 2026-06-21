package b4;

import ad.i1;
import ad.o0;
import ad.q1;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.internal.ads.ro0;
import com.google.android.gms.internal.ads.vs1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import s3.a0;
import u3.b0;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s extends s3.a {
    public static final byte[] I0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final r3.e A;
    public long A0;
    public final i B;
    public boolean B0;
    public final MediaCodec.BufferInfo C;
    public boolean C0;
    public final ArrayDeque D;
    public boolean D0;
    public final b0 E;
    public long E0;
    public final AtomicInteger F;
    public s3.b F0;
    public j3.o G;
    public s3.b G0;
    public j3.o H;
    public o0 H0;
    public ni.i I;
    public ni.i J;
    public a0 K;
    public MediaCrypto L;
    public final long M;
    public float N;
    public float O;
    public m P;
    public j3.o Q;
    public MediaFormat R;
    public boolean S;
    public float T;
    public ArrayDeque U;
    public q V;
    public p W;
    public int X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f1928a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f1929b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f1930c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public long f1931d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f1932e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f1933f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public ByteBuffer f1934g0;
    public boolean h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f1935i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f1936j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f1937k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f1938l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f1939m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f1940n0;
    public int o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f1941p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f1942q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f1943r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f1944s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Context f1945t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f1946t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f1947u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f1948u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k f1949v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f1950v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f1951w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f1952w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float f1953x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public s3.i f1954x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r3.e f1955y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public vs1 f1956y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r3.e f1957z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public r f1958z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, int i, l lVar, boolean z5, float f10) {
        super(i);
        k kVar = k.f1905c;
        this.f1945t = context.getApplicationContext();
        this.f1947u = lVar;
        this.f1949v = kVar;
        this.f1951w = z5;
        this.f1953x = f10;
        this.F = new AtomicInteger();
        this.f1955y = new r3.e(0);
        this.f1957z = new r3.e(0);
        this.A = new r3.e(2);
        i iVar = new i(2);
        iVar.f1902m = 32;
        this.B = iVar;
        this.C = new MediaCodec.BufferInfo();
        this.N = 1.0f;
        this.O = 1.0f;
        this.M = -9223372036854775807L;
        this.D = new ArrayDeque();
        this.f1958z0 = r.f1922f;
        iVar.t(0);
        iVar.f32192f.order(ByteOrder.nativeOrder());
        b0 b0Var = new b0();
        b0Var.f34078a = k3.k.f26866a;
        b0Var.f34080c = 0;
        b0Var.f34079b = 2;
        this.E = b0Var;
        this.T = -1.0f;
        this.X = 0;
        this.f1939m0 = 0;
        this.f1932e0 = -1;
        this.f1933f0 = -1;
        this.f1931d0 = -9223372036854775807L;
        this.f1944s0 = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.f1930c0 = -9223372036854775807L;
        this.f1940n0 = 0;
        this.o0 = 0;
        this.f1956y0 = new vs1(1);
        this.D0 = false;
        this.E0 = 0L;
        int i10 = o0.f846d;
        this.H0 = i1.f812k;
        s3.b bVar = s3.b.f32451b;
        this.F0 = bVar;
        this.G0 = bVar;
    }

    @Override // s3.a
    public void A(float f10, float f11) throws s3.i {
        this.N = f10;
        this.O = f11;
        y0(this.Q);
    }

    public final void A0(long j10) {
        j3.o oVar = (j3.o) this.f1958z0.f1926d.d(j10);
        if (oVar == null && this.B0 && this.R != null) {
            oVar = (j3.o) this.f1958z0.f1926d.c();
        }
        if (oVar != null) {
            this.H = oVar;
        } else if (!this.S || this.H == null) {
            return;
        }
        j3.o oVar2 = this.H;
        oVar2.getClass();
        d0(oVar2, this.R);
        this.S = false;
        this.B0 = false;
    }

    @Override // s3.a
    public final int B(j3.o oVar) throws s3.i {
        try {
            return x0(this.f1949v, oVar);
        } catch (v e3) {
            throw d(e3, oVar, false, 4002);
        }
    }

    @Override // s3.a
    public final int C() {
        return 8;
    }

    public final void E(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.F0.f32452a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030b  */
    /* JADX WARN: Type inference failed for: r24v0, types: [b4.s, s3.a] */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v4 */
    /* JADX WARN: Type inference failed for: r28v5 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(long r25, long r27) throws s3.i {
        /*
            Method dump skipped, instruction units count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.s.F(long, long):boolean");
    }

    public abstract s3.c G(p pVar, j3.o oVar, j3.o oVar2);

    public o H(IllegalStateException illegalStateException, p pVar) {
        return new o(illegalStateException, pVar);
    }

    public final boolean I(long j10, long j11) throws s3.i {
        m mVar = this.P;
        mVar.getClass();
        int i = this.f1933f0;
        MediaCodec.BufferInfo bufferInfo = this.C;
        if (i < 0) {
            int iW = mVar.w(bufferInfo);
            if (iW < 0) {
                if (iW != -2) {
                    if (this.f1929b0 && (this.f1946t0 || this.f1940n0 == 2)) {
                        i0();
                    }
                    long j12 = this.f1930c0;
                    if (j12 != -9223372036854775807L) {
                        long j13 = j12 + 100;
                        this.f32436h.getClass();
                        if (j13 < System.currentTimeMillis()) {
                            i0();
                            return false;
                        }
                    }
                    return false;
                }
                this.f1943r0 = true;
                m mVar2 = this.P;
                mVar2.getClass();
                MediaFormat mediaFormatO = mVar2.o();
                if (this.X != 0 && mediaFormatO.getInteger("width") == 32 && mediaFormatO.getInteger("height") == 32) {
                    this.f1928a0 = true;
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 29 && !this.H0.isEmpty()) {
                    o0<String> o0Var = this.H0;
                    s3.b bVar = s3.b.f32451b;
                    HashMap map = new HashMap();
                    for (String str : o0Var) {
                        if (mediaFormatO.containsKey(str)) {
                            int valueTypeForKey = mediaFormatO.getValueTypeForKey(str);
                            if (valueTypeForKey == 1) {
                                map.put(str, Integer.valueOf(mediaFormatO.getInteger(str)));
                            } else if (valueTypeForKey == 2) {
                                map.put(str, Long.valueOf(mediaFormatO.getLong(str)));
                            } else if (valueTypeForKey == 3) {
                                map.put(str, Float.valueOf(mediaFormatO.getFloat(str)));
                            } else if (valueTypeForKey == 4) {
                                map.put(str, mediaFormatO.getString(str));
                            } else if (valueTypeForKey == 5) {
                                ByteBuffer byteBuffer = mediaFormatO.getByteBuffer(str);
                                if (byteBuffer == null) {
                                    map.put(str, null);
                                } else {
                                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
                                    byteBufferAllocate.put(byteBuffer.duplicate());
                                    byteBufferAllocate.flip();
                                    map.put(str, byteBufferAllocate);
                                }
                            }
                        }
                    }
                    s3.b bVar2 = new s3.b(map);
                    if (!bVar2.equals(this.G0)) {
                        this.G0 = bVar2;
                        a0(bVar2);
                    }
                }
                this.R = mediaFormatO;
                this.S = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.E0;
            if (this.f1928a0) {
                this.f1928a0 = false;
                mVar.g(iW);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                i0();
                return false;
            }
            this.f1933f0 = iW;
            ByteBuffer byteBufferH = mVar.H(iW);
            this.f1934g0 = byteBufferH;
            if (byteBufferH != null) {
                byteBufferH.position(bufferInfo.offset);
                this.f1934g0.limit(bufferInfo.offset + bufferInfo.size);
            }
            A0(bufferInfo.presentationTimeUs);
        }
        boolean z5 = this.D0 || bufferInfo.presentationTimeUs < this.f32440m;
        long j14 = this.f1958z0.f1927e;
        boolean z10 = j14 != -9223372036854775807L && j14 <= bufferInfo.presentationTimeUs;
        this.h0 = z10;
        ByteBuffer byteBuffer2 = this.f1934g0;
        int i10 = this.f1933f0;
        int i11 = bufferInfo.flags;
        long j15 = bufferInfo.presentationTimeUs;
        j3.o oVar = this.H;
        oVar.getClass();
        if (!j0(j10, j11, mVar, byteBuffer2, i10, i11, 1, j15, z5, z10, oVar)) {
            return false;
        }
        f0(bufferInfo.presentationTimeUs);
        boolean z11 = (bufferInfo.flags & 4) != 0;
        if (!z11 && this.f1942q0 && this.h0) {
            this.f32436h.getClass();
            this.f1930c0 = System.currentTimeMillis();
        }
        this.f1933f0 = -1;
        this.f1934g0 = null;
        if (!z11) {
            return true;
        }
        i0();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean J() throws s3.i {
        /*
            Method dump skipped, instruction units count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.s.J():boolean");
    }

    public final void K() {
        try {
            m mVar = this.P;
            mVar.getClass();
            mVar.flush();
        } finally {
            o0();
        }
    }

    public final List L(boolean z5) {
        j3.o oVar = this.G;
        oVar.getClass();
        k kVar = this.f1949v;
        ArrayList arrayListO = O(kVar, oVar, z5);
        if (!arrayListO.isEmpty() || !z5) {
            return arrayListO;
        }
        ArrayList arrayListO2 = O(kVar, oVar, false);
        if (!arrayListO2.isEmpty()) {
            m3.b.s("MediaCodecRenderer", "Drm session requires secure decoder for " + oVar.f26335n + ", but no secure decoder available. Trying to proceed with " + arrayListO2 + ".");
        }
        return arrayListO2;
    }

    public int M(r3.e eVar) {
        return 0;
    }

    public abstract float N(float f10, j3.o oVar, j3.o[] oVarArr);

    public abstract ArrayList O(k kVar, j3.o oVar, boolean z5);

    public long P(long j10, long j11) {
        return super.g(j10, j11);
    }

    public final r Q() {
        ArrayDeque arrayDeque = this.D;
        return !arrayDeque.isEmpty() ? (r) arrayDeque.getLast() : this.f1958z0;
    }

    public abstract q9.o R(p pVar, j3.o oVar, MediaCrypto mediaCrypto, float f10);

    public abstract void S(r3.e eVar);

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(b4.p r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.s.T(b4.p, android.media.MediaCrypto):void");
    }

    public final boolean U(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        j3.o oVar = this.H;
        return oVar == null || !Objects.equals(oVar.f26335n, "audio/opus") || j10 - j11 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V() throws s3.i {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.s.V():void");
    }

    public final void W(MediaCrypto mediaCrypto, boolean z5) throws q {
        j3.o oVar = this.G;
        oVar.getClass();
        if (this.U == null) {
            try {
                List listL = L(z5);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.U = arrayDeque;
                if (this.f1951w) {
                    arrayDeque.addAll(listL);
                } else {
                    ArrayList arrayList = (ArrayList) listL;
                    if (!arrayList.isEmpty()) {
                        this.U.add((p) arrayList.get(0));
                    }
                }
                this.V = null;
            } catch (v e3) {
                throw new q(oVar, e3, z5, -49998);
            }
        }
        if (this.U.isEmpty()) {
            throw new q(oVar, null, z5, -49999);
        }
        ArrayDeque arrayDeque2 = this.U;
        arrayDeque2.getClass();
        while (this.P == null) {
            p pVar = (p) arrayDeque2.peekFirst();
            pVar.getClass();
            if (!X(oVar) || !u0(pVar)) {
                return;
            }
            try {
                T(pVar, mediaCrypto);
            } catch (Exception e7) {
                m3.b.t("MediaCodecRenderer", "Failed to initialize decoder: " + pVar, e7);
                arrayDeque2.removeFirst();
                q qVar = new q("Decoder init failed: " + pVar.f1907a + ", " + oVar, e7, oVar.f26335n, z5, pVar, e7 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e7).getDiagnosticInfo() : null);
                Y(qVar);
                q qVar2 = this.V;
                if (qVar2 == null) {
                    this.V = qVar;
                } else {
                    this.V = new q(qVar2.getMessage(), qVar2.getCause(), qVar2.f1918b, qVar2.f1919c, qVar2.f1920d, qVar2.f1921e);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.V;
                }
            }
        }
        this.U = null;
    }

    public boolean X(j3.o oVar) {
        return true;
    }

    public abstract void Y(Exception exc);

    public abstract void Z(long j10, long j11, String str);

    public abstract void a0(s3.b bVar);

    public abstract void b0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e3, code lost:
    
        if (r4.C(r2) != false) goto L128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public s3.c c0(r3.b r13) throws s3.i {
        /*
            Method dump skipped, instruction units count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.s.c0(r3.b):s3.c");
    }

    public abstract void d0(j3.o oVar, MediaFormat mediaFormat);

    public void f0(long j10) {
        this.A0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.D;
            if (arrayDeque.isEmpty() || j10 < ((r) arrayDeque.peek()).f1923a) {
                return;
            }
            r rVar = (r) arrayDeque.poll();
            rVar.getClass();
            r0(rVar);
            g0();
        }
    }

    @Override // s3.a
    public final long g(long j10, long j11) {
        return P(j10, j11);
    }

    public abstract void g0();

    @Override // s3.a, s3.w0
    public void handleMessage(int i, Object obj) {
        int i10;
        if (i == 11) {
            a0 a0Var = (a0) obj;
            a0Var.getClass();
            this.K = a0Var;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i10 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                o0 o0Var = (o0) obj;
                if (this.H0.equals(o0Var)) {
                    return;
                }
                if (i10 >= 31) {
                    HashSet hashSet = new HashSet(o0Var);
                    HashSet hashSet2 = new HashSet();
                    q1 it = this.H0.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    m mVar = this.P;
                    if (mVar != null) {
                        if (!hashSet2.isEmpty()) {
                            mVar.L(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            mVar.K(new ArrayList(hashSet));
                        }
                    }
                }
                this.H0 = o0Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            s3.b bVar = (s3.b) obj;
            this.F0 = bVar;
            m mVar2 = this.P;
            if (mVar2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : bVar.f32452a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                mVar2.a(bundle);
            }
        }
    }

    public final void i0() throws s3.i {
        int i = this.o0;
        if (i == 1) {
            K();
            return;
        }
        if (i == 2) {
            K();
            z0();
        } else if (i != 3) {
            this.f1948u0 = true;
            m0();
        } else {
            l0();
            V();
        }
    }

    public abstract boolean j0(long j10, long j11, m mVar, ByteBuffer byteBuffer, int i, int i10, int i11, long j12, boolean z5, boolean z10, j3.o oVar);

    public final boolean k0(int i) throws s3.i {
        r3.b bVar = this.f32432d;
        bVar.r();
        r3.e eVar = this.f1955y;
        eVar.r();
        int iW = w(bVar, eVar, i | 4);
        if (iW == -5) {
            c0(bVar);
            return true;
        }
        if (iW != -4 || !eVar.c(4)) {
            return false;
        }
        this.f1946t0 = true;
        i0();
        return false;
    }

    public final void l0() {
        try {
            m mVar = this.P;
            if (mVar != null) {
                mVar.release();
                this.f1956y0.f11454c++;
                p pVar = this.W;
                pVar.getClass();
                b0(pVar.f1907a);
            }
            this.P = null;
            try {
                MediaCrypto mediaCrypto = this.L;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.P = null;
            try {
                MediaCrypto mediaCrypto2 = this.L;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public abstract void m0();

    @Override // s3.a
    public void n() {
        this.G = null;
        r0(r.f1922f);
        this.D.clear();
        if (this.f1935i0) {
            this.f1935i0 = false;
            n0();
        } else {
            if (this.P == null) {
                return;
            }
            if (v0()) {
                l0();
            } else if (t0()) {
                K();
            } else {
                this.D0 = true;
            }
        }
    }

    public final void n0() {
        this.f1944s0 = -9223372036854775807L;
        Q().f1927e = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.f1937k0 = false;
        this.B.r();
        this.A.r();
        this.f1936j0 = false;
        b0 b0Var = this.E;
        b0Var.getClass();
        b0Var.f34078a = k3.k.f26866a;
        b0Var.f34080c = 0;
        b0Var.f34079b = 2;
    }

    public void o0() {
        this.f1932e0 = -1;
        this.f1957z.f32192f = null;
        this.f1933f0 = -1;
        this.f1934g0 = null;
        this.f1944s0 = -9223372036854775807L;
        Q().f1927e = -9223372036854775807L;
        this.A0 = -9223372036854775807L;
        this.f1931d0 = -9223372036854775807L;
        this.f1942q0 = false;
        this.f1930c0 = -9223372036854775807L;
        this.f1941p0 = false;
        this.Z = false;
        this.f1928a0 = false;
        this.h0 = false;
        this.f1940n0 = 0;
        this.o0 = 0;
        this.f1939m0 = this.f1938l0 ? 1 : 0;
        this.D0 = false;
        this.E0 = 0L;
    }

    @Override // s3.a
    public void p(long j10, boolean z5, boolean z10) throws s3.i {
        ArrayDeque arrayDeque = this.D;
        if (!arrayDeque.isEmpty()) {
            this.f1958z0 = (r) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z10) {
            this.f1946t0 = false;
            this.f1948u0 = false;
            this.f1952w0 = false;
            if (this.f1935i0) {
                n0();
            } else if (this.P != null) {
                if (v0()) {
                    l0();
                    V();
                } else if (t0()) {
                    K();
                } else {
                    this.D0 = true;
                }
            }
            if (this.f1958z0.f1926d.f() > 0) {
                this.f1950v0 = true;
            }
            ro0 ro0Var = this.f1958z0.f1926d;
            synchronized (ro0Var) {
                ro0Var.f10007c = 0;
                ro0Var.f10008d = 0;
                Arrays.fill(ro0Var.f10006b, (Object) null);
            }
        }
    }

    public final void p0() {
        o0();
        this.f1954x0 = null;
        this.U = null;
        this.W = null;
        this.Q = null;
        this.R = null;
        this.S = false;
        this.f1943r0 = false;
        this.T = -1.0f;
        this.X = 0;
        this.Y = false;
        this.f1929b0 = false;
        this.f1938l0 = false;
        this.f1939m0 = 0;
    }

    public final void q0(ni.i iVar) {
        ni.i iVar2 = this.I;
        if (iVar2 != iVar) {
            if (iVar != null) {
                iVar.g(null);
            }
            if (iVar2 != null) {
                iVar2.A(null);
            }
        }
        this.I = iVar;
    }

    public final void r0(r rVar) {
        this.f1958z0 = rVar;
        if (rVar.f1925c != -9223372036854775807L) {
            this.B0 = true;
            e0();
        }
    }

    public boolean s0(r3.e eVar) {
        return false;
    }

    public boolean t0() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(j3.o[] r12, long r13, long r15, i4.c0 r17) {
        /*
            r11 = this;
            b4.r r12 = r11.f1958z0
            long r0 = r12.f1925c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            b4.r r4 = new b4.r
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.r0(r4)
            boolean r12 = r11.C0
            if (r12 == 0) goto L56
            r11.g0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.D
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f1944s0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.A0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            b4.r r4 = new b4.r
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.r0(r4)
            b4.r r12 = r11.f1958z0
            long r12 = r12.f1925c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.g0()
        L56:
            return
        L57:
            b4.r r0 = new b4.r
            long r1 = r11.f1944s0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.s.u(j3.o[], long, long, i4.c0):void");
    }

    public boolean u0(p pVar) {
        return true;
    }

    public boolean v0() {
        int i = this.o0;
        if (i == 3 || (this.Y && !this.f1943r0)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            z0();
            return false;
        } catch (s3.i e3) {
            m3.b.t("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e3);
            return true;
        }
    }

    public boolean w0(j3.o oVar) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void x(long r12, long r14) throws s3.i {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.s.x(long, long):void");
    }

    public abstract int x0(k kVar, j3.o oVar);

    public final boolean y0(j3.o oVar) throws s3.i {
        if (this.P != null && this.o0 != 3 && this.i != 0) {
            float f10 = this.O;
            oVar.getClass();
            j3.o[] oVarArr = this.f32438k;
            oVarArr.getClass();
            float fN = N(f10, oVar, oVarArr);
            float f11 = this.T;
            if (f11 != fN) {
                if (fN == -1.0f) {
                    if (this.f1941p0) {
                        this.f1940n0 = 1;
                        this.o0 = 3;
                        return false;
                    }
                    l0();
                    V();
                    return false;
                }
                if (f11 != -1.0f || fN > this.f1953x) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fN);
                    m mVar = this.P;
                    mVar.getClass();
                    mVar.a(bundle);
                    this.T = fN;
                }
            }
        }
        return true;
    }

    public final void z0() throws s3.i {
        ni.i iVar = this.J;
        iVar.getClass();
        if (iVar.k() instanceof x3.i) {
            try {
                MediaCrypto mediaCrypto = this.L;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e3) {
                throw d(e3, this.G, false, 6006);
            }
        }
        q0(this.J);
        this.f1940n0 = 0;
        this.o0 = 0;
    }

    public void e0() {
    }

    public void h0(r3.e eVar) {
    }
}
