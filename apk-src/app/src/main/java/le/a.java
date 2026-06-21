package le;

import a0.q1;
import a0.y;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.o;
import com.google.android.gms.internal.measurement.d8;
import com.google.android.gms.internal.measurement.g7;
import com.google.android.gms.internal.measurement.i7;
import com.google.android.gms.internal.measurement.o7;
import com.google.android.gms.internal.measurement.q8;
import com.google.android.gms.internal.measurement.s8;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.v8;
import com.google.firebase.components.ComponentRegistrar;
import d8.e0;
import j3.d0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m4.m;
import md.b;
import n2.c;
import n5.k;
import ob.w;
import p3.i;
import p3.t;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements c, k, w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ a f28104c = new a(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f28105d = new a(12);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f28106e = new a(13);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f28107f = new a(14);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f28108g = new a(15);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ a f28109h = new a(16);
    public static final /* synthetic */ a i = new a(17);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f28110j = new a(18);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ a f28111k = new a(19);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ a f28112l = new a(20);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ a f28113m = new a(21);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ a f28114n = new a(22);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ a f28115o = new a(23);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a f28116p = new a(24);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ a f28117q = new a(25);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a f28118r = new a(26);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ a f28119s = new a(27);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ a f28120t = new a(28);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ a f28121u = new a(29);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28122b;

    public /* synthetic */ a(int i10) {
        this.f28122b = i10;
    }

    public static o d(nl0 nl0Var, e0 e0Var) {
        IOException iOException = (IOException) e0Var.f15621d;
        if (!(iOException instanceof p3.w)) {
            return null;
        }
        int i10 = ((p3.w) iOException).f31206d;
        if (i10 != 403 && i10 != 404 && i10 != 410 && i10 != 416 && i10 != 500 && i10 != 503) {
            return null;
        }
        if (nl0Var.a(1)) {
            return new o(1, 300000L);
        }
        if (nl0Var.a(2)) {
            return new o(2, 60000L);
        }
        return null;
    }

    public static byte[] f(long j10, long j11, List list) {
        int i10 = (int) j10;
        int i11 = (int) j11;
        if (list.size() < 3) {
            throw new IllegalArgumentException("The plane list must contain at least 3 planes (Y, U, V).");
        }
        q1 q1Var = (q1) list.get(0);
        q1 q1Var2 = (q1) list.get(1);
        char c8 = 2;
        q1 q1Var3 = (q1) list.get(2);
        ByteBuffer byteBufferE = q1Var.e();
        ByteBuffer byteBufferE2 = q1Var2.e();
        ByteBuffer byteBufferE3 = q1Var3.e();
        byteBufferE.rewind();
        byteBufferE2.rewind();
        byteBufferE3.rewind();
        int iRemaining = byteBufferE.remaining();
        byte[] bArr = new byte[((i10 * i11) / 2) + iRemaining];
        int iF = q1Var.f();
        if (iF == i10) {
            byteBufferE.get(bArr, 0, iRemaining);
        } else {
            byte[] bArr2 = new byte[i10];
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                byteBufferE.get(bArr2, 0, i10);
                System.arraycopy(bArr2, 0, bArr, i12, i10);
                i12 += i10;
                if (i13 < i11 - 1) {
                    byteBufferE.position((byteBufferE.position() - i10) + iF);
                }
            }
            iRemaining = i12;
        }
        int iF2 = q1Var2.f();
        int iF3 = q1Var3.f();
        int iG = q1Var2.g();
        int iG2 = q1Var3.g();
        byte[] bArr3 = new byte[iF2];
        byte[] bArr4 = new byte[iF3];
        int i14 = 0;
        while (i14 < i11 / 2) {
            int iMin = Math.min(byteBufferE2.remaining(), iF2);
            char c9 = c8;
            int iMin2 = Math.min(byteBufferE3.remaining(), iF3);
            byteBufferE2.get(bArr3, 0, iMin);
            byteBufferE3.get(bArr4, 0, iMin2);
            for (int i15 = 0; i15 < i10 / 2; i15++) {
                int i16 = iRemaining + 1;
                bArr[iRemaining] = bArr4[i15 * iG2];
                iRemaining += 2;
                bArr[i16] = bArr3[i15 * iG];
            }
            i14++;
            c8 = c9;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining2 = byteBufferWrap.remaining();
        byte[] bArr5 = new byte[iRemaining2];
        byteBufferWrap.get(bArr5, 0, iRemaining2);
        return bArr5;
    }

    public static long g(e0 e0Var) {
        for (Throwable cause = (IOException) e0Var.f15621d; cause != null; cause = cause.getCause()) {
            if ((cause instanceof d0) || (cause instanceof FileNotFoundException) || (cause instanceof t) || (cause instanceof m)) {
                return -9223372036854775807L;
            }
            if ((cause instanceof i) && ((i) cause).f31158b == 2008) {
                return -9223372036854775807L;
            }
        }
        return Math.min((e0Var.f15620c - 1) * 1000, 5000);
    }

    @Override // n5.k
    public int a(j3.o oVar) {
        return 1;
    }

    @Override // n5.k
    public n5.m b(j3.o oVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // n5.k
    public boolean c(j3.o oVar) {
        return false;
    }

    public int e(int i10) {
        return i10 == 7 ? 6 : 3;
    }

    @Override // ob.w
    public Object h() {
        switch (this.f28122b) {
            case 11:
                return new Boolean(((Boolean) o7.f13909a.b()).booleanValue());
            case 12:
                return new Boolean(((Boolean) d8.f13709a.b()).booleanValue());
            case 13:
                List list = ob.d0.f29996a;
                t8.f13974c.get();
                Boolean bool = (Boolean) v8.f14027c.b();
                bool.getClass();
                return bool;
            case 14:
                List list2 = ob.d0.f29996a;
                g7.f13765c.get();
                return (String) i7.f13794e.b();
            case 15:
                List list3 = ob.d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13807l0.b()).longValue());
            case 16:
                List list4 = ob.d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.f13816q0.b()).longValue());
            case 17:
                List list5 = ob.d0.f29996a;
                g7.f13765c.get();
                return (String) i7.f13810n.b();
            case 18:
                List list6 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l10 = (Long) i7.T.b();
                l10.getClass();
                return l10;
            case 19:
                List list7 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l11 = (Long) i7.J.b();
                l11.getClass();
                return l11;
            case 20:
                List list8 = ob.d0.f29996a;
                g7.f13765c.get();
                return Integer.valueOf((int) ((Long) i7.P.b()).longValue());
            case 21:
                List list9 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l12 = (Long) i7.R.b();
                l12.getClass();
                return l12;
            case 22:
                List list10 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l13 = (Long) i7.f13796f.b();
                l13.getClass();
                return l13;
            case 23:
                List list11 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l14 = (Long) i7.h0.b();
                l14.getClass();
                return l14;
            case 24:
                List list12 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l15 = (Long) i7.f13831z.b();
                l15.getClass();
                return l15;
            case 25:
                List list13 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l16 = (Long) i7.F.b();
                l16.getClass();
                return l16;
            case 26:
                List list14 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l17 = (Long) i7.f13822t0.b();
                l17.getClass();
                return l17;
            case 27:
                List list15 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l18 = (Long) i7.f13808m.b();
                l18.getClass();
                return l18;
            case 28:
                List list16 = ob.d0.f29996a;
                g7.f13765c.get();
                Long l19 = (Long) i7.G.b();
                l19.getClass();
                return l19;
            default:
                List list17 = ob.d0.f29996a;
                q8.f13932c.get();
                return (String) s8.f13966f.b();
        }
    }

    public List i(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f28831a;
            if (str != null) {
                bVar = new b(str, bVar.f28832b, bVar.f28833c, bVar.f28834d, bVar.f28835e, new y(20, str, bVar), bVar.f28837g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }
}
