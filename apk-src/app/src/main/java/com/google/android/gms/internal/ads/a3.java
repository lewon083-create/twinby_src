package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a3 implements z1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f2722l = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f2723m = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f2724n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f2725o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f2728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2730e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b2 f2732g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w2 f2733h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f2 f2734j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f2735k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2726a = new byte[1];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2731f = -1;
    public w2 i = new y1();

    static {
        String str = cq0.f4293a;
        Charset charset = StandardCharsets.UTF_8;
        f2724n = "#!AMR\n".getBytes(charset);
        f2725o = "#!AMR-WB\n".getBytes(charset);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final boolean a(a2 a2Var) {
        return f(a2Var);
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void b(b2 b2Var) {
        this.f2732g = b2Var;
        w2 w2VarO = b2Var.O(0, 1);
        this.f2733h = w2VarO;
        this.i = w2VarO;
        b2Var.u();
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void d(long j10, long j11) {
        this.f2728c = 0L;
        this.f2729d = 0;
        this.f2730e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[Catch: EOFException -> 0x0100, TryCatch #0 {EOFException -> 0x0100, blocks: (B:26:0x0070, B:28:0x0085, B:42:0x00a7, B:44:0x00ac, B:43:0x00aa, B:51:0x00be, B:52:0x00e1, B:53:0x00e2, B:54:0x00ff), top: B:71:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa A[Catch: EOFException -> 0x0100, TryCatch #0 {EOFException -> 0x0100, blocks: (B:26:0x0070, B:28:0x0085, B:42:0x00a7, B:44:0x00ac, B:43:0x00aa, B:51:0x00be, B:52:0x00e1, B:53:0x00e2, B:54:0x00ff), top: B:71:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    @Override // com.google.android.gms.internal.ads.z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(com.google.android.gms.internal.ads.a2 r19, com.google.android.gms.internal.ads.e2 r20) throws com.google.android.gms.internal.ads.eb {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a3.e(com.google.android.gms.internal.ads.a2, com.google.android.gms.internal.ads.e2):int");
    }

    public final boolean f(a2 a2Var) {
        a2Var.e();
        byte[] bArr = f2724n;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        a2Var.E(bArr2, 0, length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f2727b = false;
            a2Var.t(bArr.length);
            return true;
        }
        a2Var.e();
        byte[] bArr3 = f2725o;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        a2Var.E(bArr4, 0, length2);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f2727b = true;
        a2Var.t(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.z1
    public final void c() {
    }
}
