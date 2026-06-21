package f4;

import j3.o;
import m3.z;
import q4.a0;
import q4.m;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16632e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f16633f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f16634g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f16635h;

    public g(e4.k kVar) {
        this.f16634g = kVar;
        this.f16632e = -9223372036854775807L;
        this.f16630c = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    @Override // f4.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b(m3.p r22, long r23, int r25, boolean r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r25
            java.lang.Object r3 = r0.f16635h
            q4.a0 r3 = (q4.a0) r3
            r3.getClass()
            int r3 = r0.f16630c
            r4 = -1
            if (r3 == r4) goto L2b
            int r3 = e4.h.a(r3)
            if (r2 == r3) goto L2b
            java.lang.String r5 = m3.z.f28608a
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r5 = "; received: "
            java.lang.String r6 = ". Dropping packet."
            java.lang.String r7 = "Received RTP packet with unexpected sequence number. Expected: "
            java.lang.String r3 = com.google.android.gms.internal.ads.om1.j(r7, r3, r5, r2, r6)
            java.lang.String r5 = "RtpMpeg4Reader"
            m3.b.s(r5, r3)
        L2b:
            int r3 = r1.a()
            java.lang.Object r5 = r0.f16635h
            q4.a0 r5 = (q4.a0) r5
            r5.d(r3, r1)
            int r5 = r0.f16631d
            r6 = 0
            if (r5 != 0) goto L73
            byte[] r5 = r1.f28589a
            r7 = 4
            byte[] r8 = new byte[r7]
            r8 = {x00ae: FILL_ARRAY_DATA , data: [0, 0, 1, -74} // fill-array
            java.lang.String r9 = "array"
            com.google.android.gms.internal.measurement.h5.m(r5, r9)
            r9 = r6
        L49:
            int r10 = r5.length
            int r10 = r10 + (-3)
            if (r9 >= r10) goto L5f
            r10 = r6
        L4f:
            if (r10 >= r7) goto L60
            int r11 = r9 + r10
            r11 = r5[r11]
            r12 = r8[r10]
            if (r11 == r12) goto L5c
            int r9 = r9 + 1
            goto L49
        L5c:
            int r10 = r10 + 1
            goto L4f
        L5f:
            r9 = r4
        L60:
            if (r9 == r4) goto L70
            int r9 = r9 + r7
            r1.M(r9)
            int r1 = r1.j()
            int r1 = r1 >> 6
            if (r1 != 0) goto L70
            r1 = 1
            goto L71
        L70:
            r1 = r6
        L71:
            r0.f16629b = r1
        L73:
            int r1 = r0.f16631d
            int r1 = r1 + r3
            r0.f16631d = r1
            if (r26 == 0) goto Laa
            long r3 = r0.f16632e
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r10 = r23
            if (r1 != 0) goto L89
            r0.f16632e = r10
        L89:
            long r7 = r0.f16633f
            long r12 = r0.f16632e
            r9 = 90000(0x15f90, float:1.26117E-40)
            long r15 = hl.l.t(r7, r9, r10, r12)
            java.lang.Object r1 = r0.f16635h
            r14 = r1
            q4.a0 r14 = (q4.a0) r14
            int r1 = r0.f16629b
            int r3 = r0.f16631d
            r19 = 0
            r20 = 0
            r17 = r1
            r18 = r3
            r14.f(r15, r17, r18, r19, r20)
            r0.f16631d = r6
        Laa:
            r0.f16630c = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.g.b(m3.p, long, int, boolean):void");
    }

    @Override // f4.i
    public void c(m mVar, int i) {
        a0 a0VarP = mVar.P(i, 2);
        this.f16635h = a0VarP;
        String str = z.f28608a;
        a0VarP.a(((e4.k) this.f16634g).f16140c);
    }

    @Override // f4.i
    public void seek(long j10, long j11) {
        this.f16632e = j10;
        this.f16633f = j11;
        this.f16631d = 0;
    }

    public g(int i, int i10, o oVar, int i11, Object obj, long j10, long j11) {
        this.f16629b = i;
        this.f16630c = i10;
        this.f16634g = oVar;
        this.f16631d = i11;
        this.f16635h = obj;
        this.f16632e = j10;
        this.f16633f = j11;
    }

    @Override // f4.i
    public void a(long j10) {
    }
}
