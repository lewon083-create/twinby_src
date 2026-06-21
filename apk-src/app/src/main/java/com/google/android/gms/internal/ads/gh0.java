package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-c151d27eb9f4c00b335bd72ad6c9ab5c682fb50bb0d055f47144f326a6351039 */
/* JADX INFO: loaded from: classes.dex */
public final class gh0 extends ca.a {
    public static final SparseArray i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f5809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y50 f5810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TelephonyManager f5811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final eh0 f5812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5813h;

    static {
        SparseArray sparseArray = new SparseArray();
        i = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), cj.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        cj cjVar = cj.CONNECTING;
        sparseArray.put(iOrdinal, cjVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), cjVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), cjVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), cj.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        cj cjVar2 = cj.DISCONNECTED;
        sparseArray.put(iOrdinal2, cjVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), cjVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), cjVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), cjVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), cjVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), cj.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), cjVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), cjVar);
    }

    public gh0(Context context, y50 y50Var, eh0 eh0Var, ut utVar, t9.e0 e0Var) {
        super(utVar, e0Var);
        this.f5809d = context;
        this.f5810e = y50Var;
        this.f5812g = eh0Var;
        this.f5811f = (TelephonyManager) context.getSystemService("phone");
    }
}
