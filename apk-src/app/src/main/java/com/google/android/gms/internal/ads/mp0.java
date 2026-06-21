package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.tasks.Task;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mp0 implements wo0, sb.a, o31, n31, j91, td1, md1, uc1, sc1, od1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7970h;
    public static final /* synthetic */ mp0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7971j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7972k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7973l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7979r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7980s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7981t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7982u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7983v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7984w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7985x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7986y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ mp0 f7987z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7988b;

    static {
        byte b2 = 0;
        f7965c = new mp0(0, b2);
        f7966d = new mp0(1, b2);
        f7967e = new mp0(2, b2);
        f7968f = new mp0(8, b2);
        f7969g = new mp0(9, b2);
        f7970h = new mp0(11, b2);
        i = new mp0(12, b2);
        f7971j = new mp0(13, b2);
        f7972k = new mp0(14, b2);
        f7973l = new mp0(15, b2);
        f7974m = new mp0(16, b2);
        f7975n = new mp0(17, b2);
        f7976o = new mp0(18, b2);
        f7977p = new mp0(19, b2);
        f7978q = new mp0(20, b2);
        f7979r = new mp0(21, b2);
        f7980s = new mp0(22, b2);
        f7981t = new mp0(23, b2);
        f7982u = new mp0(24, b2);
        f7983v = new mp0(25, b2);
        f7984w = new mp0(26, b2);
        f7985x = new mp0(27, b2);
        f7986y = new mp0(28, b2);
        f7987z = new mp0(29, b2);
    }

    public mp0(int i10) {
        this.f7988b = 5;
    }

    @Override // com.google.android.gms.internal.ads.wo0
    public /* synthetic */ void a(Object obj) {
        ((ea.a) obj).g();
    }

    @Override // com.google.android.gms.internal.ads.td1
    public Object b(gr grVar) throws GeneralSecurityException {
        byte[] bArrB;
        switch (this.f7988b) {
            case 11:
                jb1 jb1Var = (jb1) grVar;
                mc1 mc1Var = u91.f10899a;
                try {
                    sb1.b();
                    return new bc1(((sl1) jb1Var.f6807e.f12221c).b(), jb1Var.f6808f.b(), sb1.b().getProvider());
                } catch (GeneralSecurityException unused) {
                    return new yb1(3, ((sl1) jb1Var.f6807e.f12221c).b(), jb1Var.f6808f.b());
                }
            case 12:
                sa1 sa1Var = (sa1) grVar;
                mc1 mc1Var2 = u91.f10899a;
                try {
                    sb1.b();
                    return new sb1(((sl1) sa1Var.f10229e.f12221c).b(), sa1Var.f10230f.b(), sb1.b().getProvider());
                } catch (GeneralSecurityException unused2) {
                    return new yb1(2, ((sl1) sa1Var.f10229e.f12221c).b(), sa1Var.f10230f.b());
                }
            case 13:
                return cl1.b((ha1) grVar);
            case 14:
                la1 la1Var = (la1) grVar;
                la1Var.getClass();
                return new yb1(((sl1) la1Var.f7470e.f12221c).b(), la1Var.f7471f);
            case 15:
                return ec1.b((pa1) grVar);
            case 16:
                return gl1.b((aa1) grVar);
            case 17:
                gb1 gb1Var = (gb1) grVar;
                gb1Var.getClass();
                return new zb1(((sl1) gb1Var.f5766e.f12221c).b(), gb1Var.f5767f, gb1Var.f5765d.f6453b);
            case 18:
                yd1 yd1Var = ((zc1) grVar).f12968d;
                int[] iArr = xc1.f12130b;
                int i10 = yd1Var.f12599b;
                Integer num = (Integer) yd1Var.f12604g;
                int i11 = iArr[t.z.m(i10)];
                e91 e91Var = (e91) qc1.f9455d.b(e91.class, (String) yd1Var.f12600c).a((bn1) yd1Var.f12602e);
                ei1 ei1Var = (ei1) yd1Var.f12603f;
                int iOrdinal = ei1Var.ordinal();
                if (iOrdinal == 1) {
                    bArrB = kd1.b(num.intValue()).b();
                } else if (iOrdinal == 2) {
                    bArrB = kd1.a(num.intValue()).b();
                } else if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(ei1Var)));
                    }
                    bArrB = kd1.a(num.intValue()).b();
                } else {
                    bArrB = kd1.f7203a.b();
                }
                return new yb1(e91Var, bArrB);
            case 19:
                return gl1.b((aa1) grVar);
            case 20:
                return cl1.b((ha1) grVar);
            case 21:
                la1 la1Var2 = (la1) grVar;
                la1Var2.getClass();
                return new yb1(((sl1) la1Var2.f7470e.f12221c).b(), la1Var2.f7471f);
            case 22:
                return ec1.b((pa1) grVar);
            case 23:
                sa1 sa1Var2 = (sa1) grVar;
                sd1 sd1Var = ta1.f10573a;
                try {
                    sb1.b();
                    return new sb1(((sl1) sa1Var2.f10229e.f12221c).b(), sa1Var2.f10230f.b(), sb1.b().getProvider());
                } catch (GeneralSecurityException unused3) {
                    return new yb1(2, ((sl1) sa1Var2.f10229e.f12221c).b(), sa1Var2.f10230f.b());
                }
            case 24:
                sd1 sd1Var2 = va1.f11322a;
                m91.a(((xa1) grVar).f12095d.f12560a);
                throw null;
            default:
                wc1 wc1Var = wa1.f11714a;
                m91.a(((ab1) grVar).f2834d.f3716b);
                throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.md1
    public o91 c(zd1 zd1Var) throws GeneralSecurityException {
        nd1 nd1Var = za1.f12935a;
        mh1 mh1Var = (mh1) zd1Var.f12972d;
        if (!mh1Var.z().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: ".concat(String.valueOf(mh1Var.z())));
        }
        try {
            bn1 bn1VarA = mh1Var.A();
            kn1 kn1Var = kn1.f7271a;
            int i10 = tm1.f10663a;
            return new ya1(zh1.A(bn1VarA, kn1.f7272b).z(), za1.b(mh1Var.B()));
        } catch (co1 e3) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.sc1
    public gr d(yd1 yd1Var) throws GeneralSecurityException {
        nd1 nd1Var = za1.f12935a;
        if (!((String) yd1Var.f12600c).equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            bn1 bn1Var = (bn1) yd1Var.f12602e;
            kn1 kn1Var = kn1.f7271a;
            int i10 = tm1.f10663a;
            xh1 xh1VarB = xh1.B(bn1Var, kn1.f7272b);
            if (xh1VarB.z() == 0) {
                return xa1.i0(new ya1(xh1VarB.A().z(), za1.b((ei1) yd1Var.f12603f)), (Integer) yd1Var.f12604g);
            }
            String strValueOf = String.valueOf(xh1VarB);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 49);
            sb2.append("KmsAeadKey are only accepted with version 0, got ");
            sb2.append(strValueOf);
            throw new GeneralSecurityException(sb2.toString());
        } catch (co1 e3) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.n31
    public Iterator e(xo0 xo0Var, CharSequence charSequence) {
        return new l31(charSequence);
    }

    @Override // com.google.android.gms.internal.ads.od1
    public zd1 f(o91 o91Var) {
        ya1 ya1Var = (ya1) o91Var;
        nd1 nd1Var = za1.f12935a;
        lh1 lh1VarD = mh1.D();
        lh1VarD.g("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        yh1 yh1VarB = zh1.B();
        String str = ya1Var.f12560a;
        yh1VarB.b();
        ((zh1) yh1VarB.f9560c).D(str);
        lh1VarD.h(((zh1) yh1VarB.d()).a());
        lh1VarD.i(za1.a(ya1Var.f12561b));
        return zd1.q((mh1) lh1VarD.d());
    }

    @Override // sb.a
    public /* synthetic */ Object g(Task task) {
        return new Boolean(task.isSuccessful());
    }

    @Override // com.google.android.gms.internal.ads.j91
    public void h() {
        switch (this.f7988b) {
            case 9:
                break;
            default:
                gd1.f5783b.a().getClass();
                break;
        }
    }

    public /* synthetic */ mp0(int i10, byte b2) {
        this.f7988b = i10;
    }

    @Override // com.google.android.gms.internal.ads.o31
    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object mo8h() {
        switch (this.f7988b) {
            case 2:
                return -1;
            case 3:
                return -1;
            case 4:
            case 5:
            default:
                throw new IllegalStateException();
            case 6:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }

    private final /* synthetic */ void i() {
    }

    @Override // com.google.android.gms.internal.ads.td1
    public yd1 b(gr grVar) {
        xa1 xa1Var = (xa1) grVar;
        nd1 nd1Var = za1.f12935a;
        wh1 wh1VarC = xh1.C();
        yh1 yh1VarB = zh1.B();
        String str = xa1Var.f12095d.f12560a;
        yh1VarB.b();
        ((zh1) yh1VarB.f9560c).D(str);
        zh1 zh1Var = (zh1) yh1VarB.d();
        wh1VarC.b();
        ((xh1) wh1VarC.f9560c).E(zh1Var);
        return yd1.f("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((xh1) wh1VarC.d()).a(), 5, za1.a(xa1Var.f12095d.f12561b), xa1Var.f12097f);
    }
}
