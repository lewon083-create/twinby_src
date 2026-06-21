package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class nl1 implements n91 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f8360e = {0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final df1 f8361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f8363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f8364d;

    public nl1(he1 he1Var) {
        this.f8361a = fs1.v(bf1.h0(cf1.b(he1Var.f6107d.f6836a), he1Var.f6108e));
        je1 je1Var = he1Var.f6107d;
        this.f8362b = je1Var.f6837b;
        this.f8363c = he1Var.f6109f.b();
        if (je1Var.f6838c.equals(h91.f6071r)) {
            this.f8364d = Arrays.copyOf(f8360e, 1);
        } else {
            this.f8364d = new byte[0];
        }
    }

    public nl1(ne1 ne1Var) {
        String strValueOf = String.valueOf(ne1Var.f8280d.f9928d);
        this.f8361a = new fc("HMAC".concat(strValueOf), new SecretKeySpec(((sl1) ne1Var.f8281e.f12221c).b(), "HMAC"));
        re1 re1Var = ne1Var.f8280d;
        this.f8362b = re1Var.f9926b;
        this.f8363c = ne1Var.f8282f.b();
        if (re1Var.f9927c.equals(qe1.f9472d)) {
            this.f8364d = Arrays.copyOf(f8360e, 1);
        } else {
            this.f8364d = new byte[0];
        }
    }

    public nl1(fc fcVar, int i) throws InvalidAlgorithmParameterException {
        this.f8361a = fcVar;
        this.f8362b = i;
        this.f8363c = new byte[0];
        this.f8364d = new byte[0];
        fcVar.b(i, new byte[0]);
    }
}
