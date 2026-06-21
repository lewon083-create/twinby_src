package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eb1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nd1 f4911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ld1 f4912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tc1 f4913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final rc1 f4914d;

    static {
        sl1 sl1VarA = ge1.a("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        f4911a = new nd1(bb1.class, cb1.f4137f);
        f4912b = new ld1(sl1VarA, cb1.f4134c);
        f4913c = new tc1(ab1.class, cb1.f4135d);
        f4914d = new rc1(sl1VarA, cb1.f4136e);
    }

    public static ei1 a(ea1 ea1Var) throws GeneralSecurityException {
        if (ea1.f4902l.equals(ea1Var)) {
            return ei1.TINK;
        }
        if (ea1.f4903m.equals(ea1Var)) {
            return ei1.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(ea1Var)));
    }

    public static di1 b(bb1 bb1Var) throws GeneralSecurityException {
        byte[] bArrB = ((mh1) ((zd1) jd1.f6829b.h(bb1Var.f3718d)).f12972d).b();
        try {
            kn1 kn1Var = kn1.f7271a;
            int i = tm1.f10663a;
            mh1 mh1VarC = mh1.C(bArrB, kn1.f7272b);
            ci1 ci1VarC = di1.C();
            String str = bb1Var.f3716b;
            ci1VarC.b();
            ((di1) ci1VarC.f9560c).E(str);
            ci1VarC.b();
            ((di1) ci1VarC.f9560c).F(mh1VarC);
            return (di1) ci1VarC.d();
        } catch (co1 e3) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e3);
        }
    }

    public static bb1 c(di1 di1Var, ei1 ei1Var) throws GeneralSecurityException {
        h91 h91Var;
        ea1 ea1Var = ea1.f4903m;
        Object obj = h91.f6068o;
        h91 h91Var2 = h91.f6067n;
        h91 h91Var3 = h91.f6066m;
        h91 h91Var4 = h91.f6064k;
        h91 h91Var5 = h91.f6065l;
        h91 h91Var6 = h91.f6063j;
        lh1 lh1VarD = mh1.D();
        lh1VarD.g(di1Var.A().z());
        lh1VarD.h(di1Var.A().A());
        lh1VarD.i(ei1.RAW);
        o91 o91VarU = fs1.u(((mh1) lh1VarD.d()).b());
        if (o91VarU instanceof oa1) {
            h91Var = h91Var6;
        } else if (o91VarU instanceof ua1) {
            h91Var = h91Var5;
        } else if (o91VarU instanceof lb1) {
            h91Var = h91Var4;
        } else if (o91VarU instanceof ga1) {
            h91Var = h91Var3;
        } else if (o91VarU instanceof ka1) {
            h91Var = h91Var2;
        } else {
            if (!(o91VarU instanceof ra1)) {
                throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(o91VarU.toString()));
            }
            h91Var = obj;
        }
        int iOrdinal = ei1Var.ordinal();
        if (iOrdinal == 1) {
            ea1Var = ea1.f4902l;
        } else if (iOrdinal != 3) {
            int iH = ei1Var.h();
            throw new GeneralSecurityException(l7.o.j(iH, "Unable to parse OutputPrefixType: ", new StringBuilder(String.valueOf(iH).length() + 34)));
        }
        String strZ = di1Var.z();
        w91 w91Var = (w91) o91VarU;
        if (strZ == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        if (w91Var == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (w91Var.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((h91Var.equals(h91Var6) && (w91Var instanceof oa1)) || ((h91Var.equals(h91Var5) && (w91Var instanceof ua1)) || ((h91Var.equals(h91Var4) && (w91Var instanceof lb1)) || ((h91Var.equals(h91Var3) && (w91Var instanceof ga1)) || ((h91Var.equals(h91Var2) && (w91Var instanceof ka1)) || (h91Var.equals(obj) && (w91Var instanceof ra1))))))) {
            return new bb1(ea1Var, strZ, h91Var, w91Var);
        }
        String str = h91Var.f6074c;
        String strValueOf = String.valueOf(w91Var);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + str.length() + 67 + 1);
        l7.o.t(sb2, "Cannot use parsing strategy ", str, " when new keys are picked according to ", strValueOf);
        sb2.append(".");
        throw new GeneralSecurityException(sb2.toString());
    }
}
