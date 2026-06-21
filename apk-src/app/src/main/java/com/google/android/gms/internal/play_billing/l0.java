package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public enum l0 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w0 f14229d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14231b;

    static {
        ad.m0 m0Var = new ad.m0(3, (byte) 0);
        m0Var.f840d = new Object[8];
        m0Var.f839c = 0;
        for (l0 l0Var : values()) {
            Integer numValueOf = Integer.valueOf(l0Var.f14231b);
            int i = m0Var.f839c + 1;
            Object[] objArr = (Object[]) m0Var.f840d;
            int length = objArr.length;
            int i10 = i + i;
            if (i10 > length) {
                m0Var.f840d = Arrays.copyOf(objArr, w.d(length, i10));
            }
            Object[] objArr2 = (Object[]) m0Var.f840d;
            int i11 = m0Var.f839c;
            int i12 = i11 + i11;
            objArr2[i12] = numValueOf;
            objArr2[i12 + 1] = l0Var;
            m0Var.f839c = i11 + 1;
        }
        d0 d0Var = (d0) m0Var.f841e;
        if (d0Var != null) {
            throw d0Var.a();
        }
        w0 w0VarA = w0.a(m0Var.f839c, (Object[]) m0Var.f840d, m0Var);
        d0 d0Var2 = (d0) m0Var.f841e;
        if (d0Var2 != null) {
            throw d0Var2.a();
        }
        f14229d = w0VarA;
    }

    l0(int i) {
        this.f14231b = i;
    }
}
